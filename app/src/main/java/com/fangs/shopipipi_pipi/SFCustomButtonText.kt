package com.fangs.shopipipi_pipi

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class SFCustomButtonText(context : Context, attrs: AttributeSet) : AppCompatButton(context, attrs){

    init {
        applyFont()
    }

    private fun applyFont() {
        val typeface = Typeface.createFromAsset(context.assets, "sf_regular.otf")
        setTypeface(typeface)
    }
}