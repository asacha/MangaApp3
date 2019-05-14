package com.ascstb.repository.mangaTown.responses

import androidx.annotation.Keep
import pl.droidsonroids.jspoon.annotation.Selector

@Keep
class LatestMangaResponse {
    @Selector(value = ".manga_pic_list > li")
    var latestMangaList: List<MangaResponse> = listOf()
}

@Keep
class MangaResponse {
    @Selector(value = "p.title > a", attr = "title")
    var title: String = ""

    @Selector(value = "a.manga_cover > img", attr = "src")
    var coverUrl: String = ""

    @Selector(value = "a.manga_cover", attr = "href")
    var url: String = ""

    @Selector(value = "p.new_chapter > a", attr = "title")
    var latestChapter: String = ""

    @Selector(value = "p.new_chapter > a", attr = "href")
    var latestChapterUrl: String = ""

    @Selector(value = "p.view:last-child")
    var latestUpdate: String = ""
}