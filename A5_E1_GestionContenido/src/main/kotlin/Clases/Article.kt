package org.example.Clases

import IArticleManager
import org.example.Impl.ArticleCMS

// Clase Article que usa a IArticleManager como atributo
class Article(private var articleCMS : IArticleManager = ArticleCMS()) {

    // Función que ejecuta todas las funciones de ArticleCMS
    fun gestionarArticulo(){
        articleCMS.createArticle(this)
        articleCMS.editArticle(this)
        articleCMS.archiveArticle(this)
        articleCMS.archiveArticle(this)
    }

}