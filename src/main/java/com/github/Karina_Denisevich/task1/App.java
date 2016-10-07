package com.github.Karina_Denisevich.task1;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Record record = new Record("1");
        Record record1 = new Record("2");
        Record record2 = new Record("3");

        Notebook notebook = new Notebook();
        notebook.addRecord(record);
        notebook.addRecord(record1);
        notebook.addRecord(record2);

        List<Record> list = notebook.getAllRecords();

        for (Record r : list) {
            System.out.println(r.toString());
        }
        notebook.editRecord(record, record1);

        System.out.println("After:");
        for (Record r : list) {
            System.out.println(r.toString());
        }
    }
}
