package corechat.com.chatenginesdklibrary

import android.content.Context

class MainClass {

    companion object{
        fun printMessage(context : Context, msg : String, view: CC_CustomTextView){
            view.init()
            view.text = msg
        }
    }

}