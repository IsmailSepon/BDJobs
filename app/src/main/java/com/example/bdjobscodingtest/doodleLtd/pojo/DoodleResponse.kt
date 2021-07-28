package com.example.bdjobscodingtest.doodleLtd.pojo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class DoodleResponse(

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null
)

@Parcelize
data class SubcatgItem(

	@field:SerializedName("sub_category_id")
	var subCategoryId: String? = null,

	@field:SerializedName("sub_category_name")
	var subCategoryName: String? = null
) : Parcelable

data class CategoriesItem(

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("category_id")
	val categoryId: String? = null,

	@field:SerializedName("subcatg")
	val subcatg: List<Any?>? = null
)
