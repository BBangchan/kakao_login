package com.example.kakao_login

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this,"929e67c71fa46504167ae838a7b77d3b")
    }

}