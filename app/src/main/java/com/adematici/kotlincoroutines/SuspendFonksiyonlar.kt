package com.adematici.kotlincoroutines
import kotlinx.coroutines.*
fun main(){
    println("Suspend basinda")
    runBlocking {
        introduceYourself()
    }
    println("suspend sonunda")
}

suspend fun introduceYourself(){
    delay(2000)
    coroutineScope {
        launch {
            println("Merhaba ben suspend fonksiyonum.")
        }
    }
}