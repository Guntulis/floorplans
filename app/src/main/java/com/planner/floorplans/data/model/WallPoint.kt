package com.planner.floorplans.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WallPoint(

    @SerializedName("x")
    @Expose
    var x: Float? = null,

    @SerializedName("y")
    @Expose
    var y: Float? = null
)