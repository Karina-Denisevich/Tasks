package com.github.Karina_Denisevich.task1;

import java.time.LocalDateTime;

public class Record {

    private String record;
    private LocalDateTime localDateTime;

    public Record(String record) {
        this.record = record;
        this.localDateTime = LocalDateTime.now();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

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
