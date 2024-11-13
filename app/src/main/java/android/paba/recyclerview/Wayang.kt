package android.paba.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wayang(
    var foto : String,
    var nama : String,
    var karakter : String,
    var deskripsi : String,

):Parcelable
