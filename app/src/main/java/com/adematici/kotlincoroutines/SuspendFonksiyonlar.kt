package com.adematici.kotlincoroutines
import kotlinx.coroutines.*
fun main(){
    println("Suspend basinda")
    runBlocking {
        sayHi()
    }
    println("suspend sonunda")
}

suspend fun sayHi(){
    delay(2000)
    coroutineScope {
        launch {
            println("Merhaba ben suspend fonksiyonum.")
        }
    }
}