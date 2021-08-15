// 13-08-2021-M Riffi Yusuf Hawarry-10118398
package com.jovanovic.stefan.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    private lateinit var tv_nama: TextView
    private lateinit var tv_keterangan: TextView
    private lateinit var tv_latitude: TextView
    private lateinit var tv_longitude: TextView
    private lateinit var iv_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val mapsModel = intent.extras?.getParcelable<MapsModel>("mapsModel")

        tv_nama = findViewById(R.id.nama)
        tv_keterangan = findViewById(R.id.keterangan)
        tv_latitude = findViewById(R.id.latitude)
        tv_longitude = findViewById(R.id.longitude)
        iv_image = findViewById(R.id.image)

        tv_nama.text = mapsModel?.nama
        tv_keterangan.text = mapsModel?.keterangan
        tv_latitude.text = mapsModel?.latitude.toString()
        tv_longitude.text = mapsModel?.longitude.toString()

        Glide.with(this)
            .load(mapsModel?.gambar.toString())
            .into(iv_image)

    }
}