package com.example.liar_game_find_liar_who_is

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_maingame.*
import kotlinx.android.synthetic.main.activity_personnel.*
import kotlinx.android.synthetic.main.activity_select.*
import kotlinx.android.synthetic.main.activity_vote.*
import kotlinx.android.synthetic.main.activity_vote2.*
import java.io.*
import java.text.SimpleDateFormat
import java.util.*


class vote2 : AppCompatActivity() {
    var stack1 = 0
    var stack2 = 0
    var stack3 = 0
    var stack4 = 0
    var stack5 = 0
    var stack6 = 0
    var stack7 = 0
    var stack8 = 0
    var stack9 = 0
    var stack10 = 0
    var stack11 = 0
    var stack12 = 0
    var stack13 = 0
    var stack14 = 0
    var stack15 = 0
    var stack16 = 0
    var stack17 = 0
    var stack18 = 0
    var stack19 = 0
    var stack20 = 0
    var choose1 = 1
    var choose2 = 1
    var choose3 = 1
    var choose4 = 1
    var choose5 = 1
    var choose6 = 1
    var choose7 = 1
    var choose8 = 1
    var choose9 = 1
    var choose10 = 1
    var choose11 = 1
    var choose12 = 1
    var choose13 = 1
    var choose14 = 1
    var choose15 = 1
    var choose16 = 1
    var choose17 = 1
    var choose18 = 1
    var choose19 = 1
    var choose20 = 1
    var votechoose1 = 0
    var votechoose2 = 0
    var votechoose3 = 0
    var votechoose4 = 0
    var votechoose5 = 0
    var votechoose6 = 0
    var votechoose7 = 0
    var votechoose8 = 0
    var votechoose9 = 0
    var votechoose10 = 0
    var votechoose11 = 0
    var votechoose12 = 0
    var votechoose13 = 0
    var votechoose14 = 0
    var votechoose15 = 0
    var votechoose16 = 0
    var votechoose17 = 0
    var votechoose18 = 0
    var votechoose19 = 0
    var votechoose20 = 0
var sum = 1
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
        setContentView(R.layout.activity_vote2)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
//        var file = File("${filesDir}/image/p1.jpg")
//        var filePath = file.getPath()
//        var bitmap = BitmapFactory.decodeFile(filePath)
//
//        num301.setImageBitmap(bitmap)


        num301.clipToOutline = true
        num302.clipToOutline = true
        num303.clipToOutline = true
        num304.clipToOutline = true
        num305.clipToOutline = true
        num306.clipToOutline = true
        num307.clipToOutline = true
        num308.clipToOutline = true
        num309.clipToOutline = true
        num310.clipToOutline = true
        num311.clipToOutline = true
        num312.clipToOutline = true
        num313.clipToOutline = true
        num314.clipToOutline = true
        num315.clipToOutline = true
        num316.clipToOutline = true
        num317.clipToOutline = true
        num318.clipToOutline = true
        num319.clipToOutline = true
        num320.clipToOutline = true
        num501.clipToOutline = true
        num502.clipToOutline = true
        num503.clipToOutline = true
        num504.clipToOutline = true
        num505.clipToOutline = true
        num506.clipToOutline = true
        num507.clipToOutline = true
        num508.clipToOutline = true
        num509.clipToOutline = true
        num510.clipToOutline = true
        num511.clipToOutline = true
        num512.clipToOutline = true
        num513.clipToOutline = true
        num514.clipToOutline = true
        num515.clipToOutline = true
        num516.clipToOutline = true
        num517.clipToOutline = true
        num518.clipToOutline = true
        num519.clipToOutline = true
        num520.clipToOutline = true

        num301.setBackgroundResource(R.drawable.drawbackff)
        num302.setBackgroundResource(R.drawable.drawbackff)
        num303.setBackgroundResource(R.drawable.drawbackff)
        num304.setBackgroundResource(R.drawable.drawbackff)
        num305.setBackgroundResource(R.drawable.drawbackff)
        num306.setBackgroundResource(R.drawable.drawbackff)
        num307.setBackgroundResource(R.drawable.drawbackff)
        num308.setBackgroundResource(R.drawable.drawbackff)
        num309.setBackgroundResource(R.drawable.drawbackff)
        num310.setBackgroundResource(R.drawable.drawbackff)
        num311.setBackgroundResource(R.drawable.drawbackff)
        num312.setBackgroundResource(R.drawable.drawbackff)
        num313.setBackgroundResource(R.drawable.drawbackff)
        num314.setBackgroundResource(R.drawable.drawbackff)
        num315.setBackgroundResource(R.drawable.drawbackff)
        num316.setBackgroundResource(R.drawable.drawbackff)
        num317.setBackgroundResource(R.drawable.drawbackff)
        num318.setBackgroundResource(R.drawable.drawbackff)
        num319.setBackgroundResource(R.drawable.drawbackff)
        num320.setBackgroundResource(R.drawable.drawbackff)
        numtag301.setText("")
        numtag302.setText("")
        numtag303.setText("")
        numtag304.setText("")
        numtag305.setText("")
        numtag306.setText("")
        numtag307.setText("")
        numtag308.setText("")
        numtag309.setText("")
        numtag310.setText("")
        numtag311.setText("")
        numtag312.setText("")
        numtag313.setText("")
        numtag314.setText("")
        numtag315.setText("")
        numtag316.setText("")
        numtag317.setText("")
        numtag318.setText("")
        numtag319.setText("")
        numtag320.setText("")
        num601.setBackgroundResource(R.drawable.drawback)
        num602.setBackgroundResource(R.drawable.drawback)
        num603.setBackgroundResource(R.drawable.drawback)
        num604.setBackgroundResource(R.drawable.drawback)
        num605.setBackgroundResource(R.drawable.drawback)
        num606.setBackgroundResource(R.drawable.drawback)
        num607.setBackgroundResource(R.drawable.drawback)
        num608.setBackgroundResource(R.drawable.drawback)
        num609.setBackgroundResource(R.drawable.drawback)
        num610.setBackgroundResource(R.drawable.drawback)
        num611.setBackgroundResource(R.drawable.drawback)
        num612.setBackgroundResource(R.drawable.drawback)
        num613.setBackgroundResource(R.drawable.drawback)
        num614.setBackgroundResource(R.drawable.drawback)
        num615.setBackgroundResource(R.drawable.drawback)
        num616.setBackgroundResource(R.drawable.drawback)
        num617.setBackgroundResource(R.drawable.drawback)
        num618.setBackgroundResource(R.drawable.drawback)
        num619.setBackgroundResource(R.drawable.drawback)
        num620.setBackgroundResource(R.drawable.drawback)

