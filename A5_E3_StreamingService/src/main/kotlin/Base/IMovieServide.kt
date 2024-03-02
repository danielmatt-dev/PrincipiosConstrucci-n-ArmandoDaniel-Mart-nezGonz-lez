package org.example.Base

/**
 * Interfaz que define las operaciones relacionadas con el servicio de series de televisión.
 */
interface IMovieServide {

    /**
     * Reproduce una serie de televisión específica.
     * @param seriesId Identificador único de la serie de televisión a reproducir.
     */
    fun playMovie(movieId : String)

    /**
     * Busca series de televisión según una consulta dada.
     * @param query Consulta para buscar series de televisión.
     * @return Lista de nombres de series de televisión que coinciden con la consulta.
     */
    fun searchMovies(query : String) : List<String>

    /**
     * Genera recomendaciones de series de televisión.
     * @return Lista de nombres de series de televisión recomendadas.
     */
    fun recommendMovie() : List<String>

}