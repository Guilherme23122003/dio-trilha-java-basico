package metodo_em_java;

public class Calculadora {
    public static int multiplicar(int a, int b){
        return a + b;
    }

    public static void multiplicar3(int a, int b, int c){
        int somar = a + b + c;
        System.out.println("O resultado dessas somas são: " + somar);
    }

    public static void mostrarMensagem(){
        System.out.println("Calculadora pronta!");
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.mostrarMensagem();

        int soma = multiplicar(100,879);
        System.out.println("O resultado dessa soma é: "+ soma);


        calculadora.multiplicar3(15, 17, 23);
    }
}
