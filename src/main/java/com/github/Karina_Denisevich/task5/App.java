package com.github.Karina_Denisevich.task5;

import com.github.Karina_Denisevich.task5.group.Group;
import com.github.Karina_Denisevich.task5.group.SubjectEnum;


import java.util.*;

public class App {

    public static void main(String[] args) {
        //all groups
        List<Group> groups = new ArrayList<>();

        //defined groups
        Group<Double> mathGroup = new Group<>(SubjectEnum.Maths);
        Group<Integer> englishGroup = new Group<>(SubjectEnum.English);

        groups.add(mathGroup);
        groups.add(englishGroup);

        Student student1 = new Student("Karina", "Denisevich");
        Student student2 = new Student("Helen", "Petrova");

        mathGroup.addStudent(student1, 8.8);
        mathGroup.addStudent(student2, 8.9);

        englishGroup.addStudent(student2, 9);

        //info about student2
        for (Group group : groups) {
            ((Set<Map.Entry>) group.getStudentMap().entrySet()).stream()
                    .filter(entry -> entry.getKey().equals(student2))
                    .forEach(entry -> {
                        System.out.println(group.getSubject() + ": " + entry.getKey() + " - " + entry.getValue());
                    });

        }

    }
}
