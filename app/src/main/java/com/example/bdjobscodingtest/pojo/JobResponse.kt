package com.example.bdjobscodingtest.pojo

import com.google.gson.annotations.SerializedName

data class JobResponse(

	@field:SerializedName("statuscode")
	val statuscode: String? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("common")
	val common: Common? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class Common(

	@field:SerializedName("total_records_found")
	val totalRecordsFound: Int? = null,

	@field:SerializedName("totalpages")
	val totalpages: Int? = null
)

data class JobDetails(

	@field:SerializedName("ApplyInstruction")
	val applyInstruction: String? = null,

	@field:SerializedName("CompanyName")
	val companyName: String? = null,

	@field:SerializedName("LastDate")
	val lastDate: String? = null,

	@field:SerializedName("Title")
	val title: String? = null
)

data class DataItem(

	@field:SerializedName("maxSalary")
	val maxSalary: String? = null,

	@field:SerializedName("recruitingCompany'sProfile")
	val recruitingCompanySProfile: String? = null,

	@field:SerializedName("jobTitle")
	val jobTitle: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("maxExperience")
	val maxExperience: Int? = null,

	@field:SerializedName("minSalary")
	val minSalary: String? = null,

	@field:SerializedName("deadline")
	val deadline: String? = null,

	@field:SerializedName("jobDetails")
	val jobDetails: JobDetails? = null,

	@field:SerializedName("IsFeatured")
	val isFeatured: Boolean? = null,

	@field:SerializedName("minExperience")
	val minExperience: Int? = null
)
