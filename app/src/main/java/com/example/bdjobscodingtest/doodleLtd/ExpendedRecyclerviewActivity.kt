package com.example.bdjobscodingtest.doodleLtd

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bdjobscodingtest.R
import com.example.bdjobscodingtest.doodleLtd.adapter.GenreAdapter
import com.example.bdjobscodingtest.doodleLtd.adapter.GenreDataFactory.makeGenres
import com.example.bdjobscodingtest.doodleLtd.factory.DoodleViewModelFactory
import com.example.bdjobscodingtest.doodleLtd.viewmodel.DoodleViewModel
import kotlinx.android.synthetic.main.activity_expended_recyclerview.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class ExpendedRecyclerviewActivity : AppCompatActivity(), KodeinAware {

    override val kodein by kodein()
    private lateinit var viewmodel: DoodleViewModel
    private  val factory : DoodleViewModelFactory by  instance()

    var adapter: GenreAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expended_recyclerview)


        getData()
    }

    private fun getData() {


        viewmodel = ViewModelProviders.of(this, factory).get(DoodleViewModel::class.java)
        viewmodel.getDoodleList()
        viewmodel.doodleList.observe(this, Observer { jobs ->

            Log.e("response", jobs.categories?.size.toString())


            adapter = GenreAdapter(makeGenres())
            recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            recycler_view.adapter = adapter

            val layoutManager = LinearLayoutManager(this)
 //           Log.e("response", jobs.data!!.size.toString())
//            jobs_recyclerview.also {
//                it.layoutManager  = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//                it.setHasFixedSize(true)
//                it.adapter = JobsAdapter(jobs.data, this)
//            }


        })


    }

}