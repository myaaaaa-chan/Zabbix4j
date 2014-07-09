package com.zabbix4j.mediatype;

/**
 * @author Suguru Yajima
 */
public class MediaTypeObject {

    private Integer mediatypeid;
    private String description;
    private Integer type;
    private String exec_path;
    private String gsm_modem;
    private String passwd;
    private String smtp_email;
    private String smtp_helo;
    private String smtp_server;
    private Integer status;
    private String username;

    /**
     * Gets username.
     *
     * @return Value of username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets new username.
     *
     * @param username New value of username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets passwd.
     *
     * @return Value of passwd.
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Sets new passwd.
     *
     * @param passwd New value of passwd.
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * Gets mediatypeid.
     *
     * @return Value of mediatypeid.
     */
    public Integer getMediatypeid() {
        return mediatypeid;
    }

    /**
     * Sets new mediatypeid.
     *
     * @param mediatypeid New value of mediatypeid.
     */
    public void setMediatypeid(Integer mediatypeid) {
        this.mediatypeid = mediatypeid;
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
     * Gets gsm_modem.
     *
     * @return Value of gsm_modem.
     */
    public String getGsm_modem() {
        return gsm_modem;
    }

    /**
     * Sets new gsm_modem.
     *
     * @param gsm_modem New value of gsm_modem.
     */
    public void setGsm_modem(String gsm_modem) {
        this.gsm_modem = gsm_modem;
    }

    /**
     * Gets smtp_email.
     *
     * @return Value of smtp_email.
     */
    public String getSmtp_email() {
        return smtp_email;
    }

    /**
     * Sets new smtp_email.
     *
     * @param smtp_email New value of smtp_email.
     */
    public void setSmtp_email(String smtp_email) {
        this.smtp_email = smtp_email;
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
     * Gets exec_path.
     *
     * @return Value of exec_path.
     */
    public String getExec_path() {
        return exec_path;
    }

    /**
     * Sets new exec_path.
     *
     * @param exec_path New value of exec_path.
     */
    public void setExec_path(String exec_path) {
        this.exec_path = exec_path;
    }

    /**
     * Gets smtp_helo.
     *
     * @return Value of smtp_helo.
     */
    public String getSmtp_helo() {
        return smtp_helo;
    }

    /**
     * Sets new smtp_helo.
     *
     * @param smtp_helo New value of smtp_helo.
     */
    public void setSmtp_helo(String smtp_helo) {
        this.smtp_helo = smtp_helo;
    }

    /**
     * Gets smtp_server.
     *
     * @return Value of smtp_server.
     */
    public String getSmtp_server() {
        return smtp_server;
    }

    /**
     * Sets new smtp_server.
     *
     * @param smtp_server New value of smtp_server.
     */
    public void setSmtp_server(String smtp_server) {
        this.smtp_server = smtp_server;
    }

    /**
     * Gets description.
     *
     * @return Value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets new description.
     *
     * @param description New value of description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public static enum MEDIA_TYPE {
        EMAIL(0), SCRIPT(1), SMS(2), JABBER(3), EZ_TEXTING(100);
        public int value;

        private MEDIA_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum MEDIA_STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private MEDIA_STATUS(int value) {
            this.value = value;
        }
    }
}
