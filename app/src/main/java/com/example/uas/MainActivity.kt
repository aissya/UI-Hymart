package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.synnapps.carouselview.CarouselView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cvSatuActivity: CardView = findViewById(R.id.cvSatu)
        cvSatuActivity.setOnClickListener(this)

        val cvDuaActivity: CardView= findViewById(R.id.cvDua)
        cvDuaActivity.setOnClickListener(this)

        val cvTigaActivity: CardView= findViewById(R.id.cvTiga)
        cvTigaActivity.setOnClickListener(this)

        val cvEmpatActivity: CardView = findViewById(R.id.cvEmpat)
        cvEmpatActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.cvSatu -> {
                val Pindahmakanan = Intent(this, MakananActivity::class.java)
                startActivity(Pindahmakanan)
            }

            R.id.cvDua -> {
                val Pindahrumah = Intent(this, RumahActivity::class.java)
                startActivity(Pindahrumah)
            }

            R.id.cvTiga -> {
                val Pindahibu = Intent(this, IbuActivity::class.java)
                startActivity(Pindahibu)
            }

            R.id.cvEmpat -> {
                val Pindahrsakit = Intent(this, RSakitActivity::class.java)
                startActivity(Pindahrsakit)
            }
        }

    }
}