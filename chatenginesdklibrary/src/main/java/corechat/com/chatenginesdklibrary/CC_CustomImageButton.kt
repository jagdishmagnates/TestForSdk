package corechat.com.corechatdemo.custom_views

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton

class CC_CustomImageButton : ImageButton {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) :
            super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    fun setCustomDrawableToButton(drawable: Int) {
        setBackgroundResource(drawable)
//        val font : Typeface = Typeface.createFromAsset(context.assets, AppTheme.CC_getCustomFont())
//        this.typeface = font
    }
}