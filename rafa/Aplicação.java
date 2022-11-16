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
                        System.out.println("insira o nome do novo aluno: ");
                        nome = in.nextLine();
                        System.out.println("insira sua matrícula: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula, nome);
                        lista1.cadastrarAluno(aluno);
                        break;
                    } else if (op2 == 2) { // remoção
                        System.out.println("insira a matrícula do aluno a ser removido: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula);
                        lista1.removerAluno(aluno);
                        break;
                    } else if (op2 == 3) { // alteração da média
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a nova média: ");
                        media = in.nextDouble();
                        Aluno aluno;
                        lista1.alterarMedia(matricula, media);
                        break;
                    } else if (op2 == 4) { // adição de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem adicionadas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista1.adicionarFalta(matricula, faltas);
                        break;
                    } else if (op2 == 5) { // remoção de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem removidas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista1.removerFalta(matricula, faltas);
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        System.out.println("alunos: ");
                        lista1.exibirTodos();
                        break;
                    } else if (op2 == 7) { // exibição de um
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        Aluno aluno;
                        lista1.exibirEspecifico(matricula);
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
                        System.out.println("insira o nome do novo aluno: ");
                        nome = in.nextLine();
                        System.out.println("insira sua matrícula: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula, nome);
                        lista2.cadastrarAluno(aluno);
                        break;
                    } else if (op2 == 2) { // remoção
                        System.out.println("insira a matrícula do aluno a ser removido: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula);
                        lista2.removerAluno(aluno);
                        break;
                    } else if (op2 == 3) { // alteração da média
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a nova média: ");
                        media = in.nextDouble();
                        Aluno aluno;
                        lista2.alterarMedia(matricula, media);
                        break;
                    } else if (op2 == 4) { // adição de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem adicionadas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista2.adicionarFalta(matricula, faltas);
                        break;
                    } else if (op2 == 5) { // remoção de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem removidas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista2.removerFalta(matricula, faltas);
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        System.out.println("alunos: ");
                        lista2.exibirTodos();
                        break;
                    } else if (op2 == 7) { // exibição de um
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        Aluno aluno;
                        lista2.exibirEspecifico(matricula);
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
                        System.out.println("insira o nome do novo aluno: ");
                        nome = in.nextLine();
                        System.out.println("insira sua matrícula: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula, nome);
                        lista3.cadastrarAluno(aluno);
                        break;
                    } else if (op2 == 2) { // remoção
                        System.out.println("insira a matrícula do aluno a ser removido: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula);
                        lista3.removerAluno(aluno);
                        break;
                    } else if (op2 == 3) { // alteração da média
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a nova média: ");
                        media = in.nextDouble();
                        Aluno aluno;
                        lista3.alterarMedia(matricula, media);
                        break;
                    } else if (op2 == 4) { // adição de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem adicionadas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista3.adicionarFalta(matricula, faltas);
                        break;
                    } else if (op2 == 5) { // remoção de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem removidas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista3.removerFalta(matricula, faltas);
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        System.out.println("alunos: ");
                        lista3.exibirTodos();
                        break;
                    } else if (op2 == 7) { // exibição de um
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        Aluno aluno;
                        lista3.exibirEspecifico(matricula);
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
                        System.out.println("insira o nome do novo aluno: ");
                        nome = in.nextLine();
                        System.out.println("insira sua matrícula: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula, nome);
                        lista4.cadastrarAluno(aluno);
                        break;
                    } else if (op2 == 2) { // remoção
                        System.out.println("insira a matrícula do aluno a ser removido: ");
                        matricula = in.nextLine();
                        Aluno aluno = new Aluno(matricula);
                        lista4.removerAluno(aluno);
                        break;
                    } else if (op2 == 3) { // alteração da média
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a nova média: ");
                        media = in.nextDouble();
                        Aluno aluno;
                        lista4.alterarMedia(matricula, media);
                        break;
                    } else if (op2 == 4) { // adição de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem adicionadas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista4.adicionarFalta(matricula, faltas);
                        break;
                    } else if (op2 == 5) { // remoção de falta
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("insira a quantidade de faltas a serem removidas: ");
                        faltas = in.nextInt();
                        Aluno aluno;
                        lista4.removerFalta(matricula, faltas);
                        break;
                    } else if (op2 == 6) { // exibição de todos
                        System.out.println("alunos: ");
                        lista4.exibirTodos();
                        break;
                    } else if (op2 == 7) { // exibição de um
                        System.out.println("insira a matrícula do aluno: ");
                        matricula = in.nextLine();
                        Aluno aluno;
                        lista4.exibirEspecifico(matricula);
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
