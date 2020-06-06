package com.example.calculator

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun appendOnExpression( string: String, canClear:Boolean){

        if(result.text.isNotEmpty()) input.text=""
        if(canClear){
            result.text=""
            input.append(string)
        }
        else{
            input.append(result.text)
            input.append(string)
        }

    }

    fun btnClick_1(view: View) {
        appendOnExpression("1",true)
    }
    fun btnClick_2(view: View) {
        appendOnExpression("2",true)
    }
    fun btnClick_3(view: View) {
        appendOnExpression("3",true)
    }
    fun btnClick_4(view: View) {
        appendOnExpression("4",true)
    }
    fun btnClick_5(view: View) {
        appendOnExpression("5",true)
    }
    fun btnClick_6(view: View) {
        appendOnExpression("6",true)
    }
    fun btnClick_7(view: View) {
        appendOnExpression("7",true)
    }

    fun btnClick_8(view: View) {
        appendOnExpression("8",true)
    }
    fun btnClick_9(view: View) {
        appendOnExpression("9",true)}
    fun btnClickPlus(view: View) {
        appendOnExpression("+",false)
    }

    fun btnClickMinus(view: View) {
        appendOnExpression("-",false)
    }
    fun btnClickMultiply(view: View) {
        appendOnExpression("*",false)
    }
    fun btnClick_0(view: View) {
        appendOnExpression("0",true)
    }
    fun btnClickDot(view: View) {
        appendOnExpression(".",true)
    }
    fun btnClickDivision(view: View) {
        appendOnExpression("/",false)
    }
    fun btnClickEqualsto(view: View) {

        try{
            val Expression=ExpressionBuilder(input.text.toString()).build()
            val output=Expression.evaluate()
            val longOutput=output.toLong()
            if(output==longOutput.toDouble())
                result.text=longOutput.toString()
            else
                result.text=output.toString()

        }catch(e:Exception){
            Log.d("Exception","messege"+e.message)
            result.text="NULL"
            input.text=""
        }
        }
    fun btnClickCancel(view: View) {
        input.text=""
        result.text=""
    }
    fun btnClickBackspace(view: View) {
        val string=input.text.toString()
        if(string.isNotEmpty()){
            input.text=string.substring(0,string.length-1)
        }
        result.text=""
    }

    fun btnClick_sin(view: View) {
        appendOnExpression("sin",true)
    }
    fun btnClick_cos(view: View) {
        appendOnExpression("cos",true)
    }
    fun btnClick_tan(view: View) {
        appendOnExpression("tan",true)
    }

    fun btnClickOpenBrac(view: View) {
        appendOnExpression("(",false)
    }
    fun btnClickPercentage(view: View) {appendOnExpression("%",false)}
    fun btnClickEE(view: View) {appendOnExpression("",false)}
    fun btnClickcloseBrac(view: View) {appendOnExpression(")",false)}
    fun btnClickDollar(view: View) {appendOnExpression(" MADE IN INDIA",true)}
    fun btnClickComma(view: View) {appendOnExpression(",",false)}


}



