package variavel_constante;

public class Produto {
    public static void main(String[] args) {
        String nomeProduto = "Shampoo";
        double precoProduto = 20.5;
        final double taxaImposto = 0.18;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor do produto: " + precoProduto);
        System.out.println("Taxa de imposto de: " + taxaImposto);
        System.out.println("Valor final: " + (precoProduto - taxaImposto));
    }
}
