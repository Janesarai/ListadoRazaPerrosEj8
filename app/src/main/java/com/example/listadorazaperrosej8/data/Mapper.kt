package com.example.listadorazaperrosej8.data

import com.example.listadorazaperrosej8.data.local.RazaDetalle

//fun de extencion
//esta extendiendo la clase string, aplica a ese exxtring this, la funcion para transofmar a entity
fun String.toEntity(id:String): RazaDetalle = RazaDetalle(id,this)