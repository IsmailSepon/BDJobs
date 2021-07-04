package com.example.bdjobscodingtest.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bdjobscodingtest.R
import com.example.bdjobscodingtest.databinding.JobsItemBinding
import com.example.bdjobscodingtest.pojo.DataItem

/**
 * Created by MD ISMAIL HOSSAIN SEPON on 04-Jul-21.
 * ismailhossainsepon@gmail.com
 */
class JobsAdapter (
    private val jobs: List<DataItem?>?,
    mContext: Context
) : RecyclerView.Adapter<JobsAdapter.JobsViewHolder>(){

    private val mContext = mContext
    override fun getItemCount() = jobs!!.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        JobsViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(mContext),
                R.layout.jobs_item,
                parent,
                false
            )
        )

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: JobsViewHolder, position: Int) {
        holder.recyclerviewJobBinding.singleJob = jobs!![position]
        val maxSalary : String = jobs!![position]!!.maxSalary.toString()
        val minSalary : String = jobs!![position]!!.minSalary.toString()
      //  val featured : Boolean? = jobs!![position]!!.isFeatured

        salary( holder.recyclerviewJobBinding.textView5, maxSalary, minSalary)

//        if (featured == true){
//            featured(holder.recyclerviewJobBinding.cardview)
//        }



    }

    private fun featured(cardview: CardView) {

        cardview.setCardBackgroundColor(Color.parseColor("#8de291"))
    }


    private fun salary(textView5: TextView, maxSalary: String, minSalary: String) {

        if (!maxSalary.equals("") && minSalary.equals("")){
            textView5.text = "Maximum Salary: "+maxSalary

        }else if (!minSalary.equals("") && maxSalary.equals("")){

            textView5.text = "Minimum Salary: "+minSalary

        }else if (!minSalary.equals("") && !maxSalary.equals("")){
            textView5.text = "Salary: "+minSalary+ " - "+maxSalary
        }else{

            textView5.text = "Salary: Negotiable"
        }
    }


    inner class JobsViewHolder(
        val recyclerviewJobBinding: JobsItemBinding
    ) : RecyclerView.ViewHolder(recyclerviewJobBinding.root)

}