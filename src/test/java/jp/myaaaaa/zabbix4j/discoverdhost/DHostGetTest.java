package jp.myaaaaa.zabbix4j.discoverdhost;

import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import jp.myaaaaa.zabbix4j.discoveredhost.DHostGetRequest;
import jp.myaaaaa.zabbix4j.discoveredhost.DHostGetResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DHostGetTest extends ZabbixApiTestBase {

    public DHostGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        DHostGetRequest request = new DHostGetRequest();
        DHostGetRequest.Params params = request.getParams();
        params.addDHostId(10105);

        DHostGetResponse response = zabbixApi.discoverdHost().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
