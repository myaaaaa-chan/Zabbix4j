package com.zabbix4j.trigger;

/**
 * @author Suguru Yajima
 */
public class FunctionObject {
    private Integer functionid;
    private Integer itemid;
    private String function;
    private Integer parameter;

    public FunctionObject() {
    }

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Integer getParameter() {
        return parameter;
    }

    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }
}
