package br.com.alura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartao:");
        double limite = scanner.nextDouble();

        Cartao cartao = new Cartao(limite);

        int opcao = 1;
        while(opcao != 0){
            System.out.println("Digite a descricao da compra:");
            String nomeDoProduto = scanner.next();

            System.out.println("Digite o valor da compra:");
            double precoDoProduto = scanner.nextDouble();

            Produto produto = new Produto(nomeDoProduto, precoDoProduto);
            boolean compraRealizada = cartao.lancarCompra(produto);

            if (compraRealizada) {
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = scanner.nextInt();
            } else {
                System.out.println("Saldo Indisponível!");
                cartao.exibirInformacoesDoCartao();
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = scanner.nextInt();
            }
        }
        cartao.exibirInformacoesDoCartao();
    }
}