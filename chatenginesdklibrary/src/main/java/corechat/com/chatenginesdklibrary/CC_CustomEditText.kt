package corechat.com.chatenginesdklibrary

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.EditText

class CC_CustomEditText : EditText {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) :
            super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    fun init() {
        val font: Typeface = Typeface.createFromAsset(context.assets, SdkPreferencesManager(context).getAppFont())
        this.typeface = font
    }

    override fun setTypeface(tf: Typeface?, style: Int) {
        val ttf: Typeface = Typeface.createFromAsset(context.assets, SdkPreferencesManager(context).getAppFont())
        super.setTypeface(ttf, style)
    }

    override fun setTypeface(tf: Typeface?) {
        val ttf = Typeface.createFromAsset(context.assets, SdkPreferencesManager(context).getAppFont())
        super.setTypeface(ttf)
    }
}