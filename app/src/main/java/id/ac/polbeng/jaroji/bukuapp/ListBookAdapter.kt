package id.ac.polbeng.jaroji.bukuapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter(private val listBook:ArrayList<Book>): RecyclerView.Adapter<ListBookAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_book, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]
        Glide.with(holder.itemView.context)
            .load(book.img_cover)
            .apply(RequestOptions().override(65,75))
            .into(holder.tvImgCover)
        holder.tvTitle.text = book.title
        holder.tvDetail.text = book.detail

        holder.itemView.setOnClickListener{
            this.onItemClickCallback.onItemClicked(listBook[holder.absoluteAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listBook.size
    }


    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle:TextView = itemView.findViewById(R.id.tv_item_title)
        var tvImgCover: ImageView = itemView.findViewById(R.id.img_cover)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Book)
    }
}