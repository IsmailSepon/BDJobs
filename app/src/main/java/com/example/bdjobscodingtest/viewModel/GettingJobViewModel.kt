package com.example.bdjobscodingtest.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bdjobscodingtest.network.Coroutines
import com.example.bdjobscodingtest.pojo.JobResponse
import com.example.bdjobscodingtest.repository.JobRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext


/**
 * Created by MD ISMAIL HOSSAIN SEPON on 04-Jul-21.
 * ismailhossainsepon@gmail.com
 */


public class GettingJobViewModel(private val repository: JobRepository) : ViewModel() {


    private lateinit var job: Job

    private val response = MutableLiveData<JobResponse>()
    val joblist : LiveData<JobResponse>
        get() = response

     fun getJObList() {

         job = Coroutines.ioThenMain(
             { repository.getJOb() },
             { response.value = it }
         )

    }
}