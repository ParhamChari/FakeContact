package com.example.fakecontact.data.Listener

import com.example.fakecontact.data.model.ContactModel

interface ContactClickListener {
    fun setOnClickListener(model : ContactModel)
}