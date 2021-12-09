package id.ac.polbeng.jaroji.bukuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvBooks:RecyclerView
    private var list: ArrayList<Book> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Katalog Buku"
        rvBooks = rv_book
        rvBooks.setHasFixedSize(true)

        list.addAll(BookData.listData)
        showRecylerList()
    }

    private fun showRecylerList() {
        rvBooks.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        rvBooks.adapter = listBookAdapter

        listBookAdapter.setOnItemClickCallback(object: ListBookAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Book) {
                showSelectedBook(data)
            }
        })
    }

    private fun showSelectedBook(book: Book) {
        val detailBuku = Intent(this,BookDetailActivity::class.java)
        detailBuku.putExtra(BookDetailActivity.BOOK, book)
        startActivity(detailBuku)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId.equals(R.id.menu_about)){
            val about = Intent(this, AboutActivity::class.java)
            startActivity(about)

        }
        return super.onOptionsItemSelected(item)
    }
}