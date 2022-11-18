package rafa;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro turmaA = new Cadastro();
        Cadastro turmaB = new Cadastro();
        Cadastro turmaC = new Cadastro();
        Cadastro turmaD = new Cadastro();
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
            switch (op) {
                case 1: // Turma A
                    do {
                        exibeMenuOpcoes();
                        val = in.nextInt();
                        in.nextLine();
                        switch (val) {
                            case 1: // cadastro
                                matrFantasia++;
                                System.out.println("Informe o nome do novo aluno: ");
                                nome = in.nextLine();
                                matr = "" + matrFantasia;
                                al = new Aluno(matr, nome);
                                turmaA.cadastrarAluno(al);
                                System.out.println("Sua matrícula será: " + matrFantasia);
                                break;
                            case 2: // remover
                                System.out.println("Informe a matrícula do aluno a ser removido: ");
                                matr = in.nextLine();
                                al = new Aluno(matr);
                                turmaA.removerAluno(al);
                                break;
                            case 3: // adicionar média
                                System.out.println("Informa a matrícula do aluno: ");
                                matr = in.nextLine();
                                System.out.println("Informa a nova média: ");
                                media = in.nextDouble();
                                al = new Aluno(matr);
                                turmaA.alterarMedia(al, media);
                                break;
                            case 4: // adicionar falta
                                System.out.println("Informa a matrícula do aluno: ");
                                matr = in.nextLine();
                                System.out.println("Informa quantas faltas serão adicionadas: ");
                                falta = in.nextInt();
                                al = new Aluno(matr);
                                turmaA.adicionarFalta(al, falta);
                                break;
                            case 5: // remover falta
                                System.out.println("Informa a matrícula do aluno: ");
                                matr = in.nextLine();
                                System.out.println("Informa quantas faltas serão adicionadas: ");
                                falta = in.nextInt();
                                al = new Aluno(matr);
                                turmaA.adicionarFalta(al, falta);
                                break;
                            case 6: // exibir todos
                                System.out.println("Alunos da turma A: ");
                                turmaA.exibirTodos();
                                break;
                            case 7: // exibir dados de um único aluno
                                System.out.println("Informe a matrícula do aluno: ");
                                matr = in.nextLine();
                                al = new Aluno(matr);
                                turmaA.exibirEspecifico(al);
                                break;
                            case 0:
                                System.out.println("Programa Encerrado!");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    } while (val != 0);
                    break;
                case 2: // Turma B
                    do {
                        exibeMenuOpcoes();
                        val = in.nextInt();
                        in.nextLine();
                        switch (val) {
                            case 1:

                        }
                    } while (val != 0);
                    break;
                case 3: // Turma C
                    do {
                        exibeMenuOpcoes();
                        val = in.nextInt();
                        in.nextLine();
                        switch (val) {
                            case 1:

                        }
                    } while (val != 0);
                    break;
                case 4: // Turma D
                    do {
                        exibeMenuOpcoes();
                        val = in.nextInt();
                        in.nextLine();
                        switch (val) {
                            case 1:

                        }
                    } while (val != 0);
                    break;
                case 0:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeMenuTurmas() {
        System.out.println("Opções");
        System.out.println("1 - Turma A");
        System.out.println("2 - Turma B");
        System.out.println("3 - Turma C");
        System.out.println("4 - Turma D");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void exibeMenuOpcoes() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Remover Aluno");
        System.out.println("3 - Alterar média de um Aluno");
        System.out.println("4 - Adicionar faltas de um Aluno");
        System.out.println("5 - Remover faltas de um Aluno");
        System.out.println("6 - Exibir Todos os Alunos");
        System.out.println("7 - Exibir Aluno Especifico");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}