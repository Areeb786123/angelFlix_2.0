package com.areeb.angelflix_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.areeb.angelflix_20.Fragments.Category
import com.areeb.angelflix_20.Fragments.Profile
import com.areeb.angelflix_20.Fragments.homeFragment
import com.areeb.angelflix_20.Fragments.searchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nav = findViewById<BottomNavigationView>(R.id.nav)
        loadFragment(homeFragment())
        nav.setOnNavigationItemSelectedListener {
            when {
                it.itemId == R.id.Home -> {
                    loadFragment(homeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                it.itemId == R.id.Search -> {
                    loadFragment(searchFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                it.itemId == R.id.Category -> {
                    loadFragment(Category())
                    return@setOnNavigationItemSelectedListener true
                }
                it.itemId == R.id.Profile -> {
                    loadFragment(Profile())
                    return@setOnNavigationItemSelectedListener true
                }

            }
            true

        }


    }

    private fun loadFragment(fragment: Fragment) {
        val change = supportFragmentManager.beginTransaction()
        change.replace(R.id.fragment_container, fragment)
        change.commit()

    }

}
