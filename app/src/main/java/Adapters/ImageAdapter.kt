package Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ilhomjon.recycleviewadapterinviewpager2.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_view_pager_2.view.*

class ImageAdapter(val list: List<String>) : RecyclerView.Adapter<ImageAdapter.VIewHOlder>() {

    inner class VIewHOlder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun onBind(url:String){
            Picasso.get().load(url).into(itemView.item_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VIewHOlder {
        return VIewHOlder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager_2, parent, false))
    }

    override fun onBindViewHolder(holder: VIewHOlder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}