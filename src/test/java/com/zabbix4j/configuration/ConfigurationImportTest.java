package com.zabbix4j.configuration;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import com.zabbix4j.host.DummyHost;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class ConfigurationImportTest extends ZabbixApiTestBase {

    public ConfigurationImportTest() {
        super();
    }

    @Test
    public void testImport1() throws Exception {
        DummyHost dummyHost = new DummyHost(zabbixApi);
        Integer id = dummyHost.createHost();
        String xml = export(id);
        dummyHost.deleteHost(id);

        ConfigurationImportRequest request = new ConfigurationImportRequest();
        ConfigurationImportRequest.Params params = request.getParams();
        params.setFormat(Configuration.FORMAT.xml.name());
        params.setSource(xml);
        Rules rules = new Rules();
        Rules.Applications hosts = rules.getHosts();
        hosts.setCreateMissing(true);
        hosts.setUpdateExisting(true);
        rules.setHosts(hosts);
        params.setRules(rules);

        ConfigurationImportResponse response = zabbixApi.configuration().imports(request);
        assertNotNull(response);

        assertTrue(response.getResult());
    }

    private String export(Integer id) throws ZabbixApiException {
        ConfigurationExportRequest request = new ConfigurationExportRequest();
        ConfigurationExportRequest.Params params = request.getParams();
        params.setFormat(Configuration.FORMAT.json.name());
        Option option = new Option();
        option.addHostId(id);
        params.setOptions(option);

        ConfigurationExportResponse response = zabbixApi.configuration().export(request);

        return response.getResult();
    }

}
