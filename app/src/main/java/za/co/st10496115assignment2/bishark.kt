package za.co.st10496115assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

var QUESTION= arrayOf("A football is played over two halves of 45 minutes each","A red card means a playes is temporarily suspended for 10 mins","the FIFA World cup takes place every two years","goalkeepers are only players allowed to use their hands during play","an offside is called when a players is behind the last defender when the ball is played to them")

var answer= arrayOf("True","false","false","true","true")
var userinput= arrayListOf("")
@Suppress("NAME_SHADOWING")
class bishark : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bishark)
        var INDEX=1
     var textView=findViewById<TextView>(R.id.textquestion)
       var TrueButton= findViewById<Button>(R.id.button3)
       var FalseButton= findViewById<Button>(R.id.button4)
        var button=findViewById<Button>(R.id.button2)
        var resultbutton=findViewById<Button>(R.id.button6)
        textView.text= QUESTION[0]
        button.setOnClickListener {
            textView.text= QUESTION[INDEX]
            INDEX=INDEX+1
            if(INDEX==5){
                resultbutton.visibility= View.VISIBLE
            }
        }
         TrueButton.setOnClickListener {
            userinput.listIterator().add("True")
         }
        FalseButton.setOnClickListener {
            userinput.listIterator().add("False")
        }
        resultbutton.setOnClickListener {
            val intent=Intent(this, tyson::class.java)
            intent.putStringArrayListExtra("user", userinput)
            intent.putExtra("ans", answer)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}