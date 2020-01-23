/*
 * vproxy
 * The vproxy http controller api.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package vproxy.client.model;

import vproxy.client.ApiCallback;
import vproxy.client.ApiClient;
import vproxy.client.ApiException;
import vproxy.client.ApiResponse;
import vproxy.client.Configuration;
import vproxy.client.Pair;
import vproxy.client.ProgressRequestBody;
import vproxy.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import vproxy.client.model.Error400;
import vproxy.client.model.Error404;
import vproxy.client.model.Error409;
import vproxy.client.model.Error500;
import vproxy.client.model.SmartGroupDelegate;
import vproxy.client.model.SmartGroupDelegateCreate;
import vproxy.client.model.SmartGroupDelegateDetail;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartGroupDelegateApi {
    private ApiClient apiClient;

    public SmartGroupDelegateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmartGroupDelegateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addSmartGroupDelegate
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addSmartGroupDelegateCall(SmartGroupDelegateCreate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/smart-group-delegate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addSmartGroupDelegateValidateBeforeCall(SmartGroupDelegateCreate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addSmartGroupDelegate(Async)");
        }
        

        com.squareup.okhttp.Call call = addSmartGroupDelegateCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * add smart-group-delegate
     * 
     * @param body  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addSmartGroupDelegate(SmartGroupDelegateCreate body) throws ApiException {
        addSmartGroupDelegateWithHttpInfo(body);
    }

    /**
     * add smart-group-delegate
     * 
     * @param body  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addSmartGroupDelegateWithHttpInfo(SmartGroupDelegateCreate body) throws ApiException {
        com.squareup.okhttp.Call call = addSmartGroupDelegateValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * add smart-group-delegate (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addSmartGroupDelegateAsync(SmartGroupDelegateCreate body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addSmartGroupDelegateValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for describeSmartGroupDelegate
     * @param sgd name of the smart-group-delegate (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call describeSmartGroupDelegateCall(String sgd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/smart-group-delegate/{sgd}/detail"
            .replaceAll("\\{" + "sgd" + "\\}", apiClient.escapeString(sgd.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call describeSmartGroupDelegateValidateBeforeCall(String sgd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'sgd' is set
        if (sgd == null) {
            throw new ApiException("Missing the required parameter 'sgd' when calling describeSmartGroupDelegate(Async)");
        }
        

        com.squareup.okhttp.Call call = describeSmartGroupDelegateCall(sgd, progressListener, progressRequestListener);
        return call;

    }

    /**
     * get detailed info of one smart-group-delegate
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @return SmartGroupDelegateDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartGroupDelegateDetail describeSmartGroupDelegate(String sgd) throws ApiException {
        ApiResponse<SmartGroupDelegateDetail> resp = describeSmartGroupDelegateWithHttpInfo(sgd);
        return resp.getData();
    }

    /**
     * get detailed info of one smart-group-delegate
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @return ApiResponse&lt;SmartGroupDelegateDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartGroupDelegateDetail> describeSmartGroupDelegateWithHttpInfo(String sgd) throws ApiException {
        com.squareup.okhttp.Call call = describeSmartGroupDelegateValidateBeforeCall(sgd, null, null);
        Type localVarReturnType = new TypeToken<SmartGroupDelegateDetail>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get detailed info of one smart-group-delegate (asynchronously)
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call describeSmartGroupDelegateAsync(String sgd, final ApiCallback<SmartGroupDelegateDetail> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = describeSmartGroupDelegateValidateBeforeCall(sgd, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartGroupDelegateDetail>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSmartGroupDelegate
     * @param sgd name of the smart-group-delegate (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSmartGroupDelegateCall(String sgd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/smart-group-delegate/{sgd}"
            .replaceAll("\\{" + "sgd" + "\\}", apiClient.escapeString(sgd.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSmartGroupDelegateValidateBeforeCall(String sgd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'sgd' is set
        if (sgd == null) {
            throw new ApiException("Missing the required parameter 'sgd' when calling getSmartGroupDelegate(Async)");
        }
        

        com.squareup.okhttp.Call call = getSmartGroupDelegateCall(sgd, progressListener, progressRequestListener);
        return call;

    }

    /**
     * get smart-group-delegate
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @return SmartGroupDelegate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartGroupDelegate getSmartGroupDelegate(String sgd) throws ApiException {
        ApiResponse<SmartGroupDelegate> resp = getSmartGroupDelegateWithHttpInfo(sgd);
        return resp.getData();
    }

    /**
     * get smart-group-delegate
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @return ApiResponse&lt;SmartGroupDelegate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartGroupDelegate> getSmartGroupDelegateWithHttpInfo(String sgd) throws ApiException {
        com.squareup.okhttp.Call call = getSmartGroupDelegateValidateBeforeCall(sgd, null, null);
        Type localVarReturnType = new TypeToken<SmartGroupDelegate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get smart-group-delegate (asynchronously)
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSmartGroupDelegateAsync(String sgd, final ApiCallback<SmartGroupDelegate> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSmartGroupDelegateValidateBeforeCall(sgd, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartGroupDelegate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listSmartGroupDelegate
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listSmartGroupDelegateCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/smart-group-delegate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listSmartGroupDelegateValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listSmartGroupDelegateCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * retrieve smart-group-delegate list
     * 
     * @return List&lt;SmartGroupDelegate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SmartGroupDelegate> listSmartGroupDelegate() throws ApiException {
        ApiResponse<List<SmartGroupDelegate>> resp = listSmartGroupDelegateWithHttpInfo();
        return resp.getData();
    }

    /**
     * retrieve smart-group-delegate list
     * 
     * @return ApiResponse&lt;List&lt;SmartGroupDelegate&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SmartGroupDelegate>> listSmartGroupDelegateWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listSmartGroupDelegateValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<SmartGroupDelegate>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * retrieve smart-group-delegate list (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSmartGroupDelegateAsync(final ApiCallback<List<SmartGroupDelegate>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listSmartGroupDelegateValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SmartGroupDelegate>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeSmartGroupDelegate
     * @param sgd name of the smart-group-delegate (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeSmartGroupDelegateCall(String sgd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/smart-group-delegate/{sgd}"
            .replaceAll("\\{" + "sgd" + "\\}", apiClient.escapeString(sgd.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeSmartGroupDelegateValidateBeforeCall(String sgd, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'sgd' is set
        if (sgd == null) {
            throw new ApiException("Missing the required parameter 'sgd' when calling removeSmartGroupDelegate(Async)");
        }
        

        com.squareup.okhttp.Call call = removeSmartGroupDelegateCall(sgd, progressListener, progressRequestListener);
        return call;

    }

    /**
     * remove smart-group-delegate
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeSmartGroupDelegate(String sgd) throws ApiException {
        removeSmartGroupDelegateWithHttpInfo(sgd);
    }

    /**
     * remove smart-group-delegate
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeSmartGroupDelegateWithHttpInfo(String sgd) throws ApiException {
        com.squareup.okhttp.Call call = removeSmartGroupDelegateValidateBeforeCall(sgd, null, null);
        return apiClient.execute(call);
    }

    /**
     * remove smart-group-delegate (asynchronously)
     * 
     * @param sgd name of the smart-group-delegate (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeSmartGroupDelegateAsync(String sgd, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = removeSmartGroupDelegateValidateBeforeCall(sgd, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
