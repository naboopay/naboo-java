# CashoutApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cashOutOrangeMoneyCashoutOrangeMoneyPost**](CashoutApi.md#cashOutOrangeMoneyCashoutOrangeMoneyPost) | **POST** /cashout/orange-money | Cash Out Orange Money |
| [**cashOutWaveCashoutWavePost**](CashoutApi.md#cashOutWaveCashoutWavePost) | **POST** /cashout/wave | Cash Out Wave |


<a id="cashOutOrangeMoneyCashoutOrangeMoneyPost"></a>
# **cashOutOrangeMoneyCashoutOrangeMoneyPost**
> CashOutResponse cashOutOrangeMoneyCashoutOrangeMoneyPost(cashOutOrangeRequest)

Cash Out Orange Money

This endpoint enables a user to withdraw funds from their NabooPay account to their Orange Money account. Authentication is required, and users with the &#39;dev&#39; role are not permitted to perform this operation. The amount to be withdrawn must be positive and within the user&#39;s available balance. The user&#39;s account must be active and registered in the system. After validation, the user&#39;s account balance is adjusted accordingly, and the transaction is logged for record-keeping.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    CashoutApi apiInstance = new CashoutApi(defaultClient);
    CashOutOrangeRequest cashOutOrangeRequest = new CashOutOrangeRequest(); // CashOutOrangeRequest | 
    try {
      CashOutResponse result = apiInstance.cashOutOrangeMoneyCashoutOrangeMoneyPost(cashOutOrangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CashoutApi#cashOutOrangeMoneyCashoutOrangeMoneyPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cashOutOrangeRequest** | [**CashOutOrangeRequest**](CashOutOrangeRequest.md)|  | |

### Return type

[**CashOutResponse**](CashOutResponse.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request was invalid or malformed. |  -  |
| **401** | The user is not authorized to make this request. |  -  |
| **403** | The user does not have permission to access this resource. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected internal server error occurred. |  -  |
| **422** | Validation Error |  -  |

<a id="cashOutWaveCashoutWavePost"></a>
# **cashOutWaveCashoutWavePost**
> CashOutResponse cashOutWaveCashoutWavePost(cashOutWaveRequest)

Cash Out Wave

This endpoint allows a user to withdraw funds from their NabooPay account to their Wave account. The user must be authenticated and not possess the &#39;dev&#39; role. The withdrawal amount must be greater than 10 and not exceed the user&#39;s account balance. The user&#39;s account must exist and be active. Upon successful validation, the system updates the user&#39;s account balance and records the transaction for tracking purposes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    CashoutApi apiInstance = new CashoutApi(defaultClient);
    CashOutWaveRequest cashOutWaveRequest = new CashOutWaveRequest(); // CashOutWaveRequest | 
    try {
      CashOutResponse result = apiInstance.cashOutWaveCashoutWavePost(cashOutWaveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CashoutApi#cashOutWaveCashoutWavePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cashOutWaveRequest** | [**CashOutWaveRequest**](CashOutWaveRequest.md)|  | |

### Return type

[**CashOutResponse**](CashOutResponse.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request was invalid or malformed. |  -  |
| **401** | The user is not authorized to make this request. |  -  |
| **403** | The user does not have permission to access this resource. |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | An unexpected internal server error occurred. |  -  |
| **422** | Validation Error |  -  |

