package com.saidur.mykotline.network.requestbody

data class ReqLogin(
    val mobile: String,
    val password: String,
    val type: Int
)