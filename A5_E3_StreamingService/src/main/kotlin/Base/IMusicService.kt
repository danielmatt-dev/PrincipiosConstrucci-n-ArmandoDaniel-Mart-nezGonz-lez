package org.example.Base

/**
 * Interfaz que define las operaciones relacionadas con el servicio de música.
 */
interface IMusicService {

    /**
     * Reproduce una pista de música específica.
     * @param trackId Identificador único de la pista de música a reproducir.
     */
    fun playMusic(trackId : String)

    /**
     * Busca música según una consulta dada.
     * @param query Consulta para buscar música.
     * @return Lista de nombres de canciones que coinciden con la consulta.
     */
    fun searchMusic(query : String) : List<String>

    /**
     * Genera recomendaciones de música.
     * @return Lista de nombres de canciones recomendadas.
     */
    fun recommendMusic() : List<String>

}