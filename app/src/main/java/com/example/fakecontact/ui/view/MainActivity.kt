package com.example.fakecontact.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.fakecontact.data.Listener.ContactClickListener
import com.example.fakecontact.data.model.ContactModel
import com.example.fakecontact.databinding.ActivityMainBinding
import com.example.fakecontact.ui.adapter.ContactAdapter
import com.example.fakecontact.utils.FakeData

class MainActivity : AppCompatActivity(), ContactClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ContactAdapter

    private lateinit var recyclerView: RecyclerView

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