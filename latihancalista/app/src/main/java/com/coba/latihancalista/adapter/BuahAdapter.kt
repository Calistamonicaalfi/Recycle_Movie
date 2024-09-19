package com.coba.latihancalista.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.coba.latihancalista.R
import android.view.View

class BuahAdapter(val itemList: ArrayList<com.coba.latihancalista.model.modelBuah>)
    : RecyclerView.Adapter<BuahAdapter.MyviewHolder>()
{
    class MyviewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari item layout
        var itemImage : ImageView
        var itemText : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama_buah)
        }
    }

    class modelBuah {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        //kita deklare layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_costum_buah, parent, false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)
    }

}

