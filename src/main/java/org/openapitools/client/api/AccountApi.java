/*
 * NabooApi V1
 * Here you have the first version of the naboo api to create checkout automatically
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.GetAccountResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getAccountInformationAccountGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid or malformed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The user is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The user does not have permission to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccountInformationAccountGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccountInformationAccountGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAccountInformationAccountGetCall(_callback);

    }

    /**
     * Get Account Information
     * 
     * @return GetAccountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid or malformed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The user is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The user does not have permission to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetAccountResponse getAccountInformationAccountGet() throws ApiException {
        ApiResponse<GetAccountResponse> localVarResp = getAccountInformationAccountGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Account Information
     * 
     * @return ApiResponse&lt;GetAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid or malformed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The user is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The user does not have permission to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetAccountResponse> getAccountInformationAccountGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAccountInformationAccountGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetAccountResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Account Information (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid or malformed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The user is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The user does not have permission to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccountInformationAccountGetAsync(final ApiCallback<GetAccountResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccountInformationAccountGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetAccountResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
