package com.example.bdjobscodingtest.doodleLtd.pojo

import com.google.gson.annotations.SerializedName

data class DoodleResponse(

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null
)

data class SubcatgItem(

	@field:SerializedName("sub_category_id")
	val subCategoryId: String? = null,

	@field:SerializedName("sub_category_name")
	val subCategoryName: String? = null
)

data class CategoriesItem(

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("category_id")
	val categoryId: String? = null,

	@field:SerializedName("subcatg")
	val subcatg: List<Any?>? = null
)
