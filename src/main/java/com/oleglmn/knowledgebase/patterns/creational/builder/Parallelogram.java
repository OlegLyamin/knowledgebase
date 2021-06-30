package com.oleglmn.knowledgebase.patterns.creational.builder;

public class Parallelogram {
    private int a;
    private int b;
    private int h;
    private double square;

    @Override
    public String toString() {
        return "Parallelogram{" +
            "a=" + a +
            ", b=" + b +
            ", h=" + h +
            ", square=" + square +
            '}';
    }

    public static final class ParallelogramBuilder {
        private int a;
        private int b;
        private int h;
        private double square;

        private ParallelogramBuilder() {
        }

        public static ParallelogramBuilder aParallelogram() {
            return new ParallelogramBuilder();
        }

        public ParallelogramBuilder withA(int a) {
            this.a = a;
            return this;
        }

        public ParallelogramBuilder withB(int b) {
            this.b = b;
            return this;
        }

        public ParallelogramBuilder withH(int h) {
            this.h = h;
            return this;
        }

        public ParallelogramBuilder withSquare(int a, int h) {
            this.a = a;
            this.h = h;
            this.square = a * h;
            return this;
        }

        public ParallelogramBuilder withSquare(int a, int b, double sinA) {
            this.square = a * b * sinA;
            return this;
        }

        public Parallelogram build() {
            Parallelogram parallelogram = new Parallelogram();
            parallelogram.a = this.a;
            parallelogram.h = this.h;
            parallelogram.b = this.b;
            parallelogram.square = this.square;
            return parallelogram;
        }
    }
}
