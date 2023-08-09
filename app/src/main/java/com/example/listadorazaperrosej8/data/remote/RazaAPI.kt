package com.example.listadorazaperrosej8.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RazaAPI {
    @GET("breeds/list/all")
    suspend fun getData():Response<Raza>

    @GET("breeds/{id}/images")
    suspend fun getDetalleRaza(@Path("id") id:String): Response<PerrooDetalle>
}