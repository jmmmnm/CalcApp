package jp.techacademy.minami.jommo.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        val nyuryoku1: String = editText1.text.toString()
        val nyuryoku2: String = editText2.text.toString()
        var kigo: String = ""
        val n1:Double
        val n2:Double

        if(nyuryoku1 == "" || nyuryoku2 == "") {
            kigo = "!"
            n1 = 0.0
            n2 = 0.0
        }else {
            if (v.id == R.id.button1){kigo = "+"
            }else if (v.id == R.id.button2){kigo = "-"
            }else if (v.id == R.id.button3){kigo = "*"
            }else if (v.id == R.id.button4){kigo = "/"
            }
            n1 = nyuryoku1.toDouble()
            n2 = nyuryoku2.toDouble()
        }
        
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", n1)
        intent.putExtra("VALUE2", n2)
        intent.putExtra("VALUE3", kigo)
        startActivity(intent)

    }
}







