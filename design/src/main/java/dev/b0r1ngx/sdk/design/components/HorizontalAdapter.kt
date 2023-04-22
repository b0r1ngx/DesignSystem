package dev.b0r1ngx.sdk.design.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HorizontalAdapter(private val data: Array<String>) : RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val description: TextView

        init {
            title = view.findViewById(dev.b0r1ngx.sdk.design.R.id.title)
            description =  view.findViewById(dev.b0r1ngx.sdk.design.R.id.description)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(dev.b0r1ngx.sdk.design.R.layout.item_horizontal, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.title.text = data[position]
        viewHolder.description.text = data[position]
    }

    override fun getItemCount() = data.size
}