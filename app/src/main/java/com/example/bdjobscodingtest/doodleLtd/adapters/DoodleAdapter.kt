package com.example.bdjobscodingtest.doodleLtd.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.bdjobscodingtest.R
import com.example.bdjobscodingtest.doodleLtd.pojo.SubcatgItem
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup


/**
 * Created by MD ISMAIL HOSSAIN SEPON on 27-Jul-21.
 * ismailhossainsepon@gmail.com
 */
class DoodleAdapter (groups: List<ExpandableGroup<*>>?) :
    ExpandableRecyclerViewAdapter<ContinentViewHolder, CountryViewHolder>(
        groups
    ) {


    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): ContinentViewHolder {
        val itemView =
            LayoutInflater.from(parent?.context).inflate(R.layout.continent_layout, parent, false)
        return ContinentViewHolder(itemView)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): CountryViewHolder {
        val itemView =
            LayoutInflater.from(parent?.context).inflate(R.layout.countrys_layout, parent, false)
        return CountryViewHolder(itemView)
    }

    override fun onBindChildViewHolder(
        holder: CountryViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?,
        childIndex: Int
    ) {
        val country: SubcatgItem = group?.items?.get(childIndex) as SubcatgItem
        holder?.bind(country)
    }

    override fun onBindGroupViewHolder(
        holder: ContinentViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?
    ) {
        val continent: Continent = group as Continent
        holder?.bind(continent)
    }
}