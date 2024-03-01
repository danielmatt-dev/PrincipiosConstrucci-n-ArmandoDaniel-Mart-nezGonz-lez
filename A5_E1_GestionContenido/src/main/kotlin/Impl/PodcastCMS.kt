package org.example.Impl

import IPodcastManager
import org.example.Clases.Podcast

class PodcastCMS : IPodcastManager {

    override fun createPodcast(p: Podcast) {
        println("Podcast creado")
    }

    override fun editPodcast(p: Podcast) {
        println("Podcast editado")
    }

    override fun publishPodcast(p: Podcast) {
        println("Podcast publicado")
    }

    override fun archivePodcast(p: Podcast) {
        println("Podcast archivado")
    }

}