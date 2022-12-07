package av2;

import java.util.Scanner;

public class CadastroProdutos {
    private BinaryTree<Produto> produtos;

    public CadastroProdutos() {
        produtos = new BinaryTree();
    }

    public void cadastrarProduto() {
        Scanner in = new Scanner(System.in);
        String codigo;
        String descricao;
        String fornecedor;
        double preco;
        int qtd;
        System.out.print("informe o código: ");
        codigo = in.nextLine();
        System.out.print("informe a descrição: ");
        descricao = in.nextLine();
        System.out.print("informe o fornecedor: ");
        fornecedor = in.nextLine();
        System.out.print("informe o preço: ");
        preco = in.nextDouble();
        System.out.print("informe a quantidade: ");
        qtd = in.nextInt();
        Produto prod = new Produto(codigo, descricao, fornecedor, preco, qtd);
        produtos.insert(prod);
    }

    public void removerProduto() {
        Scanner in = new Scanner(System.in);
        Produto prod, retorno;
        String codigo;
        System.out.print("informe o código: ");
        codigo = in.nextLine();

        prod = new Produto(codigo);
        retorno = produtos.find(prod);

        if (retorno == null) {
            System.out.println("produto não cadastrado!");
        } else {
            produtos.remove(retorno);
            System.out.println("remoção efetuada!");
        }
    }

    public void alterarQuantidade() {
        Scanner in = new Scanner(System.in);
        Produto prod, retorno;
        String codigo;
        int qtd;

        System.out.println("informe o código: ");
        codigo = in.nextLine();

        prod = new Produto(codigo);
        retorno = produtos.find(prod);

        if (retorno == null) {
            System.out.println("produto não cadastrado!");
        } else {
            System.out.println("dados atuais do produtos: ");
            System.out.println(retorno);
            System.out.println("informe a nova quantidades: ");
            qtd = in.nextInt();
            retorno.setQtd(qtd);
            System.out.println("quantidade alterada");
            System.out.println("dados após a alteração: ");
            System.out.println(retorno);

        }
    }

    public void alterarPreco() {
        Scanner in = new Scanner(System.in);
        Produto prod, retorno;
        String codigo;
        double preco;

        System.out.println("informe o código: ");
        codigo = in.nextLine();

        prod = new Produto(codigo);
        retorno = produtos.find(prod);

        if (retorno == null) {
            System.out.println("produto não cadastrado!");
        } else {
            System.out.println("dados atuais do produtos: ");
            System.out.println(retorno);
            System.out.println("informe o novo preço do produto: ");
            preco = in.nextDouble();
            retorno.setPreco(preco);
            System.out.println("preço alterado.");
            System.out.println("dados após a alteração: ");
            System.out.println(retorno);
        }
    }

    public void exibirUm() {
        Scanner in = new Scanner(System.in);
        Produto prod, retorno;
        String codigo;
        System.out.print("informe o código: ");
        codigo = in.nextLine();
        prod = new Produto(codigo);
        retorno = produtos.find(prod);
        if (retorno == null) {
            System.out.println("produto não cadastrado!");
        } else {
            System.out.println("dados do produto: ");
            System.out.println(retorno);
        }
    }

    public void exibirTodos() {
        if (this.produtos.isEmpty() == true) {
            System.out.println("não existem produtos cadastrados");
        } else {
            this.produtos.emOrdem();
        }
    }
}