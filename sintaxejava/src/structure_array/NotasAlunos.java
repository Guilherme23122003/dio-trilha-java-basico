package structure_array;

public class NotasAlunos {
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        double[] notas = {5.0, 9.5, 8.0, 4.0, 7.5};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Indice: " + i + " = " + notas[i]);
        }

        double media = calcularMedia(notas);
        System.out.println("A média é de: " + media);
    }
}

