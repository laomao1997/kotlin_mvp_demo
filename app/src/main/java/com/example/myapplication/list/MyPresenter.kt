package com.example.myapplication.list

class MyPresenter: MyContract.Presenter {

    private var mActivity: MyContract.View? = null
    private var mModel: MyContract.Model? = null

    override fun attachView(view: ListActivity) {
        mActivity = view
        mModel = MyModel()
    }

    override fun detachView() {
        mActivity = null
    }

    override fun getData() {
        if (mModel!!.getData().isNotEmpty()) {
            mActivity!!.setAdapter(mModel!!.getData())

        }
        else {
            mActivity!!.showToast("没有数据！！！！")
        }
    }
}