package com.github.Karina_Denisevich.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
//        records.removeAll(records.stream()
//                .filter(record1 -> record1.getRecord().equals(record))
//                .collect(Collectors.toList()));
    }

    public void deleteRecordById(int id) {
        try {
            records.remove(id);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    public void editRecord(Record targetRecord, Record replacementRecord) {
        for (Record record : records) {
            if (record.equals(targetRecord)) {
                record = replacementRecord;
            }
        }
    }

    public List<Record> getAllRecords() {
        return records;
    }
}
