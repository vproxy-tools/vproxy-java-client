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

import vproxy.client.ApiException;
import vproxy.client.model.SmartGroupDelegate;
import vproxy.client.model.SmartGroupDelegateCreate;
import vproxy.client.model.SmartGroupDelegateDetail;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmartGroupDelegateApi
 */
@Ignore
public class SmartGroupDelegateApiTest {

    private final SmartGroupDelegateApi api = new SmartGroupDelegateApi();

    
    /**
     * add smart-group-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSmartGroupDelegateTest() throws ApiException {
        SmartGroupDelegateCreate body = null;
        api.addSmartGroupDelegate(body);

        // TODO: test validations
    }
    
    /**
     * get detailed info of one smart-group-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void describeSmartGroupDelegateTest() throws ApiException {
        String sgd = null;
        SmartGroupDelegateDetail response = api.describeSmartGroupDelegate(sgd);

        // TODO: test validations
    }
    
    /**
     * get smart-group-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmartGroupDelegateTest() throws ApiException {
        String sgd = null;
        SmartGroupDelegate response = api.getSmartGroupDelegate(sgd);

        // TODO: test validations
    }
    
    /**
     * retrieve smart-group-delegate list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSmartGroupDelegateTest() throws ApiException {
        List<SmartGroupDelegate> response = api.listSmartGroupDelegate();

        // TODO: test validations
    }
    
    /**
     * remove smart-group-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSmartGroupDelegateTest() throws ApiException {
        String sgd = null;
        api.removeSmartGroupDelegate(sgd);

        // TODO: test validations
    }
    
}