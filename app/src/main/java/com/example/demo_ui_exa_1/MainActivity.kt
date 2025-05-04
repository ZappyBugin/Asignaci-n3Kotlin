package com.example.demo_ui_exa_1

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_option1 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, FragmentOption1())
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.action_option2 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, FragmentOption2())
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.action_option3 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, FragmentOption3())
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.action_option4 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, FragmentOption4())
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.action_option5 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, FragmentOption5())
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.action_option6 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, FragmentOption6())
                    addToBackStack(null)
                    commit()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}