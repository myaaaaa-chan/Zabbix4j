package com.zabbix4j.history;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * History objects differ depending on the item's type of information.</br>
 * They are created by the Zabbix server and cannot be modified via the API.
 * <p/>
 *
 * @author Suguru Yajima on 2014/06/03.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HistoryObject {

    private Long clock;
    private Integer itemid;
    private Integer ns;
    private String value;

    /**
     * Use only Text Hisotry
     */
    private String text;
    private Integer id;
    /**
     * Windows event log entry ID
     * Use Only Log Hisotry
     */
    private Integer logeventid;

    /**
     * Windows event log entry level.
     * Use Only Log Hisotry
     */
    private Integer severity;
    /**
     * Windows event log entry source.
     * Use Only Log Hisotry
     */
    private Integer source;
    /**
     * Windows event log entry time.
     * Use Only Log Hisotry
     */
    private Long timestamp;

    public HistoryObject() {
    }

    public Date getTimestampDate() {
        if (timestamp != null && timestamp != 0) {
            return new Date(timestamp);
        }

        return null;
    }

    public Date getClockDate() {
        if (clock != null && clock != 0) {
            return new Date(clock);
        }

        return null;
    }

    public static enum HISOTRY_OBJECT_TYPE {
        FLOAT(0), STRING(1), LOG(2), INTEGER(3), TEXT(4);
        public int value;

        private HISOTRY_OBJECT_TYPE(int value) {
            this.value = value;
        }
    }
}
