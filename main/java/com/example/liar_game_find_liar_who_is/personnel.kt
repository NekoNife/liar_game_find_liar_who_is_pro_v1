package com.example.liar_game_find_liar_who_is

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_num.*
import kotlinx.android.synthetic.main.activity_personnel.*
import kotlinx.android.synthetic.main.activity_vote.*
import java.io.*
import java.text.SimpleDateFormat
import java.util.*


class personnel : AppCompatActivity() {
//    val REQUEST_IMAGE_CAPTURE = 1
//    var currentPhotoPath = null

    val CAMERA_PERMISSION = arrayOf(Manifest.permission.CAMERA)
    val STORAGE_PERMISSION = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE)

    //권한 플래그값 정의
    val FLAG_PERM_CAMERA = 98
    val FLAG_PERM_STORAGE = 99

    //카메라와 갤러리를 호출하는 플래그
    val FLAG_REQ_CAMERA = 101
    val FLAG_REA_STORAGE = 102

    var sum = 0
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
        setContentView(R.layout.activity_personnel)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
        if(checkPermission(STORAGE_PERMISSION,FLAG_PERM_STORAGE)){
            setViews()
        }

        val per = intent.getIntExtra("per", 0)
        val img = intent.getIntExtra("img", 0)
//        Toast.makeText(this, "$per 명 ", Toast.LENGTH_SHORT).show()

        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)

        checkbt.setVisibility(View.INVISIBLE)
            num1.setVisibility(View.INVISIBLE)
            num2.setVisibility(View.INVISIBLE)
            num3.setVisibility(View.INVISIBLE)
            num4.setVisibility(View.INVISIBLE)
            num5.setVisibility(View.INVISIBLE)
            num6.setVisibility(View.INVISIBLE)
            num7.setVisibility(View.INVISIBLE)
            num8.setVisibility(View.INVISIBLE)
            num9.setVisibility(View.INVISIBLE)
            num10.setVisibility(View.INVISIBLE)
            num11.setVisibility(View.INVISIBLE)
            num12.setVisibility(View.INVISIBLE)
            num13.setVisibility(View.INVISIBLE)
            num14.setVisibility(View.INVISIBLE)
            num15.setVisibility(View.INVISIBLE)
            num16.setVisibility(View.INVISIBLE)
            num17.setVisibility(View.INVISIBLE)
            num18.setVisibility(View.INVISIBLE)
            num19.setVisibility(View.INVISIBLE)
            num20.setVisibility(View.INVISIBLE)
        numtag1.setText("")
        numtag2.setText("")
        numtag3.setText("")
        numtag4.setText("")
        numtag5.setText("")
        numtag6.setText("")
        numtag7.setText("")
        numtag8.setText("")
        numtag9.setText("")
        numtag10.setText("")
        numtag11.setText("")
        numtag12.setText("")
        numtag13.setText("")
        numtag14.setText("")
        numtag15.setText("")
        numtag16.setText("")
        numtag17.setText("")
        numtag18.setText("")
        numtag19.setText("")
        numtag20.setText("")
        numcov1.setVisibility(View.INVISIBLE)
        numcov2.setVisibility(View.INVISIBLE)
        numcov3.setVisibility(View.INVISIBLE)
        numcov4.setVisibility(View.INVISIBLE)
        numcov5.setVisibility(View.INVISIBLE)
        numcov6.setVisibility(View.INVISIBLE)
        numcov7.setVisibility(View.INVISIBLE)
        numcov8.setVisibility(View.INVISIBLE)
        numcov9.setVisibility(View.INVISIBLE)
        numcov10.setVisibility(View.INVISIBLE)
        numcov11.setVisibility(View.INVISIBLE)
        numcov12.setVisibility(View.INVISIBLE)
        numcov13.setVisibility(View.INVISIBLE)
        numcov14.setVisibility(View.INVISIBLE)
        numcov15.setVisibility(View.INVISIBLE)
        numcov16.setVisibility(View.INVISIBLE)
        numcov17.setVisibility(View.INVISIBLE)
        numcov18.setVisibility(View.INVISIBLE)
        numcov19.setVisibility(View.INVISIBLE)
        numcov20.setVisibility(View.INVISIBLE)
