package com.github.Karina_Denisevich.task1;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Record> records;

    public Notebook() {
        records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public void deleteRecord(Record record) {
        records.remove(record);
    }

    public void deleteRecordById(int id) {
        try {
            records.remove(id);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("There is no element with id = " + id);
            ex.printStackTrace();
        }
    }

    public void editRecord(Record targetRecord, Record replacementRecord) {
        try {
            records.set(records.indexOf(targetRecord), replacementRecord);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("There is no such record: " + targetRecord);
            ex.printStackTrace();
        }
    }

    public List<Record> getAllRecords() {
        return records;
    }
}
