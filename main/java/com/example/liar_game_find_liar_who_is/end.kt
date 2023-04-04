package com.example.liar_game_find_liar_who_is

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_ads.*
import kotlinx.android.synthetic.main.activity_end.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_maingame.*
import kotlinx.android.synthetic.main.activity_num.*
import kotlinx.android.synthetic.main.activity_vote.*
import kotlinx.android.synthetic.main.activity_vote2.*
import java.io.*
import java.text.SimpleDateFormat
import java.util.*


class end : AppCompatActivity() {

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

    private var mInterstitialAd: InterstitialAd? = null
    private final var TAG = "end"

    var point = 0
    var  freepoint = 0
    var  adpoint = 0
    var  propoint = 0
    var start : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-8634663172590331/4631110035", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(TAG, adError?.message)
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d(TAG, "Ad was loaded.")
                mInterstitialAd = interstitialAd
            }
        })

        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)



        setContentView(R.layout.activity_end)
//        checkbox.setText("플레이어들에게 라이어로 의심받고 있습니다.\n정답을 말해주세요.")
        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "플레이어들에게\n라이어로 의심받고 있습니다.\n" +
                "정답을 말해주세요."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 7, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        checkbox.setText(spannable, TextView.BufferType.SPANNABLE)

        val layer = intent.getIntExtra("layer", 0)
        val numsel = intent.getIntExtra("numsel", 0)
        val per = intent.getIntExtra("per", 0)
        val datas = intent.getStringExtra("datas")
        endbt66.setVisibility(View.INVISIBLE)
        endbt67.setVisibility(View.INVISIBLE)
        endbt68.setVisibility(View.INVISIBLE)
        endbt69.setVisibility(View.INVISIBLE)
       textView23.setVisibility(View.INVISIBLE)
        textView24.setVisibility(View.INVISIBLE)
        imageView27.setVisibility(View.INVISIBLE)
        textView29.setVisibility(View.INVISIBLE)
        imageView31.setVisibility(View.INVISIBLE)
        imageView2.setVisibility(View.INVISIBLE)
        endtxt2.setVisibility(View.INVISIBLE)

        admo.setVisibility(View.INVISIBLE)
        adcov.setVisibility(View.INVISIBLE)
        adyes1.setVisibility(View.INVISIBLE)
        adno1.setVisibility(View.INVISIBLE)
        adyes2.setVisibility(View.INVISIBLE)
        adno2.setVisibility(View.INVISIBLE)

        endtxt4.setVisibility(View.INVISIBLE)
        endcov.setVisibility(View.INVISIBLE)
        maxvote.setBackgroundResource(R.drawable.drawbackff)
        maxvote2.setBackgroundResource(R.drawable.drawback)
        endcheck.setBackgroundResource(R.drawable.drawbackgrape)
        endbt66.setBackgroundResource(R.drawable.drawbackff)
        endbt67.setBackgroundResource(R.drawable.drawbackff)
        endbt68.setBackgroundResource(R.drawable.drawbackgrape)
        endbt69.setBackgroundResource(R.drawable.drawbackgrape)



        try {

            var file = File("${filesDir}/image/p" + "$numsel" + ".jpg")
            var filePath = file.getPath()
            var bitmap = BitmapFactory.decodeFile(filePath)
            if (file.exists() == true) {
                when (numsel) {
                    1 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    2 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    3 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    4 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    5 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    6 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    7 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    8 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    9 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    10 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    11 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    12 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    13 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    14 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    15 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    16 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    17 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    18 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    19 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                    20 -> {
                        maxvote.setImageBitmap(bitmap)
                    }
                }
            }else {
                endnumtag.setText("$numsel")

            }
        }catch (e: Exception){
            null
        }


        endcheck.setOnClickListener {

            endcheck.setVisibility(View.INVISIBLE)

            endbt66.setVisibility(View.INVISIBLE)
            endbt67.setVisibility(View.INVISIBLE)
            endbt68.setVisibility(View.INVISIBLE)
            endbt69.setVisibility(View.INVISIBLE)
            endtxt2.setVisibility(View.VISIBLE)

            endtxt4.setVisibility(View.VISIBLE)
            endcov.setVisibility(View.VISIBLE)
            checkbox.setText("")

            if (layer == numsel) {
                endnumtag.setText("")
                textView23.setVisibility(View.VISIBLE)
                textView24.setVisibility(View.VISIBLE)
                endbt66.setVisibility(View.VISIBLE)
                endbt67.setVisibility(View.VISIBLE)
                endbt68.setVisibility(View.VISIBLE)
                endbt69.setVisibility(View.VISIBLE)
                endtxt4.setText("검거에 성공하였습니다.")
                imageView27.setVisibility(View.VISIBLE)
                try {

                    var file = File("${filesDir}/image/p" + "$layer" + ".jpg")
                    var filePath = file.getPath()
                    var bitmap = BitmapFactory.decodeFile(filePath)
                    if (file.exists() == true) {
                        when (layer) {
                            1 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            2 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            3 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            4 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            5 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            6 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            7 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            8 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            9 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            10 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            11 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            12 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            13 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            14 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            15 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            16 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            17 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            18 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            19 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                            20 -> {
                                maxvote.setImageBitmap(bitmap)
                            }
                        }
                    } else {
                            endnumtag.setText("$layer")
                        maxvote.setImageResource(R.drawable.playerback)
                        }
                }catch (e: Exception){
                    null
                }

            } else {
                endtxt2.setText("")
                endtxt4.setText("")
                checkbox.setText("검거에 실패하였습니다.")
                maxvote.setColorFilter(filter)
                maxvote2.setBackgroundResource(R.drawable.drawbackblack)
                endcov.setVisibility(View.VISIBLE)
                textView29.setVisibility(View.VISIBLE)
                imageView31.setVisibility(View.VISIBLE)
            }


        }

       imageView31.setOnClickListener {
//            checkbox.setVisibility(View.INVISIBLE)
//            endtxt2.setVisibility(View.INVISIBLE)
//            endtxt4.setVisibility(View.INVISIBLE)
           maxvote.setColorFilter(null)
           endnumtag.setText("")
           checkbox.setText("")
           endtxt2.setText("라이어")
           textView29.setVisibility(View.INVISIBLE)
           imageView31.setVisibility(View.INVISIBLE)
           maxvote2.setBackgroundResource(R.drawable.drawback)
            if (layer == numsel) {

            } else {
                imageView2.setVisibility(View.VISIBLE)
                endtxt4.setText("플레이어들을 속이고\n승리하였습니다.")
                try {

                    var file = File("${filesDir}/image/p" + "$layer" + ".jpg")
                    var filePath = file.getPath()
                    var bitmap = BitmapFactory.decodeFile(filePath)
                    if (file.exists() == true) {
                    when (layer) {
                        1  -> { maxvote.setImageBitmap(bitmap) }
                        2  -> { maxvote.setImageBitmap(bitmap) }
                        3  -> { maxvote.setImageBitmap(bitmap) }
                        4  -> { maxvote.setImageBitmap(bitmap) }
                        5  -> { maxvote.setImageBitmap(bitmap) }
                        6  -> { maxvote.setImageBitmap(bitmap) }
                        7  -> { maxvote.setImageBitmap(bitmap) }
                        8  -> { maxvote.setImageBitmap(bitmap) }
                        9  -> { maxvote.setImageBitmap(bitmap) }
                        10  -> { maxvote.setImageBitmap(bitmap) }
                        11  -> { maxvote.setImageBitmap(bitmap) }
                        12  -> { maxvote.setImageBitmap(bitmap) }
                        13  -> { maxvote.setImageBitmap(bitmap) }
                        14  -> { maxvote.setImageBitmap(bitmap) }
                        15  -> { maxvote.setImageBitmap(bitmap) }
                        16  -> { maxvote.setImageBitmap(bitmap) }
                        17  -> { maxvote.setImageBitmap(bitmap) }
                        18  -> { maxvote.setImageBitmap(bitmap) }
                        19  -> { maxvote.setImageBitmap(bitmap) }
                        20  -> { maxvote.setImageBitmap(bitmap) }
                    }
                    } else {
                        endnumtag.setText("$layer")
                        maxvote.setImageResource(R.drawable.playerback)
                    }
                }catch (e: Exception){
                    null
                }

                endbt66.setVisibility(View.VISIBLE)
                endbt67.setVisibility(View.VISIBLE)
                endbt68.setVisibility(View.VISIBLE)
                endbt69.setVisibility(View.VISIBLE)
                textView23.setVisibility(View.VISIBLE)
                textView24.setVisibility(View.VISIBLE)
            }
        }

        endbt67.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }


        endbt66.setOnClickListener {

                val intent = Intent(this, select::class.java)
                intent.putExtra("per", per)
                intent.putExtra("datas", datas)
                startActivity(intent)
                finish()


        }
        adno2.setOnClickListener {
            admo.setVisibility(View.INVISIBLE)
            adcov.setVisibility(View.INVISIBLE)
            adyes1.setVisibility(View.INVISIBLE)
            adno1.setVisibility(View.INVISIBLE)
            adyes2.setVisibility(View.INVISIBLE)
            adno2.setVisibility(View.INVISIBLE)

        }


    }




}
