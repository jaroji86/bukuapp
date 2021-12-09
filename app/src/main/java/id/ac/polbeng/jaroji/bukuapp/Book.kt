package id.ac.polbeng.jaroji.bukuapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book (
    var title : String = "",
    var detail : String = "",
    var author : String = "",
    var publiser : String ="",
    var publish_year : Int = 0,
    var img_cover : Int = 0,
    var url: String = ""
    ): Parcelable