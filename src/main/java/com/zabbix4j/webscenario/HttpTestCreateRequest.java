package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class HttpTestCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HttpTestCreateRequest() {
        setMethod("httptest.create");
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

    public class Params extends WebScenarioObject {
        private List<ScenarioStepObject> steps;

        public void addScenarioStepObject(ScenarioStepObject obj) {
            steps = ZbxListUtils.add(steps, obj);
        }

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
    }
}
