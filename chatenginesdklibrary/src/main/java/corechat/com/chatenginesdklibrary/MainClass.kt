package corechat.com.chatenginesdklibrary

import android.content.Context
import android.widget.Button
import corechat.com.chatenginesdklibrary.Utils.SdkPreferencesManager
import corechat.com.corechatdemo.custom_views.CC_CustomButton
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainClass(context: Context) {

    private val mContext : Context = context

    val AppPrefs = SdkPreferencesManager(mContext)

    fun setAppTheme(font: String, bgDrawable : Int){

        CC_CustomButton(mContext)

        AppPrefs.setAppFont(font)
        AppPrefs.setBgDrawable(bgDrawable)
    }

    fun setCustomBg(view: View, bgDrawable : Int){
        AppPrefs.setBgDrawable(bgDrawable)
        view.setBackgroundResource(bgDrawable)
    }

    fun setCustomButtonFont(view: Button, font : String){
        val font: Typeface = Typeface.createFromAsset(mContext.assets, font)
        view.typeface = font
    }

    fun setCustomTextViewFont(view: TextView, font : String){
        val font: Typeface = Typeface.createFromAsset(mContext.assets, font)
        view.typeface = font
    }

    fun setCustomEditTextFont(view: EditText, font : String){
        val font: Typeface = Typeface.createFromAsset(mContext.assets, font)
        view.typeface = font
    }

    fun changeBgColor(view: View, color : Int){
        (view.background as GradientDrawable).setColor(ContextCompat.getColor(mContext,color))
    }
}