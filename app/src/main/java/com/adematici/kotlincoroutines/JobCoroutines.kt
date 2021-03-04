package com.adematici.kotlincoroutines
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val firstJob = launch {
            delay(2000)
            println("firstJob")
            val secondJob = launch {
                println("secondJob")
            }
        }
        firstJob.invokeOnCompletion {
            println("Job finished.")
        }

    }
}