package com.ttc.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ttc.uniid.intergration.CallBackData
import com.ttc.uniid.intergration.LoginWithUniId
import org.jetbrains.annotations.NotNull


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginWithUniId = LoginWithUniId(this)
        val url = "http://uid.com.la:9999/credentials/sign-in/oauth/consent?redirectUriApp=mocha&clientId=50ccfd99-facb-40d4-8cfd-99facba0d4fe&redirectUri=http://laosapp.la/"
        loginWithUniId.login(url, object : CallBackData {
            override fun onResult(@NotNull s: String) {}
        })

    }
}