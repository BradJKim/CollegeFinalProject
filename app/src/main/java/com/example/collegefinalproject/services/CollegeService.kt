package com.example.collegefinalproject.services

import com.example.collegefinalproject.models.College
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CollegeService {

    @GET("schools")
    fun getCollegesList(@Query("api_key") api_key : String) : Call<CollegeWrapper>
}