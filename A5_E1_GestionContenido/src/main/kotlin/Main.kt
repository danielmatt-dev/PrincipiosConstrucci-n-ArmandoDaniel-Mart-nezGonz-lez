package org.example

import org.example.Clases.Article
import org.example.Clases.Podcast
import org.example.Clases.Video

fun main() {

    val articulo = Article()
    val video = Video()
    val podcast = Podcast()

    println("---------------Artículo---------------")
    articulo.gestionarArticulo()

    println("---------------Vídeo---------------")
    video.gestionarVideo()

    println("---------------Podcast---------------")
    podcast.gestionarPodcast()

}