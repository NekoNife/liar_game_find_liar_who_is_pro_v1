package com.example.liar_game_find_liar_who_is

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_num.*
import kotlinx.android.synthetic.main.activity_personnel.*
import kotlinx.android.synthetic.main.activity_select.*
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

class select : AppCompatActivity() {

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
    var sub1 = 0
    var sub2 = 0
    var sub3 = 0
    var sub4 = 0
    var sub5 = 0
    var sub6 = 0
    var sub7 = 0
    var sub8 = 0
    var sub9 = 0
    var sub10 = 0
    var sub11 = 0
    var sub12 = 0

    var point = 0
    var  freepoint = 0
    var  adpoint = 0
    var  propoint = 0

    var start : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        var actionBar : ActionBar?

        actionBar = supportActionBar
        actionBar?.hide()
            var subject: String? = null
        val per = intent.getIntExtra("per", 0)

        var ss = ""
        selbt1.setBackgroundResource(R.drawable.drawbackff)
        selbt2.setBackgroundResource(R.drawable.drawbackff)
        selbt3.setBackgroundResource(R.drawable.drawbackff)
        selbt4.setBackgroundResource(R.drawable.drawbackff)
        selbt5.setBackgroundResource(R.drawable.drawbackff)
        selbt6.setBackgroundResource(R.drawable.drawbackff)
        selbt7.setBackgroundResource(R.drawable.drawbackff)
        selbt8.setBackgroundResource(R.drawable.drawbackff)
        selbt9.setBackgroundResource(R.drawable.drawbackff)
        selbt10.setBackgroundResource(R.drawable.drawbackff)
        selbt11.setBackgroundResource(R.drawable.drawbackff)
        selbt12.setBackgroundResource(R.drawable.drawbackff)
        selbt101.setBackgroundResource(R.drawable.drawbackgrape)
        selbt102.setBackgroundResource(R.drawable.drawbackgrape)
        selbt103.setBackgroundResource(R.drawable.drawbackgrape)
        selbt104.setBackgroundResource(R.drawable.drawbackgrape)
        selbt105.setBackgroundResource(R.drawable.drawbackgrape)
        selbt106.setBackgroundResource(R.drawable.drawbackgrape)
        selbt107.setBackgroundResource(R.drawable.drawbackgrape)
        selbt108.setBackgroundResource(R.drawable.drawbackgrape)
        selbt109.setBackgroundResource(R.drawable.drawbackgrape)
        selbt110.setBackgroundResource(R.drawable.drawbackgrape)
        selbt111.setBackgroundResource(R.drawable.drawbackgrape)
        selbt112.setBackgroundResource(R.drawable.drawbackgrape)
        subjnext.setBackgroundResource(R.drawable.drawbackgrape)
        subjnext2.setBackgroundResource(R.drawable.drawbackgrape)
        selectback.setBackgroundResource(R.drawable.drawbackff)
        selectback2.setBackgroundResource(R.drawable.drawbackgrape)
        subjnext2.setBackgroundResource(R.drawable.drawbackblack)
       sub1 = ssub2(1)
         sub2 = ssub2(2)
        sub3 = ssub2(3)
        sub4 = ssub2(4)
         sub5 =ssub2(5)
         sub6 = ssub2(6)
         sub7 = ssub2(7)
         sub8 = ssub2(8)
         sub9 = ssub2(9)
         sub10 = ssub2(10)
         sub11 = ssub2(11)
         sub12 = ssub2(12)



        val color = getColor(R.color.red) // 변경하려는 색상
        val str1 = "주제를 선정해주세요. 다수의 동시 선택이 가능합니다."
        val spannable = SpannableString("$str1")
        spannable.setSpan(ForegroundColorSpan(color), 0, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView9.setText(spannable, TextView.BufferType.SPANNABLE)

        if (sub1 == 1)   selbt101.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub2 == 1)   selbt102.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub3 == 1)   selbt103.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub4 == 1)   selbt104.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub5 == 1)   selbt105.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub6 == 1)   selbt106.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub7 == 1)   selbt107.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub8 == 1)   selbt108.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub9 == 1)   selbt109.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub10 == 1)   selbt110.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub11 == 1)   selbt111.setBackgroundResource(R.drawable.drawbackgreen)
        if (sub12 == 1)   selbt112.setBackgroundResource(R.drawable.drawbackgreen)

        if (sub1 == 1 || sub2 == 1 || sub3 == 1 || sub4 == 1 || sub5 == 1 || sub6 == 1 || sub7 == 1 || sub8 == 1 || sub9 == 1 || sub10 == 1 || sub11 == 1 || sub12 == 1 ){
            subjnext2.setBackgroundResource(R.drawable.drawbackgrape)
        }else{
            subjnext2.setBackgroundResource(R.drawable.drawbackblack)
        }

