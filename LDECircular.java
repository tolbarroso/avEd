public class LDECircular<T extends Comparable<T>> {
    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirTodos() {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.prim;
            do {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            } while (aux != this.prim);
        }
        System.out.println(" ");
    }

    public void inserirNovaMedia(String nome, String matr, double media) {
        Aluno aluno = new Aluno(matr, nome);
        if (this.isEmpty() == true) {
            System.out.println("Aluno inválido!");
        } else if (matr != null) {
            aluno.setMedia(media);
        }
        System.out.println(aluno.getMedia());
    }

    public void inserirNovasFaltas(Aluno al, int faltas) {
        if (this.isEmpty() == true) {
            System.out.println("Aluno inválido!");
        } else if (al.getMatr() != null) {
            al.setFaltas(faltas);
        }
        System.out.println(al.getFaltas());
    }
}