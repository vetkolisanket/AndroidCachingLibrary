package com.example.cachinglibrary

class Cache {

    private val cache by lazy { mutableMapOf<String, Any>() }

    fun setData(key: String, data: Any) {
        cache[key] = data
    }

    fun getData(key: String): Any? = cache[key]

}