package com.example.bdjobscodingtest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bdjobscodingtest.adapter.JobsAdapter
import com.example.bdjobscodingtest.factory.JobViewModelFactory
import com.example.bdjobscodingtest.network.ApiService
import com.example.bdjobscodingtest.network.NetworkConnectionInterceptor
import com.example.bdjobscodingtest.repository.JobRepository
import com.example.bdjobscodingtest.viewModel.GettingJobViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


//    override val kodein by kodein()
    private lateinit var factory : JobViewModelFactory //by  instance()

    private lateinit var viewmodel: GettingJobViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getJob()



    }

    private  fun getJob() {

        val networkConnectionInterceptor = NetworkConnectionInterceptor(this)
        val api = ApiService(networkConnectionInterceptor)
        val repository = JobRepository(api)

        factory = JobViewModelFactory(repository)
        viewmodel = ViewModelProviders.of(this, factory).get(GettingJobViewModel::class.java)


        viewmodel.getJObList()

        viewmodel.joblist.observe(this, Observer { jobs ->

            Log.e("response", jobs.message.toString())
            Log.e("response", jobs.data!!.size.toString())

            jobs_recyclerview.also {
                it.layoutManager  = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                it.setHasFixedSize(true)
                it.adapter = JobsAdapter(jobs.data, this)
            }



        })




    }
}