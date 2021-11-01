package com.slowmotion.dzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.slowmotion.dzikirapp.R
import com.slowmotion.dzikirapp.model.DzikirDoa

class DoaHarianActivity : AppCompatActivity() {
    private lateinit var rvDoaHarian : RecyclerView
    private var dzikirdoa : ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvDoaHarian = findViewById(R.id.rvDoaHarian)
        initData()
    }

    private fun initData() {
        val desc = resources.getStringArray(R.array.dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.terjemah_dzikir_doa_harian)

        dzikirdoa.clear()
        for (data in desc.indices){
            dzikirdoa.add(
                DzikirDoa(desc[data], lafaz[data], terjemah[data])
            )
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}