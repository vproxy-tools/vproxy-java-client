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

import org.junit.Before;
import org.junit.Test;
import vproxy.client.ApiException;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.List;

import static org.junit.Assert.*;
import static vproxy.client.TestUtils.randomName;

/**
 * API tests for SmartNodeDelegateApi
 */
public class SmartNodeDelegateApiTest {

    private final SmartNodeDelegateApi api = new SmartNodeDelegateApi();
    private String name;
    private String nic;

    @Before
    public void setUp() throws Exception {
        name = randomName("snd");
        nic = NetworkInterface.getByInetAddress(InetAddress.getByName("127.0.0.1")).getName();
    }

    private void addSmartNodeDelegate() throws ApiException {
        SmartNodeDelegateCreate req = new SmartNodeDelegateCreate();
        req.setName(name);
        req.setService("my-service");
        req.setZone("zone0");
        req.setWeight(10);
        req.setExposedPort(8080);
        req.setNic(nic);
        req.setIpType(IPType.V4);
        api.addSmartNodeDelegate(req);
    }

    /**
     * add smart-node-delegate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSmartNodeDelegateTest() throws ApiException {
        int oldLen = api.listSmartNodeDelegate().size();

        addSmartNodeDelegate();

        List<SmartNodeDelegate> sndList = api.listSmartNodeDelegate();
        assertEquals(oldLen + 1, sndList.size());
        SmartNodeDelegate snd = api.getSmartNodeDelegate(name);
        assertTrue(sndList.contains(snd));
        assertEquals(name, snd.getName());
        assertEquals("my-service", snd.getService());
        assertEquals("zone0", snd.getZone());
        assertEquals(10, snd.getWeight().intValue());
        assertEquals(8080, snd.getExposedPort().intValue());
        assertEquals(nic, snd.getNic());
        assertEquals(IPType.V4, snd.getIpType());
        assertEquals(SmartNodeDelegate.StatusEnum.DOWN, snd.getStatus());
    }

    /**
     * get detailed info of one smart-node-delegate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void describeSmartNodeDelegateTest() throws ApiException {
        addSmartNodeDelegate();

        SmartNodeDelegateDetail snd = api.describeSmartNodeDelegate(name);
        assertEquals(name, snd.getName());
        assertEquals("my-service", snd.getService());
        assertEquals("zone0", snd.getZone());
        assertEquals(10, snd.getWeight().intValue());
        assertEquals(8080, snd.getExposedPort().intValue());
        assertEquals(nic, snd.getNic());
        assertEquals(IPType.V4, snd.getIpType());
        assertEquals(SmartNodeDelegateDetail.StatusEnum.DOWN, snd.getStatus());
    }

    /**
     * get smart-node-delegate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSmartNodeDelegateTest() throws ApiException {
        addSmartNodeDelegate();

        SmartNodeDelegate response = api.getSmartNodeDelegate(name);

        assertNotNull(response);
    }

    /**
     * retrieve smart-node-delegate list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSmartNodeDelegateTest() throws ApiException {
        List<SmartNodeDelegate> response = api.listSmartNodeDelegate();

        assertNotNull(response);
    }

    /**
     * remove smart-node-delegate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSmartNodeDelegateTest() throws ApiException {
        addSmartNodeDelegate();

        List<SmartNodeDelegate> sndListBefore = api.listSmartNodeDelegate();
        int lenBefore = sndListBefore.size();
        SmartNodeDelegate sndObject = api.getSmartNodeDelegate(name);
        assertTrue(sndListBefore.contains(sndObject));

        api.removeSmartNodeDelegate(name);

        List<SmartNodeDelegate> sndListAfter = api.listSmartNodeDelegate();
        int lenAfter = sndListAfter.size();

        assertEquals(lenBefore - 1, lenAfter);
        assertFalse(sndListAfter.contains(sndObject));
    }

}
