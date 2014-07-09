package com.zabbix4j.user;

import com.zabbix4j.ZabbixApiException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Suguru Yajima on 2014/04/26.
 */
public class UserTest {

    public UserTest() {

    }

    @Test
    public void testLogin1() {

        User user = new User("http://192.168.200.10/zabbix/api_jsonrpc.php");
        UserLoginRequest request = new UserLoginRequest();
        request.getParams().setUser("admin");
        request.getParams().setPassword("zabbix");

        try {
            UserLoginResponse response = user.login(request);

            assertNotNull(response);

            assertNotNull(response.getResult());
        } catch (ZabbixApiException e) {
            fail();
        }
    }

}
