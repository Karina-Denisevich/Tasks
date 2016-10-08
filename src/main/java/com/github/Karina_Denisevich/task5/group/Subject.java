package com.github.Karina_Denisevich.task5.group;

import com.github.Karina_Denisevich.task5.Student;

import java.util.HashMap;
import java.util.Map;

public class Subject<T extends Number> {

    private SubjectEnum subjectEnum;
    private Map<Student, T> studentMap;

    public Subject(SubjectEnum subjectEnum) {
        studentMap = new HashMap<>();
        this.subjectEnum = subjectEnum;
    }

    public SubjectEnum getSubjectEnum() {
        return subjectEnum;
    }

    public void setSubjectEnum(SubjectEnum subjectEnum) {
        this.subjectEnum = subjectEnum;
    }

    public Map<Student, T> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Student, T> studentMap) {
        this.studentMap = studentMap;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectEnum=" + subjectEnum +
                ", studentMap=" + studentMap +
                '}';
    }
}
