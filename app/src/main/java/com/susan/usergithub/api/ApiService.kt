package com.susan.usergithub.api

import com.susan.usergithub.model.DetailResponse
import com.susan.usergithub.model.GitUser
import com.susan.usergithub.model.GitUserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUser(
        @Query("q") query: String
    ): Call<GitUserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUser(
        @Path("username") username: String
    ): Call<DetailResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<GitUser>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<GitUser>>
}