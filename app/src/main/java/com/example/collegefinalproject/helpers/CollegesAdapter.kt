package dev.bensalcie.retrofitest.helpers

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.collegefinalproject.Main.MainActivity
import com.example.collegefinalproject.R
import com.example.collegefinalproject.models.College

class CollegesAdapter(private val collegesList: List<College>) :RecyclerView.Adapter<CollegesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.activity_college,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return collegesList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${collegesList.size} ")

        holder.nameOfCollege.setOnClickListener {
            it.findNavController().navigate(R.id.action_filterViewFragment_to_collegeFragment)
        }
        return holder.bind(collegesList[position])

    }

        class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {

        var nameOfCollege = itemView.findViewById<TextView>(R.id.textView_college_collegeName)
        var description = itemView.findViewById<TextView>(R.id.textView_college_description)
        var filter = MainActivity.filter
        fun bind(college: College) {

            nameOfCollege.text = college.school.name
            when {
                filter.contains("Cost") -> {
                    description.text = college.latest.cost.tuition.in_state.toString()
                }
                filter.contains("Debt") -> {
                    description.text = college.latest.aid.cumulative_debt.number.toString()
                }
                filter.contains("Asian") -> {
                    description.text = college.latest.student.demographics.race_ethnicity.asian.toString()
                }
            }
        }

    }
}