package hw17.com.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class screen21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen21)
        val toSignUp: Button = findViewById (R.id.buttonToSignUp)
        val intent7 = Intent(this, screen21::class.java)
        startActivity(intent7)
    }
}