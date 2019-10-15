package com.example.myapplication.list

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ListActivity : AppCompatActivity(), MyContract.View {

//    private lateinit var list: Array<Bean>

    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_list)
        val myPresenter = MyPresenter()
        myPresenter.attachView(this)

        // 获取数据
        myPresenter.getData()
//        initData()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    override fun setAdapter(listOfBean: List<Bean>) {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        myAdapter = MyAdapter(listOfBean)
        recyclerView.adapter = myAdapter
    }

    override fun notifyAdapter() {
        myAdapter.notifyDataSetChanged()
    }

/*
    fun initData() {
        val beanA = Bean("Peter", "19")
        val beanB = Bean("Bob", "33")
        list = arrayOf(
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB,
            beanA,
            beanB
        )
    }*/
}