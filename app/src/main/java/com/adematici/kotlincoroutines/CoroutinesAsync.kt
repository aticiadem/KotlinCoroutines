package com.adematici.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    var name = ""
    var age = 0
    runBlocking {
        val downloadedName = async { downloadName() }
        val downloadedAge = async { downloadAge() }
        name = downloadedName.await()
        age = downloadedAge.await()
        println("$name $age")
    }
}
suspend fun downloadName(): String{
    delay(2000)
    val name = "Adem"
    println("Isim indirildi.")
    return name
}
suspend fun downloadAge(): Int{
    delay(3000)
    val age = 21
    println("Yas indirildi.")
    return age
}