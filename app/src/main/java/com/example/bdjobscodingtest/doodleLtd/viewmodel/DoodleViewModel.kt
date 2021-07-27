package com.example.bdjobscodingtest.doodleLtd.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bdjobscodingtest.doodleLtd.pojo.DoodleResponse
import com.example.bdjobscodingtest.network.Coroutines
import com.example.bdjobscodingtest.pojo.JobResponse
import com.example.bdjobscodingtest.repository.JobRepository
import kotlinx.coroutines.Job


/**
 * Created by MD ISMAIL HOSSAIN SEPON on 04-Jul-21.
 * ismailhossainsepon@gmail.com
 */


public class DoodleViewModel(private val repository: JobRepository) : ViewModel() {


    private lateinit var job: Job

    private val response = MutableLiveData<DoodleResponse>()
    val doodleList : LiveData<DoodleResponse>
        get() = response



    fun getDoodleList(){

        job = Coroutines.ioThenMain(
            {repository.getDoodle()},
            { response.value = it }
        )

    }

}