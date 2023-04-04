package com.example.liar_game_find_liar_who_is

import android.content.Intent
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.google.android.gms.ads.*
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_maingame.*
import kotlinx.android.synthetic.main.activity_seller.*
import kotlinx.android.synthetic.main.activity_vote2.*
import java.io.*

class seller : AppCompatActivity() {
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
    var  point = 0
    var  freepoint = 0
    var  adpoint = 0
    var  propoint = 0
    var daypont = 0
    private var mInterstitialAd: InterstitialAd? = null
    private final var TAG = "seller"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller)
        var actionBar : ActionBar?
        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)
        actionBar = supportActionBar
        actionBar?.hide()
        adpointupbt2.setVisibility(View.INVISIBLE)
        adpointupbt2.setVisibility(View.INVISIBLE)
        probt2.setVisibility(View.INVISIBLE)
        var adRequest = AdRequest.Builder().build()
        var adid = "ca-app-pub-8634663172590331/4631110035"
        var adidnum = 0

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


        freepoint = pointget()
        adpoint = pointget2()
        propoint = pointget3()
        point = freepoint + adpoint + propoint
        sellerpoint.setText("$point")
//        if (pointget4() == 1){
//            thritybt2.setVisibility(View.VISIBLE)
//            adpointupbt2.setVisibility(View.VISIBLE)
//            probt2.setVisibility(View.VISIBLE)
//            thritybt2.setColorFilter(filter)
//            adpointupbt2.setColorFilter(filter)
//            probt2.setColorFilter(filter)
//
//        }

        adpointupbt2.setOnClickListener {

        }
        probt2.setOnClickListener {

        }

        adpointupbt.setOnClickListener {
            if (adpoint + freepoint <  10) {
//                if (mInterstitialAd != null) {
//                    mInterstitialAd?.show(this)
//                    adpointupbt2.setVisibility(View.VISIBLE)
//                    adpointup()
//
//                   } else {
//                    Log.d("TAG", "The interstitial ad wasn't ready yet.")
//                }

                point = freepoint + adpoint + propoint
                sellerpoint.setText("$point")
                val intent = Intent(this, ads::class.java)
                startActivity(intent)
                finish()

            }else{
                Toast.makeText(this, "총알은 10발까지 충전할 수 있습니다.", Toast.LENGTH_LONG).show()
            }
        }

sellerback.setOnClickListener {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
    finish()
}

//        thritybt.setOnClickListener {
//            if (pointget4() == 1){
//                Toast.makeText(this, "영구제를 이미 구매하셨습니다", Toast.LENGTH_LONG).show()
//            }else {
//                Toast.makeText(this, "3000원 구매 적용", Toast.LENGTH_LONG).show()
//                propointup(50)
//                freepoint = pointget()
//                adpoint = pointget2()
//                propoint = pointget3()
//                point = freepoint + adpoint + propoint
//                sellerpoint.setText("무료" + freepoint + "회, " + "광고" + adpoint + "회, " + "유료" + propoint + "회, " + "총 $point 회")
//            }
//        }
//        probt.setOnClickListener {
//            if (pointget4() == 1){
//                Toast.makeText(this, "이미 구매하신 상품입니다.", Toast.LENGTH_LONG).show()
//            }else {
//                Toast.makeText(this, "영구제 구매 적용", Toast.LENGTH_LONG).show()
//                probuy()
//                if (pointget4() == 1){
//                    thritybt2.setVisibility(View.VISIBLE)
//                    adpointupbt2.setVisibility(View.VISIBLE)
//                    probt2.setVisibility(View.VISIBLE)
//                    thritybt2.setColorFilter(filter)
//                    adpointupbt2.setColorFilter(filter)
//                    probt2.setColorFilter(filter)
//
//                }
//                freepoint = pointget()
//                adpoint = pointget2()
//                propoint = pointget3()
//                point = freepoint + adpoint + propoint
//                sellerpoint.setText("무료" + freepoint + "회, " + "광고" + adpoint + "회, " + "유료" + propoint + "회, " + "총 $point 회")
//            }
//        }
        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
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
    private  fun pointget():Int {
        var fileread = FileInputStream("${filesDir}/point/freepoint.txt")
        var  i2 = 0
        try{
            i2 = fileread.read()
            fileread.close()

        }catch (e: Exception){
            null
        }
        return i2
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
    private  fun pointget3():Int {
        var fileread = FileInputStream("${filesDir}/point/propoint.txt")
        var  i2 = 0
//        try{
//            i2 = fileread.read()
//            fileread.close()
//
//        }catch (e: Exception){
//            null
//        }
        val fileRead = FileReader("${filesDir}/point/propoint.txt")
        val bufferReader = BufferedReader(fileRead)
        try {
          i2 =  bufferReader.read()
            bufferReader.close()
        } catch (e: Exception) {
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
//    private  fun propointup(i:Int) {
//
//        propoint += i
//        val fileWriter = FileWriter("${filesDir}/point/propoint.txt")
//        val bufferWriter = BufferedWriter(fileWriter)
//        try {
//
////            fileWriter2.($propoint)
//            bufferWriter.write(propoint)
//            bufferWriter.close()
////            Toast.makeText(this, file.absolutePath, Toast.LENGTH_LONG).show()
//
//        } catch (e: Exception) {
//        }
//
//    }
//    private  fun pointget4():Int {
//        var  i2 = 0
//        val fileRead = FileReader("${filesDir}/point/propoint2.txt")
//        val bufferReader = BufferedReader(fileRead)
//        try {
//            i2 =  bufferReader.read()
//            bufferReader.close()
//        } catch (e: Exception) {
//        }
//
//        return i2
//    }
//    private  fun probuy() {
//        val fileWriter = FileWriter("${filesDir}/point/propoint.txt")
//        val bufferWriter = BufferedWriter(fileWriter)
//        try {
//
//            bufferWriter.write(9999)
//            bufferWriter.close()
//        } catch (e: Exception) {
//        }
//        val fileWriter2 = FileWriter("${filesDir}/point/propoint2.txt")
//        val bufferWriter2 = BufferedWriter(fileWriter2)
//        try {
//
//            bufferWriter2.write(1)
//            bufferWriter2.close()
//        } catch (e: Exception) {
//        }
//
//
//    }
}