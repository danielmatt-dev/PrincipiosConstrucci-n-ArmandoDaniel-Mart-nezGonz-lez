package org.example.Base

/**
 * Interfaz que define las operaciones relacionadas con el servicio de películas.
 */
interface ITVSeriesService {

    /**
     * Reproduce una película específica.
     * @param movieId Identificador único de la película a reproducir.
     */
    fun playTVSeries(seriesId : String)

    /**
     * Busca películas según una consulta dada.
     * @param query Consulta para buscar películas.
     * @return Lista de nombres de películas que coinciden con la consulta.
     */
    fun searchTVSeries(query : String) : List<String>

    /**
     * Genera recomendaciones de películas.
     * @return Lista de nombres de películas recomendadas.
     */
    fun recommendTVSeries() : List<String>

}