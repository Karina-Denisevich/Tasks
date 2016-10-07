package com.github.Karina_Denisevich.task1;

import java.time.LocalDateTime;

/**
 * The class used to store records.
 *
 * @author Karina Denisevich
 * @version 1.0
 */
public class Record {

    /**
     * Property - record.
     */
    private String record;
    /**
     * Property - localDateTime.
     */
    private LocalDateTime localDateTime;

    /**
     * Create new object and set current time and specified value.
     *
     * @param record record
     */
    public Record(String record) {
        this.record = record;
        this.localDateTime = LocalDateTime.now();
    }

    /**
     * The method returns the value of the field {@link Record#record}.
     *
     * @return the record
     */
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    /**
     * The method returns the value of the field {@link Record#localDateTime}.
     *
     * @return the date and the time, when Record object was created
     */
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record1 = (Record) o;

        if (!record.equals(record1.record)) return false;
        return localDateTime.equals(record1.localDateTime);

    }

    @Override
    public int hashCode() {
        int result = record.hashCode();
        result = 31 * result + localDateTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Record{" +
                "record='" + record + '\'' +
                ", date=" + localDateTime +
                '}';
    }
}
