package com.example.junggonara

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.search_activity.*

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)

        allviewer.setOnClickListener {
            showToast("전체보기가 클릭되었습니다.")
        }

        certification.setOnClickListener {
            showToast("인증상품이 클릭되었습니다.")
            
            //인증 상품은 눌린채로, 나머지는 non으로
            certification.setImageResource(R.drawable.search_btn_certification)
//            star_5.setImageResource(R.drawable.search_btn_5_star_non)
//            star_5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.search_btn_5_star_non))
//            notopen.setImageResource(R.drawable.search_btn_notopen_non)
        }

        star_5.setOnClickListener {

            showToast("5성급후기가 클릭되었습니다.")

            //5성급 후기는 눌린채로, 나머지는 non으로

            certification.setImageResource(R.drawable.search_btn_certification_non)
//            star_5.setImageResource(R.drawable.search_btn_5star)
//            notopen.setImageResource(R.drawable.search_btn_notopen_non)

        }

        notopen.setOnClickListener {

            showToast("미개봉상품이 클릭되었습니다.")

            //미개봉상품은 눌린채로, 나머지는 non으로

            certification.setImageResource(R.drawable.search_btn_certification_non)
//            star_5.setImageResource(R.drawable.search_btn_5_star_non)
//            notopen.setImageResource(R.drawable.search_btn_notopen)

        }
    }
}