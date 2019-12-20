package corechat.com.chatenginesdklibrary.Utils

import android.content.Context
import android.content.SharedPreferences
import corechat.com.chatenginesdklibrary.R

class SdkPreferencesManager(context: Context) {

    val APP_THEMES = "app_themes"
    var MODE_PRIVATE = Context.MODE_PRIVATE

    val SEMI_ROUND_DRAWABLE = "semi_round_drawable"
    val ROUNDED_RECT_DRAWABLE = "rounded_rect_drawable"
    val OVAL_DRAWABLE = "oval_drawable"

    val ROBOTO_REGULAR_FONT = "roboto_regular_font"
    val ROBOTO_LIGHT_FONT = "roboto_light_font"
    val ROBOTO_MEDIUM_FONT = "roboto_medium_font"

    val SEMI_ROUND: Int = R.drawable.semi_round_button
    val ROUNDED_RECT: Int = R.drawable.rounded_rect_button
    val OVAL: Int = R.drawable.oval_rounded_button
    val ROBOTO_REGULAR = "roboto_regular.ttf"
    val ROBOTO_LIGHT = "roboto_light.ttf"
    val ROBOTO_MEDIUM = "roboto_medium.ttf"

    var CC_CustomButtonBG: Int = R.drawable.rounded_rect_button
    var FONT_PATH = "fonts/$ROBOTO_REGULAR"

    val APP_FONT_PATH = "app_font_path"
    val APP_BG_DRAWABLE = "app_bg_drawable"

    val appThemesPrefs : SharedPreferences = context.getSharedPreferences(APP_THEMES,MODE_PRIVATE)
    val editor : SharedPreferences.Editor = appThemesPrefs.edit()

    init {
        editor.putString(ROBOTO_LIGHT_FONT,ROBOTO_LIGHT)
        editor.putString(ROBOTO_MEDIUM_FONT,ROBOTO_MEDIUM)
        editor.putString(ROBOTO_REGULAR_FONT,ROBOTO_REGULAR)

        editor.putInt(SEMI_ROUND_DRAWABLE,SEMI_ROUND)
        editor.putInt(ROUNDED_RECT_DRAWABLE,ROUNDED_RECT)
        editor.putInt(OVAL_DRAWABLE,OVAL)

        editor.commit()
    }

    fun setAppFont(font : String){
        editor.putString(APP_FONT_PATH,font)
        editor.commit()
    }

    fun getAppFont() : String{
        return appThemesPrefs.getString(APP_FONT_PATH,FONT_PATH)
    }

    fun setBgDrawable(drawable : Int){
        editor.putInt(APP_BG_DRAWABLE,drawable)
        editor.commit()
    }

    fun getBgDrawable(): Int {
        return appThemesPrefs.getInt(APP_BG_DRAWABLE,CC_CustomButtonBG)
    }

}