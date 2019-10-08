package jp.techacademy.minami.jommo.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val value3 = intent.getStringExtra("VALUE3")

        if(value3=="+"){
            textView.text = "${value1} ${value3} ${value2} = ${value1+value2}"
        }else if(value3=="-"){
            textView.text = "${value1} ${value3} ${value2} = ${value1-value2}"
        }else if(value3=="*"){
            textView.text = "${value1} ${value3} ${value2} = ${value1*value2}"
        }else if(value3=="/"){
            textView.text = "${value1} ${value3} ${value2} = ${value1/value2}"
        }else {
            textView.text = "何か数値を入力してください"
        }

    }
}
