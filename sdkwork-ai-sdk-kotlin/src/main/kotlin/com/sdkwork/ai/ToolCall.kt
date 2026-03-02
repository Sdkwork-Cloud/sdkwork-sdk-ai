package com.sdkwork.ai

data class ToolCall(
    val id: String? = null,
    val type: String? = null,
    val function: FunctionCall? = null
)
