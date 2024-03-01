package org.example.Clases

import IArticleManager
import org.example.Impl.ArticleCMS

class Article(private var articleCMS : IArticleManager = ArticleCMS()) {

    fun gestionarArticulo(){
        articleCMS.createArticle(this)
        articleCMS.editArticle(this)
        articleCMS.archiveArticle(this)
        articleCMS.archiveArticle(this)
    }

}