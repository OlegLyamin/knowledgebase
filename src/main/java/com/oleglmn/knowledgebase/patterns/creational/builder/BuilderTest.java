package com.oleglmn.knowledgebase.patterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Parallelogram parallelogram1 = Parallelogram.ParallelogramBuilder
            .aParallelogram()
            .withB(20)
            .withSquare(10, 5)
            .build();

        Parallelogram parallelogram2 = Parallelogram.ParallelogramBuilder
            .aParallelogram()
            .withA(30)
            .withB(40)
            .withH(10)
            .withSquare(30, 10, 0.5)
            .build();

        System.out.println("parallelogram1: " + parallelogram1);
        System.out.println("parallelogram2: " + parallelogram2);

    }
}
