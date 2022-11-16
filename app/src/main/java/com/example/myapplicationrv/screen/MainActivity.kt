package com.example.myapplicationrv.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationrv.R
import com.example.myapplicationrv.adapter.RVAdapter
import com.example.myapplicationrv.databinding.ActivityMainBinding
import com.example.myapplicationrv.model.DataModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val list = arrayListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        addtolist("raj", R.drawable.ic_launcher_background)
        addtolist("tej", R.drawable.ic_launcher_background)
        addtolist("mishal", R.drawable.ic_launcher_background)
        addtolist("demo", R.drawable.ic_launcher_background)
        addtolist("raj", R.drawable.ic_launcher_background)
        addtolist("tej", R.drawable.ic_launcher_background)
        addtolist("mishal", R.drawable.ic_launcher_background)

        steUpRV(list)

    }

    private fun addtolist(name: String, img: Int) {

        list.add(DataModel(name, img))

    }

    private fun steUpRV(list: ArrayList<DataModel>) {
        val adapter = RVAdapter(this, list)
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layoutManager
    }
}