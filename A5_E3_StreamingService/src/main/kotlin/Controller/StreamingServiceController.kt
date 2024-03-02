package org.example.Controller

import org.example.Base.IMovieServide
import org.example.Base.IMusicService
import org.example.Base.ITVSeriesService
import org.example.Impl.Movie
import org.example.Impl.Music
import org.example.Impl.TVSeries

/* Clase controladora, usa las implementaciones de las interfaces (IMusicService,
                                                                 IMovieServide,
                                                                 ITVSeriesService)
   para usar todas las funciones que estos implementan.
*/
class StreamingServiceController() {

    // Atributos

    // music de tipo IMusicService usa la implementación de Music
    private var music : IMusicService = Music()

    // movie de tipo IMovieServide usa la implementación de Movie
    private var movie : IMovieServide = Movie()

    // tvseries de tipo ITVSeriesService usa la implementación de TVSeries
    private var tvseries : ITVSeriesService = TVSeries()

    // Funciones

    // Función que ejecuta la función de playMusic en el servicio de música
    fun playMusic(trackId: String) {
        music.playMusic(trackId)
    }

    // Función que busca música según la consulta dada en el servicio de música
    fun searchMusic(query: String): List<String> {
        return music.searchMusic(query)
    }

    // Función que genera recomendaciones de música en el servicio de música
    fun recommendMusic(): List<String> {
        return music.recommendMusic()
    }

    // Función que ejecuta la función de playMovie en el servicio de películas
    fun playMovie(movieId: String) {
        movie.playMovie(movieId)
    }

    // Función que busca películas según la consulta dada en el servicio de películas
    fun searchMovies(query: String): List<String> {
        return movie.searchMovies(query)
    }

    // Función que genera recomendaciones de películas en el servicio de películas
    fun recommendMovie(): List<String> {
        return movie.recommendMovie()
    }

    // Función que ejecuta la función de playTVSeries en el servicio de series de televisión
    fun playTVSeries(seriesId: String) {
        tvseries.playTVSeries(seriesId)
    }

    // Función que busca series de televisión según la consulta dada en el servicio de series de televisión
    fun searchTVSeries(query: String): List<String> {
        return tvseries.searchTVSeries(query)
    }

    // Función que genera recomendaciones de series de televisión en el servicio de series de televisión
    fun recommendTVSeries(): List<String> {
        return tvseries.recommendTVSeries()
    }

}