import org.example.Clases.Video

interface IVideoManager {

    fun createVideo(v : Video)
    fun editVideo(v : Video)
    fun publishVideo(v : Video)
    fun archiveVideo(v : Video)

}