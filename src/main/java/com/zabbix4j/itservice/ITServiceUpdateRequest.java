package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ITServiceUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ITServiceUpdateRequest() {
        setMethod("service.update");
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

    public class Params extends ITServiceObject {

        private List<ServiceDependencyObject> dependencies;
        private Integer parentid;
        private List<ServiceTimeObject> times;

        /**
         * Gets parentid.
         *
         * @return Value of parentid.
         */
        public Integer getParentid() {
            return parentid;
        }

        /**
         * Sets new parentid.
         *
         * @param parentid New value of parentid.
         */
        public void setParentid(Integer parentid) {
            this.parentid = parentid;
        }

        /**
         * Gets dependencies.
         *
         * @return Value of dependencies.
         */
        public List<ServiceDependencyObject> getDependencies() {
            return dependencies;
        }

        /**
         * Sets new dependencies.
         *
         * @param dependencies New value of dependencies.
         */
        public void setDependencies(List<ServiceDependencyObject> dependencies) {
            this.dependencies = dependencies;
        }
    }
}
