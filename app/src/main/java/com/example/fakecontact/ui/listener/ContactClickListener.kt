package com.example.fakecontact.ui.listener

import com.example.fakecontact.data.model.ContactModel

interface ContactClickListener {
    fun setOnClickListener(model : ContactModel)
}