//        val datas = intent.getStringExtra("datas")
//
//            datas
//            if (datas == "음식"){
//                sub1 = 1
//            }
//                if (datas == "가수"){
//                    sub2 = 1
//                }
           selectback.setOnClickListener {

               val intent = Intent(this, personnel::class.java)
               intent.putExtra("per",per)
               startActivity(intent)
               finish()
           }

        selbt1.setOnClickListener {
//            var tst = ssub2(1)
//            Toast.makeText(this, "$tst", Toast.LENGTH_SHORT).show()

            if (sub1 == 0){
                selbt101.setBackgroundResource(R.drawable.drawbackgreen)
                ssub(1,1)
                sub1 = 1
            }else{
                sub1 = 0
                selbt101.setBackgroundResource(R.drawable.drawbackgrape)
                ssub(1,0)
            }
            nextset()
//            var  ss  = sub1()
//            val intent = Intent(this, Maingame::class.java)
//            intent.putExtra("per",per)
//            intent.putExtra("subt",subject)
//            intent.putExtra("sub",ss)
//            startActivity(intent)
        }
        selbt2.setOnClickListener {

            if (sub2 == 0){
                selbt102.setBackgroundResource(R.drawable.drawbackgreen)
                sub2 = 1
            }else{
                sub2 = 0
                selbt102.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt3.setOnClickListener {

            if (sub3 == 0){
                selbt103.setBackgroundResource(R.drawable.drawbackgreen)
                sub3 = 1
            }else{
                sub3 = 0
                selbt103.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt4.setOnClickListener {

            if (sub4 == 0){
                selbt104.setBackgroundResource(R.drawable.drawbackgreen)
                sub4 = 1
            }else{
                sub4 = 0
                selbt104.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt5.setOnClickListener {

            if (sub5 == 0){
                selbt105.setBackgroundResource(R.drawable.drawbackgreen)
                sub5 = 1
            }else{
                sub5 = 0
                selbt105.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt6.setOnClickListener {

            if (sub6 == 0){
                selbt106.setBackgroundResource(R.drawable.drawbackgreen)
                sub6 = 1
            }else{
                sub6 = 0
                selbt106.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt7.setOnClickListener {

            if (sub7 == 0){
                selbt107.setBackgroundResource(R.drawable.drawbackgreen)
                sub7 = 1
            }else{
                sub7 = 0
                selbt107.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt8.setOnClickListener {

            if (sub8 == 0){
                selbt108.setBackgroundResource(R.drawable.drawbackgreen)
                sub8 = 1
            }else{
                sub8 = 0
                selbt108.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt9.setOnClickListener {

            if (sub9 == 0){
                selbt109.setBackgroundResource(R.drawable.drawbackgreen)
                sub9 = 1
            }else{
                sub9 = 0
                selbt109.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt10.setOnClickListener {

            if (sub10 == 0){
                selbt110.setBackgroundResource(R.drawable.drawbackgreen)
                sub10 = 1
            }else{
                sub10 = 0
                selbt110.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt11.setOnClickListener {

            if (sub11 == 0){
                selbt111.setBackgroundResource(R.drawable.drawbackgreen)
                sub11 = 1
            }else{
                sub11 = 0
                selbt111.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }
        selbt12.setOnClickListener {


            if (sub12 == 0){
                selbt112.setBackgroundResource(R.drawable.drawbackgreen)
                sub12 = 1
            }else{
                sub12 = 0
                selbt112.setBackgroundResource(R.drawable.drawbackgrape)
            }
            nextset()
        }

        subjnext.setOnClickListener {
            if (sub1 == 0 && sub2 == 0 && sub3 == 0 && sub4 == 0 && sub5 == 0 && sub6 == 0 && sub7 == 0 && sub8 == 0 && sub9 == 0 && sub10 == 0 && sub11 == 0 && sub12 == 0) {

            } else {
                val datas = arrayListOf<String>()
                if (sub1 == 1) {
                    subject = "음식"
                    datas.add("$subject")
                }
                if (sub2 == 1) {
                    subject = "가수"
                    datas.add("$subject")
                }
                if (sub3 == 1) {
                    subject = "위인"
                    datas.add("$subject")
                }
                if (sub4 == 1) {
                    subject = "전자제품"
                    datas.add("$subject")
                }
                if (sub5 == 1) {
                    subject = "동물"
                    datas.add("$subject")
                }
                if (sub6 == 1) {
                    subject = "식물"
                    datas.add("$subject")
                }
                if (sub7 == 1) {
                    subject = "지역"
                    datas.add("$subject")
                }
                if (sub8 == 1) {
                    subject = "직업"
                    datas.add("$subject")
                }
                if (sub9 == 1) {
                    subject = "유명인"
                    datas.add("$subject")
                }
                if (sub10 == 1) {
                    subject = "운동"
                    datas.add("$subject")
                }
                if (sub11 == 1) {
                    subject = "게임"
                    datas.add("$subject")
                }
                if (sub12 == 1) {
                    subject = "캐릭터"
                    datas.add("$subject")
                }
                ss = datas.random()
                when (ss) {
                    "음식" -> {
                        subject = "음식"
                        ss = sub1()
                    }
                    "가수" -> {
                        subject = "가수"
                        ss = sub2()
                    }
                    "위인" -> {
                        subject = "위인"
                        ss = sub3()
                    }
                    "전자제품" -> {
                        subject = "전자제품"
                        ss = sub4()
                    }
                    "동물" -> {
                        subject = "동물"
                        ss = sub5()
                    }
                    "식물" -> {
                        subject = "식물"
                        ss = sub6()
                    }
                    "지역" -> {
                        subject = "지역"
                        ss = sub7()
                    }
                    "직업" -> {
                        subject = "직업"
                        ss = sub8()
                    }
                    "유명인" -> {
                        subject = "유명인"
                        ss = sub9()
                    }
                    "운동" -> {
                        subject = "운동"
                        ss = sub10()
                    }
                    "게임" -> {
                        subject = "게임"

                        ss = sub11()
                    }
                    "캐릭터" -> {
                        subject = "캐릭터"
                        ss = sub12()
                    }

                }
                ssub(1, sub1)
                ssub(2, sub2)
                ssub(3, sub3)
                ssub(4, sub4)
                ssub(5, sub5)
                ssub(6, sub6)
                ssub(7, sub7)
                ssub(8, sub8)
                ssub(9, sub9)
                ssub(10, sub10)
                ssub(11, sub11)
                ssub(12, sub12)

                    val intent = Intent(this, Maingame::class.java)
                    intent.putExtra("per", per)
                    intent.putExtra("subt", subject)
                    intent.putExtra("sub", ss)
                    intent.putExtra("datas", datas)
                    startActivity(intent)
                    finish()


                // 진행 직전


            }


        }

        }
//    private fun sub1(): String {
//        val datas = listOf("라면"
//        )
//        val random = Random().nextInt(datas.size)
//        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
//        return "$randomend"
//    }
    private  fun nextset() {
            if (sub1 == 1 || sub2 == 1 || sub3 == 1 || sub4 == 1 || sub5 == 1 || sub6 == 1 || sub7 == 1 || sub8 == 1 || sub9 == 1 || sub10 == 1 || sub11 == 1 || sub12 == 1 ){
                subjnext2.setBackgroundResource(R.drawable.drawbackgrape)
            }else{
                subjnext2.setBackgroundResource(R.drawable.drawbackblack)
            }

        }
    private  fun ssub2(i: Int):Int {
        var fileread = FileInputStream("${filesDir}/sub"+i+".txt")
        var  i2 = 0
        try{

            i2 = fileread.read()
            fileread.close()

        }catch (e: Exception){
            null
        }
        return i2
    }
    private  fun ssub(i : Int ,i2:Int) {
        var fileWriter = FileOutputStream( "${filesDir}/sub" + i + ".txt", false )
    try{
        fileWriter.write(i2)
        fileWriter.close()
//            Toast.makeText(this, file.absolutePath, Toast.LENGTH_LONG).show()
    }catch (e: Exception){
        null
    }
    }




    private fun sub1(): String {
        val datas = listOf("라면",
            "햄버거",
            "피자",
            "콜라",
            "김밥",
            "케이크",
            "커피",
            "사이다",
            "자장면",
            "짬뽕",
            "볶음밥",
            "돈까스",
            "우동",
            "만두",
            "치즈",
            "초콜릿",
            "김치",
            "치킨",
            "초밥",
            "회",
            "삼겹살",
            "소고기",
            "닭갈비",
            "쌀국수",
            "계란",
            "우유",
            "식빵",
            "냉면",
            "두부",
            "단무지",
            "오이",
            "국밥",
            "어묵",
            "새우",
            "커피",
            "불고기",
            "갈비찜",
            "부대찌개",
            "된장찌개",
            "죽",
            "밥",
            "빈대떡",
            "떡볶이",
            "비빔밥",
            "비빔국수",
            "칼국수",
            "무",
            "도라지",
            "더덕",
            "찜닭",
            "계란찜",
            "호박",
            "너비아니",
            "재육볶음",
            "떡갈비",
            "잡채",
            "육회",
            "보쌈",
            "족발",
            "고추",
            "약과",
            "버섯",
            "북어국",
            "멸치",
            "콩나물",
            "삼계탕",
            "장어",
            "아귀찜",
            "동태전",
            "마파두부",
            "탕수육",
            "깐풍기",
            "누룽지",
            "샌드위치",
            "쭈꾸미",
            "낙지",
            "월남쌈",
            "전복",
            "연근조림",
            "게",
            "김치찌개",
            "오므라이스",
            "계란말이",
            "카레",
            "닭강정",
            "소시지",
            "땅콩",
            "감자",
            "고구마",
            "옥수수",
            "해물파전",
            "닭꼬치",
            "계란국",
            "생선까스",
            "파스타",
            "리조또",
            "스테이크",
            "가지",
            "베이컨",
            "마늘",
            "부추",
            "깻잎",
            "상추",
            "배추",
            "깍두기",
            "호두",
            "아몬드",
            "젤리",
            "오징어",
            "문어",
            "양파",
            "시금치",
            "메추리알",
            "파프리카",
            "아이스크림",
            "딸기",
            "포도",
            "사과",
            "블루베리",
            "복숭아",
            "망고",
            "버터",
            "생크림",
            "굴",
            "꿀",
            "브라우니",
            "쿠키",
            "미트볼",
            "자장밥",
            "난",
            "콩국수",
            "비빔냉면",
            "회덮밥",
            "새우젖",
            "버섯스프",
            "오리고기",
            "차돌박이",
            "떡",
            "골뱅이소면",
            "토마토",
            "아이스티",
            "당근",
            "미역",
            "샐러드",
            "맛살",
            "조개",
            "레몬",
            "우삼겹",
            "메밀국수",
            "덮밥",
            "튀김",
            "칵테일",
            "타코야키",
            "붕어빵",
            "샤부샤부",
            "낫토",
            "에그타르트",
            "머핀",
            "파이",
            "바나나",
            "마카롱",
            "머랭쿠키",
            "소보루빵",
            "마늘빵",
            "크림빵",
            "도넛",
            "호떡",
            "와플",
            "간장게장",
            "양념게장",
            "닭가슴살",
            "핫도그",
            "호빵",
            "시리얼",
            "추어탕",
            "어묵탕",
            "순두부찌개",
            "순대",
            "떡국",
            "밤",
            "팥빙수",
            "팝콘",
            "닭발",
            "매운탕",
            "닭똥집",
            "소고기무국",
            "콘치즈",
            "수육",
            "삼각김밥",
            "닭죽",
            "고로케",
            "푸딩",
            "파인애플",
            "맥앤치즈",
            "에그인헬",
            "두부김치",
            "볶음우동",
            "소바",
            "칠리새우",
            "크림새우"
            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    } // 주제 음식 단어 선정
    private fun sub2(): String {
        val datas = listOf("아이유",
            "태연",
            "폴킴",
            "이무진",
            "마크툽",
            "규현",
            "허각",
            "다비치",
            "10cm",
            "백지영",
            "전상근",
            "멜로망스",
            "황치열",
            "정승환",
            "신용제",
            "노을",
            "송하예",
            "먼데이키즈",
            "임한별",
            "양다일",
            "장덕철",
            "한동근",
            "성시경",
            "청하",
            "김세정",
            "V.O.S",
            "산들",
            "카더가든",
            "시아준수",
            "스탠딩에그",
            "윤종신",
            "샘김",
            "윤하",
            "잔나비",
            "크러쉬",
            "나얼",
            "박재범",
            "백예린",
            "브라운아이드소울",
            "윤미래",
            "이하이",
            "태양",
            "헤이즈",
            "휘성",
            "비오",
            "바비",
            "도끼",
            "지드래곤",
            "그레이",
            "산이",
            "RM",
            "개코",
            "넉살",
            "기리보이",
            "로꼬",
            "버벌전트",
            "빈지노",
            "쌈디",
            "송민호",
            "슈가",
            "스윙스",
            "아웃사이더",
            "염따",
            "우원재",
            "은지원",
            "조광일",
            "지코",
            "창모",
            "카이",
            "하하",
            "CL",
            "문별",
            "전소연",
            "제니",
            "제시",
            "키썸",
            "AKMU(악동뮤지션)",
            "강승윤",
            "김동률",
            "박효신",
            "보아",
            "볼빨간사춘기",
            "선미",
            "소유",
            "이민혁",
            "이소라",
            "이수",
            "이적",
            "임재범",
            "조용필",
            "정은지",
            "전소미",
            "적재",
            "장범준",
            "2NE1",
            "4minute",
            "AOA",
            "Apink",
            "aespa",
            "블랙핑크",
            "EXID",
            "레드벨벳",
            "아이즈원",
            "ITZY",
            "f(x)",
            "트와이스",
            "래원",
            "걸스데이",
            "나인뮤지스",
            "마마무",
            "2AM",
            "2PM",
            "아스트로",
            "ATEEZ",
            "B1A4",
            "DAY6",
            "Double S 301",
            "EXO",
            "FT아일랜드",
            "오마이걸",
            "GOT7",
            "H.O.T.",
            "NCT",
            "SG워너비",
            "매드크라운",
            "레이나",
            "로코베리",
            "경서",
            "진건호",
            "바비킴",
            "강균성",
            "개리",
            "국카스텐",
            "김건모",
            "김범수",
            "김종국",
            "김종문",
            "김태우",
            "나윤권",
            "넬",
            "노라조",
            "데프콘",
            "더원",
            "드렁큰 타이거",
            "로이킴",
            "문희준",
            "민경훈",
            "바이브",
            "박상민",
            "박완규",
            "방탄소년단",
            "버즈",
            "박진영",
            "박현빈",
            "버스커버스커",
            "빅뱅",
            "비",
            "서인국",
            "설운도",
            "싸이",
            "어쿠루브",
            "어반자카파",
            "양준일",
            "에릭남",
            "에픽하이",
            "울랄라세션",
            "윤건",
            "이루",
            "이석훈",
            "이승기",
            "임영웅",
            "장기하",
            "장문복",
            "정기고",
            "정동하",
            "정준영",
            "조정치",
            "존박",
            "포스트맨",
            "하동균",
            "하현우",
            "혁오",
            "자이언티",
            "KCM",
            "케이윌",
            "거미",
            "김나영",
            "스테파니",
            "수지",
            "왁스",
            "유주",
            "이선희",
            "효린",
            "NC.A",
            "채연",
            "정인",
            "장나라",
            "에일리",
            "솔지",
            "소찬휘"

            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    } // 가수
    private fun sub3(): String {
        val datas = listOf("단군",


            "박혁거세",
            "광개토대왕",

            "주몽",
            "의자왕",


            "김유신",
            "문무왕",

            "장보고",
            "대조영",
            "강감찬",
            "원효대사",
            "서희",







            "노벨",
            "넬슨만델라",
            "김부식",


            "정몽주",
            "문익점",
            "선덕여왕",


            "정도전",
            "신윤복",
            "황희",
            "장영실",
            "홍범도",
            "반기문",
            "이이",
            "이황",
            "신사임당",
            "김대중",
            "이성계",

            "이순신",
            "태조",
            "정종",
            "태종",
            "세종",
            "문종",
            "단종",
            "세조",
            "연개소문",




            "엘리자베스 1세",


            "닐 암스트롱",
            "반 고흐",

            "곽재우",
            "논개",

            "홍길동",
            "임꺽정",
            "한석봉",
            "황진이",
            "쑨원",
            "콘스탄티누스 대제",
            "루이 14세",
            "박문수",
            "김홍도",
            "김삿갓",
            "김정호",
            "영조",
            "정조",
            "정약용",
            "전봉준",
            "헨델",
            "홍경래",
            "김옥균",
            "안중근",

            "윤동주",

            "손병희",
            "유관순",
            "안창호",
            "방정환",
            "아르키메데스",
            "피타고라스",
            "김두한",
            "이상",
            "이중섭",
            "김좌진",
            "솔로몬",
            "클레오파트라",
            "쇼팽",
            "김수로",

            "왕건",
            "근초고광",
            "진흥왕",
            "현종",
            "을지문덕",

            "이방원",


            "오일러",
            "슈뢰딩거",
            "김춘추",
            "김구",
            "이봉창",
            "윤봉길",
            "유일한",

            "박제상",

            "조조",

            "허준",

            "주시경",
            "노자",
            "정자",
            "아이작 뉴턴",
            "찰스 다윈",
            "세익스피어",
            "콜럼버스",
            "마르크스",
            "아인슈타인",
            "갈릴레오 갈릴레이",
            "레오나르도 다빈치",
            "에디슨",

            "간디",
            "미켈란젤로",
            "아담 스미스",
            "조지 워싱턴",
            "링컨",
            "제임스 와트",
            "모차르트",
            "나폴레옹",
            "헨리 포드",
            "베토벤",
            "데카르트",
            "라이트형제",
            "빌 게이츠",
            "루이 암스트롱",

            "나이팅게일",


            "밴자민 프랭클린",
            "피카소",
            "월트 디즈니",
            "잔다르크",
            "마리 퀴리",
            "파스퇴르",

            "아서 펜드래곤",
            "다윗",
            "알렉산더 대왕",
            "오펜하이머",
            "가이우스 율리우스 카이사르",
            "알베르트 슈바이처",
            "헬렌 켈러",
            "닐스 보어",
            "윈스턴 처칠",
            "예수",
            "석가모니",

            "공자",

            "테레사",

            "멘델",

            "맹자",
            "모세",


            "마틴 루터킹",
            "소크라테스",
            "제임스 왓슨",
            "바흐",

            "징기스칸",
            "아리스토텔레스",

            "맥아더",
            "살바도르 달리",
            "니체"

            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//위인
    private fun sub4(): String {
        val datas = listOf("가습기",
            "건조기",
            "공기청정기",
            "구강세정기",
            "냉장고",
            "다리미",
            "로봇 청소기",
            "리모컨",
            "백열등",
            "보풀 제거기",
            "블랜더",
            "정수기",
            "선풍기",
            "세탁기",
            "식기건조기",
            "아이스박스",
            "식기세척기",
            "에어컨",
            "온장고",
            "온풍기",
            "이발기",
            "전기난로",
            "가스레인지",
            "전기레인지",
            "전기장판",
            "전자레인지",
            "제빵기",
            "진공청소기",
            "튀김기",
            "헤어 드라이어",
            "고데기",
            "형광등",
            "환풍기",
            "의류관리기",
            "안마기",
            "면도기",
            "비대",
            "티비",
            "프로젝터",
            "셋톱박스",
            "게임기",
            "스피커",
            "밥솥",
            "오븐",
            "에어프라이어",
            "전기포트",
            "믹서기",
            "커피머신",
            "컴퓨터",
            "스마트폰",
            "태블릿",
            "스마트워치",
            "CD플레이어",
            "MP3",
            "라디오",
            "헤드셋",
            "이어폰",
            "마이크",
            "사이렌",
            "카메라",
            "전구",
            "비상등",
            "살균기",
            "전기포트",
            "토스터",
            "전기찜솥",
            "전기그릴",
            "에스프레소 머신",
            "제면기",
            "거품기",
            "수비드 머신",
            "탈수기",
            "보일러",
            "난로",
            "재봉툴",
            "제모기",
            "스팀청소기",
            "젖병소독기",
            "승마 머신",
            "러닝 머신",
            "만보기",
            "전기파리채",
            "계산기",
            "코팅기",
            "제본기",
            "복사기",
            "프린터",
            "스캐너",
            "전동 스테이플러",
            "전동 연필깎이",
            "전동 가위",
            "소음기",
            "인공심폐기",
            "인큐베이터",
            "생명유지장치",
            "제세동기",
            "체중계",
            "전자체온계",
            "혈압계",
            "혈압측정기",
            "내시경",
            "MRI",
            "CT",
            "전동휠체어",
            "보청기",
            "전동드릴",
            "전기톱",
            "3D프린터",
            "글루건",
            "예초기",
            "레이더",
            "거짓말탐지기",
            "도어락",
            "CCTV",
            "전자발찌",
            "스프링클러",
            "화재 경보기",
            "금속탐지기",
            "자판기",
            "주크박스",
            "동전교환기",
            "공중전하",
            "엘리베이터",
            "에스컬레이터",
            "무빙워크",
            "전동 스쿠터",
            "초인종",
            "드론",
            "ATM",
            "당구공 세척기",
            "노트북",
            "휴대폰",
            "모니터",
            "텔레비전",
            "코털정리기",
            "전동 칫솔",
            "칫솔살균기",
            "전기주전자",
            "커피메이커",
            "와플기",
            "반죽기",
            "빙수기",
            "제빙기",
            "생수기",
            "멀티탭",
            "충전기",
            "보조배터리",
            "시계",
            "타이머",
            "스톱워치",
            "손전등",
            "스탠드",
            "전기담요",
            "냉풍기",
            "에어서큘레이터",
            "제습기",
            "전화기",
            "팩스",
            "무전기",
            "세트톱 박스",
            "DVD플레이어",
            "녹음기",
            "헤드폰",
            "전자악기",
            "캠코더",
            "액션캠",
            "키보드",
            "마우스",
            "전자수첩",
            "세단기",
            "용접기",
            "안마의자",
            "족욕기",
            "웹캠",
            "컨트롤러",
            "포켓와이파이",
            "음주측정기",
            "영사기",
            "와인셀러",
            "팝콘제조기",
            "음식물쓰레기분쇄기",
            "라디에이터",
            "LED마스크",
            "자동분사형 방향제",
            "전자식 모기향",
            "3D팬",
            "열선감지기",
            "그라인더",
            "전동드라이버",
            "부화기",
            "전자저울",
            "전자 풍속계",
            "전자 풍향계",
            "당도측정기",
            "원심분리기",
            "전기자동차",
            "전동스쿠터",
            "전자 습도계",
            "미세먼지측정기",
            "전자사전"


            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//전자제품
    private fun sub5(): String {
        val datas = listOf("고양이",
            "강아지",
            "거북이",
            "토끼",
            "뱀",
            "사자",
            "호랑이",
            "표범",
            "치타",
            "하이에나",
            "기린",
            "코끼리",
            "코뿔소",
            "하마",
            "악어",
            "펭귄",
            "부엉이",
            "올빼미",
            "곰",
            "돼지",
            "소",
            "닭",
            "독수리",
            "타조",
            "고릴라",
            "오랑우탄",
            "침팬지",
            "원숭이",
            "코알라",
            "캥거루",
            "고래",
            "상어",
            "칠면조",
            "직박구리",
            "쥐",
            "청설모",
            "메추라기",
            "앵무새",
            "삵",
            "열대어",
            "판다",
            "오소리",
            "오리",
            "거위",
            "백조",
            "두루미",
            "고슴도치",
            "두더지",
            "우파루파",
            "맹꽁이",
            "너구리",
            "개구리",
            "두꺼비",
            "카멜레온",
            "이구아나",
            "노루",
            "제비",
            "까치",
            "고라니",
            "수달",
            "당나귀",
            "순록",
            "염소",
            "공작",
            "바다표범",
            "들소",
            "박쥐",
            "참새",
            "물개",
            "바다사자",
            "살모사",
            "구렁이",
            "얼룩말",
            "산양",
            "멧돼지",
            "바다코끼리",
            "도롱뇽",
            "북극곰",
            "퓨마",
            "미어캣",
            "코요테",
            "라마",
            "딱따구리",
            "기러기",
            "비둘기",
            "스컹크",
            "아르마딜로",
            "돌고래",
            "까마귀",
            "매",
            "낙타",
            "여우",
            "사슴",
            "늑대",
            "재규어",
            "알파카",
            "양",
            "다람쥐",
            "가젤",
            "기니피그",
            "개미핥기",
            "노새",
            "뉴트리아",
            "나무늘보",
            "조기",
            "래서판다",
            "말",
            "공룡",
            "족제비",
            "친칠라",
            "자라",
            "달팽이",
            "가재",
            "랍스타",
            "꾀꼬리",
            "복어",
            "문어",
            "오징어",
            "쭈꾸미",
            "해파리",
            "갈매기",
            "말똥구리",
            "하늘소",
            "매미",
            "벌",
            "풍뎅이",
            "사마귀",
            "전갱이",
            "가오리",
            "다금바리",
            "방어",
            "민어",
            "옥돔",
            "쥐치",
            "참치",
            "볼락",
            "병어",
            "참돔",
            "갈치",
            "고등어",
            "가다랑어",
            "감성돔",
            "돌돔",
            "광어",
            "농어",
            "우럭",
            "가자미",
            "삼치",
            "쏠뱅이",
            "연어",
            "송사리",
            "한치",
            "꽁치",
            "장어",
            "개복치",
            "금붕어",
            "인면어",
            "황새치",
            "벌새",
            "뻐꾸기",
            "홍학",
            "도마뱀",
            "라쿤",
            "햄스터",
            "병아리",
            "망아지",
            "송아지",
            "꿩",
            "청개구리",
            "미꾸라미",
            "청둥오리",
            "피라냐",
            "메기",
            "뱀장어",
            "곰치",
            "흰동가리",
            "나비고기",
            "해마",
            "새우",
            "소라게",
            "장수풍뎅이",
            "사슴벌레",
            "사슴풍뎅이",
            "물방개",
            "황소개구리",
            "바퀴벌레",
            "나비",
            "나방",
            "소금쟁이",
            "물장군",
            "잠자리",
            "메뚜기",
            "불가사리",
            "지렁이",
            "전갈",
            "버팔로",
            "올챙이",
            "무당벌레",
            "반달가슴곰",
            "물총새"

            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//동물
    private fun sub6(): String {
        val datas = listOf("가문비나무",
            "가시나무",
            "가지",
            "갈대",
            "감나무",
            "감자",
            "은행나무",
            "잣나무",
            "강낭콩",
            "강아지풀",
            "개나리",
            "강황",
            "거봉",
            "겨자",
            "고구마",
            "고사리",
            "고수",
            "고추",
            "고추냉이",
            "구아바",
            "국화",
            "귀리",
            "귤나무",
            "금귤",
            "깻잎",
            "꽈리",
            "끈끈이주걱",
            "나팔꽃",
            "난초",
            "호두나무",
            "느티나무",
            "봉숭아",
            "단풍나무",
            "달래",
            "달맞이꽃",
            "당근",
            "대나무",
            "대두",
            "대추나무",
            "더덕",
            "데이지",
            "도라지",
            "동백꽃",
            "두리안",
            "들국화",
            "들깨",
            "등나무",
            "딸기",
            "땅콩",
            "떡갈나무",
            "돼지감자",
            "라벤더",
            "라일락",
            "라임나무",
            "라즈베리",
            "레몬나무",
            "로즈마리",
            "리치",
            "마늘",
            "계피나무",
            "망고나무",
            "매생이",
            "매실나무",
            "메밀",
            "메타세콰이아",
            "멜론",
            "모란",
            "목련",
            "목화",
            "무",
            "무궁화",
            "무화과나무",
            "물망초",
            "부레옥잠",
            "물이끼",
            "미나리",
            "미역",
            "민들레",
            "민트",
            "바나나",
            "바닐라",
            "인삼",
            "바오밥",
            "박하",
            "밤나무",
            "배나무",
            "배추",
            "백합",
            "버드나무",
            "벚꽃",
            "복숭아나무",
            "가시오가피",
            "복분자나무",
            "살구나무",
            "봉선화",
            "브로콜리",
            "블루베리",
            "비트",
            "사과나무",
            "사탕무",
            "사탕수수",
            "사프란",
            "산딸기나무",
            "산수유",
            "석류나무",
            "선인장",
            "샐러리",
            "소나무",
            "수련",
            "수박",
            "수선화",
            "순무",
            "시금치",
            "시나몬",
            "쑥",
            "쑥갓",
            "아몬드",
            "아보카도",
            "개구리밥",
            "알로에",
            "앵두나무",
            "양배추",
            "양파",
            "양귀비꽃",
            "오미자",
            "오랜지",
            "오동나무",
            "오이",
            "옥수수",
            "올리브",
            "완두콩",
            "잔디",
            "장미",
            "제비꽃",
            "참외",
            "채송화",
            "청포도",
            "체리나무",
            "칡",
            "카네이션",
            "카모마일",
            "카카오",
            "커피",
            "케일",
            "코코넛",
            "콩",
            "클로버",
            "키위",
            "토마토",
            "파",
            "파래",
            "파리지옥",
            "파슬리",
            "파인애플",
            "파프리카",
            "팥",
            "포도",
            "산삼",
            "네잎클로버",
            "헛개나무",
            "호박",
            "수국",
            "백련",
            "도라지꽃",
            "코스모스",
            "국화",
            "철쭉",
            "백합",
            "꽃잔디",
            "고양이풀",
            "녹두",
            "커피나무",
            "당귀",
            "방울꽃",
            "댕댕이덜굴",
            "아스파라거스",
            "병아리콩",
            "들쭉나무",
            "벵갈고무나무",
            "백년초",
            "자작나무",
            "미모사",
            "참나무",
            "매화나무",
            "벚나무",
            "도토리",
            "참마",
            "튤립",
            "뽕나무",
            "상사화",
            "솔잎란",
            "바질",
            "월계수",
            "부추",
            "밀",
            "보리",
            "벼",
            "안개꽃",
            "해바라기",
            "할미꽃"
            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//식물
    private fun sub7(): String {
        val datas = listOf("경기",
            "서울",
            "인천",
            "대전",
            "세종",
            "충남",
            "충북",
            "영서",
            "영동",
            "광주",
            "전북",
            "전남",
            "부산",
            "대구",
            "울산",
            "경북",
            "경남",
            "제주",
            "북아프리카",
            "동아프리카",
            "중앙아프리카",
            "서아프리카",
            "남아프리카",
            "북유렵",
            "동유럽",
            "중부유럽",
            "서유럽",
            "남유럽",
            "북아시아",
            "동아시아",
            "동남아시아",
            "남아시아",
            "중앙아시아",
            "서아시아",
            "오세아니아",
            "북아메라카",
            "중앙아메리카",
            "남아메리카",
            "종로구",
            "중구",
            "용산구",
            "광진구",
            "동대문구",
            "강북구",
            "은평구",
            "서대문구",
            "마포구",
            "강서구",
            "구로구",
            "동작구",
            "영등포구",
            "관악구",
            "서초구",
            "강남구",
            "송파구",
            "강동구",
            "부산진구",
            "해운대구",
            "수성구",
            "달서구",
            "달성군",
            "연수구",
            "광산구",
            "수원시",
            "성남시",
            "의정부시",
            "안양시",
            "부천시",
            "광명시",
            "동두천시",
            "평택시",
            "안산시",
            "고양시",
            "과천시",
            "구리시",
            "남양주시",
            "오산시",
            "시흥시",
            "군포시",
            "의왕시",
            "하남시",
            "용인시",
            "파주시",
            "이천시",
            "안성시",
            "김포시",
            "화성시",
            "광주시",
            "양주시",
            "포천시",
            "여주시",
            "가평군",
            "양평군",
            "연천군",
            "춘천시",
            "원주시",
            "강릉시",
            "동해시",
            "태백시",
            "속초시",
            "삼척시",
            "홍천군",
            "횡성군",
            "영월군",
            "평창군",
            "철원군",
            "화천군",
            "정선군",
            "양구군",
            "인제군",
            "고성군",
            "양양군",
            "청주시",
            "충주시",
            "제천시",
            "단양군",
            "음성군",
            "괴산군",
            "진천군",
            "증평군",
            "영동군",
            "옥천군",
            "천안시",
            "공주시",
            "보령시",
            "아산시",
            "서산시",
            "논산시",
            "계룡시",
            "당진시",
            "금산군",
            "부여군",
            "서천군",
            "청양군",
            "홍성군",
            "예산군",
            "태안군",
            "전주시",
            "덕진구",
            "군산시",
            "익산시",
            "정읍시",
            "남원시",
            "김제시",
            "순창군",
            "고창군",
            "목포시",
            "여수시",
            "순천시",
            "나주시",
            "광양시",
            "해남군",
            "완도군",
            "포항시",
            "경주시",
            "김천시",
            "안동시",
            "구미시",
            "영주시",
            "영천시",
            "상주시",
            "문경시",
            "경산시",
            "군위군",
            "의성군",
            "청송군",
            "영양군",
            "영덕군",
            "청도군",
            "고령군",
            "성주군",
            "칠곡군",
            "예천군",
            "봉화군",
            "울진군",
            "울릉군",
            "창원시",
            "진주시",
            "통영시",
            "사천시",
            "김해시",
            "밀양시",
            "거제시",
            "양산시",
            "의령군",
            "함안군",
            "창녕군",
            "제주시",
            "서귀포시",
            "함경북도",
            "함경남도",
            "평안북도",
            "평안남도",
            "황해도",
            "워싱턴",
            "캘리포니아",
            "텍사스",
            "컨터키",
            "하와이",
            "마카오"
            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//지역
    private fun sub8(): String {
        val datas = listOf("수영강사",
            "헬스트레이너",
            "초등교사",
            "가정교사",
            "교수",
            "박사",
            "석사",
            "학사",
            "번역가",
            "사서",
            "연구원",
            "장학사",
            "조교",
            "고고학자",
            "심리학자",
            "과학자",
            "수학자",
            "철학자",
            "공학자",
            "교감",
            "교장",
            "원장",
            "탐험가",
            "경호원",
            "대리운전",
            "관광가이드",
            "세신사",
            "배달부",
            "사회복지사",
            "상담사",
            "웨이터",
            "안내원",
            "웨딩플래너",
            "스님",
            "안전관리자",
            "호스트",
            "환경미화원",
            "은행원",
            "아르바이트",
            "시인",
            "소설가",
            "극작가",
            "각본가",
            "방송작가",
            "만화가",
            "동화작가",
            "어시스턴트",
            "스토리작가",
            "영화감독",
            "가수",
            "성악가",
            "기타리스트",
            "드러머",
            "바이올리니스트",
            "보컬리스트",
            "피아니스트",
            "작곡가",
            "작사가",
            "지휘자",
            "싱어송라이터",
            "DJ",
            "발레리나",
            "비보이",
            "백댄서(댄서)",
            "화가",
            "만화가",
            "일러스트레이터",
            "조각가",
            "통역사",
            "목수",
            "공예가",
            "산업디자이너",
            "그래픽디자이너",
            "사진가",
            "애니메이션 작가",
            "애니메이션 감독",
            "작화가",
            "게임 기획자",
            "검사",
            "평론가",
            "군인",
            "갤러리스트",
            "아트 디렉터",
            "아트 딜러",
            "복원 전문가",
            "곡예사",
            "내레이터",
            "모델",
            "아이돌",
            "락커",
            "개그맨",
            "연극배우",
            "뮤지컬배우",
            "재연배우",
            "보조출연자",
            "영화배우",
            "스턴트맨",
            "엑스트라",
            "마술사",
            "성우",
            "프로듀서",
            "MC",
            "아나운서",
            "서커스",
            "유튜버",
            "BJ",
            "스트리머",
            "PD",
            "블로거",
            "레이서",
            "프로게이머",
            "프로레슬러",
            "목사",
            "치어리더",
            "해설자",
            "산악인",
            "코치",
            "스포츠 선수",
            "스포츠 감독",
            "구단주",
            "사격선수",
            "리포터",
            "특파원",
            "앵커",
            "캐스터",
            "편집자",
            "뱃사공",
            "버스 기사",
            "인력거꾼",
            "택시 기사",
            "화물차 기사",
            "철도기관사",
            "항공기관사",
            "항해사",
            "선박기관사",
            "비행기 기장",
            "승무원",
            "파일럿",
            "항공 유도원",
            "항공정비사",
            "해상교통관제사",
            "항공교통관제사",
            "의사",
            "간호사",
            "치과의사",
            "한의사",
            "물리치료사",
            "작업치료사",
            "임상병리사",
            "치과위생사",
            "약사",
            "영양사",
            "응급구조사",
            "보건의료정보관리사",
            "임상심리사",
            "한약사",
            "간호조무사",
            "수의사",
            "장의사",
            "언어재활사",
            "개발자",
            "건축가",
            "목수",
            "배관공",
            "광부",
            "대장장이",
            "프로그래머",
            "나무꾼",
            "농부",
            "도축업자",
            "사냥꾼",
            "어부",
            "해녀",
            "원예사",
            "미식가",
            "바리스타",
            "바텐더",
            "소믈리에",
            "요리사",
            "제빵사",
            "파티시에",
            "푸드스타일리스트",
            "푸드파이터",
            "요리연구가",
            "가사도우미",
            "매니저",
            "비서",
            "사육사",
            "패션 디자이너",
            "미용사",
            "코디네이터",
            "펀드매니저",
            "공무원",
            "외교관",
            "대통령",
            "국회의원",
            "경찰",
            "교도관",
            "판사",
            "소방관"

            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//직업
    private fun sub9(): String {
        val datas = listOf("마이클 조던",
            "레오나르도 디카프리오",
            "스티븐 스필버그",
            "현빈",
            "한소희",
            "톰 크루즈",
            "비틀즈",
            "하정우",
            "마돈나",
            "머라이어 캐리",
            "페이커",
            "카이",
            "차은우",
            "도날드 트럼프",
            "조보아",
            "박효신",
            "싸이",
            "소녀시대",
            "빅뱅",
            "박태환",
            "아이유",
            "김연아",
            "손연재",
            "양학선",
            "유준상",
            "류승룡",
            "주원",
            "씨스타",
            "신보라",
            "김준현",
            "김수현",
            "송중기",
            "강동원",
            "강하늘",
            "강훈",
            "고수",
            "고우림",
            "공명",
            "공유",
            "구교환",
            "곽도원",
            "구자성",
            "권오중",
            "권혁수",
            "김기방",
            "김남길",
            "김범",
            "김우빈",
            "남궁민",
            "남주혁",
            "노민우",
            "도경수",
            "류쥰열",
            "마동석",
            "박보검",
            "박서준",
            "박성웅",
            "백현",
            "변요한",
            "봉태규",
            "서강준",
            "서인국",
            "설경구",
            "성동일",
            "소지섭",
            "송강",
            "송강호",
            "안내상",
            "안보현",
            "엄태구",
            "오달수",
            "유노윤호",
            "유아인",
            "육성재",
            "윤두쥰",
            "이광수",
            "이동욱",
            "이동휘",
            "이민기",
            "이민호",
            "이병헌",
            "이승기",
            "이시언",
            "이준기",
            "정우성",
            "주지훈",
            "차승원",
            "차인표",
            "최강창민",
            "최민식",
            "최민호",
            "고아라",
            "고준희",
            "구혜선",
            "김고은",
            "김태리",
            "김태희",
            "김향기",
            "나문희",
            "문근영",
            "민효린",
            "박보영",
            "배두나",
            "송지효",
            "유재석",
            "유인나",
            "이시영",
            "이하늬",
            "장나라",
            "전소민",
            "전여빈",
            "전지현",
            "한가인",
            "황정음",
            "임시완",
            "가인",
            "나르샤",
            "선미",
            "혜림",
            "예은",
            "유빈",
            "박규리",
            "한승연",
            "구하라",
            "허영지",
            "니콜",
            "태연",
            "써니",
            "티파니",
            "효연",
            "유리",
            "수영",
            "윤아",
            "서현",
            "박봄",
            "산다라박",
            "효민",
            "지연",
            "손나은",
            "정은지",
            "수지",
            "하니",
            "설현",
            "RM",
            "진",
            "슈가",
            "제이홉",
            "지민",
            "뷔",
            "정국",
            "야노 시호",
            "추성훈",
            "김동현",
            "메시",
            "호날두",
            "안젤리나 졸리",
            "조니 뎁",
            "오바마",
            "추신수",
            "손흥민",
            "박지성",
            "스태판 커리",
            "이찬혁",
            "이수현",
            "레이디 가가",
            "로버트 다우니 주니어",
            "키아누 리부스",
            "비욘세",
            "드웨인 존슨",
            "네이마르",
            "하워드 스턴",
            "데이비드 베컴",
            "강호동",
            "이수근",
            "규현",
            "송민호",
            "지드레곤",
            "김구라",
            "김국진",
            "김나영",
            "김대희",
            "김병만",
            "김새롬",
            "김성주",
            "김숙",
            "김신영",
            "김영철",
            "김희철",
            "김용만",
            "김제동",
            "김종민",
            "안영미",
            "유병제",
            "유희열",
            "장도연",
            "정형돈",
            "정준하",
            "전현무",
            "지석진",
            "지상렬"


            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//유명인
    private fun sub10(): String {
        val datas = listOf("걷기",
            "달리기",
            "사이클",
            "테니스",
            "배구",
            "골프",
            "수영",
            "에어로빅",
            "푸쉬업",
            "스쿼트",
            "데드리프트",
            "스모",
            "종합격투기",
            "역도",
            "턱걸이",
            "버피",
            "스쿼트",
            "런지",
            "멀리뛰기",
            "플랭크",
            "등산",
            "배드민턴",
            "축구",
            "농구",
            "조깅",
            "경보",
            "스키",
            "수상스키",
            "댄스",
            "요가",
            "태권도",
            "검도",
            "유도",
            "무에타이",
            "카포에라",
            "복싱",
            "양궁",
            "씨름",
            "태견",
            "합기도",
            "경호무술",
            "특공무술",
            "특전무술",
            "궁중무술",
            "가라테",
            "킥복싱",
            "팬싱",
            "레슬링",
            "시스테마",
            "프로레슬링",
            "절권도",
            "비치발리볼",
            "탁구",
            "족구",
            "풋볼",
            "럭비",
            "핸드볼",
            "게이트볼",
            "당구",
            "볼링",
            "피구",
            "컬링",
            "야구",
            "리듬체조",
            "투포환",
            "허들",
            "마라톤",
            "높이뛰기",
            "봅슬레이",
            "스피드스케이팅",
            "피겨스케이팅",
            "컬링",
            "아이스하키",
            "롤러스케이트",
            "스케이트보드",
            "클라이밍",
            "파쿠르",
            "승마",
            "줄다리기",
            "숨쉬기",
            "맨몸운동",
            "팔굽혀펴기",
            "줄넘기",
            "윗몸 일으키기",
            "계단오르기",
            "춤추기",
            "미식축구",
            "원반던지기",
            "장애물달리기",
            "창던지기",
            "기계체조",
            "트램펄린",
            "다이빙",
            "카누",
            "서핑",
            "스노보드",
            "썰매",
            "페러글라이딩",
            "사격",
            "팔씨름",
            "요트",
            "권투",
            "스켈레톤",
            "풋살",
            "쇼트트랙",
            "주짓수",
            "물구나무",
            "필라테스",
            "스트레칭",
            "홈트레이닝",
            "웨이트 트레이닝",
            "보디빌딩",
            "기능훈련",
            "아령",
            "무용",
            "탱고",
            "왈츠",
            "폴댄스",
            "산책",
            "쉐도우 복싱",
            "에어 점프",
            "샌드백",
            "피트니스",
            "태보",
            "줌바",
            "명상",
            "무산소",
            "유산소",
            "벌크업",
            "태껸",
            "호신술",
            "수구",
            "포켓볼",
            "비보잉",
            "발야구",
            "치어리딩",
            "굽혀닿기",
            "엉덩이올리기",
            "쪼그려 뻗히기",
            "쪼그려 굽히기",
            "발벌려 뛰기",
            "옆구리 운동",
            "온몸 비틀기",
            "쪼그려 앉아 뛰며 돌기",
            "몸통젖히기",
            "쪼그려 뛰기",
            "몸통 비틀기",
            "팔 올려 발에 닿기",
            "러닝머신",
            "사이드 점프",
            "점프 스쿼트",
            "지그재그 달리기",
            "왕복달리기",
            "한발로 서기",
            "쿵푸",
            "철인 3종",
            "낚시",
            "경마",
            "삼단뛰기",
            "빙벽등반",
            "카약",
            "인라인스케이트",
            "스키점프",
            "헬스",
            "캐치볼",
            "플라잉 요가",
            "아쿠아 바이크",
            "훌라후프",
            "노래",
            "말하기",
            "스킨스쿠버",
            "공중제비",
            "스파링",
            "벤치 프레스",
            "뜀틀",
            "빨리 걷기",
            "백런지",
            "제자리걷기",
            "제자리뛰기",
            "레그레이즈",
            "뒤로 다리차기",
            "다리 들어올리기",
            "제자리멀리뛰기",
            "체조",
            "다리찢기",
            "다리펴고 앞으로 숙이기",
            "짐볼운동",
            "크로스핏",
            "고양이자세",
            "아침운동",
            "크런치",
            "발레",
            "아크로바틱",
            "철봉",
            "물구나무 팔굽혀펴기",
            "악력기",
            "준비운동",
            "국민체조",
            "수중발레",
            "PT"

            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//운동
    private fun sub11(): String {
        val datas = listOf("사다리타기",
            "판치기",
            "홀짝",
            "시소",
            "회전목마",
            "롤러코스터",
            "다빈치코드",
            "비석치기",
            "쥐불놀이",
            "줄타기",
            "폴가이즈",
            "투호",
            "눈사람만들기",
            "탈춤",
            "클레오파트라 게임",
            "보물찾기",
            "마구마구",
            "심즈",
            "팩맨",
            "킹 오브 파이터즈",
            "태고의달인",
            "젤다의전설",
            "바이오하자드",
            "아스팔트",
            "포트나이트",
            "히어로즈 오브 더 스톰(히오스)",
            "롤토체스(TFT)",
            "언더테일",
            "윷놀이",
            "장기",
            "체스",
            "바둑",
            "트럼프",
            "화투",
            "고스톱",
            "롤",
            "오버워치",
            "007빵",
            "어몽어스",
            "다크소울",
            "369게임",
            "오목",
            "알까기",
            "월드오브워크래프트",
            "도타",
            "카운터스트라이크",
            "레인보우식스시즈",
            "콜오브듀티",
            "스타크레프트",
            "하스스톤",
            "포켓몬스터",
            "카트라이더",
            "버블파이터",
            "가위 바위 보",
            "끝말잇기",
            "눈싸움",
            "눈치게임",
            "닭싸움",
            "딱지치기",
            "라이어게임",
            "마피아게임",
            "말뚝박기",
            "무궁화꽃이피었습니다",
            "배스킨라빈스31",
            "손병호게임",
            "술래잡기",
            "숨바꼭질",
            "스무고개",
            "시장에가면",
            "쎄쎄쎄",
            "아이엠그라운드",
            "얼음땡",
            "여우야 여우야",
            "오징어 게임",
            "우리 집에 왜 왔니",
            "젓가락 놀이",
            "참참참",
            "제로게임",
            "ABC",
            "포테토칩",
            "고무줄 놀이",
            "공기놀이",
            "구슬치기",
            "굴렁쇠",
            "땅따먹기",
            "빙고",
            "불꽃놀이",
            "소꿉놀이",
            "수건돌리기",
            "실뜨기",
            "연날리기",
            "제기차기",
            "다트",
            "지우개따먹기",
            "진실게임",
            "팽이치기",
            "맞고",
            "섰다",
            "포커",
            "도둑잡기",
            "강강술래",
            "그네",
            "널뛰기",
            "도미노",
            "루미큐브",
            "부루마블",
            "원카드",
            "인생게임",
            "젠가",
            "할리갈리",
            "로스트아크",
            "피파",
            "서든어택",
            "발로란트",
            "메이플스토리",
            "던전앤파이터",
            "리니지",
            "디아블로",
            "GTA",
            "검은사막",
            "테일즈런너",
            "마인크래프트",
            "로블록스",
            "제패토",
            "쿠키런",
            "브롤스타즈",
            "포켓몬고",
            "세븐나이츠",
            "모두의마블",
            "철권",
            "마리오카트",
            "동물의숲",
            "소닉",
            "슈퍼마리오",
            "앵그리버드",
            "점프킹",
            "갱피스트",
            "겟앰프드",
            "고군분투",
            "별의커비",
            "아이작",
            "메탈슬러그",
            "유희왕",
            "펌프",
            "펀치기계",
            "인형뽑기",
            "퀴즈",
            "어쌔신크리드",
            "그랜드체이스",
            "금지어게임",
            "가운뎃말잇기",
            "마비노기",
            "기차놀이",
            "손바닥 뒤집기",
            "수수께끼",
            "앞말잇기",
            "데덴찌",
            "후라이팬 놀이",
            "초인종 장난(벨튀)",
            "깡통차기",
            "업 앤 다운",
            "더 게임 오브 데스",
            "왕 게임",
            "아파트",
            "홍삼 게임",
            "바니바니",
            "디비디비딥",
            "딸기게임",
            "구구단을 외자",
            "훈민정음",
            "표창 게임",
            "애니팡",
            "미니게임천국",
            "스도쿠",
            "핀볼머신",
            "클래시오브클랜",
            "물수제비",
            "모래성짓기",
            "숨은그림찾기",
            "꼬리잡기",
            "동대문을 열어라",
            "레고",
            "물총",
            "물풍선",
            "미니카",
            "바람개비",
            "3X3큐브",
            "퍼즐",
            "쿵쿵따",
            "워터볼",
            "수박깨기",
            "행맨",
            "VR게임",
            "포트리스",
            "요요",
            "종이접기",
            "저스트댄스",
            "링피트",
            "페인트볼",
            "그림그리기"

            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    }//게임
    private fun sub12(): String {
        val datas = listOf("가면라이더",
            "엘사",
            "올라프",
            "안나",
            "가필드",
            "케로로",
            "타마마",
            "기로로",
            "쿠루루",
            "도로로",
            "나루토",
            "록리",
            "사스케",
            "사쿠라",
            "루피",
            "상디",
            "조로",
            "나미",
            "로빈",
            "프랑키",
            "쵸파",
            "브룩",
            "징베",
            "우솝",
            "도라에몽",
            "노진구",
            "이슬이",
            "비실이",
            "퉁퉁이",
            "손오공",
            "크리링",
            "베지터",
            "아구몬",
            "피카츄",
            "리자몽",
            "유비",
            "관우",
            "장비",
            "유희",
            "강백호",
            "사이타마",
            "탄지로",
            "젠이츠",
            "렌고쿠",
            "사오정",
            "저팔계",
            "스폰지밥",
            "뚱이",
            "핑핑이",
            "징징이",
            "집게사장",
            "플랑크톤",
            "코난",
            "장미",
            "세모",
            "아름",
            "뭉치",
            "미키마우스",
            "미니마우스",
            "데이지덕",
            "도날드덕",
            "구피",
            "푸우",
            "피글렛",
            "티몬",
            "품바",
            "스티치",
            "백설공주",
            "인어공주",
            "세바스찬",
            "벨",
            "자스민",
            "오로라",
            "신데렐라",
            "뮬란",
            "버즈",
            "우디",
            "주디",
            "닉",
            "스누피",
            "쿠키 몬스터",
            "뽀로로",
            "크롱",
            "루피",
            "에디",
            "포비",
            "패티",
            "해리",
            "로디",
            "스파이더맨",
            "아이언맨",
            "캡틴아메리카",
            "팔콘",
            "호크아이",
            "닥터스트레인지",
            "엔트맨",
            "토르",
            "헐크",
            "그루트",
            "심슨",
            "뽀빠이",
            "스머프",
            "알라딘",
            "둘리",
            "또치",
            "헬로키티",
            "리락쿠마",
            "호빵맨",
            "식빵맨",
            "카레빵맨",
            "슈퍼맨",
            "배트맨",
            "원더우먼",
            "파워퍼프걸",
            "톰",
            "제리",
            "도라에몽",
            "바비",
            "조커",
            "로키",
            "고질라",
            "제임스 본",
            "산타",
            "카카시",
            "히나타",
            "다스베이더",
            "이타치",
            "해리포터",
            "말포이",
            "타노스",
            "이브이",
            "헤리미온느",
            "셜록홈즈",
            "요다",
            "스티치",
            "볼드모트",
            "마리오",
            "루이지",
            "쿠파",
            "라이언",
            "어피치",
            "튜브",
            "콘",
            "무지",
            "프로도",
            "네오",
            "제이지",
            "춘식",
            "이기영",
            "이기철",
            "땡구",
            "월E",
            "플루토",
            "심바",
            "술탄",
            "포카혼타스",
            "모아나",
            "라푼젤",
            "에리얼",
            "피터팬",
            "후크선장",
            "팅커벨",
            "다오",
            "배찌",
            "디지니",
            "마리드",
            "우니",
            "케피",
            "모스",
            "에띠",
            "일곱난쟁이",
            "말레피센트",
            "타잔",
            "헤라클레스",
            "랄프",
            "포세이돈",
            "제우스",
            "하데스",
            "헤라클레스",
            "데메테르",
            "아테나",
            "아폴론",
            "아르테미스",
            "아레스",
            "아프로디테",
            "헤르메스",
            "헤파이스토스",
            "헤스티아",
            "디오니소스",
            "에로스",
            "가이아",
            "우라노스",
            "크로노스",
            "가렌",
            "럭스",
            "티모",
            "피노키오",
            "가가멜",
            "간달프",
            "보노보노"
            )

        val random = Random().nextInt(datas.size)
        var randomend =  datas[random] // 여기에 랜덤한 결과가 담길것이다. A, B, C, D, E 중 하나
        return "$randomend"
    } //캐릭터


}



