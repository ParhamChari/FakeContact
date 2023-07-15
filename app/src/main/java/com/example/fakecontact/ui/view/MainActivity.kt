package com.example.fakecontact.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.fakecontact.R
import com.example.fakecontact.data.model.ContactModel
import com.example.fakecontact.databinding.ActivityMainBinding
import com.example.fakecontact.ui.adapter.ContactAdapter
import com.example.fakecontact.ui.listener.ContactClickListener
import com.example.fakecontact.utils.FakeData

class MainActivity : AppCompatActivity(), ContactClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ContactAdapter

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindViews()
    }

    private fun bindViews() {
        recyclerView = binding.recyclerview

        adapter = ContactAdapter(FakeData.contactData, this)
        recyclerView.adapter = adapter
    }

    override fun setOnClickListener(model: ContactModel) {

        val intent = Intent(this,ContactDetailsActivity::class.java)
        intent.putExtra("NAME", model.contactName)
        intent.putExtra("IMAGE", model.ImageURI)
        startActivity(intent)
    }
}