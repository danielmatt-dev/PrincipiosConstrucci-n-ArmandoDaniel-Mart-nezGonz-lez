package org.example.Impl

import org.example.Base.ITVSeriesService

/* Clase que implementa la interfaz ITVSeriesService para proporcionar
   funcionalidades relacionadas con series de televisión.
*/
class TVSeries : ITVSeriesService {

    // Función para reproducir una serie de televisión específica
    override fun playTVSeries(seriesId: String) {
        println("Reproduciendo TVSeries $seriesId")
    }

    // Función para buscar series de televisión según una consulta dada
    override fun searchTVSeries(query: String): List<String> {
        println("Buscando TVSeries...")
        return emptyList()
    }

    // Función para generar recomendaciones de series de televisión
    override fun recommendTVSeries(): List<String> {
        println("TVSeries recomendadas...")
        return emptyList()
    }
}