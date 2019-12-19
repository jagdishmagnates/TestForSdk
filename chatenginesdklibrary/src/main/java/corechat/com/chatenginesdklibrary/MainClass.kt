package corechat.com.chatenginesdklibrary

import android.content.Context

class MainClass {

    constructor(context: Context)

//    companion object{
        fun printMessage(msg : String, view: CC_CustomTextView){
            view.init()
            view.text = msg
        }
//    }

}