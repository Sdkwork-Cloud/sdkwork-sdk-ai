package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class I18nResourceApi(private val client: HttpClient) {

    suspend fun getOptions(params: Map<String, Any>? = null): PlusApiResultListLabelOption? {
        return client.get(ApiPaths.aiPath("/v1/open/i18n/options"), params) as? PlusApiResultListLabelOption
    }

    suspend fun createOptions(params: Map<String, Any>? = null): PlusApiResultListLabelOption? {
        return client.post(ApiPaths.aiPath("/v1/open/i18n/options"), null, params) as? PlusApiResultListLabelOption
    }
}
