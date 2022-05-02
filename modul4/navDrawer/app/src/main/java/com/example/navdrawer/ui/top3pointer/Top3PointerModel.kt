package com.example.navdrawer.ui.top3pointer

import androidx.annotation.DrawableRes
import java.io.Serializable

class Top3PointerModel (
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