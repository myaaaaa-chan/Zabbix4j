/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.action;

/**
 * @author Suguru Yajima on 2014/05/19.
 */
public class OperationCommand {

    private Integer operationid;
    private String command;
    private Integer type;
    private Integer authtype;
    private Integer execute_on;
    private String password;
    private Integer port;
    private String privatekey;
    private String publickey;
    private Integer scriptid;
    private String username;

    public OperationCommand() {
    }

    public Integer getOperationid() {
        return operationid;
    }

    public void setOperationid(Integer operationid) {
        this.operationid = operationid;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAuthtype() {
        return authtype;
    }

    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    public Integer getExecute_on() {
        return execute_on;
    }

    public void setExecute_on(Integer execute_on) {
        this.execute_on = execute_on;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public Integer getScriptid() {
        return scriptid;
    }

    public void setScriptid(Integer scriptid) {
        this.scriptid = scriptid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static enum COMMAND_TYPE {
        CUSTOM_SCRIPT(0), IPMI(1), SSH(2), TELNET(3), GLOBAL_SCRIPT(4);

        private int value;

        private COMMAND_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum AUTH_TYPE {
        PASSWORD(0), PUBLIC_KEY(1);

        private int value;

        private AUTH_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum EXECUTE_ON {
        ZABBIX_AGENT(0), ZABBIX_SERVER(1);

        private int value;

        private EXECUTE_ON(int value) {
            this.value = value;
        }
    }
}
