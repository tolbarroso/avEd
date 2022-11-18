package caio;

import java.util.Scanner;

public class Implementacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cadastro turma1 = new Cadastro();
        Cadastro turma2 = new Cadastro();
        Cadastro turma3 = new Cadastro();
        Cadastro turma4 = new Cadastro();

        int op;
        int val, faltas;
        double media;
        String nome, matricula;
        Aluno al;

        do {
            exibeTurmas();
            op = in.nextInt();
            in.nextLine();
            if (op == 1) { // lista 1
                do {
                    exibeOpcoes();
                    val = in.nextInt();
                    in.nextLine();
                    if (val == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        al = new Aluno(matricula, nome);
                        turma1.cadastroDeAluno(al);
                    } else if (val == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        turma1.excluirAluno(matricula);
                    } else if (val == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        turma1.alterarMedia(matricula, media);
                    } else if (val == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        turma1.alterarFalta(matricula, faltas);
                    } else if (val == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        turma1.exibir();
                    } else if (val == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        turma1.exibirAluno(matricula);
                    } else if (val == 0) {
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                } while (val != 0);
                break;
            } else if (op == 2) { // turma 2
                do {
                    exibeOpcoes();
                    val = in.nextInt();
                    in.nextLine();
                    if (val == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        al = new Aluno(matricula, nome);
                        turma2.cadastroDeAluno(al);
                    } else if (val == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        turma2.excluirAluno(matricula);
                    } else if (val == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        turma2.alterarMedia(matricula, media);
                    } else if (val == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        turma2.alterarFalta(matricula, faltas);
                    } else if (val == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        turma2.exibir();
                    } else if (val == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        turma2.exibirAluno(matricula);
                    } else if (val == 0) {
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                } while (val != 0);
                break;
            } else if (op == 3) { // turma 3
                do {
                    exibeOpcoes();
                    val = in.nextInt();
                    in.nextLine();
                    if (val == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        al = new Aluno(matricula, nome);
                        turma3.cadastroDeAluno(al);
                    } else if (val == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        turma1.excluirAluno(matricula);
                    } else if (val == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        turma3.alterarMedia(matricula, media);
                    } else if (val == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        turma3.alterarFalta(matricula, faltas);
                    } else if (val == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        turma3.exibir();
                    } else if (val == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        turma3.exibirAluno(matricula);
                    } else if (val == 0) {
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                } while (val != 0);
                break;
            } else if (op == 4) { // turma 4
                do {
                    exibeOpcoes();
                    val = in.nextInt();
                    in.nextLine();
                    if (val == 1) { // cadastro
                        System.out.print("insira o nome: ");
                        nome = in.nextLine();
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        al = new Aluno(matricula, nome);
                        turma4.cadastroDeAluno(al);
                    } else if (val == 2) { // remoção
                        System.out.print("insira a matrícula: ");
                        matricula = in.nextLine();
                        turma4.excluirAluno(matricula);
                    } else if (val == 3) { // alteração da média
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a média: ");
                        media = in.nextDouble();
                        turma4.alterarMedia(matricula, media);
                    } else if (val == 4) { // alteração de falta
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.print("insira a quantidade de faltas: ");
                        faltas = in.nextInt();
                        turma4.alterarFalta(matricula, faltas);
                    } else if (val == 5) { // exibição de todos
                        System.out.println("alunos: ");
                        turma4.exibir();
                    } else if (val == 6) { // exibição de um
                        System.out.print("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        turma4.exibirAluno(matricula);
                    } else if (val == 0) {
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                    }
                } while (val != 0);
                break;
            } else if (op == 0) {
                System.out.println("programa Encerrado!");
                break;
            } else {
                System.out.println("opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeTurmas() {
        System.out.println("opções");
        System.out.println("1 - turma 1");
        System.out.println("2 - turma 2");
        System.out.println("3 - turma 3");
        System.out.println("4 - turma 4");
        System.out.println("0 - encerrar programa");
        System.out.print("digite a opção desejada: ");
    }

    public static void exibeOpcoes() {
        System.out.println("opções");
        System.out.println("1 - cadastrar um novo aluno");
        System.out.println("2 - remover um aluno");
        System.out.println("3 - alterar uma média");
        System.out.println("4 - alterar faltas");
        System.out.println("5 - exibir todos os alunos");
        System.out.println("6 - exibir um aluno especifico");
        System.out.println("0 - encerrar programa");
        System.out.print("digite a opção desejada: ");
    }
}