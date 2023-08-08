package com.example.listadorazaperrosej8.vistas

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.listadorazaperrosej8.data.Repositorio
import com.example.listadorazaperrosej8.data.local.RazaDataBase
import com.example.listadorazaperrosej8.data.remote.RazaRetrofit
import kotlinx.coroutines.launch

class RazaVM ( application: Application): AndroidViewModel(application) {
    private val repositorio: Repositorio


    init {
        val api = RazaRetrofit.getRetrofitRaza()
        val razaDataBase = RazaDataBase.getDatabase(application).getRazaDao()
        repositorio = Repositorio(api, razaDataBase)

    }

    fun getTodasRazas() = viewModelScope.launch {
        repositorio.getRazas()
    }
}