package com.example.collegefinalproject.services

import com.example.collegefinalproject.models.College
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CollegeService {

    @GET("/v1/schools?api_key=JwqB47hsWQYqWuyAdDNuRMYiidSuQe1w8i38NYY4")
    fun getCollegesList(@Query("api_key") api_key : String) : CollegeWrapper
}