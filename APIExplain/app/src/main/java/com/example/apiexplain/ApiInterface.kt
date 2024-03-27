package com.example.apiexplain

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("products")
    fun getproductData():Call<Mydata>
}