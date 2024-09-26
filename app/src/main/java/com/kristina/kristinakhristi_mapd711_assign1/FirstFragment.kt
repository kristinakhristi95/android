package com.kristina.kristinakhristi_mapd711_assign1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kristina.kristinakhristi_mapd711_assign1.databinding.FragmentFirstBinding


class FirstFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)

        val fullNameText = findViewById<TextView>(R.id.fullNameText)
        val addressText = findViewById<TextView>(R.id.addressText)
        val professionText = findViewById<TextView>(R.id.professionText)
        val dreamJobText = findViewById<TextView>(R.id.dreamJobText)
        val favoriteFoodText = findViewById<TextView>(R.id.favoriteFoodText)

        val fullName = intent.getStringExtra("fullName")
        val address = intent.getStringExtra("address")
        val profession = intent.getStringExtra("profession")
        val dreamJob = intent.getStringExtra("dreamJob")
        val favoriteFood = intent.getStringExtra("favoriteFood")

        fullNameText.text = "Full Name: $fullName"
        addressText.text = "Address: $address"
        professionText.text = "Profession: $profession"
        dreamJobText.text = "Dream Job: $dreamJob"
        favoriteFoodText.text = "Favorite Food: $favoriteFood"
    }
}

//class FirstFragment : Fragment() {
//    private lateinit var binding: FragmentFirstBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.d("FirstFragment", "onCreate invoked!")
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FragmentFirstBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.d("FirstFragment", "onStart invoked!")
//        binding.tvLifecycle.text = "onStart invoked!"
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("FirstFragment", "onResume invoked!")
//        binding.tvLifecycle.text = "onResume invoked!"
//    }

//    override fun onPause() {
//        super.onPause()
//        Log.d("FirstFragment", "onPause invoked!")
//    }
//}
