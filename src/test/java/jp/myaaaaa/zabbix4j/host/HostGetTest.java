package jp.myaaaaa.zabbix4j.host;

import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostGetTest extends ZabbixApiTestBase {

    public HostGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer targetHostId = 10108;
        HostGetRequest request = new HostGetRequest();
        HostGetRequest.Params params = request.getParams();

        ArrayList<Integer> hostIds = new ArrayList<Integer>();
        hostIds.add(targetHostId);
        params.setHostids(hostIds);

        HostGetResponse response = zabbixApi.host().get(request);

        assertNotNull(response);

        HostGetResponse.Result result = response.getResult().get(0);
        assertEquals(targetHostId, result.getHostid());
    }
}
