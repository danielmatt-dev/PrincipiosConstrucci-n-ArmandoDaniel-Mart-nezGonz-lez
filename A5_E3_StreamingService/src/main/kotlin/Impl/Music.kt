package org.example.Impl

import org.example.Base.IMusicService

/* Clase que implementa la interfaz IMusicService para proporcionar
   funcionalidades relacionadas con la música.
*/
class Music : IMusicService {

    // Función para reproducir una pista de música específica
    override fun playMusic(trackId: String) {
        println("Reproduciendo música $trackId")
    }

    // Función para buscar música según una consulta dada
    override fun searchMusic(query: String): List<String> {
        println("Buscando música...")
        return emptyList()
    }

    // Función para generar recomendaciones de música
    override fun recommendMusic(): List<String> {
        println("Música recomendada...")
        return emptyList()
    }
}