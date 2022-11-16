package rafa;

import java.util.Scanner;

public class Aplicação {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LDECircular lista1 = new LDECircular();
        LDECircular lista2 = new LDECircular();
        LDECircular lista3 = new LDECircular();
        LDECircular lista4 = new LDECircular();

        int op, op2;
        int val;
        String matricula;
        String nome;
        int faltas;
        double media;
        int cont = 0, cont2 = 0;

        while (cont != 20) {
            cont++;

            exibeMenu();
            op = in.nextInt();
            in.nextLine();

            if (op == 1) {
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        System.out.println("Insira o nome do novo aluno: ");
                        nome = in.nextLine();
                        System.out.println("Insira sua matrícula: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula, nome);
                        break;
                    } else if (op2 == 2) { // remoção
                        break;
                    } else if (op2 == 3) { // alteração da média
                        break;
                    } else if (op2 == 4) { // adição de matrícula
                        break;
                    } else if (op2 == 5) { // remoção de matrícula
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        break;
                    } else if (op2 == 7) { // exibição de um
                        break;
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                        break;
                    }
                }
                break;
            } else if (op == 2) {
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        break;
                    } else if (op2 == 2) { // remoção
                        break;
                    } else if (op2 == 3) { // alteração da média
                        break;
                    } else if (op2 == 4) { // adição de matrícula
                        break;
                    } else if (op2 == 5) { // remoção de matrícula
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        break;
                    } else if (op2 == 7) { // exibição de um
                        break;
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                        break;
                    }
                }
                break;
            } else if (op == 3) {
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        break;
                    } else if (op2 == 2) { // remoção
                        break;
                    } else if (op2 == 3) { // alteração da média
                        break;
                    } else if (op2 == 4) { // adição de matrícula
                        break;
                    } else if (op2 == 5) { // remoção de matrícula
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        break;
                    } else if (op2 == 7) { // exibição de um
                        break;
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                        break;
                    }
                }
                break;
            } else if (op == 4) {
                while (cont2 != 20) {
                    cont2++;

                    exibeMenu2();
                    op2 = in.nextInt();
                    in.nextLine();

                    if (op2 == 1) { // cadastro
                        break;
                    } else if (op2 == 2) { // remoção
                        break;
                    } else if (op2 == 3) { // alteração da média
                        break;
                    } else if (op2 == 4) { // adição de matrícula
                        break;
                    } else if (op2 == 5) { // remoção de matrícula
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        break;
                    } else if (op2 == 7) { // exibição de um
                        break;
                    } else if (op2 == 0) {
                        cont2 = 20;
                        System.out.println("programa encerrado");
                    } else {
                        System.out.println("opção invalida");
                        break;
                    }
                }
                break;
            } else if (op == 0) {
                cont = 20;
                System.out.println("programa encerrado");
            } else {
                System.out.println("opção invalida");
                break;
            }
        }
    }

    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Lista 1");
        System.out.println("2 - Lista 2");
        System.out.println("3 - Lista 3");
        System.out.println("4 - Lista 4");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void exibeMenu2() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Remover");
        System.out.println("3 - Alterar média");
        System.out.println("4 - Adicionar faltas");
        System.out.println("5 - Remover faltas");
        System.out.println("6 - Exibir todos");
        System.out.println("7 - Exibir especifico");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}
