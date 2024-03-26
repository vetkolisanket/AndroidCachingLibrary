package com.example.cachinglibrary

public object Cache {

    private val cache by lazy { mutableMapOf<String, Any>() }

    public fun setData(key: String, data: Any) {
        cache[key] = data
    }

    public fun getData(key: String): Any? = cache[key]

}