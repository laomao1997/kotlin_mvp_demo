package com.example.myapplication

class MainPresenter(var view: IMainView) {



    fun login(userName: String, password: String) {
        if (userName == password) {
            view.loginSuccess()
        }
        else {
            view.loginFailed("不一样")
        }
    }

}