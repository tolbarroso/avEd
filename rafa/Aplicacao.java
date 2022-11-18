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
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula, nome);
                        lista1.cadastrarAluno(aluno);
                    } else if (op2 == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        lista1.removerAluno(matricula);
                    } else if (op2 == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        lista1.alterarMedia(matricula, media);
                    } else if (op2 == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        lista1.alterarFalta(matricula, faltas);
                    } else if (op2 == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        lista1.exibirLista();
                    } else if (op2 == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        lista1.exibirUm(matricula);
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                }
            } else if (op == 2) { // lista 2
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula, nome);
                        lista2.cadastrarAluno(aluno);
                    } else if (op2 == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        lista2.removerAluno(matricula);
                    } else if (op2 == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        lista2.alterarMedia(matricula, media);
                    } else if (op2 == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        lista2.alterarFalta(matricula, faltas);
                    } else if (op2 == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        lista2.exibirLista();
                    } else if (op2 == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        lista2.exibirUm(matricula);
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                }
            } else if (op == 3) { // lista 3
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula, nome);
                        lista3.cadastrarAluno(aluno);
                    } else if (op2 == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        lista3.removerAluno(matricula);
                    } else if (op2 == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        lista3.alterarMedia(matricula, media);
                    } else if (op2 == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        lista3.alterarFalta(matricula, faltas);
                    } else if (op2 == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        lista3.exibirLista();
                    } else if (op2 == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        lista3.exibirUm(matricula);
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                }
            } else if (op == 4) { // lista 4
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        aluno = new Aluno(matricula, nome);
                        lista4.cadastrarAluno(aluno);
                    } else if (op2 == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        lista4.removerAluno(matricula);
                    } else if (op2 == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        lista4.alterarMedia(matricula, media);
                    } else if (op2 == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        lista4.alterarFalta(matricula, faltas);
                    } else if (op2 == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        lista4.exibirLista();
                    } else if (op2 == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        lista4.exibirUm(matricula);
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                }
            }
        }
    }

    public static void exibeMenu() {
        System.out.println("opções");
        System.out.println("1 - lista 1");
        System.out.println("2 - lista 2");
        System.out.println("3 - lista 3");
        System.out.println("4 - lista 4");
        System.out.println("0 - encerrar");
        System.out.print("digite a opção desejada: ");
    }

    public static void exibeMenu2() {
        System.out.println("opções");
        System.out.println("1 - cadastrar");
        System.out.println("2 - remover");
        System.out.println("3 - alterar média");
        System.out.println("4 - alterar faltas");
        System.out.println("5 - exibir todos");
        System.out.println("6 - exibir especifico");
        System.out.println("0 - encerrar");
        System.out.print("digite a opção desejada: ");
    }
}
