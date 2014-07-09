

package com.zabbix4j.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class ZbxListUtils {

    private ZbxListUtils() {
    }

    public static <E> List<E> add(List<E> list, E e) {
        if (list == null) {
            list = new ArrayList<E>();
        }

        list.add(e);

        return list;
    }
}
