import java.util.Scanner;

public class TesteThrow {
    public static void lerNumero(int numeroDigitado) throws IllegalArgumentException {
        if (numeroDigitado == 0) {
            //Essa é a "e.getMessage" solicitada no método main.
            throw new IllegalArgumentException("Não foi possível ler o número digitado");
        } else {
            System.out.println("Você digitou o número: " + numeroDigitado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite um número");
        int numeroDigitado = scanner.nextInt();

        try {
            lerNumero(numeroDigitado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}