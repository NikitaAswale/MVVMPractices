package com.example.myapplication.data.repository

import com.example.myapplication.data.api.RetrofitInstance
import com.example.myapplication.data.model.Post

class PostRepository {
    private val apiService = RetrofitInstance.api
    
    suspend fun getPosts(): List<Post> {
        return try {
            apiService.getPosts()
        } catch (e: Exception) {
            emptyList()
        }
    }
}
