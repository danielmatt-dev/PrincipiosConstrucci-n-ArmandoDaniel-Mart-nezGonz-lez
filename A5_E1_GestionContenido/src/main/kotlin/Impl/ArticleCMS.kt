package org.example.Impl

import IArticleManager
import org.example.Clases.Article

// Clase que implementa la interfaz de IPodcastManager
class ArticleCMS : IArticleManager {

    // Funcion createArticle
    override fun createArticle(a: Article) {
        println("Artículo creado")
    }

    // Funcion editArticle
    override fun editArticle(a: Article) {
        println("Artículo editado")
    }

    // Funcion publishArticle
    override fun publishArticle(a: Article) {
        println("Artículo publicado")
    }

    // Funcion archiveArticle
    override fun archiveArticle(a: Article) {
        println("Artículo archivado")
    }

}