package com.ascstb.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Manga(
    val title: String,
    val coverUr: String,
    val url: String?,
    val latestChapter: String,
    val latestChapterUrl: String
): Parcelable