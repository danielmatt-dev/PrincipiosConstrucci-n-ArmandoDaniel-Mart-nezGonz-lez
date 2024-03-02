package org.example

import org.example.Controller.StreamingServiceController
import org.example.Impl.Movie
import org.example.Impl.Music
import org.example.Impl.TVSeries

fun main() {
    // Demostración de funcionalidades para el servicio de música
    println("Music------------")
    val music = Music()

    // Reproducir música con el ID 001
    music.playMusic("001")

    // Buscar música con la consulta "query"
    println(music.searchMusic("query"))

    // Generar recomendaciones de música
    println(music.recommendMusic())

    // Demostración de funcionalidades para el servicio de películas
    println("\nMovie------------")
    val movie = Movie()

    // Reproducir la película con el ID 010
    movie.playMovie("010")

    // Buscar películas con la consulta "query"
    println(movie.searchMovies("query"))

    // Generar recomendaciones de películas
    println(movie.recommendMovie())

    // Demostración de funcionalidades para el servicio de series de televisión
    println("\nTVSeries------------")
    val tvSeries = TVSeries()

    // Reproducir la serie de televisión con el ID 100
    tvSeries.playTVSeries("100")

    // Buscar series de televisión con la consulta "query"
    println(tvSeries.searchTVSeries("query"))

    // Generar recomendaciones de series de televisión
    println(tvSeries.recommendTVSeries())


    // Demostración de funcionalidades para el controlador de servicios de streaming
    println("\nController------------")
    val controller = StreamingServiceController()

    // Reproducir música con el ID 002
    controller.playMusic("002")

    // Buscar música con el controlador y la consulta "query"
    println(controller.searchMusic("query"))

    // Generar recomendaciones de música con el controlador
    println(controller.recommendMusic())

    // Reproducir la película con el ID 020
    controller.playMovie("020")

    // Buscar películas con el controlador y la consulta "query"
    println(controller.searchMovies("query"))

    // Generar recomendaciones de películas con el controlador
    println(controller.recommendMovie())

    // Reproducir la serie de televisión con el ID 200
    controller.playTVSeries("200")

    // Buscar series de televisión con el controlador y la consulta "query"
    println(controller.searchTVSeries("query"))

    // Generar recomendaciones de series de televisión con el controlador
    println(controller.recommendTVSeries())


}
