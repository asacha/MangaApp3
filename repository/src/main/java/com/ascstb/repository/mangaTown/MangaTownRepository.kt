package com.ascstb.repository.mangaTown

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ascstb.model.Manga
import kotlinx.coroutines.runBlocking

interface MangaTownRepository {
    fun getLatestMangaAsync(page: Int): LiveData<List<Manga>>
}

class MangaTownRepositoryImpl(
    private val mangaTownApi: MangaTownApi
) : MangaTownRepository {
    private var latestData = MutableLiveData<List<Manga>>()

    override fun getLatestMangaAsync(page: Int): LiveData<List<Manga>> {
        runBlocking {
            mangaTownApi.getLatestMangaAsync(page).await().latestMangaList.let { response ->
                latestData.value = response.map {
                    Manga(
                        title = it.title,
                        coverUr = it.coverUrl,
                        url = it.url,
                        latestChapter = it.latestChapter,
                        latestChapterUrl = it.latestChapterUrl
                    )
                }
            }
        }

        return latestData
    }
}