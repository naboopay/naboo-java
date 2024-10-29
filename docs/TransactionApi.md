# TransactionApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransactionTransactionCreateTransactionPost**](TransactionApi.md#createTransactionTransactionCreateTransactionPost) | **PUT** /transaction/create-transaction | Create Transaction |
| [**deleteTransactionTransactionDeleteTransactionDelete**](TransactionApi.md#deleteTransactionTransactionDeleteTransactionDelete) | **DELETE** /transaction/delete-transaction | Delete Transaction |
| [**getOneTransactionTransactionGetOneTransactionGet**](TransactionApi.md#getOneTransactionTransactionGetOneTransactionGet) | **GET** /transaction/get-one-transaction | Get One Transaction |
| [**getTransactionsTransactionGetTransactionsGet**](TransactionApi.md#getTransactionsTransactionGetTransactionsGet) | **GET** /transaction/get-transactions | Get Transactions |


<a id="createTransactionTransactionCreateTransactionPost"></a>
# **createTransactionTransactionCreateTransactionPost**
> TransactionResponse createTransactionTransactionCreateTransactionPost(transactionRequest)

Create Transaction

This endpoint allows authenticated users to create a transaction by submitting a request with the necessary details. The endpoint ensures that the user&#39;s access level permits transaction creation and enforces a rate limit of 30 requests. It checks that the number of products is within the allowed range (1-20) and calculates the total transaction amount, applying a 20% charge for escrow transactions. It also verifies that the total amount does not exceed a specific threshold (2,000,000). The user&#39;s IP address and browser information are logged, and the transaction details are saved with relevant metadata, including a unique order ID and the associated account state. If any conditions are not met, appropriate error messages are returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    TransactionRequest transactionRequest = new TransactionRequest(); // TransactionRequest | 
    try {
      TransactionResponse result = apiInstance.createTransactionTransactionCreateTransactionPost(transactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createTransactionTransactionCreateTransactionPost");
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
| **transactionRequest** | [**TransactionRequest**](TransactionRequest.md)|  | |

### Return type

[**TransactionResponse**](TransactionResponse.md)

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

<a id="deleteTransactionTransactionDeleteTransactionDelete"></a>
# **deleteTransactionTransactionDeleteTransactionDelete**
> DeleteTransactionResponse deleteTransactionTransactionDeleteTransactionDelete(deleteTransactionRequest)

Delete Transaction

This endpoint allows authenticated users to delete a transaction by submitting a request with the necessary details. The endpoint checks the user&#39;s access level to ensure they have permission to delete transactions and enforces a rate limit of 30 requests. It verifies that the transaction belongs to the user and has not already been deleted or withdrawn. If the transaction is paid and has a payment reference, it processes refunds and updates the user&#39;s account balance accordingly.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    DeleteTransactionRequest deleteTransactionRequest = new DeleteTransactionRequest(); // DeleteTransactionRequest | 
    try {
      DeleteTransactionResponse result = apiInstance.deleteTransactionTransactionDeleteTransactionDelete(deleteTransactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#deleteTransactionTransactionDeleteTransactionDelete");
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
| **deleteTransactionRequest** | [**DeleteTransactionRequest**](DeleteTransactionRequest.md)|  | |

### Return type

[**DeleteTransactionResponse**](DeleteTransactionResponse.md)

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

<a id="getOneTransactionTransactionGetOneTransactionGet"></a>
# **getOneTransactionTransactionGetOneTransactionGet**
> GetOneTransaction getOneTransactionTransactionGetOneTransactionGet(orderId)

Get One Transaction

This endpoint allows authenticated users to retrieve the details of a specific transaction using the order ID. The endpoint ensures the user has read access and enforces a rate limit of 30 requests. It checks if the transaction exists in the database and if the user has the appropriate access rights,then provides a checkout URL for the transaction and others informations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String orderId = "orderId_example"; // String | 
    try {
      GetOneTransaction result = apiInstance.getOneTransactionTransactionGetOneTransactionGet(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getOneTransactionTransactionGetOneTransactionGet");
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
| **orderId** | **String**|  | |

### Return type

[**GetOneTransaction**](GetOneTransaction.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getTransactionsTransactionGetTransactionsGet"></a>
# **getTransactionsTransactionGetTransactionsGet**
> GetAllTransaction getTransactionsTransactionGetTransactionsGet()

Get Transactions

This endpoint allows authenticated users to retrieve a list of their visible transactions, up to a maximum of 50. The endpoint enforces a rate limit of 30 requests and ensures the user has read access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    try {
      GetAllTransaction result = apiInstance.getTransactionsTransactionGetTransactionsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getTransactionsTransactionGetTransactionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAllTransaction**](GetAllTransaction.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
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

