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
        var nyuryoku1: String = editText1.text.toString()
        var nyuryoku2: String = editText2.text.toString()
        var kigo: String = "%"

        if(nyuryoku1 == "" || nyuryoku2 == ""){
            Log.d("CALC_TEST","ダメダメだよ")
        }else{
            if (v.id == R.id.button1){kigo = "+"
            }else if (v.id == R.id.button2){kigo = "-"
            }else if (v.id == R.id.button3){kigo = "*"
            }else if (v.id == R.id.button4){kigo = "/"
            }
        }

        Log.d("CALC_TEST","${kigo}")

        var n1: Double = nyuryoku1.toDouble()
        var n2: Double = nyuryoku2.toDouble()

        Log.d("CALC_TEST","${n1}${kigo}${n2}")

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", n1)
        intent.putExtra("VALUE2", n2)
        startActivity(intent)
    }
}







