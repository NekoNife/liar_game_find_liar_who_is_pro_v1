package com.example.liar_game_find_liar_who_is

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_ads.*

import kotlinx.android.synthetic.main.activity_main.*
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
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

    var start: Long = 0
    var pointload = 0
    var propointload = 0
    var point = 0
    var freepoint = 0
    var adpoint = 0
    var propoint = 0

    private var mInterstitialAd: InterstitialAd? = null
    private final var TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actionBar: ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()

        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(
            this,
            "ca-app-pub-8634663172590331/4631110035",
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.d(TAG, adError?.message)
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    Log.d(TAG, "Ad was loaded.")
                    mInterstitialAd = interstitialAd
                }
            })



        admo2.setVisibility(View.INVISIBLE)
        adcov2.setVisibility(View.INVISIBLE)
        adyes3.setVisibility(View.INVISIBLE)
        adyes4.setVisibility(View.INVISIBLE)
        adno3.setVisibility(View.INVISIBLE)
        adno4.setVisibility(View.INVISIBLE)


        start = System.currentTimeMillis()






        MobileAds.initialize(this) {

        }
//        val adRequest = AdRequest.Builder().build()
//        adView.loadAd(adRequest)


        Thread {
//        Handler().postDelayed({
            var set = 0

            while (true) {
                Thread.sleep(700L)
                9
                if (set == 0) {
                    textView.setTextColor(Color.WHITE)
                    set = 1
                } else if (set == 1) {
//                    startbt.setVisibility(View.INVISIBLE)
                    textView.setTextColor(Color.BLACK)
                    set = 0
                }
            }
//        }, 1000)
        }.start()

        val path = File(filesDir, "image")
        if (!path.exists()) {
            path.mkdirs()
        }
        for (i in 1..20) {
            val file = File(path, "p" + i + ".jpg")
            try {
                file.delete()
            } catch (e: Exception) {
                null
            }
        }


        setbt.setOnClickListener {
            val intent = Intent(this, SetActivity::class.java)

            startActivity(intent)
            finish()

        }

        startbt.setOnClickListener {


                val intent = Intent(this, numActivity::class.java)

                intent.putExtra("img", 1)
                startActivity(intent)
                finish()

        }

        adno3.setOnClickListener {

            admo2.setVisibility(View.INVISIBLE)
            adcov2.setVisibility(View.INVISIBLE)
            adyes3.setVisibility(View.INVISIBLE)
            adyes4.setVisibility(View.INVISIBLE)
            adno3.setVisibility(View.INVISIBLE)
            adno4.setVisibility(View.INVISIBLE)
        }
        adyes3.setOnClickListener {


            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
                admo2.setVisibility(View.INVISIBLE)
                adcov2.setVisibility(View.INVISIBLE)
                adyes3.setVisibility(View.INVISIBLE)
                adyes4.setVisibility(View.INVISIBLE)
                adno3.setVisibility(View.INVISIBLE)
                adno4.setVisibility(View.INVISIBLE)

                Handler().postDelayed({

                point = freepoint + adpoint + propoint
//                mainpoint.setText("$point")
                }, 2000)
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.")
            }
            if (0 < point) {
                admo2.setVisibility(View.INVISIBLE)
                adcov2.setVisibility(View.INVISIBLE)
                adyes3.setVisibility(View.INVISIBLE)
                adyes4.setVisibility(View.INVISIBLE)
                adno3.setVisibility(View.INVISIBLE)
                adno4.setVisibility(View.INVISIBLE)
            }
        }


        mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d(TAG, "Ad was dismissed.")
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                Log.d(TAG, "Ad failed to show.")
            }

            override fun onAdShowedFullScreenContent() {
                Log.d(TAG, "Ad showed fullscreen content.")

                mInterstitialAd = null;

            }
        }

    }



}