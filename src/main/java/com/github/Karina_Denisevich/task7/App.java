package com.github.Karina_Denisevich.task7;

import com.github.Karina_Denisevich.task6.ships.NuclearShip;
import com.github.Karina_Denisevich.task7.annotations.DescriptionAnnotationAnalyzer;

import java.lang.reflect.Constructor;

public class App {

    public static void main(String[] args) {
        DescriptionAnnotationAnalyzer analyzer = new DescriptionAnnotationAnalyzer();

        try {
            analyzer.analyze(NuclearShip.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