        num401.setBackgroundResource(R.drawable.drawback)
        num402.setBackgroundResource(R.drawable.drawback)
        num403.setBackgroundResource(R.drawable.drawback)
        num404.setBackgroundResource(R.drawable.drawback)
        num405.setBackgroundResource(R.drawable.drawback)
        num406.setBackgroundResource(R.drawable.drawback)
        num407.setBackgroundResource(R.drawable.drawback)
        num408.setBackgroundResource(R.drawable.drawback)
        num409.setBackgroundResource(R.drawable.drawback)
        num410.setBackgroundResource(R.drawable.drawback)
        num411.setBackgroundResource(R.drawable.drawback)
        num412.setBackgroundResource(R.drawable.drawback)
        num413.setBackgroundResource(R.drawable.drawback)
        num414.setBackgroundResource(R.drawable.drawback)
        num415.setBackgroundResource(R.drawable.drawback)
        num416.setBackgroundResource(R.drawable.drawback)
        num417.setBackgroundResource(R.drawable.drawback)
        num418.setBackgroundResource(R.drawable.drawback)
        num419.setBackgroundResource(R.drawable.drawback)
        num420.setBackgroundResource(R.drawable.drawback)


        num501.setBackgroundResource(R.drawable.drawbackff)
        num502.setBackgroundResource(R.drawable.drawbackff)
        num503.setBackgroundResource(R.drawable.drawbackff)
        num504.setBackgroundResource(R.drawable.drawbackff)
        num505.setBackgroundResource(R.drawable.drawbackff)
        num506.setBackgroundResource(R.drawable.drawbackff)
        num507.setBackgroundResource(R.drawable.drawbackff)
        num508.setBackgroundResource(R.drawable.drawbackff)
        num509.setBackgroundResource(R.drawable.drawbackff)
        num510.setBackgroundResource(R.drawable.drawbackff)
        num511.setBackgroundResource(R.drawable.drawbackff)
        num512.setBackgroundResource(R.drawable.drawbackff)
        num513.setBackgroundResource(R.drawable.drawbackff)
        num514.setBackgroundResource(R.drawable.drawbackff)
        num515.setBackgroundResource(R.drawable.drawbackff)
        num516.setBackgroundResource(R.drawable.drawbackff)
        num517.setBackgroundResource(R.drawable.drawbackff)
        num518.setBackgroundResource(R.drawable.drawbackff)
        num519.setBackgroundResource(R.drawable.drawbackff)
        num520.setBackgroundResource(R.drawable.drawbackff)
        numtag501.setText("")
        numtag502.setText("")
        numtag503.setText("")
        numtag504.setText("")
        numtag505.setText("")
        numtag506.setText("")
        numtag507.setText("")
        numtag508.setText("")
        numtag509.setText("")
        numtag510.setText("")
        numtag511.setText("")
        numtag512.setText("")
        numtag513.setText("")
        numtag514.setText("")
        numtag515.setText("")
        numtag516.setText("")
        numtag517.setText("")
        numtag518.setText("")
        numtag519.setText("")
        numtag520.setText("")
        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)

        selyes2.setColorFilter(filter)

var votenum = 0
        val per = intent.getIntExtra("per", 0)
        val layer = intent.getIntExtra("layer", 0)
        val sub = intent.getStringExtra("sub")

//        var votenum = intent.getIntExtra("votenum", 0)
        setimg(per)
        setimg2(per)
        setbt() //버튼 비활성화


        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "본인의 사진을 클릭하여 투표를 진행해주세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 13, 19, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView7.setText(spannable, TextView.BufferType.SPANNABLE)

        vote2next2.setOnClickListener {

        }
        votecov.setOnClickListener {

        }

        num301.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num301.setEnabled(false);
            num301.setColorFilter(filter)
            num401.setBackgroundResource(R.drawable.drawbackblack)
            choose1 = 0
            setonbt()

        }


        num302.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num302.setEnabled(false);
            num302.setColorFilter(filter)
            num402.setBackgroundResource(R.drawable.drawbackblack)
            choose2 = 0
            setonbt()


        }
        num303.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num303.setEnabled(false);
            num303.setColorFilter(filter)
            num403.setBackgroundResource(R.drawable.drawbackblack)
            choose3 = 0
            setonbt()

        }


        num304.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num304.setEnabled(false);
            num304.setColorFilter(filter)
            num404.setBackgroundResource(R.drawable.drawbackblack)
            choose4 = 0
            setonbt()

        }

        num305.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num305.setEnabled(false);
            num305.setColorFilter(filter)
            num405.setBackgroundResource(R.drawable.drawbackblack)
            setonbt()
            choose5 = 0
        }

        num306.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num306.setEnabled(false);
            num306.setColorFilter(filter)
            num406.setBackgroundResource(R.drawable.drawbackblack)
            choose6 = 0
            setonbt()

        }

        num307.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num307.setEnabled(false);
            num307.setColorFilter(filter)
            num407.setBackgroundResource(R.drawable.drawbackblack)
            choose7 = 0
            setonbt()

        }

        num308.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num308.setEnabled(false);
            num308.setColorFilter(filter)
            num408.setBackgroundResource(R.drawable.drawbackblack)
            choose8 = 0
            setonbt()

        }

        num309.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num309.setEnabled(false);
            num309.setColorFilter(filter)
            num409.setBackgroundResource(R.drawable.drawbackblack)
            choose9 = 0
            setonbt()

        }

        num310.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num310.setEnabled(false);
            num310.setColorFilter(filter)
            num410.setBackgroundResource(R.drawable.drawbackblack)
            choose10 = 0
            setonbt()

        }

        num311.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num311.setEnabled(false);
            num311.setColorFilter(filter)
            num411.setBackgroundResource(R.drawable.drawbackblack)
            choose11 = 0
            setonbt()

        }

        num312.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num312.setEnabled(false);
            num312.setColorFilter(filter)
            num412.setBackgroundResource(R.drawable.drawbackblack)
            choose12 = 0
            setonbt()

        }

        num313.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num313.setEnabled(false);
            num313.setColorFilter(filter)
            num413.setBackgroundResource(R.drawable.drawbackblack)
            choose13 = 0
            setonbt()

        }


        num314.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num314.setEnabled(false);
            num314.setColorFilter(filter)
            num414.setBackgroundResource(R.drawable.drawbackblack)
            choose14 = 0
            setonbt()

        }

        num315.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num315.setEnabled(false);
            num315.setColorFilter(filter)
            num415.setBackgroundResource(R.drawable.drawbackblack)
            choose15 = 0
            setonbt()

        }

        num316.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num316.setEnabled(false);
            num316.setColorFilter(filter)
            num416.setBackgroundResource(R.drawable.drawbackblack)
            choose16 = 0
            setonbt()

        }

        num317.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num317.setEnabled(false);
            num317.setColorFilter(filter)
            num417.setBackgroundResource(R.drawable.drawbackblack)
            choose17 = 0
            setonbt()

        }

        num318.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num318.setEnabled(false);
            num318.setColorFilter(filter)
            num418.setBackgroundResource(R.drawable.drawbackblack)
            choose18 = 0
            setonbt()

        }


        num319.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num319.setEnabled(false);
            num319.setColorFilter(filter)
            num419.setBackgroundResource(R.drawable.drawbackblack)
            choose19 = 0
            setonbt()

        }

        num320.setOnClickListener {
            textView11.setText("라이어로 의심되는 사람의 사진을 눌러주세요.")
            votenum++
            num320.setEnabled(false);
            num320.setColorFilter(filter)
            num420.setBackgroundResource(R.drawable.drawbackblack)
            choose20 = 0
            setonbt()

        }
