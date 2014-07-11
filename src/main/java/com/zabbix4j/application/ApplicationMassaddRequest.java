package com.zabbix4j.application;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.item.ItemObject;
import com.zabbix4j.utils.ZbxListUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Request paramter for application.massadd
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApplicationMassaddRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ApplicationMassaddRequest() {
        setMethod("application.massadd");
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    public class Params {
        private List<ApplicationObject> applications;
        private List<ItemObject> items;

        public Params() {
            super();
        }

        public void addApplication(ApplicationObject obj) {
            applications = ZbxListUtils.add(applications, obj);
        }

        public void addItem(ItemObject obj) {
            items = ZbxListUtils.add(items, obj);
        }
    }

}
