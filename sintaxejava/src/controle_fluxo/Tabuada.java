package controle_fluxo;

/*
 * Tarefa:
 * Crie uma classe Tabuada.
 * Use for para imprimir a tabuada do número 7.
 * Depois, use while para imprimir números pares de 0 a 10.
 * Use if dentro do while para decidir se o número é par.
 * */

public class Tabuada {
    public static void main(String[] args) {

        int tabuada;

        //Laço for
        for (int i = 0; i <= 10; i++) {
            tabuada = 7;
            int calcular = tabuada * i;
            System.out.println(tabuada + " * " + i + " = " + calcular);
        }


        //Laço while
        int contador = 0;
        while (contador <= 10) {
            if (contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
