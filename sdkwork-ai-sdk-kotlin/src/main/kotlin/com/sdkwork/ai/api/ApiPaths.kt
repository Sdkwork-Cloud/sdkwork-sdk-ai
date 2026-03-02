package com.sdkwork.ai.api

object ApiPaths {
    const val API_PREFIX = "/ai/v3"
    
    fun aiPath(path: String = ""): String {
        if (path.isEmpty()) return API_PREFIX
        if (path.startsWith("http://") || path.startsWith("https://")) return path

        var normalizedPrefix = API_PREFIX.trim()
        normalizedPrefix = if (normalizedPrefix.isNotEmpty() && normalizedPrefix != "/") {
            "/" + normalizedPrefix.trim('/')
        } else {
            ""
        }

        val normalizedPath = if (path.startsWith("/")) path else "/$path"
        if (normalizedPrefix.isEmpty()) return normalizedPath
        if (normalizedPath == normalizedPrefix || normalizedPath.startsWith("$normalizedPrefix/")) {
            return normalizedPath
        }
        return normalizedPrefix + normalizedPath
    }
}
