package com.example.bdjobscodingtest.doodleLtd.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.bdjobscodingtest.R
import com.example.bdjobscodingtest.doodleLtd.pojo.SubcatgItem
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder


class CountryViewHolder(itemView: View) : ChildViewHolder(itemView) {
    val countryName = itemView.findViewById<TextView>(R.id.countryName)

    fun bind(country: SubcatgItem) {
        countryName.text = country.subCategoryName
    }
}

class ContinentViewHolder(itemView: View) : GroupViewHolder(itemView) {
    val continentName = itemView.findViewById<TextView>(R.id.continent)
    val arrow = itemView.findViewById<ImageView>(R.id.arrow)

    fun bind(continent: Continent) {
        continentName.text = continent.continentName
    }

}