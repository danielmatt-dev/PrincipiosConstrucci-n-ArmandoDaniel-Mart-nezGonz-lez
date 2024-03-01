import org.example.Clases.Podcast

interface IPodcastManager {

    fun createPodcast(p : Podcast)
    fun editPodcast(p : Podcast)
    fun publishPodcast(p : Podcast)
    fun archivePodcast(p : Podcast)

}