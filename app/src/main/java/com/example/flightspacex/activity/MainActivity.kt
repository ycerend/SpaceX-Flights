package com.example.flightspacex

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.flightspacex.activity.MiddleMainActivity
import com.example.flightspacex.activity.ui.Launchs.LaunchMainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException){}
        /*val helloTextView = findViewById<TextView>(R.id.deneme)
        RetrofitClient.instance.getAllCapsulesInfo()
            .enqueue(object : Callback<List<AllCapsules>> {
            override fun onResponse(
                call: Call<List<AllCapsules>>?,
                response: Response<List<AllCapsules>>?
            ) {
                if(response?.code() == 200 ){
                    val response_capsule = response?.body()
                    val one_capsule = response_capsule!!.get(0)
                    helloTextView.setText(one_capsule.capsule_serial)

                }
                else{
                    System.out.println(response?.body())
                    System.out.println(response?.code())
                    helloTextView.setText("EYVAH")
                }
            }

                override fun onFailure(call: Call<List<AllCapsules>>, t: Throwable) {
                    System.out.println(t.message)
                    System.out.println(t.cause)


                    //System.out.println(call.toString())
                    helloTextView.setText("vuuuu")
                }

            })*/



    }
    fun goToEventListPage(view : View) {
        val intent =Intent(this, MiddleMainActivity::class.java)
        intent.putExtra("Event",true)
        intent.putExtra("Launch",false)
        intent.putExtra("Mission",false)
        startActivity(intent)


    }

    fun goToLaunchPage(view : View) {
        val intent =Intent(this, MiddleMainActivity::class.java)
        intent.putExtra("Event",false)
        intent.putExtra("Launch",true)
        intent.putExtra("Mission",false)
        startActivity(intent)
    }
    fun goToMissionListPage(view : View) {
        val intent =Intent(this, MiddleMainActivity::class.java)
        intent.putExtra("Event",false)
        intent.putExtra("Launch",false)
        intent.putExtra("Mission",true)

        startActivity(intent)
    }

    companion object {
        fun getLaunchIntent(from : Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onBackPressed() {}
}