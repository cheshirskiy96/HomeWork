package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class screen7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen7)
        val logButton: Button = findViewById(R.id.buttonToLog)
        logButton.setOnClickListener {
            val intent6 = Intent(this, screen21::class.java)
            startActivity(intent6)
        }
    }
}