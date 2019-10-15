package com.example.myapplication.list

interface MyContract {

    interface View {
        // Toast 显示信息
        fun showToast(message: String)

        // 设置 RecyclerView
        fun setAdapter(listOfBean: List<Bean>)

        // 刷新 Adapter
        fun notifyAdapter()
    }

    interface Model {
        // http 请求获取数据
        fun getData(): List<Bean>
    }

    interface Presenter {
        // 连接 View
        fun attachView(view: ListActivity)

        // 断开 View
        fun detachView()

        // 获取数据
        fun getData()
    }

}