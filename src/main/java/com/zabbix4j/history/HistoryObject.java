package com.zabbix4j.history;

import java.util.Date;

/**
 * History objects differ depending on the item's type of information.</br>
 * They are created by the Zabbix server and cannot be modified via the API.
 * <p/>
 * Created by Suguru Yajima on 2014/06/03.
 */
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public Integer getLogeventid() {
        return logeventid;
    }

    public void setLogeventid(Integer logeventid) {
        this.logeventid = logeventid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Long getClock() {
        return clock;
    }

    public void setClock(Long clock) {
        this.clock = clock;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getNs() {
        return ns;
    }

    public void setNs(Integer ns) {
        this.ns = ns;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static enum HISOTRY_OBJECT_TYPE {
        FLOAT(0),STRING(1),LOG(2),INTEGER(3),TEXT(4);
        public int value ;
        private HISOTRY_OBJECT_TYPE(int value) {
            this.value = value;
        }
    }
}
