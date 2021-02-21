package com.adematici.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*GlobalScope.launch {
            launch(Dispatchers.Main){
                println("Main Thread      : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("Default Thread   : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined){
                println("Unconfined Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread        : ${Thread.currentThread().name}")
            }
        }*/
    }
}