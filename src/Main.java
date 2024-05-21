import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limite;
        String descricao;
        int valorDaCompra;

        for (opcao =! 2){
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o limite do cartão:");
            limite = leitura.nextInt();

            System.out.println("Digite a descrição da compra:");
            descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra:");
            valorDaCompra = leitura.nextInt();

            System.out.println("Compra realizada!");
            System.out.println("Didite 1 para sair ou 0 para continuar.");
            opcao = leitura.nextInt();
        }
    }
}