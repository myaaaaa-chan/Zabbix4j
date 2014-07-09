package com.zabbix4j.user;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class UserObject {

    private Integer userid;
    private String alias;
    private Long attempt_clock;
    private Integer attempt_failed;
    private Integer autologin;
    private Integer autologout;
    private String lang;
    private String name;
    private Integer refresh;
    private Integer rows_per_page;
    private String surname;
    private String theme;
    private Integer type;
    private String url;

    public Date getAttemptClock() {
        if (attempt_clock != null && attempt_clock != 0) {
            return new Date(attempt_clock);
        }
        return null;
    }

    /**
     * Gets url.
     *
     * @return Value of url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets new url.
     *
     * @param url New value of url.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets surname.
     *
     * @return Value of surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets new surname.
     *
     * @param surname New value of surname.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets refresh.
     *
     * @return Value of refresh.
     */
    public Integer getRefresh() {
        return refresh;
    }

    /**
     * Sets new refresh.
     *
     * @param refresh New value of refresh.
     */
    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }

    /**
     * Gets rows_per_page.
     *
     * @return Value of rows_per_page.
     */
    public Integer getRows_per_page() {
        return rows_per_page;
    }

    /**
     * Sets new rows_per_page.
     *
     * @param rows_per_page New value of rows_per_page.
     */
    public void setRows_per_page(Integer rows_per_page) {
        this.rows_per_page = rows_per_page;
    }

    /**
     * Gets autologin.
     *
     * @return Value of autologin.
     */
    public Integer getAutologin() {
        return autologin;
    }

    /**
     * Sets new autologin.
     *
     * @param autologin New value of autologin.
     */
    public void setAutologin(Integer autologin) {
        this.autologin = autologin;
    }

    /**
     * Gets lang.
     *
     * @return Value of lang.
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets new lang.
     *
     * @param lang New value of lang.
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Gets theme.
     *
     * @return Value of theme.
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets new theme.
     *
     * @param theme New value of theme.
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * Gets attempt_failed.
     *
     * @return Value of attempt_failed.
     */
    public Integer getAttempt_failed() {
        return attempt_failed;
    }

    /**
     * Sets new attempt_failed.
     *
     * @param attempt_failed New value of attempt_failed.
     */
    public void setAttempt_failed(Integer attempt_failed) {
        this.attempt_failed = attempt_failed;
    }

    /**
     * Gets autologout.
     *
     * @return Value of autologout.
     */
    public Integer getAutologout() {
        return autologout;
    }

    /**
     * Sets new autologout.
     *
     * @param autologout New value of autologout.
     */
    public void setAutologout(Integer autologout) {
        this.autologout = autologout;
    }

    /**
     * Gets userid.
     *
     * @return Value of userid.
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * Sets new userid.
     *
     * @param userid New value of userid.
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * Gets alias.
     *
     * @return Value of alias.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets new alias.
     *
     * @param alias New value of alias.
     */
    public void setAlias(String alias) {
        this.alias = alias;
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
     * Gets attempt_clock.
     *
     * @return Value of attempt_clock.
     */
    public Long getAttempt_clock() {
        return attempt_clock;
    }

    /**
     * Sets new attempt_clock.
     *
     * @param attempt_clock New value of attempt_clock.
     */
    public void setAttempt_clock(Long attempt_clock) {
        this.attempt_clock = attempt_clock;
    }

    public static enum AUTO_LOGIN {
        DISABLED(0), ENABLED(1);
        public int value;

        private AUTO_LOGIN(int value) {
            this.value = value;
        }
    }

    public static enum USER_TYPE {
        ZABBIX_USER(1), ZABBIX_ADMIN(2), ZABBIX_SUPER_ADMIN(3);
        public int value;

        private USER_TYPE(int value) {
            this.value = value;
        }
    }
}
