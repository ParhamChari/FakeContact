package com.example.fakecontact.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.fakecontact.databinding.ActivityContactDetailsBinding
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class ContactDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactDetailsBinding
    lateinit var name: TextView
    private lateinit var image: CircleImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        name = binding.name
        image = binding.contactImage

        val contactName = intent.extras!!.getString("NAME")
        val imageURI = intent.extras!!.getString("IMAGE")

        name.text = contactName
        Picasso.get().load(imageURI).into(image)

    }
}