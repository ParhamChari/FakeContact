package com.example.fakecontact.utils

import android.app.Application
import android.content.Context
import android.provider.Settings.Global.getString
import com.example.fakecontact.R
import com.example.fakecontact.data.model.ContactModel

object FakeData {

    val contactData = arrayListOf(
        ContactModel("Contact 1","https://www.pngall.com/wp-content/uploads/12/Avatar-No-Background.png"),
        ContactModel("Contact 2","https://thumbs.dreamstime.com/b/businessman-vector-icon-avatar-sign-man-business-suit-male-face-flat-design-man-avatars-profile-concept-concept-boss-85517342.jpg"),
        ContactModel("Contact 3","https://png.pngtree.com/png-vector/20191101/ourmid/pngtree-male-avatar-simple-cartoon-design-png-image_1934458.jpg"),
        ContactModel("Contact 4","https://thumbs.dreamstime.com/z/unknown-male-avatar-profile-image-businessman-vector-unknown-male-avatar-profile-image-businessman-vector-profile-179373829.jpg"),
        ContactModel("Contact 5","https://thumbs.dreamstime.com/b/user-icon-male-hipster-avatar-vector-flat-design-user-icon-male-beard-icon-hipster-flat-icon-avatar-man-beard-flat-99281046.jpg"),
        ContactModel("Contact 6","https://thumbs.dreamstime.com/b/happy-smiling-geek-hipster-beard-man-cool-avatar-geek-man-avatar-104871313.jpg"),
        ContactModel("Contact 7","https://www.pngall.com/wp-content/uploads/12/Avatar-No-Background.png"),
        ContactModel("Contact 8","https://png.pngtree.com/png-vector/20191101/ourmid/pngtree-male-avatar-simple-cartoon-design-png-image_1934458.jpg"),
        ContactModel("Contact 9","https://thumbs.dreamstime.com/b/happy-smiling-geek-hipster-beard-man-cool-avatar-geek-man-avatar-104871313.jpg"),
        ContactModel("Contact 10","https://thumbs.dreamstime.com/b/businessman-vector-icon-avatar-sign-man-business-suit-male-face-flat-design-man-avatars-profile-concept-concept-boss-85517342.jpg"),
        ContactModel("Contact 11","https://thumbs.dreamstime.com/b/user-icon-male-hipster-avatar-vector-flat-design-user-icon-male-beard-icon-hipster-flat-icon-avatar-man-beard-flat-99281046.jpg"),
        ContactModel("Contact 12","https://thumbs.dreamstime.com/z/unknown-male-avatar-profile-image-businessman-vector-unknown-male-avatar-profile-image-businessman-vector-profile-179373829.jpg"),
        ContactModel("Contact 13","https://thumbs.dreamstime.com/b/businessman-vector-icon-avatar-sign-man-business-suit-male-face-flat-design-man-avatars-profile-concept-concept-boss-85517342.jpg")
    )
}