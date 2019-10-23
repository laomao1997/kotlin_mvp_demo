package com.example.myapplication.list

class MyModel: MyContract.Model {

    private lateinit var list: List<Bean>

    override fun getData(): List<Bean> {
        val beanA = Bean("Peter", "19")
        val beanB = Bean("Bob", "33")
        list = listOf(
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
        return list
    }
}