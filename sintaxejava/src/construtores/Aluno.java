package construtores;
/*
 * Crie uma classe chamada Aluno que possua:
 * Atributos: nome e nota.
 * Um construtor padrão que define nome = "Sem nome" e nota = 0.
 * Um construtor com parâmetros para definir nome e nota.
 * Um método mostrarInfo() para exibir os dados.
 * Teste criando 3 objetos:
 * Um com o construtor padrão.
 * Um apenas com nome.
 * Um com nome e nota.
 * */

public class Aluno {
    String nome;
    double nota;

    public Aluno() {
        this.nome = "Sem nome";
        this.nota = 0;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0;
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    void mostrarInfo() {
        System.out.println(" ALuno: " + nome + " - Nota: " + nota);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Guilherme");
        Aluno aluno3 = new Aluno("Bianca", 10.0);

        aluno1.mostrarInfo();
        aluno2.mostrarInfo();
        aluno3.mostrarInfo();
    }
}
