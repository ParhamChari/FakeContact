package com.example.fakecontact.ui.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.fakecontact.data.model.ContactModel
import com.example.fakecontact.databinding.ActivityMainBinding
import com.example.fakecontact.databinding.ContactItemBinding
import com.example.fakecontact.ui.listener.ContactClickListener
import com.squareup.picasso.Picasso

class ContactViewHolder(private val binding: ContactItemBinding) : ViewHolder(binding.root) {

    private var name = binding.contactName
    private var image = binding.image
    private var constraintLayout = binding.parent

    fun bindDataViews(model: ContactModel, clickListener: ContactClickListener) {
        name.text = model.contactName
        Picasso.get().load(model.ImageURI).into(image)

        constraintLayout.setOnClickListener {
            clickListener.setOnClickListener(model)
        }
    }
}