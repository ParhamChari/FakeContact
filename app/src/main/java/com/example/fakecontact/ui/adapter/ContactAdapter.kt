package com.example.fakecontact.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.fakecontact.data.model.ContactModel
import com.example.fakecontact.databinding.ContactItemBinding
import com.example.fakecontact.ui.listener.ContactClickListener

class ContactAdapter(
    private val models: List<ContactModel>,
    private val clickListener: ContactClickListener
) :
    Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder =
        ContactViewHolder(
            ContactItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bindDataViews(models[position], clickListener)
    }

    override fun getItemCount(): Int =
        models.size


}