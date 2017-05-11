package com.zabbix4j.webscenario;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class WebScenarioObject {

    private Integer httptestid;
    private Integer hostid;
    private String name;
    private String agent;
    private Integer applicationid;
    private Integer authentication;
    private Integer delay;
    private String http_password;
    private String http_proxy;
    private String http_user;
    private Long nextcheck;
    private Integer retries;
    private Integer status;
    private Integer templateid;
    private String variables;
    private String url;

    public String getUrl() {
	return url;
      }

    public void setUrl(String url) {
	this.url = url;
      }

    public Date getNextCheckDate() {
        if (nextcheck != null && nextcheck != 0) {
            return new Date(nextcheck);
        }

        return null;
    }

    /**
     * Gets templateid.
     *
     * @return Value of templateid.
     */
    public Integer getTemplateid() {
        return templateid;
    }

    /**
     * Sets new templateid.
     *
     * @param templateid New value of templateid.
     */
    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    /**
     * Gets http_user.
     *
     * @return Value of http_user.
     */
    public String getHttp_user() {
        return http_user;
    }

    /**
     * Sets new http_user.
     *
     * @param http_user New value of http_user.
     */
    public void setHttp_user(String http_user) {
        this.http_user = http_user;
    }

    /**
     * Gets status.
     *
     * @return Value of status.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets new status.
     *
     * @param status New value of status.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets variables.
     *
     * @return Value of variables.
     */
    public String getVariables() {
        return variables;
    }

    /**
     * Sets new variables.
     *
     * @param variables New value of variables.
     */
    public void setVariables(String variables) {
        this.variables = variables;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets hostid.
     *
     * @return Value of hostid.
     */
    public Integer getHostid() {
        return hostid;
    }

    /**
     * Sets new hostid.
     *
     * @param hostid New value of hostid.
     */
    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    /**
     * Gets retries.
     *
     * @return Value of retries.
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * Sets new retries.
     *
     * @param retries New value of retries.
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * Gets delay.
     *
     * @return Value of delay.
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * Sets new delay.
     *
     * @param delay New value of delay.
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * Gets applicationid.
     *
     * @return Value of applicationid.
     */
    public Integer getApplicationid() {
        return applicationid;
    }

    /**
     * Sets new applicationid.
     *
     * @param applicationid New value of applicationid.
     */
    public void setApplicationid(Integer applicationid) {
        this.applicationid = applicationid;
    }

    /**
     * Gets httptestid.
     *
     * @return Value of httptestid.
     */
    public Integer getHttptestid() {
        return httptestid;
    }

    /**
     * Sets new httptestid.
     *
     * @param httptestid New value of httptestid.
     */
    public void setHttptestid(Integer httptestid) {
        this.httptestid = httptestid;
    }

    /**
     * Gets authentication.
     *
     * @return Value of authentication.
     */
    public Integer getAuthentication() {
        return authentication;
    }

    /**
     * Sets new authentication.
     *
     * @param authentication New value of authentication.
     */
    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }

    /**
     * Gets http_proxy.
     *
     * @return Value of http_proxy.
     */
    public String getHttp_proxy() {
        return http_proxy;
    }

    /**
     * Sets new http_proxy.
     *
     * @param http_proxy New value of http_proxy.
     */
    public void setHttp_proxy(String http_proxy) {
        this.http_proxy = http_proxy;
    }

    /**
     * Gets http_password.
     *
     * @return Value of http_password.
     */
    public String getHttp_password() {
        return http_password;
    }

    /**
     * Sets new http_password.
     *
     * @param http_password New value of http_password.
     */
    public void setHttp_password(String http_password) {
        this.http_password = http_password;
    }

    /**
     * Gets nextcheck.
     *
     * @return Value of nextcheck.
     */
    public Long getNextcheck() {
        return nextcheck;
    }

    /**
     * Sets new nextcheck.
     *
     * @param nextcheck New value of nextcheck.
     */
    public void setNextcheck(Long nextcheck) {
        this.nextcheck = nextcheck;
    }

    /**
     * Gets agent.
     *
     * @return Value of agent.
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets new agent.
     *
     * @param agent New value of agent.
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    public static enum AUTHENTICATION_METHOD {
        NONE(0), BASCI_HTTP(1), NTLM(2);
        private int value;

        private AUTHENTICATION_METHOD(int value) {
            this.value = value;
        }
    }

    public static enum STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }
}
