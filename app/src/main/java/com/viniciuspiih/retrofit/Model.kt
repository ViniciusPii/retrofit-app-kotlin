package com.viniciuspiih.retrofit

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET

data class Posts(
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    var title: String,
    @SerializedName("body")
    var body: String
)

interface Endpoint {
    @GET("/posts")
    fun getPosts() : Call<List<Posts>>
}