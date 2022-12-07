package av2;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroProdutos produtos = new CadastroProdutos();
        int op;
        do {
            exibirOpcoes();
            op = in.nextInt();

            if (op == 1) {
                produtos.cadastrarProduto();
            } else if (op == 2) {
                produtos.exibirTodos();
            } else if (op == 3) {
                produtos.alterarPreco();
            } else if (op == 4) {
                produtos.alterarQuantidade();
            } else if (op == 5) {
                produtos.exibirUm();
            } else if (op == 6) {
                produtos.removerProduto();
            } else if (op == 0) {
                System.out.println("bye");
            } else {
                System.out.println("opção inválida");
            }
        } while (op != 0);
    }

    public static void exibirOpcoes() {
        System.out.println(" ");
        System.out.println("1 - cadastro de produto");
        System.out.println("2 - exibir info de todos");
        System.out.println("3 - alteração de preçoa");
        System.out.println("4 - alteração de quantidade");
        System.out.println("5 - exibir info de um produto");
        System.out.println("6 - remoção de produto");
        System.out.println("0 - encerrar");
        System.out.println("informe uma opção: ");
    }
}