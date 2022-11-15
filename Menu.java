import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LDECircular turmaA = new LDECircular();
        LDECircular turmaB = new LDECircular();
        LDECircular turmaC = new LDECircular();
        LDECircular turmaD = new LDECircular();
        int op;
        int val, falta;
        double media;
        String matr, nome;

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
                            case 1: // Turma A

                                break;
                            case 2: // Turma B

                                break;
                            case 3: // Turma C

                                break;
                            case 4: // Turma D

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
                            case 1: // Turma A

                                break;
                            case 2: // Turma B

                                break;
                            case 3: // Turma C

                                break;
                            case 4: // Turma D

                                break;
                            case 0:
                                System.out.println("Programa Encerrado!");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    } while (val != 0);
                    break;
                case 3: // Turma C
                    do {
                        exibeMenuOpcoes();
                        val = in.nextInt();
                        in.nextLine();
                        switch (val) {
                            case 1: // Turma A

                                break;
                            case 2: // Turma B

                                break;
                            case 3: // Turma C

                                break;
                            case 4: // Turma D

                                break;
                            case 0:
                                System.out.println("Programa Encerrado!");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    } while (val != 0);
                    break;
                case 4: // Turma D
                    do {
                        exibeMenuOpcoes();
                        val = in.nextInt();
                        in.nextLine();
                        switch (val) {
                            case 1: // Turma A

                                break;
                            case 2: // Turma B

                                break;
                            case 3: // Turma C

                                break;
                            case 4: // Turma D

                                break;
                            case 0:
                                System.out.println("Programa Encerrado!");
                                break;
                            default:
                                System.out.println("Opção inválida");
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
        System.out.println("1 - Turma A");
        System.out.println("2 - Turma B");
        System.out.println("3 - Turma C");
        System.out.println("4 - Turma D");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}