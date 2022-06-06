package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton: Button = findViewById(R.id.button)
        startButton.setOnClickListener {
            val intent = Intent (this, screen2::class.java)
            startActivity (intent)
        }

    }
}