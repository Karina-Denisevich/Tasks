package com.github.Karina_Denisevich.task7.annotations;


import java.lang.reflect.Constructor;

public class DescriptionAnnotationAnalyzer {

    public void analyze(Class<?> clazz) throws Exception {

        if (clazz.isAnnotationPresent(Description.class)) {
            Description description = clazz.getAnnotation(Description.class);
            Constructor con = clazz.getConstructor(Integer.class);
            Object o = con.newInstance(4);

            System.out.println(description.createdBy() + '\n');
            System.out.println(description.info());

        }
    }
}
