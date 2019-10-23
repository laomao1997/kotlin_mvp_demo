package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.list.ListActivity

class LoginActivity : AppCompatActivity(), IMainView {

    private var mainPresenter: MainPresenter? = null

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var usernameView: EditText
    private lateinit var passwordView: EditText


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

        textView.setOnClickListener {
            val mRoundedBottomSheetDialogFragment = RoundedBottomSheetDialogFragment()
            mRoundedBottomSheetDialogFragment.show(supportFragmentManager, "RoundedBottomDialog")
        }

        button.setOnClickListener {
            println("Login")
            mainPresenter?.login(passwordView.text.toString(), usernameView.text.toString())
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
