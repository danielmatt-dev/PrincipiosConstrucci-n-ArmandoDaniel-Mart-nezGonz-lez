package org.example

import org.example.Clases.Article
import org.example.Clases.Podcast
import org.example.Clases.Video

fun main() {

    // Objeto de tipo Article
    val articulo = Article()

    // Objeto de tipo Video
    val video = Video()

    // Objeto de tipo Podcast
    val podcast = Podcast()

    // Ejecución de las funciones de cada objeto
    println("---------------Artículo---------------")
    articulo.gestionarArticulo()

    println("---------------Vídeo---------------")
    video.gestionarVideo()

    println("---------------Podcast---------------")
    podcast.gestionarPodcast()

}