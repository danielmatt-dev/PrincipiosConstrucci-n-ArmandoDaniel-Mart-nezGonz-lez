package org.example.Clases

import IPodcastManager
import org.example.Impl.PodcastCMS

class Podcast(private var podcastCMS: IPodcastManager = PodcastCMS()) {

    fun gestionarPodcast(){
        podcastCMS.createPodcast(this)
        podcastCMS.editPodcast(this)
        podcastCMS.publishPodcast(this)
        podcastCMS.archivePodcast(this)
    }

}