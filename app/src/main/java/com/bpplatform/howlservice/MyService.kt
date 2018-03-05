package com.bpplatform.howlservice

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Created by myeongsic on 2018. 2. 28..
 */

class MyService : Service(){
    //서비스가 생성될때 작동
    override fun onCreate() {
        super.onCreate()
    }
    //생성되기 직전에 작동
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Thread{
            run {

                while (true){
                    Thread.sleep(3000)
                    println("서비스 실행 중 입니다.")
                }

            }
        }.start()
        return START_STICKY
    }
    //서비스가 제거 될 때 작동
    override fun onDestroy() {
        super.onDestroy()
    }



    override fun onBind(p0: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}