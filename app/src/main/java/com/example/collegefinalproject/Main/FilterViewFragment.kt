package com.example.collegefinalproject.Main

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.collegefinalproject.R
import com.example.collegefinalproject.models.College
import com.example.collegefinalproject.services.CollegeService
import com.example.collegefinalproject.services.CollegeWrapper
import com.example.collegefinalproject.services.ServiceBuilder
import dev.bensalcie.retrofitest.helpers.CollegesAdapter
import kotlinx.android.synthetic.main.fragment_filter_view.*
import kotlinx.android.synthetic.main.fragment_filter_view.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.Comparator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FilterViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FilterViewFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        MainActivity.fragment ="Filter"
        val layout = inflater.inflate(R.layout.fragment_filter_view, container, false)
        loadColleges(layout)
        setHasOptionsMenu(true)
        return layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun loadColleges(layout : View) {
        val destinationService = ServiceBuilder.buildService(CollegeService::class.java)
        val requestCall = destinationService.getCollegesList("JwqB47hsWQYqWuyAdDNuRMYiidSuQe1w8i38NYY4")
        requestCall.enqueue(object : Callback<CollegeWrapper> {
            override fun onResponse(call: Call<CollegeWrapper>, response: Response<CollegeWrapper>) {
                Log.d("Response", "onResponse: ${response.body()}")
                if (response.isSuccessful){
                    val collegeList = response.body()?.results
                    val filter = MainActivity.filter

                    Log.d("Response", "collegeList size: ${collegeList?.size}")
                    Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")

                    // Add filters below to reorder collegelist by filter
                    Collections.sort(collegeList, object : Comparator<College?> {
                        override fun compare(p0: College?, p1: College?): Int {
                            if(p0 == null || p1 == null) {
                                return 0
                                Log.d(MainActivity.TAG, "p0 or p1 is null")
                            } else {
                                if(filter == "Cost") {
                                    return p0.latest.cost.tuition.in_state - p1.latest.cost.tuition.in_state
                                }
                                else if(filter == "Debt"){
                                    return p0.latest.aid.cumulative_debt.number - p1.latest.aid.cumulative_debt.number
                                }
                                else if(filter == "Asian"){
                                    return (p0.latest.student.demographics.race_ethnicity.asian - p1.latest.student.demographics.race_ethnicity.asian).toInt()
                                }
                                else {
                                    return 0
                                    Log.d(MainActivity.TAG, "No Filter matches")
                                }
                            }
                        }
                    })

                    Log.d("Response", "collegeList size: ${collegeList?.size}")
                    Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")

                    // Set Recycler here
                    layout.college_recycler.apply {
                        setHasFixedSize(true)
                        layoutManager = LinearLayoutManager(requireActivity())
                        adapter = CollegesAdapter(collegeList!!)
                    }

                    // Log.d("Response", "collegeList size: ${collegeList?.size}")
                    // Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")
                }
                else{
                    Toast.makeText(requireActivity(), "Something went wrong ${response.message()}", Toast.LENGTH_SHORT).show()
                    Log.d(MainActivity.TAG, "Error: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<CollegeWrapper>, t: Throwable) {
                Toast.makeText(requireContext(), "Something went wrong $t", Toast.LENGTH_SHORT).show()
                Log.d(MainActivity.TAG, "$t")
            }
        })
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FilterViewFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FilterViewFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}



