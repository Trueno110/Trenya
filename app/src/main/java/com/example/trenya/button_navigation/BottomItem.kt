package com.example.trenya.button_navigation

import android.icu.text.CaseMap.Title
import com.example.trenya.R

sealed class BottomItem(val title: String, val iconId : Int ,val route: String) {
    object Screen1: BottomItem("Screen 1", R.drawable.derzhidomik, "screen_1" )
    object Screen2: BottomItem("Screen 2", R.drawable.gantelya, "screen_2")
    object Screen3: BottomItem("Screen 3", R.drawable.chuvaaaac, "screen_3")
}