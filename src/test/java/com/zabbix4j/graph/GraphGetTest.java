package com.zabbix4j.graph;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/31.
 */
public class GraphGetTest extends ZabbixApiTestBase {

    public GraphGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        Integer targetId = createDummyGraph();

        GraphGetRequest request = new GraphGetRequest();
        GraphGetRequest.Params params = request.getParams();
        params.addGraphId(targetId);
        params.setSelectItems(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectDiscoveryRule(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGraphItems(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectGroups(ZabbixApiParamter.QUERY.extend.name());
        params.setSelectHosts(ZabbixApiParamter.QUERY.extend.name());

        GraphGetResponse response = zabbixApi.graph().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        deleteDummy(targetId);
    }

    private Integer createDummyGraph() throws ZabbixApiException {

        GraphCreateRequest request = new GraphCreateRequest();
        GraphCreateRequest.Params params = request.getParams();
        params.setName("Graph Delete Test");

        GraphItem gitem = new GraphItem();
        gitem.setItemid(23661);
        gitem.setColor("00AA00");
        params.addGraphItem(gitem);

        params.setHeight(800);
        params.setWidth(140);

        GraphCreateResponse response = zabbixApi.graph().create(request);

        return response.getResult().getGraphids().get(0);
    }

    private void deleteDummy(Integer id) throws ZabbixApiException {

        GraphDeleteRequest request = new GraphDeleteRequest();
        request.getParams().add(id);

        GraphDeleteResponse response = zabbixApi.graph().delete(request);
    }
}
