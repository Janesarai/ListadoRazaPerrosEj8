package com.example.listadorazaperrosej8.data

import com.example.listadorazaperrosej8.data.local.RazaDetalle
import com.example.listadorazaperrosej8.data.local.RazaEntity

//fun de extencion
//esta extendiendo la clase string, aplica a ese exxtring this, la funcion para transofmar a entity
fun String.toEntity(id:String): RazaDetalle = RazaDetalle(id,this)

fun String.toRazaEntity(): RazaEntity = RazaEntity(this)