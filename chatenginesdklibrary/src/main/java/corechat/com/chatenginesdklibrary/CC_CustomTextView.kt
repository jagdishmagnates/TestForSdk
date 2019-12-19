package corechat.com.chatenginesdklibrary

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class CC_CustomTextView : TextView {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) :
            super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr) {
        init()
    }


    fun init() {
        val font: Typeface = Typeface.createFromAsset(context.assets, "fonts/roboto_medium.ttf")
        this.typeface = font
    }

    override fun setTypeface(tf: Typeface?, style: Int) {
        val ttf: Typeface = Typeface.createFromAsset(context.assets,"fonts/roboto_medium.ttf")
        super.setTypeface(ttf, style)
    }

    override fun setTypeface(tf: Typeface?) {
        val ttf = Typeface.createFromAsset(context.assets, "fonts/roboto_medium.ttf")
        super.setTypeface(ttf)
    }
}