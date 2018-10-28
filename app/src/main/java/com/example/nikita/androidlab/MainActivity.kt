package com.example.nikita.androidlab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d(TAG,"onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestart() {
        Log.d(TAG," onRestart(")
        super.onRestart()
    }


    override fun onResume() {
        Log.d(TAG,"onResume()")
        super.onResume()
    }


    override fun onPause() {
        Log.d(TAG,"onPause()")
        super.onPause()
    }


    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG,"onSaveInstanceState(outState: Bundle?)")
        super.onSaveInstanceState(outState)
    }


    override fun onStop() {
        Log.d(TAG,"onStop()")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d(TAG,"onDestroy()")
        super.onDestroy()
    }
}
