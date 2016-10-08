package com.github.Karina_Denisevich.task5;

import com.github.Karina_Denisevich.task5.group.Subject;
import com.github.Karina_Denisevich.task5.group.SubjectEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        List<Subject> mathsGroups = new ArrayList<>();
        List<Subject> englishGroups = new ArrayList<>();

        Subject<Double> subjectMath1 = new Subject<>(SubjectEnum.Maths);
        Subject<Double> subjectMath2 = new Subject<>(SubjectEnum.Maths);
        Subject<Integer> subjectEnglish = new Subject<>(SubjectEnum.English);

        Map<Student, Double> mapMath1 = new HashMap<>();
        Map<Student, Double> mapMath2 = new HashMap<>();
        Map<Student, Integer> mapEnglish = new HashMap<>();

        Student student1 = new Student("Karina", "Denisevich");
        Student student2 = new Student("Helen", "Petrova");

        mapMath1.put(student1, 8.2);
        subjectMath1.setStudentMap(mapMath1);

        mapMath2.put(student2, 8.6);
        subjectMath2.setStudentMap(mapMath2);

        mapEnglish.put(student1, 8);
        mapEnglish.put(student2, 9);
        subjectEnglish.setStudentMap(mapEnglish);

        mathsGroups.add(subjectMath1);
        mathsGroups.add(subjectMath2);
        englishGroups.add(subjectEnglish);

    }
}
