package com.sdkwork.ai

data class Categories(
    val hate: Boolean? = null,
    val sexual: Boolean? = null,
    val violence: Boolean? = null,
    val hateThreatening: Boolean? = null,
    val selfHarm: Boolean? = null,
    val sexualMinors: Boolean? = null,
    val violenceGraphic: Boolean? = null,
    val illegalAct: Boolean? = null,
    val illegalActInstruction: Boolean? = null
)
