package com.ascstb.repository.mangaTown

import com.ascstb.repository.mangaTown.responses.LatestMangaResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface MangaTownApi {
    @GET("latest/{page}.htm")
    fun getLatestMangaAsync(
        @Path("page") page: Int
    ): Deferred<LatestMangaResponse>
}