package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.host.HostObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class HttpTestGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public HttpTestGetResponse() {
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

    public class Result extends WebScenarioObject {

        private List<ScenarioStepObject> steps;
        private List<HostObject> hosts;

        /**
         * Gets steps.
         *
         * @return Value of steps.
         */
        public List<ScenarioStepObject> getSteps() {
            return steps;
        }

        /**
         * Sets new steps.
         *
         * @param steps New value of steps.
         */
        public void setSteps(List<ScenarioStepObject> steps) {
            this.steps = steps;
        }

        /**
         * Gets hosts.
         *
         * @return Value of hosts.
         */
        public List<HostObject> getHosts() {
            return hosts;
        }

        /**
         * Sets new hosts.
         *
         * @param hosts New value of hosts.
         */
        public void setHosts(List<HostObject> hosts) {
            this.hosts = hosts;
        }
    }
}
