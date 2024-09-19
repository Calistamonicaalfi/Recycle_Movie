package com.coba.latihancalista

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListView : AppCompatActivity() {
    private lateinit var lv_data : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        lv_data = findViewById(R.id.lv_data)

        //Listview
        //widget listview --> Array adaptar --> data source (array/list/database)

        //bikin array list
        val namaHewan = listOf(
            "gajah",
            "kuda",
            "beruang",
            "panda",
            "ular",
            "kucing",
            "sapi",
            "kerbau",
            "ikan"
        )

        //memasukkan data array ini ke dalam adater
        //android layout --> layout bawaan untuk di adapter
        lv_data.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

        //untuk bisa di klik dari list
        lv_data.setOnItemClickListener {
                parent, view, position, id ->
            Toast.makeText(this, "anda memilih : ${namaHewan[position]}",
                Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnRecycleMovie)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}