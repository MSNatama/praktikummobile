package com.example.navdrawer.ui.topscorer

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize
import java.io.Serializable

class Scorer (
    @DrawableRes
    val imageResourceId: Int,
    var name: String = "",
    var team: String,
    var score: String,
    var total: Int,
    var pos: String,
    var jersey: String,
    var height: String,
    var weight: String
)




