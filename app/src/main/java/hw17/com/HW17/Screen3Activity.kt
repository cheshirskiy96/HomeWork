package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Screen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen3)
        val intent2 = Intent(this,screen4::class.java)
        val r: Runnable = object : Runnable {
            override fun run() {
                startActivity(intent2)
            }
        }
        val h = Handler(Looper.getMainLooper())
        h.postDelayed(r, 10000)
    }
}