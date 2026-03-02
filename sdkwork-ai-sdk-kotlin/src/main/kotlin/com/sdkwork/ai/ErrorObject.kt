package com.sdkwork.ai

data class ErrorObject(
    val code: String? = null,
    val message: String? = null,
    val line: Int? = null,
    val param: String? = null
)
