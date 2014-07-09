package com.zabbix4j.configuration;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class ConfigurationExportTest extends ZabbixApiTestBase {
    public ConfigurationExportTest() {
        super();
    }

    @Test
    public void testExport1() throws Exception {

        ConfigurationExportRequest request = new ConfigurationExportRequest();
        ConfigurationExportRequest.Params params = request.getParams();
        params.setFormat(Configuration.FORMAT.XML.value);
        Option option = new Option();
        option.addHostId(10113);
        params.setOptions(option);

        ConfigurationExportResponse response = zabbixApi.configuration().export(request);
        assertNotNull(response);
        assertNotNull(response.getResult());
    }

    @Test
    public void testExport2() throws Exception {

        ConfigurationExportRequest request = new ConfigurationExportRequest();
        ConfigurationExportRequest.Params params = request.getParams();
        params.setFormat(Configuration.FORMAT.JSON.value);
        Option option = new Option();
        option.addHostId(10113);
        params.setOptions(option);

        ConfigurationExportResponse response = zabbixApi.configuration().export(request);
        assertNotNull(response);
        assertNotNull(response.getResult());
    }
}
