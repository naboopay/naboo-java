# openapi-java-client

NabooApi V1

Here you have the first version of the naboo api to create checkout automatically




## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:0.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      GetAccountResponse result = apiInstance.getAccountInformationAccountGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getAccountInformationAccountGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to */api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getAccountInformationAccountGet**](docs/AccountApi.md#getAccountInformationAccountGet) | **GET** /account/ | Get Account Information
*CashoutApi* | [**cashOutOrangeMoneyCashoutOrangeMoneyPost**](docs/CashoutApi.md#cashOutOrangeMoneyCashoutOrangeMoneyPost) | **POST** /cashout/orange-money | Cash Out Orange Money
*CashoutApi* | [**cashOutWaveCashoutWavePost**](docs/CashoutApi.md#cashOutWaveCashoutWavePost) | **POST** /cashout/wave | Cash Out Wave
*TransactionApi* | [**createTransactionTransactionCreateTransactionPost**](docs/TransactionApi.md#createTransactionTransactionCreateTransactionPost) | **PUT** /transaction/create-transaction | Create Transaction
*TransactionApi* | [**deleteTransactionTransactionDeleteTransactionDelete**](docs/TransactionApi.md#deleteTransactionTransactionDeleteTransactionDelete) | **DELETE** /transaction/delete-transaction | Delete Transaction
*TransactionApi* | [**getOneTransactionTransactionGetOneTransactionGet**](docs/TransactionApi.md#getOneTransactionTransactionGetOneTransactionGet) | **GET** /transaction/get-one-transaction | Get One Transaction
*TransactionApi* | [**getTransactionsTransactionGetTransactionsGet**](docs/TransactionApi.md#getTransactionsTransactionGetTransactionsGet) | **GET** /transaction/get-transactions | Get Transactions


## Documentation for Models

 - [CashOutOrangeRequest](docs/CashOutOrangeRequest.md)
 - [CashOutResponse](docs/CashOutResponse.md)
 - [CashOutWaveRequest](docs/CashOutWaveRequest.md)
 - [DeleteTransactionRequest](docs/DeleteTransactionRequest.md)
 - [DeleteTransactionResponse](docs/DeleteTransactionResponse.md)
 - [GetAccountResponse](docs/GetAccountResponse.md)
 - [GetAllTransaction](docs/GetAllTransaction.md)
 - [GetOneTransaction](docs/GetOneTransaction.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [ProductModel](docs/ProductModel.md)
 - [TransactionRequest](docs/TransactionRequest.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionStatusEnum](docs/TransactionStatusEnum.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorLocInner](docs/ValidationErrorLocInner.md)
 - [Wallet](docs/Wallet.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="HTTPBearer"></a>
### HTTPBearer

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

