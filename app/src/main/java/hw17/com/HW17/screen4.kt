package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class screen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)
        val intent3 = Intent(this, screen5::class.java )
        val r: Runnable = object : Runnable {
            override fun run() {
                startActivity(intent3)
            }
        }
        val h = Handler(Looper.getMainLooper())
        h.postDelayed(r, 10000)
    }
}