package dev.yuyuyuyuyu.mymaterialthemeexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform