package com.example.navdrawer.ui.topassist

import androidx.annotation.DrawableRes
import java.io.Serializable

class Assist (
    @DrawableRes
    val imageResourceId: Int,
    val name: String,
    val team: String,
    val score: String,
    val total: Int,
    val pos: String,
    val jersey: String,
    val height: String,
    val weight: String
) : Serializable