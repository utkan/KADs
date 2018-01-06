package com.antonioleiva.kads.kad04

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.antonioleiva.kads.R
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions
import kotlinx.android.synthetic.main.activity_kad04ctivity.*

@ContainerOptions(CacheImplementation.SPARSE_ARRAY)
class Kad04ctivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kad04ctivity)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        intent.putExtra("model", Model("", -1))
        val model = intent.getParcelableExtra<Model>("model")

    }

    override fun onDestroy() {
//        clearFindViewByIdCache()
        super.onDestroy()
    }
}
