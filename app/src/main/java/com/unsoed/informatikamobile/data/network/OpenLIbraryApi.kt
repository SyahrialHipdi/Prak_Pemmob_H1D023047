package com.unsoed.informatikamobile.data.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenLIbraryApi {
    @GET("search.json")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("limit") Limit: Int
    ): Response<com.unsoed.informatikamobile.data.model.SearchResponse>
}