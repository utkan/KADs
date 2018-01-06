package com.antonioleiva.kads.kad04

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.antonioleiva.kads.R
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null
        //, defStyleAttr: Int = 0
) : LinearLayout(context, attrs/*, defStyleAttr*/) {
    init {
        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
        itemTitle.text = "Hello Kotlin!"

        if (isInEditMode) {
            itemTitle.text = "isInEditMode"
        }
    }
}