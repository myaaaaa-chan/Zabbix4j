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

package com.zabbix4j.host;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostInventoryObject {
    private String alias;
    private String asset_tag;
    private String chassis;
    private String contact;
    private String contract_number;
    private String date_hw_decomm;
    private String date_hw_expiry;
    private String date_hw_install;
    private String date_hw_purchase;
    private String deployment_status;
    private String hardware;
    private String hardware_full;
    private String host_netmask;
    private String host_networks;
    private String host_router;
    private String hw_arch;
    private String installer_name;
    private String inventory_mode;
    private String location;
    private String location_lat;
    private String location_lon;
    private String macaddress_a;
    private String macaddress_b;
    private String model;
    private String name;
    private String notes;
    private String oob_ip;
    private String oob_netmask;
    private String oob_router;
    private String os;
    private String os_full;
    private String os_short;
    private String poc_1_cell;
    private String poc_1_email;
    private String poc_1_name;
    private String poc_1_notes;
    private String poc_1_phone_a;
    private String poc_1_phone_b;
    private String poc_1_screen;
    private String poc_2_cell;
    private String poc_2_email;
    private String poc_2_name;
    private String poc_2_notes;
    private String poc_2_phone_a;
    private String poc_2_phone_b;
    private String poc_2_screen;
    private String serialno_a;
    private String serialno_b;
    private String site_address_a;
    private String site_address_b;
    private String site_address_c;
    private String site_city;
    private String site_country;
    private String site_notes;
    private String site_rack;
    private String site_state;
    private String site_zip;
    private String software;
    private String software_app_a;
    private String software_app_b;
    private String software_app_c;
    private String software_app_d;
    private String software_app_e;
    private String software_full;
    private String tag;
    private String type;
    private String type_full;
    private String url_a;
    private String url_b;
    private String url_c;
    private String vendor;

    public static enum INVENTORY_MODE {
        DISABLED(-1), MANUAL(0), AUTOMATIC(1);
        public int value;

        private INVENTORY_MODE(int value) {
            this.value = value;
        }
    }
}
