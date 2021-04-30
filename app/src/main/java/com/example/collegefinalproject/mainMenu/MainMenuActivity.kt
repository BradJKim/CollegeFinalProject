package com.example.collegefinalproject.mainMenu

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.backendless.Backendless
import com.backendless.async.callback.AsyncCallback
import com.backendless.exceptions.BackendlessFault
import com.example.collegefinalproject.R
import com.example.collegefinalproject.login.Account
import kotlinx.android.synthetic.main.activity_main.*


class MainMenuActivity : AppCompatActivity() {

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

        button_main_filter.setOnClickListener {

        }

        button_main_viewing.setOnClickListener {

        }

        button_main_settings.setOnClickListener {

        }

    }
}