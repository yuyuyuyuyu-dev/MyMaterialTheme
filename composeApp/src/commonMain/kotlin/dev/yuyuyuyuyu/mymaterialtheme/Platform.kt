package dev.yuyuyuyuyu.mymaterialtheme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform