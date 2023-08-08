package com.example.listadorazaperrosej8.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RazaRetrofit {

    companion object {
        private  const val URL_BASE = "https://dog.ceo/api/"


    fun getRetrofitRaza() : RazaAPI {
        val mRetrofit = Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return mRetrofit.create(RazaAPI::class.java)

        }
    }
}