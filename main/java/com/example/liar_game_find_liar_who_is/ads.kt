package com.example.liar_game_find_liar_who_is

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_ads.*
import java.io.FileInputStream
import java.io.FileOutputStream

class ads : AppCompatActivity() {
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
    private final var TAG = "ads"
    var  adpoint = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ads)

        adsbt3.setVisibility(View.INVISIBLE)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
      adpoint = pointget2()
        var adRequest = AdRequest.Builder().build()
        var adid = "ca-app-pub-8634663172590331/3377506609"

        InterstitialAd.load(this,"$adid", adRequest, object : InterstitialAdLoadCallback() {
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

        adsbt3.setColorFilter(filter)
        if (mInterstitialAd != null) {
            mInterstitialAd?.show(this)

            adpointup()
            adsbt3.setVisibility(View.VISIBLE)
            Handler().postDelayed({
                adstxt.setText("1회\n충전되었습니다.")
            }, 2000)
        } else {

            Log.d("TAG", "The interstitial ad wasn't ready yet.1")
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)

                adpointup()
                adsbt3.setVisibility(View.VISIBLE)
                adstxt.setText("1회\n충전되었습니다.")
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.2")
                adstxt.setText("광고가 나오지 않을경우 광고보기를 눌러주세요")
            }
        }


        adsbt.setOnClickListener {
            val intent = Intent(this, seller::class.java)
            startActivity(intent)
            finish()
        }

        adsbt2.setOnClickListener {

            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
                adpointup()
                adsbt3.setVisibility(View.VISIBLE)
                Handler().postDelayed({
                    adstxt.setText("1회\n충전되었습니다.")
                }, 2000)

            } else {

                Log.d("TAG", "The interstitial ad wasn't ready yet.1")
            }
        }






        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d(ContentValues.TAG, "Ad was dismissed.")
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                Log.d(ContentValues.TAG, "Ad failed to show.")
            }

            override fun onAdShowedFullScreenContent() {
                Log.d(ContentValues.TAG, "Ad showed fullscreen content.")

                mInterstitialAd = null;

            }
        }

    }
    private  fun pointget2():Int {
        var fileread = FileInputStream("${filesDir}/point/adpoint.txt")
        var  i2 = 0
        try{
            i2 = fileread.read()
            fileread.close()

        }catch (e: Exception){
            null
        }
        return i2
    }
    private  fun adpointup() {

        adpoint ++
        var fileWriter2 = FileOutputStream("${filesDir}/point/adpoint.txt", false)
        try {
            fileWriter2.write(adpoint)
            fileWriter2.close()
//            Toast.makeText(this, file.absolutePath, Toast.LENGTH_LONG).show()

        } catch (e: Exception) {
        }

    }
}