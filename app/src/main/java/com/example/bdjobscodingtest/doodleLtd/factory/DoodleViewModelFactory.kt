package com.example.bdjobscodingtest.doodleLtd.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bdjobscodingtest.doodleLtd.viewmodel.DoodleViewModel
import com.example.bdjobscodingtest.repository.JobRepository
import com.example.bdjobscodingtest.viewModel.GettingJobViewModel


/**
 * Created by MD ISMAIL HOSSAIN SEPON on 07-Jun-21.
 * ismailhossainsepon@gmail.com
 */

@Suppress("UNCHECKED_CAST")
class DoodleViewModelFactory(private val repository: JobRepository)  : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DoodleViewModel(repository) as T
    }
}