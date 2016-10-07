package com.github.Karina_Denisevich.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * The class used to store records and to manipulate them.
 *
 * @author Karina Denisevich
 * @version 1.0
 */
public class Notebook {

    /**
     * Property records used to storage the list of records.
     *
     * @see java.util.List
     */
    private List<Record> records;

    /**
     * Create new object
     */
    public Notebook() {
        records = new ArrayList<>();
    }

    /**
     * Add a new record to the records' list {@link Notebook#records}.
     *
     * @param record record for addition
     */
    public void addRecord(Record record) {
        records.add(record);
    }

    /**
     * Delete the specified record from the records' list {@link Notebook#records}.
     *
     * @param record record to deletion
     */
    public void deleteRecord(Record record) {
        records.remove(record);
    }

    /**
     * Delete the records from the records {@link Notebook#records} by index.
     *
     * @param index index of the record
     */
    public void deleteRecordByIndex(int index) {
        try {
            records.remove(index);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("There is no element with index = " + index);
            ex.printStackTrace();
        }
    }

    /**
     * Change the old record to the new one.
     *
     * @param targetRecord      The record to be replaced
     * @param replacementRecord The replacement record
     */
    public void editRecord(Record targetRecord, Record replacementRecord) {
        try {
            records.set(records.indexOf(targetRecord), replacementRecord);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("There is no such record: " + targetRecord);
            ex.printStackTrace();
        }
    }

    /**
     * @return list of the records {@link Notebook#records}
     */
    public List<Record> getAllRecords() {
        return records;
    }
}
