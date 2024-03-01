package org.example.Impl

import IVideoManager
import org.example.Clases.Video

// Clase que implementa la interfaz de IVideoManager
class VideoCMS : IVideoManager{

    // Funcion createVideo
    override fun createVideo(v: Video) {
        println("Video creado")
    }

    // Funcion editVideo
    override fun editVideo(v: Video) {
        println("Video editado")
    }

    // Funcion publishVideo
    override fun publishVideo(v: Video) {
        println("Video publicado")
    }

    // Funcion archiveVideo
    override fun archiveVideo(v: Video) {
        println("Video archivado")
    }

}