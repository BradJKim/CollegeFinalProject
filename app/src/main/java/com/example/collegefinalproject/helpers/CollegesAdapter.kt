package dev.bensalcie.retrofitest.helpers

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.collegefinalproject.Main.MainActivity
import com.example.collegefinalproject.R
import com.example.collegefinalproject.models.College
import com.squareup.picasso.Picasso

class CollegesAdapter(private val collegesList: List<College>) :RecyclerView.Adapter<CollegesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.fragment_college,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return collegesList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${collegesList.size} ")


        return holder.bind(collegesList[position])

    }
    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {

        var nameOfCollege = itemView.findViewById<TextView>(R.id.textView_college_collegeName)
        var description = itemView.findViewById<TextView>(R.id.textView_college_description)
        var filter = MainActivity.filter
        fun bind(college: College) {

            nameOfCollege.text = college.school.name
            when {
                filter.contains("cost") -> {
                    description.text = college.latest.cost.tuition.in_state.toString()
                }
                filter.contains("debt") -> {
                    description.text = college.latest.aid.cumulative_debt.number.toString()
                }
                filter.contains("Asian") -> {
                    description.text = college.latest.student.demographics.race_ethnicity.asian.toString()
                }
            }

            var navController: NavController? = null

            // navController = Navigation.findNavController(itemView)
            itemView.setOnClickListener{
                if(MainActivity.fragment.equals("Filter")) {
                    // navController!!.navigate(R.id.action_filterViewFragment_to_collegeFragment)
                    Navigation.createNavigateOnClickListener(R.id.action_filterViewFragment_to_collegeFragment)
                }
                else if(MainActivity.fragment.equals("List")){
                    // navController!!.navigate(R.id.action_viewingListViewFragment_to_collegeFragment)
                    Navigation.createNavigateOnClickListener(R.id.action_viewingListViewFragment_to_collegeFragment)
                }
            }
        }

    }
}