package com.alexlyxy.alexnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.alexlyxy.alexnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            nv.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.item1 -> {
                        //Here can be many line posssible
                        Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT)
                            .show() //Only one line
                        Toast.makeText(this@MainActivity, "Item 2", Toast.LENGTH_SHORT)
                            .show() //Only one line
                        Toast.makeText(this@MainActivity, "Item 3", Toast.LENGTH_SHORT)
                            .show() //Only one line
                    }

                    R.id.item2 ->
                        Toast.makeText(this@MainActivity, "Item 02", Toast.LENGTH_SHORT)
                            .show() //Only one line

                    R.id.item3 ->
                        Toast.makeText(this@MainActivity, "Item 03", Toast.LENGTH_SHORT)
                            .show() //Only one line

                    R.id.item4 ->
                        Toast.makeText(this@MainActivity, "Item 04", Toast.LENGTH_SHORT)
                            .show() //Only one line
                }
                drawer.closeDrawer(GravityCompat.START)    // After clicking button Navigation will be closed
                true
            }
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
                //drawer.closeDrawer(GravityCompat.START)
            }
        }
    }
}