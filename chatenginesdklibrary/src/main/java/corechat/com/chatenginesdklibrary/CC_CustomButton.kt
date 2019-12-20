package corechat.com.chatenginesdklibrary

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.Button

class CC_CustomButton : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) :
            super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    fun setCustomDrawableToButton(drawable: Int) {
        setBackgroundResource(SdkPreferencesManager(context).getBgDrawable())
        val font: Typeface = Typeface.createFromAsset(context.assets, SdkPreferencesManager(context).getAppFont())
        this.typeface = font
    }
}
