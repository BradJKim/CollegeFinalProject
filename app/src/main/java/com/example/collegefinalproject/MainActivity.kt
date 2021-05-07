package com.example.collegefinalproject

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.backendless.Backendless
import com.backendless.async.callback.AsyncCallback
import com.backendless.exceptions.BackendlessFault
import com.example.collegefinalproject.activities.collegeList
import com.example.collegefinalproject.models.College
import com.example.collegefinalproject.services.CollegeService
import com.example.collegefinalproject.services.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    companion object{
     val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Backendless.Data.of(Account::class.java).find(object : AsyncCallback<List<Account?>?> {
                override fun handleResponse(foundAccounts: List<Account?>?) {
                    // every loaded object from the "Contact" table is now an individual java.util.Map
                    Log.d(TAG, "handleResponse: " + foundAccounts.toString())
                }

                override fun handleFault(fault: BackendlessFault) {
                    // an error has occurred, the error code can be retrieved with fault.getCode()
                    Log.d(TAG, "handleFault: " + fault.message)
                }
            })
        loadColleges()
    }

    private fun loadColleges() {
        val destinationService = ServiceBuilder.buildService(CollegeService::class.java)
        val requestCall = destinationService.getCollegesList()

        requestCall.enqueue(object : Callback<List<College>> {
            override fun onResponse(call: Call<List<College>>, response: Response<List<College>>) {
                Log.d("Response", "onResponse: ${response.body()}")
                if (response.isSuccessful){
                    val collegeList = response.body() ?: emptyList()
                    Log.d("Response", "collegeList size: ${collegeList.size}")
                }
                else{
                    Toast.makeText(this@MainActivity, "Something went wrong ${response.message()}", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<List<College>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Something went wrong $t", Toast.LENGTH_SHORT).show()
            }
        })
    }
}