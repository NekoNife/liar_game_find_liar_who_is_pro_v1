package com.example.liar_game_find_liar_who_is

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

import kotlinx.android.synthetic.main.activity_maingame.*
import kotlinx.android.synthetic.main.activity_vote.*

import java.io.*
import java.text.SimpleDateFormat
import java.util.*


class Maingame : AppCompatActivity() {

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

    var point = 0
    var  freepoint = 0
    var  adpoint = 0
    var  propoint = 0
    var start : Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maingame)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()


        num101.setVisibility(View.INVISIBLE)
        num102.setVisibility(View.INVISIBLE)
        num103.setVisibility(View.INVISIBLE)
        num104.setVisibility(View.INVISIBLE)
        num105.setVisibility(View.INVISIBLE)
        num106.setVisibility(View.INVISIBLE)
        num107.setVisibility(View.INVISIBLE)
        num108.setVisibility(View.INVISIBLE)
        num109.setVisibility(View.INVISIBLE)
        num110.setVisibility(View.INVISIBLE)
        num111.setVisibility(View.INVISIBLE)
        num112.setVisibility(View.INVISIBLE)
        num113.setVisibility(View.INVISIBLE)
        num114.setVisibility(View.INVISIBLE)
        num115.setVisibility(View.INVISIBLE)
        num116.setVisibility(View.INVISIBLE)
        num117.setVisibility(View.INVISIBLE)
        num118.setVisibility(View.INVISIBLE)
        num119.setVisibility(View.INVISIBLE)
        num120.setVisibility(View.INVISIBLE)
        num201.setVisibility(View.INVISIBLE)
        num202.setVisibility(View.INVISIBLE)
        num203.setVisibility(View.INVISIBLE)
        num204.setVisibility(View.INVISIBLE)
        num205.setVisibility(View.INVISIBLE)
        num206.setVisibility(View.INVISIBLE)
        num207.setVisibility(View.INVISIBLE)
        num208.setVisibility(View.INVISIBLE)
        num209.setVisibility(View.INVISIBLE)
        num210.setVisibility(View.INVISIBLE)
        num211.setVisibility(View.INVISIBLE)
        num212.setVisibility(View.INVISIBLE)
        num213.setVisibility(View.INVISIBLE)
        num214.setVisibility(View.INVISIBLE)
        num215.setVisibility(View.INVISIBLE)
        num216.setVisibility(View.INVISIBLE)
        num217.setVisibility(View.INVISIBLE)
        num218.setVisibility(View.INVISIBLE)
        num219.setVisibility(View.INVISIBLE)
        num220.setVisibility(View.INVISIBLE)
        numtag101.setText("")
        numtag102.setText("")
        numtag103.setText("")
        numtag104.setText("")
        numtag105.setText("")
        numtag106.setText("")
        numtag107.setText("")
        numtag108.setText("")
        numtag109.setText("")
        numtag110.setText("")
        numtag111.setText("")
        numtag112.setText("")
        numtag113.setText("")
        numtag114.setText("")
        numtag115.setText("")
        numtag116.setText("")
        numtag117.setText("")
        numtag118.setText("")
        numtag119.setText("")
        numtag120.setText("")


        mainnext.setBackgroundResource(R.drawable.drawbackblack)
        mainnext2.setBackgroundResource(R.drawable.drawbackblack)
        maingameback.setBackgroundResource(R.drawable.drawbackff)
        maingameback2.setBackgroundResource(R.drawable.drawbackgrape)
        imgcov.setVisibility(View.INVISIBLE)
        nontouch.setVisibility(View.INVISIBLE)
        subcheck.setVisibility(View.INVISIBLE)
        subjsee.setVisibility(View.INVISIBLE)
        layertxt1.setVisibility(View.INVISIBLE)
        layertxt2.setVisibility(View.INVISIBLE)
        layertxt3.setVisibility(View.INVISIBLE)
        layertxt4.setVisibility(View.INVISIBLE)
        sub2.setVisibility(View.INVISIBLE)
        imagelayer.setVisibility(View.INVISIBLE)

        val per = intent.getIntExtra("per", 0)

        setimg(per) // 이미지 세팅



        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "자신의 사진을 클릭하여 제시어를 확인해주세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 13, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView8.setText(spannable, TextView.BufferType.SPANNABLE)