//       checkbt.setVisibility(View.INVISIBLE)


        ssub(1,0)
        ssub(2,0)
        ssub(3,0)
        ssub(4,0)
        ssub(5,0)
        ssub(6,0)
        ssub(7,0)
        ssub(8,0)
        ssub(9,0)
        ssub(10,0)
        ssub(11,0)
        ssub(12,0)



        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "참가자분들은 사진을 촬영해주세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 7, 13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView4.setText(spannable, TextView.BufferType.SPANNABLE)



        perback.setOnClickListener {
            val intent = Intent(this, numActivity::class.java)
            startActivity(intent)
            finish()
        }





        when (per) {
            //선택안함
            0 -> {
                Toast.makeText(this, "인원이 선택되지 않았습니다 ", Toast.LENGTH_SHORT).show()
            }
            1 -> {
                num1.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)

            }
            2 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)

            }
            3 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)

            }
            4 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
            }
            5 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
            }
            6 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
            }
            7 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
            }
            8 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
            }
            9 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
            }
            10 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
            }
            11 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
            }
            12 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
            }
            13 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
            }
            14 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)


            }
            15 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                num15.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)
                numcov15.setVisibility(View.VISIBLE)

            }
            16 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                num15.setVisibility(View.VISIBLE)
                num16.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)
                numcov15.setVisibility(View.VISIBLE)
                numcov16.setVisibility(View.VISIBLE)

            }
            17 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                num15.setVisibility(View.VISIBLE)
                num16.setVisibility(View.VISIBLE)
                num17.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)
                numcov15.setVisibility(View.VISIBLE)
                numcov16.setVisibility(View.VISIBLE)
                numcov17.setVisibility(View.VISIBLE)

            }
            18 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                num15.setVisibility(View.VISIBLE)
                num16.setVisibility(View.VISIBLE)
                num17.setVisibility(View.VISIBLE)
                num18.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)
                numcov15.setVisibility(View.VISIBLE)
                numcov16.setVisibility(View.VISIBLE)
                numcov17.setVisibility(View.VISIBLE)
                numcov18.setVisibility(View.VISIBLE)
            }
            19 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                num15.setVisibility(View.VISIBLE)
                num16.setVisibility(View.VISIBLE)
                num17.setVisibility(View.VISIBLE)
                num18.setVisibility(View.VISIBLE)
                num19.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)
                numcov15.setVisibility(View.VISIBLE)
                numcov16.setVisibility(View.VISIBLE)
                numcov17.setVisibility(View.VISIBLE)
                numcov18.setVisibility(View.VISIBLE)
                numcov19.setVisibility(View.VISIBLE)
            }
            20 -> {
                num1.setVisibility(View.VISIBLE)
                num2.setVisibility(View.VISIBLE)
                num3.setVisibility(View.VISIBLE)
                num4.setVisibility(View.VISIBLE)
                num5.setVisibility(View.VISIBLE)
                num6.setVisibility(View.VISIBLE)
                num7.setVisibility(View.VISIBLE)
                num8.setVisibility(View.VISIBLE)
                num9.setVisibility(View.VISIBLE)
                num10.setVisibility(View.VISIBLE)
                num11.setVisibility(View.VISIBLE)
                num12.setVisibility(View.VISIBLE)
                num13.setVisibility(View.VISIBLE)
                num14.setVisibility(View.VISIBLE)
                num15.setVisibility(View.VISIBLE)
                num16.setVisibility(View.VISIBLE)
                num17.setVisibility(View.VISIBLE)
                num18.setVisibility(View.VISIBLE)
                num19.setVisibility(View.VISIBLE)
                num20.setVisibility(View.VISIBLE)
                numcov1.setVisibility(View.VISIBLE)
                numcov2.setVisibility(View.VISIBLE)
                numcov3.setVisibility(View.VISIBLE)
                numcov4.setVisibility(View.VISIBLE)
                numcov5.setVisibility(View.VISIBLE)
                numcov6.setVisibility(View.VISIBLE)
                numcov7.setVisibility(View.VISIBLE)
                numcov8.setVisibility(View.VISIBLE)
                numcov9.setVisibility(View.VISIBLE)
                numcov10.setVisibility(View.VISIBLE)
                numcov11.setVisibility(View.VISIBLE)
                numcov12.setVisibility(View.VISIBLE)
                numcov13.setVisibility(View.VISIBLE)
                numcov14.setVisibility(View.VISIBLE)
                numcov15.setVisibility(View.VISIBLE)
                numcov16.setVisibility(View.VISIBLE)
                numcov17.setVisibility(View.VISIBLE)
                numcov18.setVisibility(View.VISIBLE)
                numcov19.setVisibility(View.VISIBLE)
                numcov20.setVisibility(View.VISIBLE)
            }

        }
      //   참가자 버튼 활성화
        num1.setBackgroundResource(R.drawable.drawbackff)
        num2.setBackgroundResource(R.drawable.drawbackff)
        num3.setBackgroundResource(R.drawable.drawbackff)
        num4.setBackgroundResource(R.drawable.drawbackff)
        num5.setBackgroundResource(R.drawable.drawbackff)
        num6.setBackgroundResource(R.drawable.drawbackff)
        num7.setBackgroundResource(R.drawable.drawbackff)
        num8.setBackgroundResource(R.drawable.drawbackff)
        num9.setBackgroundResource(R.drawable.drawbackff)
        num10.setBackgroundResource(R.drawable.drawbackff)
        num11.setBackgroundResource(R.drawable.drawbackff)
        num12.setBackgroundResource(R.drawable.drawbackff)
        num13.setBackgroundResource(R.drawable.drawbackff)
        num14.setBackgroundResource(R.drawable.drawbackff)
        num15.setBackgroundResource(R.drawable.drawbackff)
        num16.setBackgroundResource(R.drawable.drawbackff)
        num17.setBackgroundResource(R.drawable.drawbackff)
        num18.setBackgroundResource(R.drawable.drawbackff)
        num19.setBackgroundResource(R.drawable.drawbackff)
        num20.setBackgroundResource(R.drawable.drawbackff)
        numcov1.setBackgroundResource(R.drawable.drawback)
        numcov2.setBackgroundResource(R.drawable.drawback)
        numcov3.setBackgroundResource(R.drawable.drawback)
        numcov4.setBackgroundResource(R.drawable.drawback)
        numcov5.setBackgroundResource(R.drawable.drawback)
        numcov6.setBackgroundResource(R.drawable.drawback)
        numcov7.setBackgroundResource(R.drawable.drawback)
        numcov8.setBackgroundResource(R.drawable.drawback)
        numcov9.setBackgroundResource(R.drawable.drawback)
        numcov10.setBackgroundResource(R.drawable.drawback)
        numcov11.setBackgroundResource(R.drawable.drawback)
        numcov12.setBackgroundResource(R.drawable.drawback)
        numcov13.setBackgroundResource(R.drawable.drawback)
        numcov14.setBackgroundResource(R.drawable.drawback)
        numcov15.setBackgroundResource(R.drawable.drawback)
        numcov16.setBackgroundResource(R.drawable.drawback)
        numcov17.setBackgroundResource(R.drawable.drawback)
        numcov18.setBackgroundResource(R.drawable.drawback)
        numcov19.setBackgroundResource(R.drawable.drawback)
        numcov20.setBackgroundResource(R.drawable.drawback)
        perback.setBackgroundResource(R.drawable.drawbackff)
        perback2.setBackgroundResource(R.drawable.drawbackgrape)
        num1.clipToOutline = true
        num2.clipToOutline = true
        num3.clipToOutline = true
        num4.clipToOutline = true
        num5.clipToOutline = true
        num6.clipToOutline = true
        num7.clipToOutline = true
        num8.clipToOutline = true
        num9.clipToOutline = true
        num10.clipToOutline = true
        num11.clipToOutline = true
        num12.clipToOutline = true
        num13.clipToOutline = true
        num14.clipToOutline = true
        num15.clipToOutline = true
        num16.clipToOutline = true
        num17.clipToOutline = true
        num18.clipToOutline = true
        num19.clipToOutline = true
        num20.clipToOutline = true
        perback.clipToOutline = true
