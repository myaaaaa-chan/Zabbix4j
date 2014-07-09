package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.user.UserObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MediaTypeGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public MediaTypeGetResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends MediaTypeObject {

        private List<UserObject> users;

        /**
         * Gets users.
         *
         * @return Value of users.
         */
        public List<UserObject> getUsers() {
            return users;
        }

        /**
         * Sets new users.
         *
         * @param users New value of users.
         */
        public void setUsers(List<UserObject> users) {
            this.users = users;
        }
    }
}
