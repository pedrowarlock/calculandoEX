package com.example.calculandoex;

public class Calculando {
    public static double soma(double a, double b) {
        return a + b;
    }
    public static double subtracao(double a, double b) {
        return a - b;
    }
    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static double exponenciacao(double a, double b) {
        return Math.pow(a, b);
    }

    public static double radiciacao(double a, double b) {
        double calc = Math.pow(a,1.0/b);
        return Math.round(calc * 1000) / 1000.0;
    }
}


