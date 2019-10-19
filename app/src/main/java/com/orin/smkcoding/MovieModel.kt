package com.orin.smkcoding

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class MovieModel (
@Parcelize
    var title: String? = null,

    var rating: Int? = null,

    var image: String? = null,

    var description: String? = null

) : Parcelable