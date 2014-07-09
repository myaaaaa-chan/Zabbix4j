package com.zabbix4j.hostprototype;

/**
 * The host prototype inventory object has the following properties.
 * <p/>
 * Created by Suguru Yajima on 2014/06/04.
 */
public class HostPrototypeInventoryObject {

    /**
     * Host prototype inventory population mode
     */
    private Integer inventory_mode = INVENTORY_MODE.MANUAL.value;

    public static enum INVENTORY_MODE {
        DISABLED(-1), MANUAL(0), AUTOMATIC(1);
        public int value;

        private INVENTORY_MODE(int value) {
            this.value = value;
        }
    }
}
