package com.example.listadorazaperrosej8.data.local

import androidx.room.Entity


@Entity(tableName ="tabla_razasDetalle", primaryKeys = ["razaDetalle","url"])
data class RazaDetalle (
    val razaDetalle : String,
    val url: String
)