//        var file = File("${filesDir}/image/p1.jpg")
//        var filePath = file.getPath()
//        var bitmap = BitmapFactory.decodeFile(filePath)
//
//        num301.setImageBitmap(bitmap)


        var sub = intent.getStringExtra("sub")
        var subt = intent.getStringExtra("subt")
        var datas = intent.getStringExtra("datas")

        var sum = 0
//        txtper2.exrtext("주제 : $subt")
        subjsee.setText(sub)
        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)

            //라이어
        val range = Random().nextInt(per) +1  //0~19 +1
//        Toast.makeText(this, "$range 가 라이어 입니다. ", Toast.LENGTH_SHORT).show()
//            Toast.makeText(this, "$range 번", Toast.LENGTH_SHORT).show()
        sub2.setText("주제 : $subt")

        when (per ) {
            //선택안함
            0 -> {
                Toast.makeText(this, "인원이 선택되지 않았습니다 ", Toast.LENGTH_SHORT).show()
            }
            1 -> {
                num101.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)


            }
            2 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)

            }
            3 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)

            }
            4 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)

            }
            5 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)

            }
            6 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)

            }
            7 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
            }
            8 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
            }
            9 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
            }
            10 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
            }
            11 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
            }
            12 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
            }
            13 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
            }
            14 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
            }
            15 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num115.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
                num215.setVisibility(View.VISIBLE)
            }
            16 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num115.setVisibility(View.VISIBLE)
                num116.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
                num215.setVisibility(View.VISIBLE)
                num216.setVisibility(View.VISIBLE)
            }
            17 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num115.setVisibility(View.VISIBLE)
                num116.setVisibility(View.VISIBLE)
                num117.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
                num215.setVisibility(View.VISIBLE)
                num216.setVisibility(View.VISIBLE)
                num217.setVisibility(View.VISIBLE)
            }
            18 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num115.setVisibility(View.VISIBLE)
                num116.setVisibility(View.VISIBLE)
                num117.setVisibility(View.VISIBLE)
                num118.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
                num215.setVisibility(View.VISIBLE)
                num216.setVisibility(View.VISIBLE)
                num217.setVisibility(View.VISIBLE)
                num218.setVisibility(View.VISIBLE)
            }
            19 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num115.setVisibility(View.VISIBLE)
                num116.setVisibility(View.VISIBLE)
                num117.setVisibility(View.VISIBLE)
                num118.setVisibility(View.VISIBLE)
                num119.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
                num215.setVisibility(View.VISIBLE)
                num216.setVisibility(View.VISIBLE)
                num217.setVisibility(View.VISIBLE)
                num218.setVisibility(View.VISIBLE)
                num219.setVisibility(View.VISIBLE)
            }
            20 -> {
                num101.setVisibility(View.VISIBLE)
                num102.setVisibility(View.VISIBLE)
                num103.setVisibility(View.VISIBLE)
                num104.setVisibility(View.VISIBLE)
                num105.setVisibility(View.VISIBLE)
                num106.setVisibility(View.VISIBLE)
                num107.setVisibility(View.VISIBLE)
                num108.setVisibility(View.VISIBLE)
                num109.setVisibility(View.VISIBLE)
                num110.setVisibility(View.VISIBLE)
                num111.setVisibility(View.VISIBLE)
                num112.setVisibility(View.VISIBLE)
                num113.setVisibility(View.VISIBLE)
                num114.setVisibility(View.VISIBLE)
                num115.setVisibility(View.VISIBLE)
                num116.setVisibility(View.VISIBLE)
                num117.setVisibility(View.VISIBLE)
                num118.setVisibility(View.VISIBLE)
                num119.setVisibility(View.VISIBLE)
                num120.setVisibility(View.VISIBLE)
                num201.setVisibility(View.VISIBLE)
                num202.setVisibility(View.VISIBLE)
                num203.setVisibility(View.VISIBLE)
                num204.setVisibility(View.VISIBLE)
                num205.setVisibility(View.VISIBLE)
                num206.setVisibility(View.VISIBLE)
                num207.setVisibility(View.VISIBLE)
                num208.setVisibility(View.VISIBLE)
                num209.setVisibility(View.VISIBLE)
                num210.setVisibility(View.VISIBLE)
                num211.setVisibility(View.VISIBLE)
                num212.setVisibility(View.VISIBLE)
                num213.setVisibility(View.VISIBLE)
                num214.setVisibility(View.VISIBLE)
                num215.setVisibility(View.VISIBLE)
                num216.setVisibility(View.VISIBLE)
                num217.setVisibility(View.VISIBLE)
                num218.setVisibility(View.VISIBLE)
                num219.setVisibility(View.VISIBLE)
                num220.setVisibility(View.VISIBLE)
            }

        }
        //   참가자 버튼 활성화

        num101.setBackgroundResource(R.drawable.drawbackff)
        num102.setBackgroundResource(R.drawable.drawbackff)
        num103.setBackgroundResource(R.drawable.drawbackff)
        num104.setBackgroundResource(R.drawable.drawbackff)
        num105.setBackgroundResource(R.drawable.drawbackff)
        num106.setBackgroundResource(R.drawable.drawbackff)
        num107.setBackgroundResource(R.drawable.drawbackff)
        num108.setBackgroundResource(R.drawable.drawbackff)
        num109.setBackgroundResource(R.drawable.drawbackff)
        num110.setBackgroundResource(R.drawable.drawbackff)
        num111.setBackgroundResource(R.drawable.drawbackff)
        num112.setBackgroundResource(R.drawable.drawbackff)
        num113.setBackgroundResource(R.drawable.drawbackff)
        num114.setBackgroundResource(R.drawable.drawbackff)
        num115.setBackgroundResource(R.drawable.drawbackff)
        num116.setBackgroundResource(R.drawable.drawbackff)
        num117.setBackgroundResource(R.drawable.drawbackff)
        num118.setBackgroundResource(R.drawable.drawbackff)
        num119.setBackgroundResource(R.drawable.drawbackff)
        num120.setBackgroundResource(R.drawable.drawbackff)
        num201.setBackgroundResource(R.drawable.drawback)
        num202.setBackgroundResource(R.drawable.drawback)
        num203.setBackgroundResource(R.drawable.drawback)
        num204.setBackgroundResource(R.drawable.drawback)
        num205.setBackgroundResource(R.drawable.drawback)
        num206.setBackgroundResource(R.drawable.drawback)
        num207.setBackgroundResource(R.drawable.drawback)
        num208.setBackgroundResource(R.drawable.drawback)
        num209.setBackgroundResource(R.drawable.drawback)
        num210.setBackgroundResource(R.drawable.drawback)
        num211.setBackgroundResource(R.drawable.drawback)
        num212.setBackgroundResource(R.drawable.drawback)
        num213.setBackgroundResource(R.drawable.drawback)
        num214.setBackgroundResource(R.drawable.drawback)
        num215.setBackgroundResource(R.drawable.drawback)
        num216.setBackgroundResource(R.drawable.drawback)
        num217.setBackgroundResource(R.drawable.drawback)
        num218.setBackgroundResource(R.drawable.drawback)
        num219.setBackgroundResource(R.drawable.drawback)
        num220.setBackgroundResource(R.drawable.drawback)
        maingameback.setOnClickListener {
            val intent = Intent(this, select::class.java)
            intent.putExtra("per",per)
            startActivity(intent)
            finish()
        }
        mainnext.setOnClickListener {
            if (sum == per)
            {
                val intent = Intent(this, vote::class.java)
                intent.putExtra("per",per)
                intent.putExtra("sub",sub)
                intent.putExtra("layer",range)
                intent.putExtra("datas",datas)
                startActivity(intent)
                finish()
            }

        }


        num101.setOnClickListener {
       if (range == 1){
           subjsee.setVisibility(View.INVISIBLE)
           layertxt1.setVisibility(View.VISIBLE)
           layertxt2.setVisibility(View.VISIBLE)
           layertxt3.setVisibility(View.VISIBLE)
           layertxt4.setVisibility(View.VISIBLE)
           imagelayer.setVisibility(View.VISIBLE)
       } else{
           subjsee.setVisibility(View.VISIBLE)
            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num101.setEnabled(false);
            num101.setColorFilter(filter)
            num101.setBackgroundResource(R.drawable.drawbackff)
            num201.setBackgroundResource(R.drawable.drawbackblack)
        }
        num102.setOnClickListener {
            if (range == 2){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)


            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num102.setEnabled(false);
            num102.setColorFilter(filter)
            num102.setBackgroundResource(R.drawable.drawbackff)
            num202.setBackgroundResource(R.drawable.drawbackblack)
        }
        num103.setOnClickListener {
            if (range == 3){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num103.setEnabled(false);
            num103.setColorFilter(filter)
            num103.setBackgroundResource(R.drawable.drawbackff)
            num203.setBackgroundResource(R.drawable.drawbackblack)
        }
        num104.setOnClickListener {
            if (range == 4){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num104.setEnabled(false);
            num104.setColorFilter(filter)
            num104.setBackgroundResource(R.drawable.drawbackff)
            num204.setBackgroundResource(R.drawable.drawbackblack)
        }
        num105.setOnClickListener {
            if (range == 5){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)

            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num105.setEnabled(false);
            num105.setColorFilter(filter)
            num105.setBackgroundResource(R.drawable.drawbackff)
            num205.setBackgroundResource(R.drawable.drawbackblack)

        }
        num106.setOnClickListener {
            if (range == 6){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num106.setEnabled(false);
            num106.setColorFilter(filter)

            num106.setBackgroundResource(R.drawable.drawbackff)
            num206.setBackgroundResource(R.drawable.drawbackblack)
        }

        num107.setOnClickListener {
            if (range == 7){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num107.setEnabled(false);
            num107.setColorFilter(filter)

            num107.setBackgroundResource(R.drawable.drawbackff)
            num207.setBackgroundResource(R.drawable.drawbackblack)
        }
        num108.setOnClickListener {
            if (range == 8){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num108.setEnabled(false);
            num108.setColorFilter(filter)
            num108.setBackgroundResource(R.drawable.drawbackff)
            num208.setBackgroundResource(R.drawable.drawbackblack)
        }
        num109.setOnClickListener {
            if (range == 9){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num109.setEnabled(false);
            num109.setColorFilter(filter)
            num109.setBackgroundResource(R.drawable.drawbackff)
            num209.setBackgroundResource(R.drawable.drawbackblack)
        }
        num110.setOnClickListener {
            if (range == 10){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num110.setEnabled(false);
            num110.setColorFilter(filter)
            num110.setBackgroundResource(R.drawable.drawbackff)
            num210.setBackgroundResource(R.drawable.drawbackblack)
        }
        num111.setOnClickListener {
            if (range == 11){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num111.setEnabled(false);
            num111.setColorFilter(filter)
            num111.setBackgroundResource(R.drawable.drawbackff)
            num211.setBackgroundResource(R.drawable.drawbackblack)
        }
        num112.setOnClickListener {
            if (range == 12){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num112.setEnabled(false);
            num112.setColorFilter(filter)
            num112.setBackgroundResource(R.drawable.drawbackff)
            num212.setBackgroundResource(R.drawable.drawbackblack)
        }
        num113.setOnClickListener {
            if (range == 13){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num113.setEnabled(false);
            num113.setColorFilter(filter)
            num113.setBackgroundResource(R.drawable.drawbackff)
            num213.setBackgroundResource(R.drawable.drawbackblack)
        }
        num114.setOnClickListener {
            if (range == 14){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num114.setEnabled(false);
            num114.setColorFilter(filter)
            num114.setBackgroundResource(R.drawable.drawbackff)
            num214.setBackgroundResource(R.drawable.drawbackblack)
        }
        num115.setOnClickListener {
            if (range == 15){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num115.setEnabled(false);
            num115.setColorFilter(filter)
            num115.setBackgroundResource(R.drawable.drawbackff)
            num215.setBackgroundResource(R.drawable.drawbackblack)
        }
        num116.setOnClickListener {
            if (range == 16){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num116.setEnabled(false);
            num116.setColorFilter(filter)
            num116.setBackgroundResource(R.drawable.drawbackff)
            num216.setBackgroundResource(R.drawable.drawbackblack)
        }
        num117.setOnClickListener {
            if (range == 17){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num117.setEnabled(false);
            num117.setColorFilter(filter)
            num117.setBackgroundResource(R.drawable.drawbackff)
            num217.setBackgroundResource(R.drawable.drawbackblack)
        }
        num118.setOnClickListener {
            if (range == 18){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num118.setEnabled(false);
            num118.setColorFilter(filter)
            num118.setBackgroundResource(R.drawable.drawbackff)
            num218.setBackgroundResource(R.drawable.drawbackblack)
        }
        num119.setOnClickListener {
            if (range == 19){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num119.setEnabled(false);
            num119.setColorFilter(filter)
            num119.setBackgroundResource(R.drawable.drawbackff)
            num219.setBackgroundResource(R.drawable.drawbackblack)
        }
        num120.setOnClickListener {
            if (range == 20){
                subjsee.setVisibility(View.INVISIBLE)
                layertxt1.setVisibility(View.VISIBLE)
                layertxt2.setVisibility(View.VISIBLE)
                layertxt3.setVisibility(View.VISIBLE)
                layertxt4.setVisibility(View.VISIBLE)
                imagelayer.setVisibility(View.VISIBLE)
            } else{
                subjsee.setVisibility(View.VISIBLE)

            }
            sub2.setVisibility(View.VISIBLE)
            nontouch.setVisibility(View.VISIBLE)
            imgcov.setVisibility(View.VISIBLE)
            subcheck.setVisibility(View.VISIBLE)
            num120.setEnabled(false);
            num120.setColorFilter(filter)
            num120.setBackgroundResource(R.drawable.drawbackff)
            num220.setBackgroundResource(R.drawable.drawbackblack)
        }

        subcheck.setOnClickListener {
            imgcov.setVisibility(View.INVISIBLE)
            nontouch.setVisibility(View.INVISIBLE)
            subcheck.setVisibility(View.INVISIBLE)
            subjsee.setVisibility(View.INVISIBLE)
            sub2.setVisibility(View.INVISIBLE)
            layertxt1.setVisibility(View.INVISIBLE)
            layertxt2.setVisibility(View.INVISIBLE)
            layertxt3.setVisibility(View.INVISIBLE)
            layertxt4.setVisibility(View.INVISIBLE)
            imagelayer.setVisibility(View.INVISIBLE)
            sum++
            if(sum == per){
                mainnext.setBackgroundResource(R.drawable.drawbackff)
            mainnext2.setBackgroundResource(R.drawable.drawbackgrape)
            }
//            if (sum == per)
//            {
//                val intent = Intent(this, vote::class.java)
//                intent.putExtra("per",per)
//                intent.putExtra("sub",sub)
//                intent.putExtra("layer",range)
//                intent.putExtra("datas",datas)
//                startActivity(intent)
//                finish()
//            }

        }

        nontouch.setOnClickListener {
//            imgcov.setVisibility(View.INVISIBLE)
//            nontouch.setVisibility(View.INVISIBLE)
//            subcheck.setVisibility(View.INVISIBLE)
//            subjsee.setVisibility(View.INVISIBLE)
//            layerim.setVisibility(View.INVISIBLE)
//            sum++
//            if (sum == per)
//            {
//                val intent = Intent(this, vote::class.java)
//                intent.putExtra("per",per)
//                intent.putExtra("sub",sub)
//                intent.putExtra("layer",range)
//                startActivity(intent)
//                finish()
//            }
        }




//        when(sub){
//
//            "음식" -> {
//
//            }
//            "가수" -> {
//
//            }
//            "위인" -> {
//
//            }
//            "전자제품" -> {
//
//            }
//            "동물" -> {
//
//            }
//            "식물" -> {
//
//            }
//            "지역" -> {
//
//            }
//            "직업" -> {
//
//            }
//            "유명인" -> {
//
//            }
//            "운동" -> {
//
//            }
//            "게임" -> {
//
//            }
//            "케릭터" -> {
//
//            }
//
//        }//when






    }
    private fun setimg(i2: Int ){
        num101.clipToOutline = true
        num102.clipToOutline = true
        num103.clipToOutline = true
        num104.clipToOutline = true
        num105.clipToOutline = true
        num106.clipToOutline = true
        num107.clipToOutline = true
        num108.clipToOutline = true
        num109.clipToOutline = true
        num110.clipToOutline = true
        num111.clipToOutline = true
        num112.clipToOutline = true
        num113.clipToOutline = true
        num114.clipToOutline = true
        num115.clipToOutline = true
        num116.clipToOutline = true
        num117.clipToOutline = true
        num118.clipToOutline = true
        num119.clipToOutline = true
        num120.clipToOutline = true
        val path = File(filesDir, "image")
        if(!path.exists()){
            path.mkdirs()
        }



      for(i in 1..i2) {
          try {

              var file = File("${filesDir}/image/p" + "$i" + ".jpg")
              var filePath = file.getPath()
              var bitmap = BitmapFactory.decodeFile(filePath)
                if (file.exists() == true) {
                    when (i) {
                        1 -> {
                            num101.setImageBitmap(bitmap)

                        }
                        2 -> {
                            num102.setImageBitmap(bitmap)

                        }
                        3 -> {
                            num103.setImageBitmap(bitmap)

                        }
                        4 -> {
                            num104.setImageBitmap(bitmap)

                        }
                        5 -> {
                            num105.setImageBitmap(bitmap)

                        }
                        6 -> {
                            num106.setImageBitmap(bitmap)

                        }
                        7 -> {
                            num107.setImageBitmap(bitmap)

                        }
                        8 -> {
                            num108.setImageBitmap(bitmap)

                        }
                        9 -> {
                            num109.setImageBitmap(bitmap)

                        }
                        10 -> {
                            num110.setImageBitmap(bitmap)

                        }
                        11 -> {
                            num111.setImageBitmap(bitmap)

                        }
                        12 -> {
                            num112.setImageBitmap(bitmap)

                        }
                        13 -> {
                            num113.setImageBitmap(bitmap)

                        }
                        14 -> {
                            num114.setImageBitmap(bitmap)

                        }
                        15 -> {
                            num115.setImageBitmap(bitmap)

                        }
                        16 -> {
                            num116.setImageBitmap(bitmap)

                        }
                        17 -> {
                            num117.setImageBitmap(bitmap)

                        }
                        18 -> {
                            num118.setImageBitmap(bitmap)

                        }
                        19 -> {
                            num119.setImageBitmap(bitmap)

                        }
                        20 -> {
                            num120.setImageBitmap(bitmap)

                        }
                    }
                }else{
                    when (i) {
                        1 -> {

                            numtag101.setText("1")
                        }
                        2 -> {

                            numtag102.setText("2")
                        }
                        3 -> {

                            numtag103.setText("3")
                        }
                        4 -> {

                            numtag104.setText("4")
                        }
                        5 -> {

                            numtag105.setText("5")
                        }
                        6 -> {

                            numtag106.setText("6")
                        }
                        7 -> {

                            numtag107.setText("7")
                        }
                        8 -> {

                            numtag108.setText("8")
                        }
                        9 -> {

                            numtag109.setText("9")
                        }
                        10 -> {

                            numtag110.setText("10")
                        }
                        11 -> {

                            numtag111.setText("11")
                        }
                        12 -> {

                            numtag112.setText("12")
                        }
                        13 -> {

                            numtag113.setText("13")
                        }
                        14 -> {

                            numtag114.setText("14")
                        }
                        15 -> {

                            numtag115.setText("15")
                        }
                        16 -> {

                            numtag116.setText("16")
                        }
                        17 -> {

                            numtag117.setText("17")
                        }
                        18 -> {

                            numtag118.setText("18")
                        }
                        19 -> {

                            numtag119.setText("19")
                        }
                        20 -> {

                            numtag120.setText("20")
                        }
                    }

                }
          }catch (e: Exception){
              null
          }



      }


        }



}

