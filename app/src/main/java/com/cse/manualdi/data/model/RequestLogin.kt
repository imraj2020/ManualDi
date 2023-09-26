package com.cse.manualdi.data.model

import com.google.gson.annotations.SerializedName

data class RequestLogin(
    @SerializedName("email")
    var email: String?,
    @SerializedName("password")
    var password: String?
)
