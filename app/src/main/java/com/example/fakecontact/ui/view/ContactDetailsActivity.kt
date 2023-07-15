package com.example.fakecontact.ui.view

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.fakecontact.R
import com.example.fakecontact.databinding.ActivityContactDetailsBinding
import com.example.fakecontact.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class ContactDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityContactDetailsBinding
    lateinit var name: TextView
    lateinit var image: CircleImageView

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