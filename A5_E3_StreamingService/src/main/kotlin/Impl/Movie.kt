package org.example.Impl

import org.example.Base.IMovieServide

/* Clase que implementa la interfaz IMovieService para proporcionar
   funcionalidades relacionadas con películas.
*/
class Movie : IMovieServide {

    // Función para reproducir una película específica
    override fun playMovie(movieId: String) {
        println("Reproduciendo Movie $movieId")
    }

    // Función para buscar películas según una consulta dada
    override fun searchMovies(query: String): List<String> {
        println("Buscando movies...")
        return emptyList()
    }

    // Función para generar recomendaciones de películas
    override fun recommendMovie(): List<String> {
        println("Movie recomendada...")
        return emptyList()
    }
}