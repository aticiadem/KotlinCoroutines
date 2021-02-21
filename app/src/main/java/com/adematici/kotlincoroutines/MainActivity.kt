package com.adematici.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("runBlocking basladi.")
        runBlocking {
            launch {
                delay(4000)
                println("runBlocking")
            }
        }
        println("runBlocking bitti.")

        println("GlobalScope basladi.")
        GlobalScope.launch {
            delay(4000)
            println("GlobalScope")
        }
        println("GlobalScope bitti.")
        // runBlocking main threadi blokladıgı icin arkaplanda calismaz ve islemin bitmesi gerekir.
        // GlobalScope ise arkaplanda calismaya devam eder, main threadi bloklamaz.
    }
}
