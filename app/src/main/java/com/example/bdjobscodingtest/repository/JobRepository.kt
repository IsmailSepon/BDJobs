package com.example.bdjobscodingtest.repository

import com.example.bdjobscodingtest.doodleLtd.pojo.DoodleResponse
import com.example.bdjobscodingtest.network.ApiService
import com.example.bdjobscodingtest.network.SafeApiRequest
import com.example.bdjobscodingtest.pojo.JobResponse


/**
 * Created by MD ISMAIL HOSSAIN SEPON on 04-Jul-21.
 * ismailhossainsepon@gmail.com
 */
class JobRepository (private val api: ApiService) : SafeApiRequest(){



suspend fun getJOb() : JobResponse {

    return apiRequest{ api.getJObList()}

}

suspend fun getDoodle() : DoodleResponse {

    return apiRequest{ api.getDoodleList()}

}

}