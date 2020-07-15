package islom.din.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogAdapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addData()
    }

    fun initRecyclerView() {
        recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
        val topSpacingItemDecoration = TopSpacingItemDecoration(30)
        recycler_view.addItemDecoration(topSpacingItemDecoration)
        blogAdapter = Adapter()
        recycler_view.adapter = blogAdapter

        // another method
//        recycler_view.apply {
//        layoutManager = LinearLayoutManager(this@MainActivity)
//        blogAdapter = Adapter()
//        adapter = blogAdapter
//        }
    }

    fun addData() {
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }
}
