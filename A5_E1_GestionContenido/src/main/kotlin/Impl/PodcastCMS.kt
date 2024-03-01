package org.example.Impl

import IPodcastManager
import org.example.Clases.Podcast

// Clase que implementa la interfaz de IPodcastManager
class PodcastCMS : IPodcastManager {

    // Funcion createPodcast
    override fun createPodcast(p: Podcast) {
        println("Podcast creado")
    }

    // Funcion editPodcast
    override fun editPodcast(p: Podcast) {
        println("Podcast editado")
    }

    // Funcion publishPodcast
    override fun publishPodcast(p: Podcast) {
        println("Podcast publicado")
    }

    // Funcion archivePodcast
    override fun archivePodcast(p: Podcast) {
        println("Podcast archivado")
    }

}