package com.zabbix4j.host;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UnLinkTemplate {
    private int templateid;

    public UnLinkTemplate(int templateId) {
        this.templateid = templateId;
    }
}
