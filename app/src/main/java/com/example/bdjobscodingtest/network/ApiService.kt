package com.example.bdjobscodingtest.network

import com.example.bdjobscodingtest.pojo.JobResponse
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by MD ISMAIL HOSSAIN SEPON on 04-Jul-21.
 * ismailhossainsepon@gmail.com
 */
interface ApiService {


    @GET("InterviewJson.json")
    suspend fun getJObList() : Response<JobResponse>



    companion object{
        operator fun invoke(
            networkConnectionInterceptor: NetworkConnectionInterceptor
        ) : ApiService{


            val okkHttpclient = OkHttpClient.Builder()
                .addInterceptor(networkConnectionInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okkHttpclient)
                .baseUrl("http://corporate3.bdjobs.com/interviewtest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}