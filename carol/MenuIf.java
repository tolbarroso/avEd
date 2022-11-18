package carol;

import java.util.Scanner;

public class MenuIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cadastro lista1 = new Cadastro();
        Cadastro lista2 = new Cadastro();
        Cadastro lista3 = new Cadastro();
        Cadastro lista4 = new Cadastro();

        int op;
        int val, falta;
        double media;
        int matrFantasia = 0;
        String nome, matr;
        Aluno al;

        do {
            exibeMenuTurmas();
            op = in.nextInt();
            in.nextLine();
            if (op == 1) { // lista 1
                do {
                    exibeMenuOpcoes();
                    val = in.nextInt();
                    in.nextLine();
                    if (val == 1) { // cadastro
                        matrFantasia++;
                        System.out.println("informe o nome do novo aluno: ");
                        nome = in.nextLine();
                        matr = "" + matrFantasia;
                        al = new Aluno(matr, nome);
                        System.out.println("Sua matrícula será: " + matrFantasia);
                        lista1.inserir(al);
                    } else if (val == 2) { // remover
                        System.out.println("informe a matrícula do aluno a ser removido: ");
                        matr = in.nextLine();
                        al = new Aluno(matr);
                        lista1.remover(matr);
                    } else if (val == 3) { // alteração da média
                        System.out.println("informa a matrícula do aluno: ");
                        matr = in.nextLine();
                        System.out.println("informa a nova média: ");
                        media = in.nextDouble();
                        al = new Aluno(matr);
                        lista1.inserirMedia(al, media);
                    } else if (val == 4) { // adição de falta
                        System.out.println("informa a matrícula do aluno: ");
                        matr = in.nextLine();
                        System.out.println("informa quantas faltas serão adicionadas: ");
                        falta = in.nextInt();
                        al = new Aluno(matr);
                        lista1.adicionarFalta(al, falta);
                    } else if (val == 5) { // remoção de falta
                        System.out.println("informa a matrícula do aluno: ");
                        matr = in.nextLine();
                        System.out.println("informa quantas faltas serão adicionadas: ");
                        falta = in.nextInt();
                        al = new Aluno(matr);
                        lista1.adicionarFalta(al, falta);
                    } else if (val == 6) { // exibição de todos
                        System.out.println("alunos da Turma A: ");
                        lista1.exibirTodos();
                    } else if (val == 7) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matr = in.nextLine();
                        al = new Aluno(matr);
                        lista1.exibirEspecifico(al);
                    } else if (val == 0) {
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                } while (val != 0);
                break;
            } else if (op == 2) { // lista 2
                
            } else if (op == 3) { // lista 3
                
            } else if (op == 4) { // lista 4
                
            } else if (op == 0) {
                System.out.println("Programa Encerrado!");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeMenuTurmas() {
        System.out.println("opções");
        System.out.println("1 - lista 1");
        System.out.println("2 - lista 2");
        System.out.println("3 - lista 3");
        System.out.println("4 - lista 4");
        System.out.println("0 - encerrar programa");
        System.out.print("digite a opção desejada: ");
    }

    public static void exibeMenuOpcoes() {
        System.out.println("opções");
        System.out.println("1 - cadastrar um novo aluno");
        System.out.println("2 - remover um aluno");
        System.out.println("3 - alterar uma média");
        System.out.println("4 - adicionar novas faltas");
        System.out.println("5 - remover faltas");
        System.out.println("6 - exibir todos os alunos");
        System.out.println("7 - exibir um aluno especifico");
        System.out.println("0 - encerrar programa");
        System.out.print("digite a opção desejada: ");
    }
}