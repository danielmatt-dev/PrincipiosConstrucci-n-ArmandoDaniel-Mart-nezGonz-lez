import org.example.Clases.Article

interface IArticleManager {

    fun createArticle(a : Article)
    fun editArticle(a: Article)
    fun publishArticle(a: Article)
    fun archiveArticle(a: Article)

}