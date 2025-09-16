package classes_e_objetos;

public class Aluno {
    String nome;
    int idade;
    double notaFinal;

    void mostrarInfo() {
        System.out.println("O nome do Aluno é: " + nome);
        System.out.println("A idade do aluno é: " + idade);
        System.out.println("A notá final do aluno foi: " + notaFinal);
        System.out.println("----------------------------");
    }
}