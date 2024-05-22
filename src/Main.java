import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limite = leitura.nextInt();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra:");
            double valorDaCompra = leitura.nextDouble();

            System.out.println("Compra realizada!");
            System.out.println("Didite 1 para sair ou 0 para continuar.");

            Compra compra = new Compra(descricao, valorDaCompra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("*********************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }

        System.out.println("\n*********************************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}