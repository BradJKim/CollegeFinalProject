package com.example.collegefinalproject.helpers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.collegefinalproject.Main.MainActivity
import com.example.collegefinalproject.R
import com.example.collegefinalproject.models.CollegeList

class CollegesListAdapter(private val listOfLists: List<CollegeList?>) : RecyclerView.Adapter<CollegesListAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.fragment_college_list, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        // viewHolder.textView.text = listOfLists[position].toString()

        return viewHolder.bind(listOfLists[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = listOfLists.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // val textView: TextView

        var listName = itemView.findViewById<TextView>(R.id.textView_collegeList_listName)

        fun bind (collegeList : CollegeList?){
            listName.text = collegeList?.listName
            MainActivity.list = "List"

            itemView.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_viewingListFragment_to_viewingListViewFragment)
            )
        }
    }
}
