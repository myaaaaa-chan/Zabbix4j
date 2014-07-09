package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ItemPrototypeUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ItemPrototypeUpdateRequest() {
        setMethod("itemprototype.update");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends ItemPrototypeObject {

        private List<Integer> applications;

        public void addApplicationId(Integer id) {
            applications = ZbxListUtils.add(applications, id);
        }

        /**
         * Gets applications.
         *
         * @return Value of applications.
         */
        public List<Integer> getApplications() {
            return applications;
        }

        /**
         * Sets new applications.
         *
         * @param applications New value of applications.
         */
        public void setApplications(List<Integer> applications) {
            this.applications = applications;
        }
    }
}