var selnum = 0
        selyes.setOnClickListener {

            if (votechoose1 == 1 || votechoose2 == 1 || votechoose3 == 1 || votechoose4 == 1 || votechoose5 == 1 || votechoose6 == 1 || votechoose7 == 1 || votechoose8 == 1 || votechoose9 == 1 || votechoose10 == 1 || votechoose11 == 1 || votechoose12 == 1  || votechoose13 == 1 || votechoose14 == 1|| votechoose15 == 1 || votechoose16 == 1  || votechoose17 == 1 || votechoose18 == 1 || votechoose19 == 1 || votechoose20 == 1 ){
                numtag501.setText("")
                numtag502.setText("")
                numtag503.setText("")
                numtag504.setText("")
                numtag505.setText("")
                numtag506.setText("")
                numtag507.setText("")
                numtag508.setText("")
                numtag509.setText("")
                numtag510.setText("")
                numtag511.setText("")
                numtag512.setText("")
                numtag513.setText("")
                numtag514.setText("")
                numtag515.setText("")
                numtag516.setText("")
                numtag517.setText("")
                numtag518.setText("")
                numtag519.setText("")
                numtag520.setText("")
                textView11.setText("")
                sum++
                setbt()
                setplayer()
                setimg3(selnum)
                if (votenum == per) {
                    end()
                }
                votechoose1 = 0
                votechoose2 = 0
                votechoose3 = 0
                votechoose4 = 0
                votechoose5 = 0
                votechoose6 = 0
                votechoose7 = 0
                votechoose8 = 0
                votechoose9 = 0
                votechoose10 = 0
                votechoose11 = 0
                votechoose12 = 0
                votechoose13 = 0
                votechoose14 = 0
                votechoose15 = 0
                votechoose16 = 0
                votechoose17 = 0
                votechoose18 = 0
                votechoose19 = 0
                votechoose20 = 0
            }

    selyes2.setOnClickListener {

    }

        }

        num501.setOnClickListener {
            votechooseset(1)
            setcheck()
            selnum = 1
        }
        num502.setOnClickListener {
            votechooseset(2)
            setcheck()
            selnum = 2
        }
        num503.setOnClickListener {
            votechooseset(3)
            setcheck()
            selnum = 3
        }
        num504.setOnClickListener {
            votechooseset(4)
            setcheck()
            selnum = 4
        }
        num505.setOnClickListener {
            votechooseset(5)
            setcheck()
            selnum = 5
        }
        num506.setOnClickListener {
            votechooseset(6)
            setcheck()
            selnum = 6
        }
        num507.setOnClickListener {
            votechooseset(7)
            setcheck()
            selnum = 7
        }
        num508.setOnClickListener {
            votechooseset(8)
            setcheck()
            selnum = 8
        }
        num509.setOnClickListener {
            votechooseset(9)
            setcheck()
            selnum = 9
        }
        num510.setOnClickListener {
            votechooseset(10)
            setcheck()
            selnum = 10
        }
        num511.setOnClickListener {
            votechooseset(11)
            setcheck()
            selnum = 11
        }
        num512.setOnClickListener {
            votechooseset(12)
            setcheck()
            selnum = 12
        }
        num513.setOnClickListener {
            votechooseset(13)
            setcheck()
            selnum = 13
        }
        num514.setOnClickListener {
            votechooseset(14)
            setcheck()
            selnum = 14
        }
        num515.setOnClickListener {
            votechooseset(15)
            setcheck()
            selnum = 15
        }
        num516.setOnClickListener {
            votechooseset(16)
            setcheck()
            selnum = 16
        }
        num517.setOnClickListener {
            votechooseset(17)
            setcheck()
            selnum = 17
        }
        num518.setOnClickListener {
            votechooseset(18)
            setcheck()
            selnum = 18
        }
        num519.setOnClickListener {
            votechooseset(19)
            setcheck()
            selnum = 19
        }
        num520.setOnClickListener {
            votechooseset(20)
            setcheck()
            selnum = 20
        }

        vote2next.setOnClickListener {

            val per = intent.getIntExtra("per", 0)

            val layer = intent.getIntExtra("layer", 0)
            val intent = Intent(this, end::class.java)
            intent.putExtra("per",per)
            intent.putExtra("layer", layer)
            intent.putExtra("numsel", num)
            startActivity(intent)
            finish()

        }

