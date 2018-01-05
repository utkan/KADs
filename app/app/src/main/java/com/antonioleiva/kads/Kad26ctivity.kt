package com.antonioleiva.kads

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.antonioleiva.kads.kad26.Toaster

class Kad26ctivity : AppCompatActivity(), Toaster {

    // https://antonioleiva.com/interfaces-kotlin/
    
    override val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kad26ctivity)

        toast("onCreate")
    }
}
