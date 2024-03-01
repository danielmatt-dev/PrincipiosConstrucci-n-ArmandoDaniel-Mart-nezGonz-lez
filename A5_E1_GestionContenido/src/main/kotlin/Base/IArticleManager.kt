import org.example.Clases.Article

// Interface que contiene las funciones para crear, editar, publicar y archivar articulos
interface IArticleManager {

    // Función para crear articulos
    fun createArticle(a : Article)

    // Funcion para editar articulos
    fun editArticle(a: Article)

    // Función para publicar articulos
    fun publishArticle(a: Article)

    // Función para archivar articulos
    fun archiveArticle(a: Article)

}