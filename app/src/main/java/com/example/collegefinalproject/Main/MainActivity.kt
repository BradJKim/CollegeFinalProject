package com.example.collegefinalproject.Main

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.collegefinalproject.R
import com.example.collegefinalproject.models.College
import com.example.collegefinalproject.services.CollegeService
import com.example.collegefinalproject.services.CollegeWrapper
import com.example.collegefinalproject.services.ServiceBuilder
import dev.bensalcie.retrofitest.helpers.CollegesAdapter
import kotlinx.android.synthetic.main.activity_college_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.Comparator


class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
        var filter = ""
        var list = ""
        var fragment = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun loadColleges() {
        val destinationService = ServiceBuilder.buildService(CollegeService::class.java)
        val requestCall =
            destinationService.getCollegesList("JwqB47hsWQYqWuyAdDNuRMYiidSuQe1w8i38NYY4")
        requestCall.enqueue(object : Callback<CollegeWrapper> {
            override fun onResponse(
                call: Call<CollegeWrapper>,
                response: Response<CollegeWrapper>
            ) {
                Log.d("Response", "onResponse: ${response.body()}")
                if (response.isSuccessful) {
                    val collegeList = response.body()?.results
                    val filter = MainActivity.filter

                    Log.d("Response", "collegeList size: ${collegeList?.size}")
                    Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")

                    // Add filters below to reorder collegelist by filter
                    Collections.sort(collegeList, object : Comparator<College?> {
                        override fun compare(p0: College?, p1: College?): Int {
                            if (p0 == null || p1 == null) {
                                return 0
                                Log.d(MainActivity.TAG, "p0 or p1 is null")
                            } else {
                                if (filter == "Cost") {
                                    return p0.latest.cost.tuition.in_state - p1.latest.cost.tuition.in_state
                                } else if (filter == "Debt") {
                                    return p0.latest.aid.cumulative_debt.number - p1.latest.aid.cumulative_debt.number
                                } else if (filter == "Asian") {
                                    return (p0.latest.student.demographics.race_ethnicity.asian - p1.latest.student.demographics.race_ethnicity.asian).toInt()
                                } else {
                                    return 0
                                    Log.d(MainActivity.TAG, "No Filter matches")
                                }
                            }
                        }
                    })

                    Log.d("Response", "collegeList size: ${collegeList?.size}")
                    Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")

                    // Set Recycler here
                    college_recycler.apply {
                        setHasFixedSize(true)
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        adapter = CollegesAdapter(collegeList!!)
                    }
                }
            }

            override fun onFailure(call: Call<CollegeWrapper>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Something went wrong $t", Toast.LENGTH_SHORT).show()
                Log.d(MainActivity.TAG, "$t")
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.home -> {
                Navigation.findNavController(this, R.id.navHostFragment).popBackStack(R.id.navHostFragment, true)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}