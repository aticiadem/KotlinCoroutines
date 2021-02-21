package com.adematici.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    /*var isim = ""
    var yas = 0
    runBlocking {
        val indirilmisIsim = async { indirilenIsim() }
        val indirilmisYas = async { indirilenYas() }
        isim = indirilmisIsim.await()
        yas = indirilmisYas.await()
        println("$isim $yas")
    }*/
}
suspend fun indirilenIsim(): String{
    delay(2000)
    val isim = "Adem"
    println("Isim indirildi.")
    return isim
}
suspend fun indirilenYas(): Int{
    delay(3000)
    val yas = 21
    println("Yas indirildi.")
    return yas
}