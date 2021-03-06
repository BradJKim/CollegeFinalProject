package com.example.collegefinalproject.Main

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.collegefinalproject.R
import kotlinx.android.synthetic.main.fragment_filter.*
import kotlinx.android.synthetic.main.fragment_filter.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FilterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class FilterFragment : Fragment() {
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
        val layout = inflater.inflate(R.layout.fragment_filter, container, false)

        setHasOptionsMenu(true)

        // Create onClickListeners here for filters
        // set filter in mainactivity into filter name and navigate to new fragment
        layout.button_filter_1.setOnClickListener {
            MainActivity.filter = button_filter_1.text.toString()
            view?.findNavController()?.navigate(R.id.action_filterFragment_to_filterViewFragment)
        }
        layout.button_filter_2.setOnClickListener {
            MainActivity.filter = button_filter_2.text.toString()
            view?.findNavController()?.navigate(R.id.action_filterFragment_to_filterViewFragment)
        }
        layout.button_filter_3.setOnClickListener {
            MainActivity.filter = button_filter_3.text.toString()
            view?.findNavController()?.navigate(R.id.action_filterFragment_to_filterViewFragment)
        }
        return layout
    }

    /**
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_options, menu)
    }
    */

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.home) {
            view?.findNavController()?.navigate(R.id.action_filterFragment_to_navHostFragment)
        }
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FilterFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FilterFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}