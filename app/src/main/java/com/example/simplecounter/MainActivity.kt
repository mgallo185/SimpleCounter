package com.example.simplecounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        var counter = 0
        val textView = findViewById<TextView>(R.id.TextView)

        val plusbutton = findViewById<Button>(R.id.upgradeHard)

        button.setOnClickListener {
            counter++
            textView.text = counter.toString()
            //Toast.makeText(it.context, "Clicked Button",Toast.LENGTH_SHORT ).show()

        if(counter >=100){
            plusbutton.visibility= View.VISIBLE
            plusbutton.setOnClickListener {
                button.text = "add 2"


                button.setOnClickListener {
                    counter= counter+2
                    textView.text = counter.toString()
                }
                plusbutton.visibility= View.INVISIBLE
            }
        }



        }












    }

}
