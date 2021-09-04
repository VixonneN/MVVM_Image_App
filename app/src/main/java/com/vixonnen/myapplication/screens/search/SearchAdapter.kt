package com.vixonnen.myapplication.screens.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.vixonnen.myapplication.R
import com.vixonnen.myapplication.databinding.ItemImageBinding
import com.vixonnen.myapplication.screens.models.Urls

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    private val mListImages = emptyList<Urls>()

    class ViewHolder(var binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = ItemImageBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = mListImages[position]
        holder.binding.previewImageItem = image.small
    }

    override fun getItemCount(): Int = mListImages.size

    fun setImages(images: List<Urls>){

    }

}