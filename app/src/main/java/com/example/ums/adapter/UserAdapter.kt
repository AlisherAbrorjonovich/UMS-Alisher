package com.example.ums.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ums.databinding.ItemRvBinding
import com.example.ums.models.MyInfo

class RvAdapter(var list : ArrayList<MyInfo> = ArrayList(), var rvAction: RvAction): RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh( var itemRvBinding: ItemRvBinding): RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(myInfo: MyInfo,position: Int){
            itemRvBinding.tvBolim.text = myInfo.title
            itemRvBinding.tvCod.text = myInfo.ussdCod
            itemRvBinding.tvMalumot.text = myInfo.about

            itemRvBinding.itemView.setOnClickListener {
                rvAction.itemClick(myInfo, position)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }
    interface RvAction{
        fun itemClick(myInfo: MyInfo, position: Int)
    }
}