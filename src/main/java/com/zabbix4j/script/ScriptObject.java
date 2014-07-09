package com.zabbix4j.script;

/**
 * @author Suguru Yajima
 */
public class ScriptObject {
    private Integer scriptid;
    private String command;
    private String name;
    private String confirmation;
    private String description;
    private Integer execute_on;
    private Integer groupid;
    private Integer host_access;
    private Integer type;
    private Integer usrgrpid;

    /**
     * Gets command.
     *
     * @return Value of command.
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets new command.
     *
     * @param command New value of command.
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * Gets host_access.
     *
     * @return Value of host_access.
     */
    public Integer getHost_access() {
        return host_access;
    }

    /**
     * Sets new host_access.
     *
     * @param host_access New value of host_access.
     */
    public void setHost_access(Integer host_access) {
        this.host_access = host_access;
    }

    /**
     * Gets confirmation.
     *
     * @return Value of confirmation.
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Sets new confirmation.
     *
     * @param confirmation New value of confirmation.
     */
    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
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
     * Gets groupid.
     *
     * @return Value of groupid.
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * Sets new groupid.
     *
     * @param groupid New value of groupid.
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * Gets usrgrpid.
     *
     * @return Value of usrgrpid.
     */
    public Integer getUsrgrpid() {
        return usrgrpid;
    }

    /**
     * Sets new usrgrpid.
     *
     * @param usrgrpid New value of usrgrpid.
     */
    public void setUsrgrpid(Integer usrgrpid) {
        this.usrgrpid = usrgrpid;
    }

    /**
     * Gets scriptid.
     *
     * @return Value of scriptid.
     */
    public Integer getScriptid() {
        return scriptid;
    }

    /**
     * Sets new scriptid.
     *
     * @param scriptid New value of scriptid.
     */
    public void setScriptid(Integer scriptid) {
        this.scriptid = scriptid;
    }

    /**
     * Gets execute_on.
     *
     * @return Value of execute_on.
     */
    public Integer getExecute_on() {
        return execute_on;
    }

    /**
     * Sets new execute_on.
     *
     * @param execute_on New value of execute_on.
     */
    public void setExecute_on(Integer execute_on) {
        this.execute_on = execute_on;
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

    public static enum EXECUTE_ON {
        ZABBIX_AGENT(0), ZABBIX_SERVER(1);
        public int value;

        private EXECUTE_ON(int value) {
            this.value = value;
        }
    }

    public static enum HOST_PERMISSION {
        READ(2), WRITE(3);
        public int value;

        private HOST_PERMISSION(int value) {
            this.value = value;
        }
    }
}
