package com.mamburuapps.smack

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import kotlin.random.Random
import kotlin.math.sin
import kotlin.random.nextInt


class CreateUserActivity : AppCompatActivity() {
    
    var userAvatar = "profileDefault" 
    var avatarColor = "[0.5, 0.5, 0.5, 1]"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view:View) {
        val color = Random.nextInt(2)
        val avatar = Random.nextInt(27)
        if (color == 0) {
            userAvatar="light$avatar"
            println(userAvatar)
        }
        else {userAvatar = "dark$avatar"
            println(userAvatar)
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)


    }

    fun createUserClicked(view: View){

    }

   fun  generateBackgroundColorClicked(view:View){

       val r = Random.nextInt(255)
       val b = Random.nextInt(255)
       val g = Random.nextInt(255)

       createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

       val savedR = r.toDouble() / 255
       val savedB = b.toDouble() / 255
       val savedG = g.toDouble() / 255

       avatarColor = "[$savedR, $savedG, $savedB, 1]"
   }

}