package com.github.Karina_Denisevich.task5.group;

import com.github.Karina_Denisevich.task5.Student;


import java.util.HashMap;
import java.util.Map;

public class Group<T extends Number> {

    private SubjectEnum subject;
    private Map<Student, T> studentMap;

    public Group(SubjectEnum subject) {
        studentMap = new HashMap<>();
        this.subject = subject;
    }

    public SubjectEnum getSubject() {
        return subject;
    }

    public void setSubject(SubjectEnum subject) {
        this.subject = subject;
    }

    public Map<Student, T> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Student, T> studentMap) {
        this.studentMap = studentMap;
    }

    public void addStudent(Student student, T scope){
        this.studentMap.put(student, scope);
    }
}
