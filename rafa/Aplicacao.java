package rafa;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cadastro lista1 = new Cadastro();
        Cadastro lista2 = new Cadastro();
        Cadastro lista3 = new Cadastro();
        Cadastro lista4 = new Cadastro();

        int op, op2;
        String matricula;
        String nome;
        int faltas;
        double media;
        Aluno aluno;
        int cont = 0, cont2 = 0;

        while (cont != 20) {
            cont++;

            exibeMenu();
            op = in.nextInt();
            in.nextLine();

            if (op == 1) { // lista 1
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        System.out.print("insira o nome do novo aluno: ");
                        nome = in.nextLine();
                        System.out.print("insira sua matrícula: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula, nome);
                        lista1.cadastrarAluno(aluno);
                    } else if (op2 == 2) { // remoção
                        System.out.print("insira a matrícula do aluno a ser removido: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula);
                        lista1.removerAluno(aluno);
                    } else if (op2 == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a nova média: ");
                        media = in.nextDouble();
                        lista1.alterarMedia(matricula, media);
                    } else if (op2 == 4) { // adição de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas a serem adicionadas: ");
                        faltas = in.nextInt();
                        lista1.adicionarFalta(matricula, faltas);
                    } else if (op2 == 5) { // remoção de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas a serem removidas: ");
                        faltas = in.nextInt();
                        lista1.removerFalta(matricula, faltas);
                    } else if (op2 == 6) { // exibição de todos
                        System.out.println("alunos: ");
                        lista1.exibirTodos();
                    } else if (op2 == 7) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula);
                        lista1.exibirEspecifico(matricula);
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                }
          /*  } else if (op == 2) { // lista 2
                
            } else if (op == 3) { // lista 3
                
            } else if (op == 4) { // lista 4
        */
            }
        }
    }

    public static void exibeMenu() {
        System.out.println("opções");
        System.out.println("1 - lista 1");
        System.out.println("2 - lista 2");
        System.out.println("3 - lista 3");
        System.out.println("4 - lista 4");
        System.out.println("0 - encerrar programa");
        System.out.print("digite a opção desejada: ");
    }

    public static void exibeMenu2() {
        System.out.println("opções");
        System.out.println("1 - cadastrar");
        System.out.println("2 - remover");
        System.out.println("3 - alterar média");
        System.out.println("4 - adicionar faltas");
        System.out.println("5 - remover faltas");
        System.out.println("6 - exibir todos");
        System.out.println("7 - exibir especifico");
        System.out.println("0 - encerrar programa");
        System.out.print("digite a opção desejada: ");
    }
}
