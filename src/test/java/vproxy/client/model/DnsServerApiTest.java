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

import java.util.List;

import static org.junit.Assert.*;
import static vproxy.client.TestUtils.randomName;
import static vproxy.client.TestUtils.randomPort;

/**
 * API tests for DnsServerApi
 */
public class DnsServerApiTest {

    private final DnsServerApi api = new DnsServerApi();
    private String elgName;
    private String upsName;
    private String name;
    private int port;

    @Before
    public void setUp() throws Exception {
        elgName = randomName("elg");
        upsName = randomName("ups");
        name = randomName("dns");
        port = randomPort();

        EventLoopGroupCreate elg = new EventLoopGroupCreate();
        elg.setName(elgName);
        new EventLoopGroupApi().addEventLoopGroup(elg);

        UpstreamCreate ups = new UpstreamCreate();
        ups.setName(upsName);
        new UpstreamApi().addUpstream(ups);
    }

    private void addDnsServer() throws ApiException {
        DnsServerCreate req = new DnsServerCreate();
        req.setName(name);
        req.setAddress("127.0.0.1:" + port);
        req.setEventLoopGroup(elgName);
        req.setRrsets(upsName);
        req.setTtl(1);
        api.addDnsServer(req);
    }

    /**
     * add dns-server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addDnsServerTest() throws ApiException {
        int oldLen = api.listDnsServer().size();

        addDnsServer();

        List<DnsServer> dnsList = api.listDnsServer();
        assertEquals(oldLen + 1, dnsList.size());
        DnsServer dns = api.getDnsServer(name);
        assertTrue(dnsList.contains(dns));
        assertEquals(name, dns.getName());
        assertEquals("127.0.0.1:" + port, dns.getAddress());
        assertEquals(elgName, dns.getEventLoopGroup());
        assertEquals(upsName, dns.getRrsets());
        assertEquals(1, dns.getTtl().intValue());
    }

    /**
     * get detailed info of one dns-server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void describeDnsServerTest() throws ApiException {
        addDnsServer();

        DnsServerDetail dns = api.describeDnsServer(name);

        assertEquals(name, dns.getName());
        assertEquals("127.0.0.1:" + port, dns.getAddress());
        assertEquals(elgName, dns.getEventLoopGroup().getName());
        assertNotNull(dns.getEventLoopGroup().getEventLoopList());
        assertEquals(upsName, dns.getRrsets().getName());
        assertNotNull(dns.getRrsets().getServerGroupList());
        assertEquals(1, dns.getTtl().intValue());
    }

    /**
     * get dns-server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDnsServerTest() throws ApiException {
        addDnsServer();

        DnsServer response = api.getDnsServer(name);

        assertNotNull(response);
    }

    /**
     * retrieve dns-server list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDnsServerTest() throws ApiException {
        List<DnsServer> response = api.listDnsServer();

        assertNotNull(response);
    }

    /**
     * remove dns-server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeDnsServerTest() throws ApiException {
        addDnsServer();

        List<DnsServer> dnsListBefore = api.listDnsServer();
        int lenBefore = dnsListBefore.size();
        DnsServer dnsObject = api.getDnsServer(name);
        assertTrue(dnsListBefore.contains(dnsObject));

        api.removeDnsServer(name);

        List<DnsServer> dnsListAfter = api.listDnsServer();
        int lenAfter = dnsListAfter.size();

        assertEquals(lenBefore - 1, lenAfter);
        assertFalse(dnsListAfter.contains(dnsObject));
    }

    /**
     * update dns-server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDnsServerTest() throws ApiException {
        addDnsServer();

        DnsServerUpdate update = new DnsServerUpdate();
        update.setTtl(2);
        api.updateDnsServer(name, update);

        DnsServer dns = api.getDnsServer(name);
        assertEquals(2, dns.getTtl().intValue());
    }

}
