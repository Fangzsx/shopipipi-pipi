package com.fangs.shopipipi_pipi.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class SFCustomTextview(context : Context, attrs : AttributeSet) : AppCompatTextView(context, attrs)  {

    init{
        applyFont()
    }

    private fun applyFont() {
        val typeface = Typeface.createFromAsset(context.assets, "sf_regular.otf")
        setTypeface(typeface)
    }

}