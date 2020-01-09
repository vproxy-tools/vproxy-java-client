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
import vproxy.client.model.SmartNodeDelegate;
import vproxy.client.model.SmartNodeDelegateCreate;
import vproxy.client.model.SmartNodeDelegateDetail;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmartNodeDelegateApi
 */
@Ignore
public class SmartNodeDelegateApiTest {

    private final SmartNodeDelegateApi api = new SmartNodeDelegateApi();

    
    /**
     * add smart-node-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSmartNodeDelegateTest() throws ApiException {
        SmartNodeDelegateCreate body = null;
        api.addSmartNodeDelegate(body);

        // TODO: test validations
    }
    
    /**
     * get detailed info of one smart-node-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void describeSmartNodeDelegateTest() throws ApiException {
        String snd = null;
        SmartNodeDelegateDetail response = api.describeSmartNodeDelegate(snd);

        // TODO: test validations
    }
    
    /**
     * get smart-node-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmartNodeDelegateTest() throws ApiException {
        String snd = null;
        SmartNodeDelegate response = api.getSmartNodeDelegate(snd);

        // TODO: test validations
    }
    
    /**
     * retrieve smart-node-delegate list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSmartNodeDelegateTest() throws ApiException {
        List<SmartNodeDelegate> response = api.listSmartNodeDelegate();

        // TODO: test validations
    }
    
    /**
     * remove smart-node-delegate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSmartNodeDelegateTest() throws ApiException {
        String snd = null;
        api.removeSmartNodeDelegate(snd);

        // TODO: test validations
    }
    
}
