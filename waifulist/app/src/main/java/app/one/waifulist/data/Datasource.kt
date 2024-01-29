package app.one.waifulist.data

import app.one.waifulist.R
import app.one.waifulist.model.Waifu

class Datasource {

    fun loadWaifus() : List<Waifu>{
        return listOf<Waifu>(
            Waifu(R.string.waifu1,R.drawable.image1),
            Waifu(R.string.waifu2,R.drawable.image2),
            Waifu(R.string.waifu3,R.drawable.image3),
            Waifu(R.string.waifu4,R.drawable.image4),
            Waifu(R.string.waifu5,R.drawable.image5),
            Waifu(R.string.waifu6,R.drawable.image6),
            Waifu(R.string.waifu7,R.drawable.image7),
            Waifu(R.string.waifu8,R.drawable.image8),
            Waifu(R.string.waifu9,R.drawable.image9),
            Waifu(R.string.waifu10,R.drawable.image10)
        )
    }
}