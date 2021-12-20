package com.example.companionobjectsapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat

class BackGround {
    var backGround = "color "

    companion object backGrund {

        fun Change(dayOrNight :String,layout:View){

            if(dayOrNight=="day"){
//             var  bakG=  ResourcesCompat.getDrawable(context.resources,R.drawable.day,null)
//                layout.background =bakG

                layout.setBackgroundResource(R.drawable.day)

            }
            else if (dayOrNight=="night"){
                layout.setBackgroundResource(R.drawable.night)

            }

        }
    }
}