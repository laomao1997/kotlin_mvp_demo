package com.example.myapplication

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.list.ListActivity

class LoginActivity : AppCompatActivity(), IMainView {

    private var mainPresenter: MainPresenter? = null

    var textView: TextView? =null
    var button: Button? = null
    var usernameView: EditText? = null
    var passwordView: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        mainPresenter = MainPresenter(this)


        textView = findViewById(R.id.text)
        button = findViewById(R.id.button)
        usernameView = findViewById(R.id.username)
        passwordView = findViewById(R.id.password)

        button?.setOnClickListener {
            println("Login")
            mainPresenter?.login(passwordView?.text.toString(), usernameView?.text.toString())
            val intent = Intent(applicationContext, ListActivity::class.java)
            startActivity(intent)
        }
    }

    override fun loginSuccess() {
        println("Login Success!!!")
    }

    override fun loginFailed(msg: String) {
        println("Login Failed. $msg")
    }
}
