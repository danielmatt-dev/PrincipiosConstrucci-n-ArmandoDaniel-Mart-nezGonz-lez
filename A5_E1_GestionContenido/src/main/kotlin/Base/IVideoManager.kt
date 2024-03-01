import org.example.Clases.Video

// Interface que contiene las funciones para crear, editar, publicar y archivar videos
interface IVideoManager {

    // Función para crear videos
    fun createVideo(v : Video)

    // Funcion para editar videos
    fun editVideo(v : Video)

    // Función para publicar videos
    fun publishVideo(v : Video)

    // Función para archivar videos
    fun archiveVideo(v : Video)

}