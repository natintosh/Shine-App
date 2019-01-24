package com.google.codelabs.mdc.kotlin.shrine

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.android.volley.toolbox.NetworkImageView

class ProductCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val productImage: NetworkImageView = itemView.findViewById(R.id.product_image)
    val productTitle: TextView = itemView.findViewById(R.id.product_title)
    val productPrice: TextView = itemView.findViewById(R.id.product_price)
}

