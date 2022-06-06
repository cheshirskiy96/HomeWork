package hw17.com.HW17

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        val intent = Intent(this, Screen3Activity::class.java)
        val r: Runnable = object : Runnable {
            override fun run() {
                startActivity(intent)
            }
        }
        val h = Handler(Looper.getMainLooper())
        h.postDelayed(r, 10000)
    }

}