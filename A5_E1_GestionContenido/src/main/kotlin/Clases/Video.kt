package org.example.Clases

import IPodcastManager
import IVideoManager
import org.example.Impl.PodcastCMS
import org.example.Impl.VideoCMS

// Clase Video que usa a IVideoManager como atributo
class Video(private var videoCMS : IVideoManager =  VideoCMS()){

    // Función que ejecuta todas las funciones de VideoCMS
    fun gestionarVideo(){
        videoCMS.createVideo(this)
        videoCMS.editVideo(this)
        videoCMS.publishVideo(this)
        videoCMS.archiveVideo(this)
    }

}