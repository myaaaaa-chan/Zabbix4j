package com.zabbix4j.maintenance;

import java.util.Date;

/**
 * @author Suguru Yajima
 */
public class TimePeriodObject {

    private Integer timeperiodid;
    private Integer day;
    private Integer dayofweek;
    private Integer every;
    private Integer month;
    private Integer period;
    private Long start_date;
    private Integer start_time;
    private Integer timeperiod_type;

    public Date getStartDate() {
        if (start_date != null && start_date != 0) {
            return new Date(start_date);
        }

        return null;
    }

    /**
     * Gets every.
     *
     * @return Value of every.
     */
    public Integer getEvery() {
        return every;
    }

    /**
     * Sets new every.
     *
     * @param every New value of every.
     */
    public void setEvery(Integer every) {
        this.every = every;
    }

    /**
     * Gets start_date.
     *
     * @return Value of start_date.
     */
    public Long getStart_date() {
        return start_date;
    }

    /**
     * Sets new start_date.
     *
     * @param start_date New value of start_date.
     */
    public void setStart_date(Long start_date) {
        this.start_date = start_date;
    }

    /**
     * Gets timeperiodid.
     *
     * @return Value of timeperiodid.
     */
    public Integer getTimeperiodid() {
        return timeperiodid;
    }

    /**
     * Sets new timeperiodid.
     *
     * @param timeperiodid New value of timeperiodid.
     */
    public void setTimeperiodid(Integer timeperiodid) {
        this.timeperiodid = timeperiodid;
    }

    /**
     * Gets day.
     *
     * @return Value of day.
     */
    public Integer getDay() {
        return day;
    }

    /**
     * Sets new day.
     *
     * @param day New value of day.
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Gets start_time.
     *
     * @return Value of start_time.
     */
    public Integer getStart_time() {
        return start_time;
    }

    /**
     * Sets new start_time.
     *
     * @param start_time New value of start_time.
     */
    public void setStart_time(Integer start_time) {
        this.start_time = start_time;
    }

    /**
     * Gets dayofweek.
     *
     * @return Value of dayofweek.
     */
    public Integer getDayofweek() {
        return dayofweek;
    }

    /**
     * Sets new dayofweek.
     *
     * @param dayofweek New value of dayofweek.
     */
    public void setDayofweek(Integer dayofweek) {
        this.dayofweek = dayofweek;
    }

    /**
     * Gets timeperiod_type.
     *
     * @return Value of timeperiod_type.
     */
    public Integer getTimeperiod_type() {
        return timeperiod_type;
    }

    /**
     * Sets new timeperiod_type.
     *
     * @param timeperiod_type New value of timeperiod_type.
     */
    public void setTimeperiod_type(Integer timeperiod_type) {
        this.timeperiod_type = timeperiod_type;
    }

    /**
     * Gets month.
     *
     * @return Value of month.
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets new month.
     *
     * @param month New value of month.
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * Gets period.
     *
     * @return Value of period.
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets new period.
     *
     * @param period New value of period.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    public static enum WEEK_OF_THE_MONTH {
        FIRST_WEEK(1), SECOND_WEEK(2), THIRD_WEEK(3), FOURTH_WEEK(4), LAST_WEEK(5);
        public int value;

        private WEEK_OF_THE_MONTH(int value) {
            this.value = value;
        }

    }

    public static enum TIMEPERIOD_TYPE {
        ONE_TIME_ONLY(0), DAILY(2), WEEKLY(3), MONTHLY(4);
        public int value;

        private TIMEPERIOD_TYPE(int value) {
            this.value = value;
        }
    }
}
