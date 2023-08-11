package com.example.listadorazaperrosej8.data

import org.junit.Assert.*

import org.junit.Test

class MapperTest {

    @Test
    fun toEntity() {
        //Given, dado este valor

        val url = "http://example.com"
        val id = "datoId"

        //when, hago esto (cuando?)

        val resultaUrlfoTransformacion = url.toEntity(id)

        //Then, epero este resultado

        assertEquals(id,resultaUrlfoTransformacion.razaDetalle)
        assertEquals(url,resultaUrlfoTransformacion.url)
    }

    @Test
    fun toRazaEntity() {
        //Given, dado este valor

        val raza = "siraza"

        //when, hago esto (cuando?)

        val resultaUrlfoTransformacion = raza.toRazaEntity()

        //Then, epero este resultado

        assertEquals(raza,resultaUrlfoTransformacion.raza)
    }
}