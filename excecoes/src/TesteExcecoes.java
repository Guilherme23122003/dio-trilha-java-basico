public class TesteExcecoes {
    public static void main(String[] args) {

        //Aplicando testes de exceções:
        try {
            int[] testeNumeros = {1, 2};
            System.out.println(testeNumeros[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Execeção capturada: " + e);
        } catch (Exception j){
            System.out.println("Exceção registrada: " + j);
        }
        System.out.println("Fim do programa rs");
    }
}
