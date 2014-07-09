package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ITServiceCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ITServiceCreateRequest() {
        setMethod("service.create");
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

        List<Dependency> dependencies;
        private Integer parentid;
        private List<ServiceTimeObject> times;

        public void addDependency(Dependency dependency) {
            dependencies = ZbxListUtils.add(dependencies, dependency);
        }

        public Dependency newDependency() {
            return new Dependency();
        }


        /**
         * Gets dependencies.
         *
         * @return Value of dependencies.
         */
        public List<Dependency> getDependencies() {
            return dependencies;
        }

        /**
         * Sets new dependencies.
         *
         * @param dependencies New value of dependencies.
         */
        public void setDependencies(List<Dependency> dependencies) {
            this.dependencies = dependencies;
        }

        public void addTime(ServiceTimeObject obj) {
            times = ZbxListUtils.add(times, obj);
        }

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
         * Gets times.
         *
         * @return Value of times.
         */
        public List<ServiceTimeObject> getTimes() {
            return times;
        }

        /**
         * Sets new times.
         *
         * @param times New value of times.
         */
        public void setTimes(List<ServiceTimeObject> times) {
            this.times = times;
        }
    }

    public class Dependency {

        /**
         * ID of an IT service the service depends on, that is, the child IT service
         */
        private Integer dependsOnServiceid;
        /**
         * type of service dependency; refer to the service dependency object page for more information on dependency types
         */
        private Integer soft;

        public Dependency() {
        }

        /**
         * Gets type of service dependency; refer to the service dependency object page for more information on dependency types.
         *
         * @return Value of type of service dependency; refer to the service dependency object page for more information on dependency types.
         */
        public Integer getSoft() {
            return soft;
        }

        /**
         * Sets new type of service dependency; refer to the service dependency object page for more information on dependency types.
         *
         * @param soft New value of type of service dependency; refer to the service dependency object page for more information on dependency types.
         */
        public void setSoft(Integer soft) {
            this.soft = soft;
        }

        /**
         * Gets ID of an IT service the service depends on, that is, the child IT service.
         *
         * @return Value of ID of an IT service the service depends on, that is, the child IT service.
         */
        public Integer getDependsOnServiceid() {
            return dependsOnServiceid;
        }

        /**
         * Sets new ID of an IT service the service depends on, that is, the child IT service.
         *
         * @param dependsOnServiceid New value of ID of an IT service the service depends on, that is, the child IT service.
         */
        public void setDependsOnServiceid(Integer dependsOnServiceid) {
            this.dependsOnServiceid = dependsOnServiceid;
        }
    }
}
