package dev.yuyuyuyuyu.mymaterialthemeexample

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}