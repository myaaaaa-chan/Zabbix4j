package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.screen.ScreenObject;
import com.zabbix4j.screenitem.ScreenItemObject;
import com.zabbix4j.template.TemplateObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public TemplateScreenGetResponse() {
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

    public class Result extends TemplateScreenObject {

        private List<ScreenItemObject> screenitems;
        private List<HostObject> hosts;
        private List<ScreenObject> screns;
        private List<TemplateObject> templates;

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

        /**
         * Gets screns.
         *
         * @return Value of screns.
         */
        public List<ScreenObject> getScrens() {
            return screns;
        }

        /**
         * Sets new screns.
         *
         * @param screns New value of screns.
         */
        public void setScrens(List<ScreenObject> screns) {
            this.screns = screns;
        }

        /**
         * Gets templates.
         *
         * @return Value of templates.
         */
        public List<TemplateObject> getTemplates() {
            return templates;
        }

        /**
         * Sets new templates.
         *
         * @param templates New value of templates.
         */
        public void setTemplates(List<TemplateObject> templates) {
            this.templates = templates;
        }

        /**
         * Gets screenitems.
         *
         * @return Value of screenitems.
         */
        public List<ScreenItemObject> getScreenitems() {
            return screenitems;
        }

        /**
         * Sets new screenitems.
         *
         * @param screenitems New value of screenitems.
         */
        public void setScreenitems(List<ScreenItemObject> screenitems) {
            this.screenitems = screenitems;
        }
    }
}
