package org.example.Impl

import IArticleManager
import org.example.Clases.Article

class ArticleCMS : IArticleManager {

    override fun createArticle(a: Article) {
        println("Artículo creado")
    }

    override fun editArticle(a: Article) {
        println("Artículo editado")
    }

    override fun publishArticle(a: Article) {
        println("Artículo publicado")
    }

    override fun archiveArticle(a: Article) {
        println("Artículo archivado")
    }

}