package app;

import util.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Resultado: " + calc.somar(5, 3));
    }
}