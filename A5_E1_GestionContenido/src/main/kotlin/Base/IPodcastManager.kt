import org.example.Clases.Podcast

// Interface que contiene las funciones para crear, editar, publicar y archivar podcasts
interface IPodcastManager {

    // Función para crear podcasts
    fun createPodcast(p : Podcast)

    // Funcion para editar podcasts
    fun editPodcast(p : Podcast)

    // Función para publicar podcasts
    fun publishPodcast(p : Podcast)

    // Función para archivar podcasts
    fun archivePodcast(p : Podcast)

}