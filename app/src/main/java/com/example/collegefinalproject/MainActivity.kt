package com.example.collegefinalproject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.backendless.Backendless
import com.backendless.async.callback.AsyncCallback
import com.backendless.exceptions.BackendlessFault


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

    }
}