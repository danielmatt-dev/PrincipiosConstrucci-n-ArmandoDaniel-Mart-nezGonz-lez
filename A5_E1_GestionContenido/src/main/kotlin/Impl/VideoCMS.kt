package org.example.Impl

import IVideoManager
import org.example.Clases.Video

class VideoCMS : IVideoManager{

    override fun createVideo(v: Video) {
        println("Video creado")
    }

    override fun editVideo(v: Video) {
        println("Video editado")
    }

    override fun publishVideo(v: Video) {
        println("Video publicado")
    }

    override fun archiveVideo(v: Video) {
        println("Video archivado")
    }

}