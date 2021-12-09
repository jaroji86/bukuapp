package id.ac.polbeng.jaroji.bukuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_book_detail.*

class BookDetailActivity : AppCompatActivity() {
    companion object {
        const val BOOK = "book"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)
        val data = intent.getParcelableExtra<Book>(BOOK)

        data?.let {
            val author = "Penulis: ${it.author}"
            val publiser = "Penerbit: ${it.publiser}"
            val pub_year = "Tahun Terbit: ${it.publish_year}"
            title = it.title
            txt_title_detail.text = it.title
            txt_author_detail.text = author
            txt_publish_year_detail.text = pub_year
            txt_publisher_detail.text = publiser
            txt_sinopsis_detail.text = it.detail

            Glide.with(this)
                .load(it.img_cover)
                .into(img_cover_detail)
        }
    }
}