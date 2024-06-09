package com.example.news.models

import java.io.Serializable

data class Source(
    val id: String?,
    val name: String
) : Serializable {
    override fun hashCode(): Int {
        return id?.hashCode() ?: 0 + name.hashCode()
    }
}