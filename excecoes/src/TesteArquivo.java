import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteArquivo {
    public static void calculadora(int numero1, int numero2) {
        int resultado = numero1 / numero2;
        System.out.println(resultado);
    }

    public static void main(String[] args) {

        try {
            File arquivo = new File("dados.txt");
            Scanner leitura = new Scanner(arquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e);
        }
        calculadora(10, 0);
        System.out.println("Fim do programa...");
    }
}
