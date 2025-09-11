package operadores;

public class CalculadoraSimples {
    public static void main(String[] args) {
        int x = 35;
        int y = 49;

        System.out.println("X = "+ x);
        System.out.println("Y = "+ y);
        System.out.println("**********Operações aritiméticas**********");
        System.out.println("Soma: " + x + " + " + y + " = " + (x+y));
        System.out.println("Subtração: " + x + " - " + y + " = " + (x-y));
        System.out.println("Multiplicação: " + x + " X " + y + " = " + (x*y));
        System.out.println("Divisão: " + x + " / " + y +  " = " + (x/y));
        System.out.println("Restante da divisão: " + x + " % " + y + " = " + (x%y));
        System.out.println("******************************************");
    }
}
