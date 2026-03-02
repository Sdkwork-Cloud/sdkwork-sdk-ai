package com.sdkwork.ai

data class CategoryScores(
    val hate: Double? = null,
    val sexual: Double? = null,
    val violence: Double? = null,
    val hateThreatening: Double? = null,
    val selfHarm: Double? = null,
    val sexualMinors: Double? = null,
    val violenceGraphic: Double? = null,
    val illegalAct: Double? = null,
    val illegalActInstruction: Double? = null
)
