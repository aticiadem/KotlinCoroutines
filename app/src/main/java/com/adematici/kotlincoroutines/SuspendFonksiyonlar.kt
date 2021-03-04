package com.adematici.kotlincoroutines
import kotlinx.coroutines.*
fun main(){
    println("Suspend basinda")
    runBlocking {
        selamVer()
    }
    println("Suspend sonunda")
}

suspend fun selamVer(){
    delay(2000)
    coroutineScope {
        launch {
            println("Merhaba ben suspend fonksiyonum.")
        }
    }
}