package com.example.listadorazaperrosej8.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.listadorazaperrosej8.data.local.RazaDao
import com.example.listadorazaperrosej8.data.local.RazaDetalle
import com.example.listadorazaperrosej8.data.local.RazaEntity
import com.example.listadorazaperrosej8.data.remote.RazaAPI

class Repositorio( private val razaAPI: RazaAPI, private val razaDao: RazaDao) {

    fun obtenerRazasEntity(): LiveData<List<RazaEntity>> = razaDao.getRazas()
    suspend fun getRazas(){
        val response = razaAPI.getData()// llegan los datos
        if (response.isSuccessful){ //llegaron los datos?
            val message = response.body()!!.message //solo sacando la parte del mensaje, sin status
            val keys = message.keys

            keys.forEach{
                val razaEntity = RazaEntity(it)
                razaDao.insertRaza(razaEntity)
            }
                }else{
            Log.e("respositorio",response.errorBody().toString())
                }
        }

    suspend fun getDetallePerro(id:String){
        val response = razaAPI.getDetalleRaza(id)// llegan los datos
        if (response.isSuccessful){
            response.body()!!.message.forEach{
                val razaDetalle = RazaDetalle(id,it)
                razaDao.insertDetallePerro(razaDetalle)  //seria el raza detalle que ed un entiti
            }


            }else{
                Log.e("respositorio",response.errorBody().toString())
        }
    }
}


