package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class screen6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen6)
        val intent5 = Intent(this, screen7::class.java )
        val r: Runnable = object : Runnable {
            override fun run() {
                startActivity(intent5)
            }
        }
        val h = Handler(Looper.getMainLooper())
        h.postDelayed(r, 10000)
    }
}