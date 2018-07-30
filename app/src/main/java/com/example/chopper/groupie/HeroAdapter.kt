package com.example.chopper.groupie

import android.content.Context
import com.bumptech.glide.Glide
import com.example.chopper.groupie.model.Hero
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.list_item.view.*

class HeroAdapter(val hero: Hero) : Item<ViewHolder>() {

    var context: Context? = null

    override fun getLayout(): Int = R.layout.list_item

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvHero.text = hero.name
        Glide.with(this!!.context!!)
                .load(hero.image)
                .into(viewHolder.itemView.ivHero)
    }
}