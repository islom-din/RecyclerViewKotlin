package islom.din.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import islom.din.recyclerviewkotlin.models.BlogPost
import kotlinx.android.synthetic.main.list_item.view.*

class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is BlogViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<BlogPost>) {
        items = blogList
    }

    class BlogViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView) {
        val blogImage: ImageView = itemView.blog_image
        val blogTitle: TextView = itemView.blog_title
        val blogAuthor: TextView = itemView.blog_author

        fun bind(blogPost: BlogPost) {
            blogTitle.setText(blogPost.title)
            blogAuthor.setText(blogPost.username)

            // using Glide
            val requesOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context) // passing a context
                .applyDefaultRequestOptions(requesOptions)
                .load(blogPost.image) // here is the url for the picture
                .into(blogImage)
        }
    }

}