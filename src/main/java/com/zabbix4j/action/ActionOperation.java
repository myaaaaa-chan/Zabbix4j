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

import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima on 2014/05/19.
 */
public class ActionOperation {

    private Integer operationid;
    private Integer operationtype;
    private Integer actionid;
    private Integer esc_period;
    private Integer esc_step_from;
    private Integer esc_step_to;
    private Integer evaltype;
    private OperationCommand opcommand;
    private List<Integer> opcommand_grp;
    private List<Integer> opcommand_hst;
    private List<OperationCondition> opconditions;
    private List<Integer> opgroup;
    private OperationMessage opmessage;
    private List<OperationMessageGroup> opmessage_grp;
    private List<Integer> opmessage_usr;
    private List<Integer> optemplate;

    public ActionOperation() {
    }

    public List<OperationMessageGroup> getOpmessage_grp() {
        return opmessage_grp;
    }

    public void setOpmessage_grp(List<OperationMessageGroup> opmessage_grp) {
        this.opmessage_grp = opmessage_grp;
    }

    public void addOpmessageGrp(OperationMessageGroup omg) {
        opmessage_grp = ZbxListUtils.add(opmessage_grp, omg);
    }

    public void addOpcommandGrp(Integer id) {
        opcommand_grp = ZbxListUtils.add(opcommand_grp, id);
    }

    public void addOpcomandHst(Integer id) {
        opcommand_hst = ZbxListUtils.add(opcommand_hst, id);
    }

    public void addOpondition(OperationCondition oc) {
        opconditions = ZbxListUtils.add(opconditions, oc);
    }

    public void addOpgroup(Integer id) {
        opgroup = ZbxListUtils.add(opgroup, id);
    }

    public void addOpmessageUsr(Integer id) {
        opmessage_usr = ZbxListUtils.add(opmessage_usr, id);
    }

    public void addOptemplate(Integer id) {
        optemplate = ZbxListUtils.add(optemplate, id);
    }

    public void addOpConditons(OperationCondition oc) {
        this.opconditions = ZbxListUtils.add(opconditions, oc);
    }

    public Integer getOperationid() {
        return operationid;
    }

    public void setOperationid(Integer operationid) {
        this.operationid = operationid;
    }

    public Integer getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(Integer operationtype) {
        this.operationtype = operationtype;
    }

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    public Integer getEsc_period() {
        return esc_period;
    }

    public void setEsc_period(Integer esc_period) {
        this.esc_period = esc_period;
    }

    public Integer getEsc_step_from() {
        return esc_step_from;
    }

    public void setEsc_step_from(Integer esc_step_from) {
        this.esc_step_from = esc_step_from;
    }

    public Integer getEsc_step_to() {
        return esc_step_to;
    }

    public void setEsc_step_to(Integer esc_step_to) {
        this.esc_step_to = esc_step_to;
    }

    public Integer getEvaltype() {
        return evaltype;
    }

    public void setEvaltype(Integer evaltype) {
        this.evaltype = evaltype;
    }

    public OperationCommand getOpcommand() {
        return opcommand;
    }

    public void setOpcommand(OperationCommand opcommand) {
        this.opcommand = opcommand;
    }

    public List<Integer> getOpcommand_grp() {
        return opcommand_grp;
    }

    public void setOpcommand_grp(List<Integer> opcommand_grp) {
        this.opcommand_grp = opcommand_grp;
    }

    public List<Integer> getOpcommand_hst() {
        return opcommand_hst;
    }

    public void setOpcommand_hst(List<Integer> opcommand_hst) {
        this.opcommand_hst = opcommand_hst;
    }

    public List<OperationCondition> getOpconditions() {
        return opconditions;
    }

    public void setOpconditions(List<OperationCondition> opconditions) {
        this.opconditions = opconditions;
    }

    public List<Integer> getOpgroup() {
        return opgroup;
    }

    public void setOpgroup(List<Integer> opgroup) {
        this.opgroup = opgroup;
    }

    public OperationMessage getOpmessage() {
        return opmessage;
    }

    public void setOpmessage(OperationMessage opmessage) {
        this.opmessage = opmessage;
    }

    public List<Integer> getOpmessage_usr() {
        return opmessage_usr;
    }

    public void setOpmessage_usr(List<Integer> opmessage_usr) {
        this.opmessage_usr = opmessage_usr;
    }

    public List<Integer> getOptemplate() {
        return optemplate;
    }

    public void setOptemplate(List<Integer> optemplate) {
        this.optemplate = optemplate;
    }


}
