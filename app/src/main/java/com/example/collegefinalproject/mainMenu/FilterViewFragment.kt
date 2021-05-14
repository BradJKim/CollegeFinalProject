package com.example.collegefinalproject.mainMenu

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresPermission
import com.example.collegefinalproject.R
import com.example.collegefinalproject.models.College
import com.example.collegefinalproject.services.CollegeService
import com.example.collegefinalproject.services.CollegeWrapper
import com.example.collegefinalproject.services.ServiceBuilder
import kotlinx.android.synthetic.main.fragment_filter.view.*
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

        return inflater.inflate(R.layout.fragment_filter_view, container, false)
    }

    private fun loadColleges() {
        val destinationService = ServiceBuilder.buildService(CollegeService::class.java)
        val requestCall = destinationService.getCollegesList("JwqB47hsWQYqWuyAdDNuRMYiidSuQe1w8i38NYY4")
        requestCall.enqueue(object : Callback<CollegeWrapper> {
            override fun onResponse(call: Call<CollegeWrapper>, response: Response<CollegeWrapper>) {
                Log.d("Response", "onResponse: ${response.body()}")
                if (response.isSuccessful){
                    val collegeList = response.body()?.results
                    val filter = MainActivity.filter

                    // Add filters below to reorder collegelist by filter
                    Collections.sort(collegeList, object : Comparator<College?> {
                        override fun compare(p0: College?, p1: College?): Int {
                            if(p0 == null || p1 == null) {
                                return 0
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
                                }
                            }
                        }
                    })

                    // Log.d("Response", "collegeList size: ${collegeList?.size}")
                    // Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")
                }
                else{
                    Toast.makeText(requireContext(), "Something went wrong ${response.message()}", Toast.LENGTH_SHORT).show()
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