package app.one.waifulist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Waifu(
    @StringRes val stringResourceId : Int,
    @DrawableRes val imageResourceId : Int){
}