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

  //  var num1: String = editText1.text.toString()


  //  var num2: String = editText2.text.toString()


    override fun onClick(v: View) {

        if (v.id == R.id.button1) {
            Log.d("CALC_TEST","${editText1.text}+${editText2.text}")
        } else if (v.id == R.id.button2) {
            Log.d("CALC_TEST","${editText1.text}-${editText2.text}")
        } else if (v.id == R.id.button3) {
            Log.d("CALC_TEST","${editText1.text}*${editText2.text}")
        } else if (v.id == R.id.button4) {
            Log.d("CALC_TEST","${editText1.text}/${editText2.text}")
        }
    }


}
