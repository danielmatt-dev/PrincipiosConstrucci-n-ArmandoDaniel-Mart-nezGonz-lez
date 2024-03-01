package org.example.Clases

import IPodcastManager
import IVideoManager
import org.example.Impl.PodcastCMS
import org.example.Impl.VideoCMS

class Video(private var videoCMS : IVideoManager =  VideoCMS()){

    fun gestionarVideo(){
        videoCMS.createVideo(this)
        videoCMS.editVideo(this)
        videoCMS.publishVideo(this)
        videoCMS.archiveVideo(this)
    }

}