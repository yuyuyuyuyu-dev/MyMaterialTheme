package dev.yuyuyuyuyu.example

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform