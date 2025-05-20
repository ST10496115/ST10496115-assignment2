package za.co.st10496115assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tyson : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tyson)
        var resultbutton=findViewById<Button>(R.id.button5)
        var textViewbook=findViewById<TextView>(R.id.textView3)
        val here=findViewById<TextView>(R.id.hereit)
        val name= intent.getStringExtra("user")
        val answerr=intent.getStringExtra("ans")
        textViewbook.text="Q1:true\n"+"Q2:false\n"+"Q3:false\n"+"Q4:true\n"+"Q5:true\n"
        here.text= "USER".plus(userinput)
        resultbutton.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}