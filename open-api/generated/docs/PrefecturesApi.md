# PrefecturesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrefectures**](PrefecturesApi.md#getPrefectures) | **GET** /prefectures | List all prefectures


<a name="getPrefectures"></a>
# **getPrefectures**
> kotlin.collections.List&lt;Prefecture&gt; getPrefectures()

List all prefectures

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PrefecturesApi()
try {
    val result : kotlin.collections.List<Prefecture> = apiInstance.getPrefectures()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PrefecturesApi#getPrefectures")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PrefecturesApi#getPrefectures")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Prefecture&gt;**](Prefecture.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

