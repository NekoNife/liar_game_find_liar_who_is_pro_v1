package com.example.liar_game_find_liar_who_is

import android.content.Intent
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_maingame.*
import kotlinx.android.synthetic.main.activity_vote.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.*
import java.text.SimpleDateFormat
import java.util.*


import kotlin.concurrent.timer

class vote : AppCompatActivity() {

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
            Toast.makeText(this,  "뒤로 버튼을5번 누르시면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        }
        // 처음 클릭 메시지

        backPressedTime = System.currentTimeMillis()
    }
    var point = 0
    var  freepoint = 0
    var  adpoint = 0
    var  propoint = 0

    var start : Long = 0
    private var mAdView: AdView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
        val per = intent.getIntExtra("per", 0)
        val layer = intent.getIntExtra("layer", 0)
        val sub = intent.getStringExtra("sub")
        var datas = intent.getStringExtra("datas")

        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)

        votebt2.setColorFilter(filter)


        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "플레이어 속 숨어있는 라이어를 찾으세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 7, 15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView20.setText(spannable, TextView.BufferType.SPANNABLE)



        var int_count = 60
        var key = 0




        Thread(Runnable {

            var i = 1
            while (true) {

                if (int_count > 0) timetxt.setText("$int_count" + "초 이후 활성화 됩니다.")
                if (int_count < 1) {
                    timetxt.setText("")
                    key = 1
                    timetxt.setText("")
                    votebt2.setVisibility(View.INVISIBLE)
                    votebt.setVisibility(View.VISIBLE)
                }
                settxt(i)
                    i++
                if (i == 10) i = 1
                 int_count--

                if (int_count > 0) timetxt.setText("$int_count" + "초 이후 활성화 됩니다.")
                if (int_count < 1) {
                    timetxt.setText("")
                    key = 1
                    timetxt.setText("")
                    votebt2.setVisibility(View.INVISIBLE)
                    votebt.setVisibility(View.VISIBLE)
                }
                Thread.sleep(500L)
            }
        }).start()

        votebt.setOnClickListener {
            val intent = Intent(this, vote2::class.java)
            intent.putExtra("per", per)
            intent.putExtra("sub", sub)
            intent.putExtra("layer", layer)
            intent.putExtra("datas", datas)
            startActivity(intent)
            finish()

        }


//        voteback.setOnClickListener {
//            val intent = Intent(this, select::class.java)
//            intent.putExtra("per",per)
//            startActivity(intent)
//            finish()
//        }

    }
    private  fun settxt(i:Int) {
        if (i == 1) votetxt1.setText("(*´꒳`*)")
        if (i == 2) votetxt2.setText("F0*F&B&%+")
        if (i == 3)  votetxt3.setText("& ''$%#!( $)")
        if (i == 4)  votetxt4.setText("./&+& /3-5 ")
        if (i == 5)  votetxt5.setText("(´⌒｀。)")
        if (i == 6)   votetxt6.setText(")5<1 :5#(")
        if (i == 7)   votetxt7.setText("' %&^& ")
        if (i == 8)  votetxt8.setText("・ヘ・?")
        if (i == 9)  votetxt9.setText("A'A?<&")
        Thread.sleep(500L)
        votetxt1.setText("")
        votetxt2.setText("")
        votetxt3.setText("")
        votetxt4.setText("")
        votetxt5.setText("")
        votetxt6.setText("")
        votetxt7.setText("")
        votetxt8.setText("")
        votetxt9.setText("")
    }

}