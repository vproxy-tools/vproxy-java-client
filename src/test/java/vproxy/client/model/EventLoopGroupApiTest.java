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
import vproxy.client.model.EventLoopGroup;
import vproxy.client.model.EventLoopGroupCreate;
import vproxy.client.model.EventLoopGroupDetail;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventLoopGroupApi
 */
@Ignore
public class EventLoopGroupApiTest {

    private final EventLoopGroupApi api = new EventLoopGroupApi();

    
    /**
     * add event-loop-group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEventLoopGroupTest() throws ApiException {
        EventLoopGroupCreate body = null;
        api.addEventLoopGroup(body);

        // TODO: test validations
    }
    
    /**
     * get detailed info of one event-loop-group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void describeEventLoopGroupTest() throws ApiException {
        String elg = null;
        EventLoopGroupDetail response = api.describeEventLoopGroup(elg);

        // TODO: test validations
    }
    
    /**
     * get event-loop-group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventLoopGroupTest() throws ApiException {
        String elg = null;
        EventLoopGroup response = api.getEventLoopGroup(elg);

        // TODO: test validations
    }
    
    /**
     * retrieve event-loop-group list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEventLoopGroupTest() throws ApiException {
        List<EventLoopGroup> response = api.listEventLoopGroup();

        // TODO: test validations
    }
    
    /**
     * remove event-loop-group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeEventLoopGroupTest() throws ApiException {
        String elg = null;
        api.removeEventLoopGroup(elg);

        // TODO: test validations
    }
    
}
