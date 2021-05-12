package com.example.collegefinalproject.mainMenu

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.backendless.Backendless
import com.backendless.async.callback.AsyncCallback
import com.backendless.exceptions.BackendlessFault
import com.example.collegefinalproject.R
import com.example.collegefinalproject.services.CollegeService
import com.example.collegefinalproject.services.CollegeWrapper
import com.example.collegefinalproject.services.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    companion object{
       val TAG = "MainActivity"
       var filter = ""
        var list = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun loadColleges() {
        val destinationService = ServiceBuilder.buildService(CollegeService::class.java)
        val requestCall = destinationService.getCollegesList("JwqB47hsWQYqWuyAdDNuRMYiidSuQe1w8i38NYY4")
        requestCall.enqueue(object : Callback<CollegeWrapper> {
            override fun onResponse(call: Call<CollegeWrapper>, response: Response<CollegeWrapper>) {
                Log.d("Response", "onResponse: ${response.body()}")
                if (response.isSuccessful){
                    val collegeList = response.body()?.results
                    Log.d("Response", "collegeList size: ${collegeList?.size}")
                    Log.d("Response", "College Name: ${collegeList?.get(0)?.school?.name}")
                }
                else{
                    Toast.makeText(this@MainActivity, "Something went wrong ${response.message()}", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<CollegeWrapper>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Something went wrong $t", Toast.LENGTH_SHORT).show()
                Log.d(TAG, "$t")
            }
        })
    }
}