//        checkbt2.setBackgroundResource(R.drawable.drawbackblack)
        checkbt2.setBackgroundResource(R.drawable.drawbackgrape)
        if (img == 0){

            val path = File(filesDir, "image")
            if(!path.exists()){
                path.mkdirs()
            }
            for (i in 1..per) {
                val file = File(path, "p"+i+".jpg")
                if (file.exists() == true) {
                    setimg(i)
                    sum++
                    when(i){
                        1 -> {
                            numcov1.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        2 -> {
                            numcov2.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        3 -> {
                            numcov3.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        4 -> {
                            numcov4.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        5 -> {
                            numcov5.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        6 -> {
                            numcov6.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        7 -> {
                            numcov7.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        8 -> {
                            numcov8.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        9 -> {
                            numcov9.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        10 -> {
                            numcov10.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        11 -> {
                            numcov11.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        12 -> {
                            numcov12.setBackgroundResource(R.drawable.drawbackblack)

                        }
                        13 -> {
                            numcov13.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        14 -> {
                            numcov14.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        15 -> {
                            numcov15.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        16 -> {
                            numcov16.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        17 -> {
                            numcov17.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        18 -> {
                            numcov18.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        19 -> {
                            numcov19.setBackgroundResource(R.drawable.drawbackblack)
                        }
                        20 -> {
                            numcov20.setBackgroundResource(R.drawable.drawbackblack)
                        }



                    }
                    if( per == sum) {
                        checkbt2.setVisibility(View.INVISIBLE)
                        checkbt.setVisibility(View.VISIBLE)
                        checkbt.setBackgroundResource(R.drawable.drawbackgrape)
                        checkbt3.setBackgroundResource(R.drawable.drawbackgrape)

                    }

                }else {
                    when(i){
                        1 -> {
                            numtag1.setText("1")
                        }
                        2 -> {
                            numtag2.setText("2")
                        }
                        3 -> {
                            numtag3.setText("3")
                        }
                        4 -> {
                            numtag4.setText("4")
                        }
                        5 -> {
                            numtag5.setText("5")
                        }
                        6 -> {
                            numtag6.setText("6")
                        }
                        7 -> {
                            numtag7.setText("7")
                        }
                        8 -> {
                            numtag8.setText("8")
                        }
                        9 -> {
                            numtag9.setText("9")
                        }
                        10 -> {
                            numtag10.setText("10")
                        }
                        11 -> {
                            numtag11.setText("11")
                        }
                        12 -> {
                            numtag12.setText("12")
                        }
                        13 -> {
                            numtag13.setText("13")
                        }
                        14 -> {
                            numtag14.setText("14")
                        }
                        15 -> {
                            numtag15.setText("15")
                        }
                        16 -> {
                            numtag16.setText("16")
                        }
                        17 -> {
                            numtag17.setText("17")
                        }
                        18 -> {
                            numtag18.setText("18")
                        }
                        19 -> {
                            numtag19.setText("19")
                        }
                        20 -> {
                            numtag20.setText("20")
                        }



                    }

                }
            }

        }
        checkbt2.setVisibility(View.VISIBLE)
        checkbt.setVisibility(View.VISIBLE)
//
//        num1.setOnClickListener {
//
//            val builder = AlertDialog.Builder(this)
//
//            builder.setTitle("타이틀 입니다.")
//                .setMessage("메세지 내용 부분 입니다.")
//                .setPositiveButton("확인",
//                    DialogInterface.OnClickListener { dialog, id ->
//
//                        txtper.setText("참가자 확인")
//                        checkbt.setVisibility(View.VISIBLE)
//
//                    })
//                .setNegativeButton("취소",
//                    DialogInterface.OnClickListener { dialog, id ->
//
//                    })
//            // 다이얼로그를 띄워주기
//            builder.show()
//        }// 이미지 클릭


            checkbt.setOnClickListener {


                val intent = Intent(this, select::class.java)
                intent.putExtra("per",per)
                startActivity(intent)
            finish()
            }
//        checkbt2.setOnClickListener {
//
//        }



        }

var camsel = 0

    private fun setViews() {
        //카메라 버튼 클릭
        num1.setOnClickListener {
            //카메라 호출 메소드
            camsel = 1
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num2.setOnClickListener {
            //카메라 호출 메소드
            camsel = 2
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num3.setOnClickListener {
            camsel = 3
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num4.setOnClickListener {
            camsel = 4
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num5.setOnClickListener {
            camsel = 5
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num6.setOnClickListener {
            camsel = 6
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num7.setOnClickListener {
            camsel = 7
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num8.setOnClickListener {
            camsel = 8
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num9.setOnClickListener {
            camsel = 9
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num10.setOnClickListener {
            camsel = 10
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num11.setOnClickListener {
            camsel = 11
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num12.setOnClickListener {
            camsel = 12
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num13.setOnClickListener {
            camsel = 13
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num14.setOnClickListener {
            camsel = 14
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num15.setOnClickListener {
            camsel = 15
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num16.setOnClickListener {
            camsel = 16
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num17.setOnClickListener {
            camsel = 17
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num18.setOnClickListener {
            camsel = 18
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num19.setOnClickListener {
            camsel = 19
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }
        num20.setOnClickListener {
            camsel = 20
            //카메라 호출 메소드
            checkbt.setVisibility(View.VISIBLE)
            openCamera()
        }






    }

    private  fun ssub(i : Int ,i2:Int) {
        var fileWriter = FileOutputStream( "${filesDir}/sub" + i + ".txt", false )
        try{
            fileWriter.write(i2)
            fileWriter.close()
//            Toast.makeText(this, file.absolutePath, Toast.LENGTH_LONG).show()
        }catch (e: Exception){
        }
    }

    private fun openCamera() {
        //카메라 권한이 있는지 확인
        if(checkPermission(CAMERA_PERMISSION,FLAG_PERM_CAMERA)){
            //권한이 있으면 카메라를 실행시킵니다.
            val intent:Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,FLAG_REQ_CAMERA)
        }
    }

    //권한이 있는지 체크하는 메소드
    fun checkPermission(permissions:Array<out String>,flag:Int):Boolean{
        //안드로이드 버전이 마쉬멜로우 이상일때
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            for(permission in permissions){
                //만약 권한이 승인되어 있지 않다면 권한승인 요청을 사용에 화면에 호출합니다.
                if(ContextCompat.checkSelfPermission(this,permission) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this,permissions,flag)
                    return false
                }
            }
        }
        return true
    }



    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when(requestCode){
            FLAG_PERM_STORAGE ->{
                for(grant in grantResults){
                    if(grant != PackageManager.PERMISSION_GRANTED){
                        //권한이 승인되지 않았다면 return 을 사용하여 메소드를 종료시켜 줍니다
                        Toast.makeText(this,"저장소 권한을 승인해야지만 앱을 사용할 수 있습니다..",Toast.LENGTH_SHORT).show()
                        finish()
                        return
                    }
                }
                //카메라 호출 메소드
                setViews()
            }
            FLAG_PERM_CAMERA ->{
                for(grant in grantResults){
                    if(grant != PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(this,"카메라 권한을 승인해야지만 카메라를 사용할 수 있습니다.",Toast.LENGTH_SHORT).show()
                        return
                    }
                }
                openCamera()
            }
        }
    }
    val  bitmap1 = null

    //startActivityForResult 을 사용한 다음 돌아오는 결과값을 해당 메소드로 호출합니다.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                FLAG_REQ_CAMERA ->{
                    if(data?.extras?.get("data") != null){
                        //카메라로 방금 촬영한 이미지를 미리 만들어 놓은 이미지뷰로 전달 합니다.
                        val bitmap = data?.extras?.get("data") as Bitmap
                        var per = intent.getIntExtra("per", 0)
                        when(camsel){
                            1  -> {
//                                num1.setImageBitmap(bitmap)

                                saveBitmapAsJPGFile("p1.jpg",bitmap)
                                numcov1.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(1)

                            }
                            2  -> {
//                                num2.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p2.jpg",bitmap)
                                numcov2.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(2)
                            }
                            3  -> {
//                                num3.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p3.jpg",bitmap)
                                numcov3.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(3)
                            }
                            4  -> {
//                                num4.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p4.jpg",bitmap)
                                numcov4.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(4)
                            }
                            5  -> {
//                                num5.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p5.jpg",bitmap)
                                numcov5.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(5)
                            }
                            6  -> {
//                                num6.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p6.jpg",bitmap)
                                numcov6.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(6)
                            }
                            7  -> {
//                                num7.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p7.jpg",bitmap)
                                numcov7.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(7)
                            }
                            8  -> {
//                                num8.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p8.jpg",bitmap)
                                numcov8.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(8)
                            }
                            9  -> {
//                                num9.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p9.jpg",bitmap)
                                numcov9.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(9)
                            }
                            10  -> {
//                                num10.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p10.jpg",bitmap)
                                numcov10.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(10)
                            }
                            11  -> {
//                                num11.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p11.jpg",bitmap)
                                numcov11.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(11)
                            }
                            12  -> {
//                                num12.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p12.jpg",bitmap)
                                numcov12.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(12)
                            }
                            13  -> {
//                                num13.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p13.jpg",bitmap)
                                numcov13.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(13)
                            }
                            14  -> {
//                                num14.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p14.jpg",bitmap)
                                numcov14.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(14)
                            }
                            15  -> {
//                                num15.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p15.jpg",bitmap)
                                numcov15.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(15)
                            }
                            16  -> {
//                                num16.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p16.jpg",bitmap)
                                numcov16.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(16)
                            }

                            17  -> {
//                                num17.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p17.jpg",bitmap)
                                numcov17.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(17)
                            }
                            18  -> {
//                                num18.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p18.jpg",bitmap)
                                numcov18.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(18)
                            }
                            19  -> {
//                                num19.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p19.jpg",bitmap)
                                numcov19.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(19)
                            }
                            20  -> {
//                                num20.setImageBitmap(bitmap)
                                saveBitmapAsJPGFile("p20.jpg",bitmap)
                                numcov20.setBackgroundResource(R.drawable.drawbackblack)
                                sum++
                                setimg(20)
                            }


                        }

                        if( per == sum) {
                            checkbt2.setVisibility(View.INVISIBLE)
                            checkbt.setVisibility(View.VISIBLE)
                            checkbt.setBackgroundResource(R.drawable.drawbackgrape)
                            checkbt3.setBackgroundResource(R.drawable.drawbackgrape)
                        }




                    }
                }
            }
        }
    }

    fun createImageUri(filename:String, mimeType:String):Uri?{
        var values = ContentValues()
        values.put(MediaStore.Images.Media.DISPLAY_NAME,filename)
        values.put(MediaStore.Images.Media.MIME_TYPE, mimeType)
        return contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
    }
    private fun newJpgFileName() : String {
        val sdf = SimpleDateFormat("yyyyMMdd_HHmmss")
        val filename = sdf.format(System.currentTimeMillis())
        return "${filename}.jpg"
    }
    private fun saveBitmapAsJPGFile(name : String ,bitmap: Bitmap) {
        val path = File(filesDir, "image")
        if(!path.exists()){
            path.mkdirs()
        }
        val file = File(path, name)
        var imageFile: OutputStream? = null
        try{
            file.createNewFile()
            imageFile = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, imageFile)
            imageFile.close()
//            Toast.makeText(this, file.absolutePath, Toast.LENGTH_LONG).show()
        }catch (e: Exception){

        }
    }


    private fun setimg(i2: Int ){
        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)

        try {

                var file = File("${filesDir}/image/p" + "$i2" + ".jpg")
                var filePath = file.getPath()
                var bitmap = BitmapFactory.decodeFile(filePath)
                when (i2) {
                    1 -> {
                        num1.setImageBitmap(bitmap)
                        numtag1.setText("")
                    }
                    2 -> {
                        num2.setImageBitmap(bitmap)
                        numtag2.setText("")
                    }
                    3 -> {
                        num3.setImageBitmap(bitmap)
                        numtag3.setText("")
                    }
                    4 -> {
                        num4.setImageBitmap(bitmap)
                        numtag4.setText("")
                    }
                    5 -> {
                        num5.setImageBitmap(bitmap)
                        numtag5.setText("")
                    }
                    6 -> {
                        num6.setImageBitmap(bitmap)
                        numtag6.setText("")
                    }
                    7 -> {
                        num7.setImageBitmap(bitmap)
                        numtag7.setText("")
                    }
                    8 -> {
                        num8.setImageBitmap(bitmap)
                        numtag8.setText("")
                    }
                    9 -> {
                        num9.setImageBitmap(bitmap)
                        numtag9.setText("")
                    }
                    10 -> {
                        num10.setImageBitmap(bitmap)
                        numtag10.setText("")
                    }
                    11 -> {
                        num11.setImageBitmap(bitmap)
                        numtag11.setText("")
                    }
                    12 -> {
                        num12.setImageBitmap(bitmap)
                        numtag12.setText("")
                    }
                    13 -> {
                        num13.setImageBitmap(bitmap)
                        numtag13.setText("")
                    }
                    14 -> {
                        num14.setImageBitmap(bitmap)
                        numtag14.setText("")
                    }
                    15 -> {
                        num15.setImageBitmap(bitmap)
                        numtag15.setText("")
                    }
                    16 -> {
                        num16.setImageBitmap(bitmap)
                        numtag16.setText("")
                    }
                    17 -> {
                        num17.setImageBitmap(bitmap)
                        numtag17.setText("")
                    }
                    18 -> {
                        num18.setImageBitmap(bitmap)
                        numtag18.setText("")
                    }

                    19 -> {
                        num19.setImageBitmap(bitmap)
                        numtag19.setText("")
                    }
                    20 -> {
                        num20.setImageBitmap(bitmap)
                        numtag20.setText("")
                    }
                }

            }catch (e: Exception){

            }






    }


}




/*
    val builder = AlertDialog.Builder(this)
    builder.setTitle("타이틀 입니다.")
    .setMessage("메세지 내용 부분 입니다.")
    .setPositiveButton("확인",
    DialogInterface.OnClickListener { dialog, id ->
        resultText.text = "확인 클릭"
    })
    .setNegativeButton("취소",
    DialogInterface.OnClickListener { dialog, id ->
        resultText.text = "취소 클릭"
    })
    // 다이얼로그를 띄워주기
    builder.show()
    */



