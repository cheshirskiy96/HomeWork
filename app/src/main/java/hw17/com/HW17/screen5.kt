package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class screen5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen5)
        val intent4 = Intent(this, screen6::class.java )
        val r: Runnable = object : Runnable {
            override fun run() {
                startActivity(intent4)
            }
        }
        val h = Handler(Looper.getMainLooper())
        h.postDelayed(r, 10000)
    }
}