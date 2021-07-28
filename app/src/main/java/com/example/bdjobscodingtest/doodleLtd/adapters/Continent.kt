package com.example.bdjobscodingtest.doodleLtd.adapters

import com.example.bdjobscodingtest.doodleLtd.adapters.Country
import com.example.bdjobscodingtest.doodleLtd.pojo.SubcatgItem
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup


data class Continent(
    val continentName: String, val countries: List<SubcatgItem>
):  ExpandableGroup<SubcatgItem>(continentName, countries)