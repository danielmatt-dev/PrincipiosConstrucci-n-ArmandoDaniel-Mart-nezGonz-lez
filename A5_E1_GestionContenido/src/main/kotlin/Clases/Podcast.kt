package org.example.Clases

import IPodcastManager
import org.example.Impl.PodcastCMS

// Clase Podcast que usa a IPodcastManager como atributo
class Podcast(private var podcastCMS: IPodcastManager = PodcastCMS()) {

    // Función que ejecuta todas las funciones de PodcastCMS
    fun gestionarPodcast(){
        podcastCMS.createPodcast(this)
        podcastCMS.editPodcast(this)
        podcastCMS.publishPodcast(this)
        podcastCMS.archivePodcast(this)
    }

}