//       vote2back.setOnClickListener {
//            val intent = Intent(this, select::class.java)
//            intent.putExtra("per",per)
//            startActivity(intent)
//            finish()
//        }


    }




    var max2 = 0
    var num = 0
    private fun end() {
        val per = intent.getIntExtra("per", 0)
        var max = 0



        if ( max < stack1 ) {
            max = stack1
            num = 1
        }
        if (max < stack2) {
            max = stack2
            num = 2
        }

        if (max < stack3) {
            max = stack3
            num = 3
        }
        if (max < stack4) {
            max = stack4
            num = 4
        }
        if (max < stack5) {
            max = stack5
            num = 5
        }
        if (max < stack6) {
            max = stack6
            num = 6
        }
        if (max < stack7) {
            max = stack7
            num = 7
        }
        if (max < stack8) {
            max = stack8
            num = 8
        }
        if (max < stack9) {
            max = stack9
            num = 9
        }
        if (max < stack10) {
            max = stack10
            num = 10
        }
        if (max < stack11) {
            max = stack11
            num = 11
        }
        if (max < stack12) {
            max = stack12
            num = 12
        }
        if (max < stack13) {
            max = stack13
            num = 13
        }
        if (max < stack14) {
            max = stack14
            num = 14
        }
        if (max < stack15) {
            max = stack15
            num = 15
        }
        if (max < stack16) {
            max = stack16
            num = 16
        }
        if (max < stack17) {
            max = stack17
            num = 17
        }
        if (max < stack18) {
            max = stack18
            num = 18
        }
        if (max < stack19) {
            max = stack19
            num = 19
        }
        if (max < stack20) {
            max = stack20
            num = 20
        }

        if (max == stack1) max2++
        if (max == stack2) max2++
        if (max == stack3) max2++
        if (max == stack4) max2++
        if (max == stack5) max2++
        if (max == stack6) max2++
        if (max == stack7) max2++
        if (max == stack8) max2++
        if (max == stack9) max2++
        if (max == stack10) max2++
        if (max == stack11) max2++
        if (max == stack12) max2++
        if (max == stack13) max2++
        if (max == stack14) max2++
        if (max == stack15) max2++
        if (max == stack16) max2++
        if (max == stack17) max2++
        if (max == stack18) max2++
        if (max == stack19) max2++
        if (max == stack20) max2++



        val datas = intent.getStringExtra("datas")
        if (max2 > 1 || num == 0) {
            Toast.makeText(this, "동표가 나왔습니다.\n다시 투표해주세요.", Toast.LENGTH_SHORT).show()
            val per = intent.getIntExtra("per", 0)
            val layer = intent.getIntExtra("layer", 0)
            val sub = intent.getStringExtra("sub")
            val intent = Intent(this, vote2::class.java)
            intent.putExtra("layer",layer)
            intent.putExtra("per",per)
            intent.putExtra("sub",sub)
            intent.putExtra("datas",datas)
            startActivity(intent)
            finish()
        }else {

                    vote2next2.setVisibility(View.INVISIBLE)

//            val per = intent.getIntExtra("per", 0)
//            val layer = intent.getIntExtra("layer", 0)
//            val intent = Intent(this, end::class.java)
//            intent.putExtra("per",per)
//            intent.putExtra("layer", layer)
//            intent.putExtra("numsel", num)
//            intent.putExtra("datas",datas)
//            startActivity(intent)
//            finish()
        }


    }

    private fun setbt(){

        selyes.setVisibility(View.INVISIBLE)
        textView22.setVisibility(View.INVISIBLE)
        selyes2.setVisibility(View.INVISIBLE)
//        tos.setText("라이어 투표장")
        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "본인의 사진을 클릭하여 투표를 진행해주세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 13, 19, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView7.setText(spannable, TextView.BufferType.SPANNABLE)
        val per = intent.getIntExtra("per", 0)

        //         버튼 비활성화
        if(per <= 19){
            num620.setVisibility(View.INVISIBLE)
            num420.setVisibility(View.INVISIBLE)
            num320.setVisibility(View.INVISIBLE)

        }
        if(per <= 18){
            num619.setVisibility(View.INVISIBLE)
            num419.setVisibility(View.INVISIBLE)
            num319.setVisibility(View.INVISIBLE)
        }
        if(per <= 17){
            num618.setVisibility(View.INVISIBLE)
            num418.setVisibility(View.INVISIBLE)
            num318.setVisibility(View.INVISIBLE)

        }
        if(per <= 16) {
            num617.setVisibility(View.INVISIBLE)
            num417.setVisibility(View.INVISIBLE)
            num317.setVisibility(View.INVISIBLE)
        }
        if(per <= 15){
            num616.setVisibility(View.INVISIBLE)
            num416.setVisibility(View.INVISIBLE)
            num316.setVisibility(View.INVISIBLE)
        }
        if(per <= 14){
            num615.setVisibility(View.INVISIBLE)
            num415.setVisibility(View.INVISIBLE)
            num315.setVisibility(View.INVISIBLE)
        }
        if(per <= 13){
            num614.setVisibility(View.INVISIBLE)
            num414.setVisibility(View.INVISIBLE)
            num314.setVisibility(View.INVISIBLE)
        }
        if(per <= 12){
            num613.setVisibility(View.INVISIBLE)
            num413.setVisibility(View.INVISIBLE)
            num313.setVisibility(View.INVISIBLE)
        }
        if(per <= 11){
            num612.setVisibility(View.INVISIBLE)
            num412.setVisibility(View.INVISIBLE)
            num312.setVisibility(View.INVISIBLE)
        }
        if(per <= 10){
            num611.setVisibility(View.INVISIBLE)
            num411.setVisibility(View.INVISIBLE)
            num311.setVisibility(View.INVISIBLE)
        }
        if(per <= 9){
            num610.setVisibility(View.INVISIBLE)
            num410.setVisibility(View.INVISIBLE)
            num310.setVisibility(View.INVISIBLE)
        }
        if(per <= 8){
            num609.setVisibility(View.INVISIBLE)
            num409.setVisibility(View.INVISIBLE)
            num309.setVisibility(View.INVISIBLE)
        }
        if(per <= 7){
            num608.setVisibility(View.INVISIBLE)
            num408.setVisibility(View.INVISIBLE)
            num308.setVisibility(View.INVISIBLE)
        }
        if(per <= 6){
            num607.setVisibility(View.INVISIBLE)
            num407.setVisibility(View.INVISIBLE)
            num307.setVisibility(View.INVISIBLE)
        }
        if(per <= 5){
            num606.setVisibility(View.INVISIBLE)
            num406.setVisibility(View.INVISIBLE)
            num306.setVisibility(View.INVISIBLE)
        }
        if(per <= 4){
            num605.setVisibility(View.INVISIBLE)
            num405.setVisibility(View.INVISIBLE)
            num305.setVisibility(View.INVISIBLE)
        }
        if(per <= 3){
            num604.setVisibility(View.INVISIBLE)
            num404.setVisibility(View.INVISIBLE)
            num304.setVisibility(View.INVISIBLE)
        }
        if(per <= 2){
            num603.setVisibility(View.INVISIBLE)
            num403.setVisibility(View.INVISIBLE)
            num303.setVisibility(View.INVISIBLE)
        }
        if(per <= 1){
            num602.setVisibility(View.INVISIBLE)
            num402.setVisibility(View.INVISIBLE)
            num302.setVisibility(View.INVISIBLE)
        }

        num301.setBackgroundResource(R.drawable.drawbackff)
        num302.setBackgroundResource(R.drawable.drawbackff)
        num303.setBackgroundResource(R.drawable.drawbackff)
        num304.setBackgroundResource(R.drawable.drawbackff)
        num305.setBackgroundResource(R.drawable.drawbackff)
        num306.setBackgroundResource(R.drawable.drawbackff)
        num307.setBackgroundResource(R.drawable.drawbackff)
        num308.setBackgroundResource(R.drawable.drawbackff)
        num309.setBackgroundResource(R.drawable.drawbackff)
        num310.setBackgroundResource(R.drawable.drawbackff)
        num311.setBackgroundResource(R.drawable.drawbackff)
        num312.setBackgroundResource(R.drawable.drawbackff)
        num313.setBackgroundResource(R.drawable.drawbackff)
        num314.setBackgroundResource(R.drawable.drawbackff)
        num315.setBackgroundResource(R.drawable.drawbackff)
        num316.setBackgroundResource(R.drawable.drawbackff)
        num317.setBackgroundResource(R.drawable.drawbackff)
        num318.setBackgroundResource(R.drawable.drawbackff)
        num319.setBackgroundResource(R.drawable.drawbackff)
        num320.setBackgroundResource(R.drawable.drawbackff)

        num401.setVisibility(View.INVISIBLE)
        num402.setVisibility(View.INVISIBLE)
        num403.setVisibility(View.INVISIBLE)
        num404.setVisibility(View.INVISIBLE)
        num405.setVisibility(View.INVISIBLE)
        num406.setVisibility(View.INVISIBLE)
        num407.setVisibility(View.INVISIBLE)
        num408.setVisibility(View.INVISIBLE)
        num409.setVisibility(View.INVISIBLE)
        num410.setVisibility(View.INVISIBLE)
        num411.setVisibility(View.INVISIBLE)
        num412.setVisibility(View.INVISIBLE)
        num413.setVisibility(View.INVISIBLE)
        num414.setVisibility(View.INVISIBLE)
        num415.setVisibility(View.INVISIBLE)
        num416.setVisibility(View.INVISIBLE)
        num417.setVisibility(View.INVISIBLE)
        num418.setVisibility(View.INVISIBLE)
        num419.setVisibility(View.INVISIBLE)
        num420.setVisibility(View.INVISIBLE)

        num501.setVisibility(View.INVISIBLE)
        num502.setVisibility(View.INVISIBLE)
        num503.setVisibility(View.INVISIBLE)
        num504.setVisibility(View.INVISIBLE)
        num505.setVisibility(View.INVISIBLE)
        num506.setVisibility(View.INVISIBLE)
        num507.setVisibility(View.INVISIBLE)
        num508.setVisibility(View.INVISIBLE)
        num509.setVisibility(View.INVISIBLE)
        num510.setVisibility(View.INVISIBLE)
        num511.setVisibility(View.INVISIBLE)
        num512.setVisibility(View.INVISIBLE)
        num513.setVisibility(View.INVISIBLE)
        num514.setVisibility(View.INVISIBLE)
        num515.setVisibility(View.INVISIBLE)
        num516.setVisibility(View.INVISIBLE)
        num517.setVisibility(View.INVISIBLE)
        num518.setVisibility(View.INVISIBLE)
        num519.setVisibility(View.INVISIBLE)
        num520.setVisibility(View.INVISIBLE)
        votecov.setVisibility(View.INVISIBLE)
        votecov2.setVisibility(View.INVISIBLE)


        return
    }
    private fun setonbt(){
        val per = intent.getIntExtra("per", 0)
        votecov.setVisibility(View.VISIBLE)
        votecov2.setVisibility(View.VISIBLE)

        textView22.setVisibility(View.VISIBLE)
        selyes.setVisibility(View.VISIBLE)
        selyes2.setVisibility(View.VISIBLE)
//        tos.setText("투표중···")
        when (per) {
            //선택안함
            0 -> {
                Toast.makeText(this, "인원이 선택되지 않았습니다 ", Toast.LENGTH_SHORT).show()
            }
            1 -> {
                num501.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)

            }
            2 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)


            }
            3 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)

            }
            4 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
            }
            5 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
            }
            6 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
            }
            7 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
            }
            8 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
            }
            9 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
            }
            10 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
            }
            11 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
            }
            12 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
            }
            13 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
            }
            14 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
            }
            15 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num515.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num415.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
                num415.setBackgroundResource(R.drawable.drawbackgrape)
            }
            16 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num515.setVisibility(View.VISIBLE)
                num516.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num415.setVisibility(View.VISIBLE)
                num416.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
                num415.setBackgroundResource(R.drawable.drawbackgrape)
                num416.setBackgroundResource(R.drawable.drawbackgrape)
            }
            17 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num515.setVisibility(View.VISIBLE)
                num516.setVisibility(View.VISIBLE)
                num517.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num415.setVisibility(View.VISIBLE)
                num416.setVisibility(View.VISIBLE)
                num417.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
                num415.setBackgroundResource(R.drawable.drawbackgrape)
                num416.setBackgroundResource(R.drawable.drawbackgrape)
                num417.setBackgroundResource(R.drawable.drawbackgrape)
            }
            18 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num515.setVisibility(View.VISIBLE)
                num516.setVisibility(View.VISIBLE)
                num517.setVisibility(View.VISIBLE)
                num518.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num415.setVisibility(View.VISIBLE)
                num416.setVisibility(View.VISIBLE)
                num417.setVisibility(View.VISIBLE)
                num418.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
                num415.setBackgroundResource(R.drawable.drawbackgrape)
                num416.setBackgroundResource(R.drawable.drawbackgrape)
                num417.setBackgroundResource(R.drawable.drawbackgrape)
                num418.setBackgroundResource(R.drawable.drawbackgrape)
            }
            19 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num515.setVisibility(View.VISIBLE)
                num516.setVisibility(View.VISIBLE)
                num517.setVisibility(View.VISIBLE)
                num518.setVisibility(View.VISIBLE)
                num519.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num415.setVisibility(View.VISIBLE)
                num416.setVisibility(View.VISIBLE)
                num417.setVisibility(View.VISIBLE)
                num418.setVisibility(View.VISIBLE)
                num419.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
                num415.setBackgroundResource(R.drawable.drawbackgrape)
                num416.setBackgroundResource(R.drawable.drawbackgrape)
                num417.setBackgroundResource(R.drawable.drawbackgrape)
                num418.setBackgroundResource(R.drawable.drawbackgrape)
                num419.setBackgroundResource(R.drawable.drawbackgrape)
            }
            20 -> {
                num501.setVisibility(View.VISIBLE)
                num502.setVisibility(View.VISIBLE)
                num503.setVisibility(View.VISIBLE)
                num504.setVisibility(View.VISIBLE)
                num505.setVisibility(View.VISIBLE)
                num506.setVisibility(View.VISIBLE)
                num507.setVisibility(View.VISIBLE)
                num508.setVisibility(View.VISIBLE)
                num509.setVisibility(View.VISIBLE)
                num510.setVisibility(View.VISIBLE)
                num511.setVisibility(View.VISIBLE)
                num512.setVisibility(View.VISIBLE)
                num513.setVisibility(View.VISIBLE)
                num514.setVisibility(View.VISIBLE)
                num515.setVisibility(View.VISIBLE)
                num516.setVisibility(View.VISIBLE)
                num517.setVisibility(View.VISIBLE)
                num518.setVisibility(View.VISIBLE)
                num519.setVisibility(View.VISIBLE)
                num520.setVisibility(View.VISIBLE)
                num401.setVisibility(View.VISIBLE)
                num402.setVisibility(View.VISIBLE)
                num403.setVisibility(View.VISIBLE)
                num404.setVisibility(View.VISIBLE)
                num405.setVisibility(View.VISIBLE)
                num406.setVisibility(View.VISIBLE)
                num407.setVisibility(View.VISIBLE)
                num408.setVisibility(View.VISIBLE)
                num409.setVisibility(View.VISIBLE)
                num410.setVisibility(View.VISIBLE)
                num411.setVisibility(View.VISIBLE)
                num412.setVisibility(View.VISIBLE)
                num413.setVisibility(View.VISIBLE)
                num414.setVisibility(View.VISIBLE)
                num415.setVisibility(View.VISIBLE)
                num416.setVisibility(View.VISIBLE)
                num417.setVisibility(View.VISIBLE)
                num418.setVisibility(View.VISIBLE)
                num419.setVisibility(View.VISIBLE)
                num420.setVisibility(View.VISIBLE)
                num401.setBackgroundResource(R.drawable.drawbackgrape)
                num402.setBackgroundResource(R.drawable.drawbackgrape)
                num403.setBackgroundResource(R.drawable.drawbackgrape)
                num404.setBackgroundResource(R.drawable.drawbackgrape)
                num405.setBackgroundResource(R.drawable.drawbackgrape)
                num406.setBackgroundResource(R.drawable.drawbackgrape)
                num407.setBackgroundResource(R.drawable.drawbackgrape)
                num408.setBackgroundResource(R.drawable.drawbackgrape)
                num409.setBackgroundResource(R.drawable.drawbackgrape)
                num410.setBackgroundResource(R.drawable.drawbackgrape)
                num411.setBackgroundResource(R.drawable.drawbackgrape)
                num412.setBackgroundResource(R.drawable.drawbackgrape)
                num413.setBackgroundResource(R.drawable.drawbackgrape)
                num414.setBackgroundResource(R.drawable.drawbackgrape)
                num415.setBackgroundResource(R.drawable.drawbackgrape)
                num416.setBackgroundResource(R.drawable.drawbackgrape)
                num417.setBackgroundResource(R.drawable.drawbackgrape)
                num418.setBackgroundResource(R.drawable.drawbackgrape)
                num419.setBackgroundResource(R.drawable.drawbackgrape)
                num420.setBackgroundResource(R.drawable.drawbackgrape)
            }



        }
        //   참가자 버튼 활성화
        for(i in 1..per) {
            var file = File("${filesDir}/image/p" + "$i" + ".jpg")
            if (file.exists() != true) {
                when (i) {
                    1 -> {

                        numtag501.setText("1")
                    }
                    2 -> {

                        numtag502.setText("2")
                    }
                    3 -> {

                        numtag503.setText("3")
                    }
                    4 -> {

                        numtag504.setText("4")
                    }
                    5 -> {

                        numtag505.setText("5")
                    }
                    6 -> {

                        numtag506.setText("6")
                    }
                    7 -> {

                        numtag507.setText("7")
                    }
                    8 -> {

                        numtag508.setText("8")
                    }
                    9 -> {

                        numtag509.setText("9")
                    }
                    10 -> {

                        numtag510.setText("10")
                    }
                    11 -> {

                        numtag511.setText("11")
                    }
                    12 -> {

                        numtag512.setText("12")
                    }
                    13 -> {

                        numtag513.setText("13")
                    }
                    14 -> {

                        numtag514.setText("14")
                    }
                    15 -> {

                        numtag515.setText("15")
                    }
                    16 -> {

                        numtag516.setText("16")
                    }
                    17 -> {

                        numtag517.setText("17")
                    }
                    18 -> {

                        numtag518.setText("18")
                    }
                    19 -> {

                        numtag519.setText("19")
                    }
                    20 -> {

                        numtag520.setText("20")
                    }
                }

            }
        }
    }
    private fun setplayer(){
        num401.setBackgroundResource(R.drawable.drawback)
        num402.setBackgroundResource(R.drawable.drawback)
        num403.setBackgroundResource(R.drawable.drawback)
        num404.setBackgroundResource(R.drawable.drawback)
        num405.setBackgroundResource(R.drawable.drawback)
        num406.setBackgroundResource(R.drawable.drawback)
        num407.setBackgroundResource(R.drawable.drawback)
        num408.setBackgroundResource(R.drawable.drawback)
        num409.setBackgroundResource(R.drawable.drawback)
        num410.setBackgroundResource(R.drawable.drawback)
        num411.setBackgroundResource(R.drawable.drawback)
        num412.setBackgroundResource(R.drawable.drawback)
        num413.setBackgroundResource(R.drawable.drawback)
        num414.setBackgroundResource(R.drawable.drawback)
        num415.setBackgroundResource(R.drawable.drawback)
        num416.setBackgroundResource(R.drawable.drawback)
        num417.setBackgroundResource(R.drawable.drawback)
        num418.setBackgroundResource(R.drawable.drawback)
        num419.setBackgroundResource(R.drawable.drawback)
        num420.setBackgroundResource(R.drawable.drawback)
        if (choose1 == 0)   num601.setBackgroundResource(R.drawable.drawbackblack)
        if (choose2 == 0)   num602.setBackgroundResource(R.drawable.drawbackblack)
        if (choose3 == 0)   num603.setBackgroundResource(R.drawable.drawbackblack)
        if (choose4 == 0)   num604.setBackgroundResource(R.drawable.drawbackblack)
        if (choose5 == 0)   num605.setBackgroundResource(R.drawable.drawbackblack)
        if (choose6 == 0)   num606.setBackgroundResource(R.drawable.drawbackblack)
        if (choose7 == 0)   num607.setBackgroundResource(R.drawable.drawbackblack)
        if (choose8 == 0)   num608.setBackgroundResource(R.drawable.drawbackblack)
        if (choose9 == 0)   num609.setBackgroundResource(R.drawable.drawbackblack)
        if (choose10 == 0)   num610.setBackgroundResource(R.drawable.drawbackblack)
        if (choose11 == 0)   num611.setBackgroundResource(R.drawable.drawbackblack)
        if (choose12 == 0)   num612.setBackgroundResource(R.drawable.drawbackblack)
        if (choose13 == 0)   num613.setBackgroundResource(R.drawable.drawbackblack)
        if (choose14 == 0)   num614.setBackgroundResource(R.drawable.drawbackblack)
        if (choose15 == 0)   num615.setBackgroundResource(R.drawable.drawbackblack)
        if (choose16 == 0)   num616.setBackgroundResource(R.drawable.drawbackblack)
        if (choose17 == 0)   num617.setBackgroundResource(R.drawable.drawbackblack)
        if (choose18 == 0)   num618.setBackgroundResource(R.drawable.drawbackblack)
        if (choose19 == 0)   num619.setBackgroundResource(R.drawable.drawbackblack)
        if (choose20 == 0)   num620.setBackgroundResource(R.drawable.drawbackblack)
    }
    private fun setimg(i2: Int ){

        for(i in 1..i2) {


            try {

                var file = File("${filesDir}/image/p" + "$i" + ".jpg")
                var filePath = file.getPath()
                var bitmap = BitmapFactory.decodeFile(filePath)
                if (file.exists() == true) {
                    when (i) {
                        1 -> {
                            num301.setImageBitmap(bitmap)
                            num301.setBackgroundResource(R.drawable.drawback)

                        }
                        2 -> {
                            num302.setImageBitmap(bitmap)
                            num302.setBackgroundResource(R.drawable.drawback)

                        }
                        3 -> {
                            num303.setImageBitmap(bitmap)
                            num303.setBackgroundResource(R.drawable.drawback)

                        }
                        4 -> {
                            num304.setImageBitmap(bitmap)
                            num304.setBackgroundResource(R.drawable.drawback)

                        }
                        5 -> {
                            num305.setImageBitmap(bitmap)
                            num305.setBackgroundResource(R.drawable.drawback)

                        }
                        6 -> {
                            num306.setImageBitmap(bitmap)
                            num306.setBackgroundResource(R.drawable.drawback)

                        }
                        7 -> {
                            num307.setImageBitmap(bitmap)
                            num307.setBackgroundResource(R.drawable.drawback)

                        }
                        8 -> {
                            num308.setImageBitmap(bitmap)
                            num308.setBackgroundResource(R.drawable.drawback)

                        }
                        9 -> {
                            num309.setImageBitmap(bitmap)
                            num309.setBackgroundResource(R.drawable.drawback)

                        }
                        10 -> {
                            num310.setImageBitmap(bitmap)
                            num310.setBackgroundResource(R.drawable.drawback)

                        }
                        11 -> {
                            num311.setImageBitmap(bitmap)
                            num311.setBackgroundResource(R.drawable.drawback)

                        }
                        12 -> {
                            num312.setImageBitmap(bitmap)
                            num312.setBackgroundResource(R.drawable.drawback)

                        }
                        13 -> {
                            num313.setImageBitmap(bitmap)
                            num313.setBackgroundResource(R.drawable.drawback)

                        }
                        14 -> {
                            num314.setImageBitmap(bitmap)
                            num314.setBackgroundResource(R.drawable.drawback)

                        }
                        15 -> {
                            num315.setImageBitmap(bitmap)
                            num315.setBackgroundResource(R.drawable.drawback)

                        }
                        16 -> {
                            num316.setImageBitmap(bitmap)
                            num316.setBackgroundResource(R.drawable.drawback)

                        }
                        17 -> {
                            num317.setImageBitmap(bitmap)
                            num317.setBackgroundResource(R.drawable.drawback)

                        }
                        18 -> {
                            num318.setImageBitmap(bitmap)
                            num318.setBackgroundResource(R.drawable.drawback)

                        }
                        19 -> {
                            num319.setImageBitmap(bitmap)
                            num319.setBackgroundResource(R.drawable.drawback)

                        }
                        20 -> {
                            num320.setImageBitmap(bitmap)
                            num320.setBackgroundResource(R.drawable.drawback)

                        }
                    }
                }else {
                    when (i) {
                        1 -> {

                            numtag301.setText("1")
                        }
                        2 -> {

                            numtag302.setText("2")
                        }
                        3 -> {

                            numtag303.setText("3")
                        }
                        4 -> {

                            numtag304.setText("4")
                        }
                        5 -> {

                            numtag305.setText("5")
                        }
                        6 -> {

                            numtag306.setText("6")
                        }
                        7 -> {

                            numtag307.setText("7")
                        }
                        8 -> {

                            numtag308.setText("8")
                        }
                        9 -> {

                            numtag309.setText("9")
                        }
                        10 -> {

                            numtag310.setText("10")
                        }
                        11 -> {

                            numtag311.setText("11")
                        }
                        12 -> {

                            numtag312.setText("12")
                        }
                        13 -> {

                            numtag313.setText("13")
                        }
                        14 -> {

                            numtag314.setText("14")
                        }
                        15 -> {

                            numtag315.setText("15")
                        }
                        16 -> {

                            numtag316.setText("16")
                        }
                        17 -> {

                            numtag317.setText("17")
                        }
                        18 -> {

                            numtag318.setText("18")
                        }
                        19 -> {

                            numtag319.setText("19")
                        }
                        20 -> {

                            numtag320.setText("20")
                        }
                    }
                }
                }catch (e: Exception){
                null
            }



        }


    }
    private fun setimg2(i2: Int ){

        for(i in 1..i2) {


            try {

                var file = File("${filesDir}/image/p" + "$i" + ".jpg")
                var filePath = file.getPath()
                var bitmap = BitmapFactory.decodeFile(filePath)
                if (file.exists() == true) {
                    when (i) {
                        1 -> num501.setImageBitmap(bitmap)
                        2 -> num502.setImageBitmap(bitmap)
                        3 -> num503.setImageBitmap(bitmap)
                        4 -> num504.setImageBitmap(bitmap)
                        5 -> num505.setImageBitmap(bitmap)
                        6 -> num506.setImageBitmap(bitmap)
                        7 -> num507.setImageBitmap(bitmap)
                        8 -> num508.setImageBitmap(bitmap)
                        9 -> num509.setImageBitmap(bitmap)
                        10 -> num510.setImageBitmap(bitmap)
                        11 -> num511.setImageBitmap(bitmap)
                        12 -> num512.setImageBitmap(bitmap)
                        13 -> num513.setImageBitmap(bitmap)
                        14 -> num514.setImageBitmap(bitmap)
                        15 -> num515.setImageBitmap(bitmap)
                        16 -> num516.setImageBitmap(bitmap)
                        17 -> num517.setImageBitmap(bitmap)
                        18 -> num518.setImageBitmap(bitmap)
                        19 -> num519.setImageBitmap(bitmap)
                        20 -> num520.setImageBitmap(bitmap)
                    }
                }

            }catch (e: Exception){
                null
            }



        }

    }
    private fun setimg3(i: Int ) {


        when(i){
            1 ->   stack1++
            2 ->   stack2++
            3 ->   stack3++
            4 ->   stack4++
            5 ->   stack5++
            6 ->   stack6++
            7 ->   stack7++
            8 ->   stack8++
            9 ->   stack9++
            10 ->   stack10++
            11 ->   stack11++
            12 ->   stack12++
            13 ->   stack13++
            14 ->   stack14++
            15 ->   stack15++
            16 ->   stack16++
            17 ->   stack17++
            18 ->   stack18++
            19 ->   stack19++
            20 ->   stack20++


        }


    }
    private fun setcheck() {
        if (votechoose1 == 1){
            num401.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num401.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose2 == 1){
            num402.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num402.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose3 == 1){
            num403.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num403.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose4 == 1){
            num404.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num404.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose5 == 1){
            num405.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num405.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose6 == 1){
            num406.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num406.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose7 == 1){
            num407.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num407.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose8 == 1){
            num408.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num408.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose9 == 1){
            num409.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num409.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose10 == 1){
            num410.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num410.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose11 == 1){
            num411.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num411.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose12 == 1){
            num412.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num412.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose13 == 1){
            num413.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num413.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose14 == 1){
            num414.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num414.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose15 == 1){
            num415.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num415.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose16 == 1){
            num416.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num416.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose17 == 1){
            num417.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num417.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose18 == 1){
            num418.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num418.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose19 == 1){
            num419.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num419.setBackgroundResource(R.drawable.drawbackgrape)
        }
        if (votechoose20 == 1){
            num420.setBackgroundResource(R.drawable.drawbackgreen)
        }else {
            num420.setBackgroundResource(R.drawable.drawbackgrape)
        }


    }
    private fun votechooseset(i : Int) {
         votechoose1 = 0
         votechoose2 = 0
         votechoose3 = 0
        votechoose4 = 0
         votechoose5 = 0
         votechoose6 = 0
        votechoose7 = 0
        votechoose8 = 0
        votechoose9 = 0
        votechoose10 = 0
        votechoose11 = 0
        votechoose12 = 0
        votechoose13 = 0
        votechoose14 = 0
        votechoose15 = 0
        votechoose16 = 0
        votechoose17 = 0
        votechoose18 = 0
        votechoose19 = 0
        votechoose20 = 0
        selyes2.setVisibility(View.INVISIBLE)
        when (i) {
            1 -> votechoose1 = 1
            2 -> votechoose2 = 1
            3 -> votechoose3 = 1
            4 -> votechoose4 = 1
            5 -> votechoose5 = 1
            6 -> votechoose6 = 1
            7 -> votechoose7 = 1
            8 -> votechoose8 = 1
            9 -> votechoose9 = 1
            10 -> votechoose10 = 1
            11 -> votechoose11 = 1
            12 -> votechoose12 = 1
            13 -> votechoose13 = 1
            14 -> votechoose14 = 1
            15 -> votechoose15 = 1
            16 -> votechoose16 = 1
            17 -> votechoose17 = 1
            18 -> votechoose18 = 1
            19 -> votechoose19 = 1
            20 -> votechoose20 = 1
        }



    }


}