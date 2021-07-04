package com.example.bdjobscodingtest.AppController

import android.app.Application
import com.example.bdjobscodingtest.network.ApiService
import com.example.bdjobscodingtest.network.NetworkConnectionInterceptor
import com.example.bdjobscodingtest.repository.JobRepository
import com.example.bdjobscodingtest.viewModel.GettingJobViewModel
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton


/**
 * Created by MD ISMAIL HOSSAIN SEPON on 08-Jun-21.
 * ismailhossainsepon@gmail.com
 */
@SuppressWarnings("ALL")
class AppController  : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@AppController))

        bind() from singleton {String()}

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { ApiService(instance()) }
        bind() from singleton { JobRepository(instance()) }
        bind() from provider { GettingJobViewModel(instance()) }


    }



}