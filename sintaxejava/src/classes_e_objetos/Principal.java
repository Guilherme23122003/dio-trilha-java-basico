package classes_e_objetos;

public class Principal {
    public static void main(String[] args) {
        //Aluno 1
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Guilherme";
        aluno1.idade = 22;
        aluno1.notaFinal = 10.0;

        //Aluno 2
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bianca";
        aluno2.idade = 17;
        aluno2.notaFinal = 9.5;

        //chamando o método para mostrar as informações
        aluno1.mostrarInfo();
        aluno2.mostrarInfo();
    }
}
