package com.example.liar_game_find_liar_who_is

import android.annotation.SuppressLint

import android.content.Intent
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.*
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.finishAffinity
import kotlinx.android.synthetic.main.activity_maingame.*
import kotlinx.android.synthetic.main.activity_num.*
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

class numActivity : AppCompatActivity() {

    var backcount = 0
    private var backPressedTime: Long = 0
    override fun onBackPressed() {
        // 2초내 다시 클릭하면 앱 종료
        backcount++
        if (System.currentTimeMillis() - backPressedTime < 500) {

            if (backcount == 4) {
                System.exit(0)
                return
            }
        }else{
            backcount = 0
            Toast.makeText(this,  "뒤로 버튼을 5번 누르시면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        }
        // 처음 클릭 메시지

        backPressedTime = System.currentTimeMillis()
    }


    var num = 0


    var start : Long = 0

var point = 0
    var  freepoint = 0
    var  adpoint = 0
    var  propoint = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
        numstrat101.setBackgroundResource(R.drawable.drawbackblack)
        numstrat102.setBackgroundResource(R.drawable.drawbackblack)
        numstrat103.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat104.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat105.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat106.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat107.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat108.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat109.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat110.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat111.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat112.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat113.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat114.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat115.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat116.setBackgroundResource(R.drawable.drawbackgrape)

        numbt2.setBackgroundResource(R.drawable.drawbackblack)


        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "참가자의 인원수를 선택해주세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 5, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView26.setText(spannable, TextView.BufferType.SPANNABLE)


        numback.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
        }

        var personnelnum = 0
//spinner.adapter = ArrayAdapter.createFromResource(this, R.array.itemList, android.R.layout.simple_spinner_item)


        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)


//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//
//            }
//
//
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//
//            ) {
//
//                numbt2.setBackgroundResource(R.drawable.drawbackgrape)
//                numback2.setBackgroundResource(R.drawable.drawbackgrape)
//
//
//                when (position) {
//                    //선택안함
//                    0 -> {
//
//                    }
//                    //
//                    in 1..20 -> {
//                        personnelnum = position
////                        Toast.makeText(this@numActivity, "$personnelnum 명 입니다. ", Toast.LENGTH_SHORT).show()
//
//                    }
//
//                    //일치하는게 없는 경우
//                    else -> {
//                        Toast.makeText(this@numActivity, "오류 인원을 찾을수 없습니다 ", Toast.LENGTH_SHORT).show()
//
//                    }
//                }
//            }
//
//
//        }




        val img = intent.getIntExtra("img", 0)

        numbt.setOnClickListener {
       if (num == 1 ||num == 2 ||num == 0){
//                Toast.makeText(this@numActivity, "3명 이상 진행을 해주세요. ", Toast.LENGTH_SHORT).show()
            }else {

                val intent = Intent(this, personnel::class.java)
                intent.putExtra("per", num)
                intent.putExtra("img", 0)
                startActivity(intent)
           finish()
            }
        }

//        numstrat1.setOnClickListener {
//            snum(1)
//        }
//        numstrat2.setOnClickListener {
//            snum(2)
//        }
        numstrat3.setOnClickListener {
            snum(3)
        }
        numstrat4.setOnClickListener {
            snum(4)
        }
        numstrat5.setOnClickListener {
            snum(5)
        }
        numstrat6.setOnClickListener {
            snum(6)
        }

        numstrat7.setOnClickListener {
            snum(7)
        }
        numstrat8.setOnClickListener {
            snum(8)
        }


        numstrat9.setOnClickListener {
            snum(9)
        }
        numstrat10.setOnClickListener {
            snum(10)
        }
        numstrat11.setOnClickListener {
            snum(11)
        }

        numstrat12.setOnClickListener {
            snum(12)
        }

        numstrat13.setOnClickListener {
            snum(13)
        }

        numstrat14.setOnClickListener {
            snum(14)
        }
        numstrat15.setOnClickListener {
            snum(15)
        }
        numstrat16.setOnClickListener {
            snum(16)
        }





    }
    private  fun snum(i: Int){
        numbt2.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat101.setBackgroundResource(R.drawable.drawbackblack)
        numstrat102.setBackgroundResource(R.drawable.drawbackblack)
        numstrat103.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat104.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat105.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat106.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat107.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat108.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat109.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat110.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat111.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat112.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat113.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat114.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat115.setBackgroundResource(R.drawable.drawbackgrape)
        numstrat116.setBackgroundResource(R.drawable.drawbackgrape)

        when(i){
            1 ->{
                numstrat101.setBackgroundResource(R.drawable.drawbackgreen)
                num = 1
            }
            2 ->{
                numstrat102.setBackgroundResource(R.drawable.drawbackgreen)
                num = 2
            }

            3 ->{
                numstrat103.setBackgroundResource(R.drawable.drawbackgreen)
                num = 3
            }
            4 ->{
                numstrat104.setBackgroundResource(R.drawable.drawbackgreen)
                num = 4
            }
            5 ->{
                numstrat105.setBackgroundResource(R.drawable.drawbackgreen)
                num = 5
            }
            6 ->{
                numstrat106.setBackgroundResource(R.drawable.drawbackgreen)
                num = 6
            }
            7 ->{
                numstrat107.setBackgroundResource(R.drawable.drawbackgreen)
                num = 7
            }
            8 ->{
                numstrat108.setBackgroundResource(R.drawable.drawbackgreen)
                num = 8
            }
            9 ->{
                numstrat109.setBackgroundResource(R.drawable.drawbackgreen)
                num = 9
            }
            10 ->{
                numstrat110.setBackgroundResource(R.drawable.drawbackgreen)
                num = 10
            }
            11 ->{
                numstrat111.setBackgroundResource(R.drawable.drawbackgreen)
                num = 11
            }
            12 ->{
                numstrat112.setBackgroundResource(R.drawable.drawbackgreen)
                num = 12
            }
            13 ->{
                numstrat113.setBackgroundResource(R.drawable.drawbackgreen)
                num = 13
            }
            14 ->{
                numstrat114.setBackgroundResource(R.drawable.drawbackgreen)
                num = 14
            }
            15 ->{
                numstrat115.setBackgroundResource(R.drawable.drawbackgreen)
                num = 15
            }
            16 ->{
                numstrat116.setBackgroundResource(R.drawable.drawbackgreen)
                num = 16
            }


        }


        return
    }



}

