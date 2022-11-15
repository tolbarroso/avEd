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

    public LDENode<T> buscar(T valor) { // busca simples
        LDENode<T> aux = this.prim;
        if (this.isEmpty() == true) {
            return null;
        }
        if (valor.compareTo(this.ult.getInfo()) == 0) {
            return this.ult;
        }
        for (int i = 0; i < this.qtd; i++) {
            if (valor.compareTo(aux.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public LDENode<T> buscar2(Aluno al) {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.prim;
            while (aux != null) {
                if (aux.getInfo().compareTo(al) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirMedia(Aluno al, double media) {
        LDENode<T> retorno = this.buscar2(al);
        if (retorno == null) {
            System.out.println("Aluno inválido!");
        } else {
            al.setMedia(media);
        }
        System.out.println("média atualizada para: " + al.getMedia());
    }

    public void adicionarFalta(Aluno al, int faltasNovas){
        LDENode<T> retorno = this.buscar2(al);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            al.setFaltas(al.getFaltas() + faltasNovas);
        }
        System.out.println("faltas atualizada para: " + al.getFaltas());
    }

    public void retirarFalta(Aluno al, int faltasRemovidas){
        LDENode<T> retorno = this.buscar2(al);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            al.setFaltas(al.getFaltas() - faltasRemovidas);
        }
        System.out.println("faltas atualizada para: " + al.getFaltas());
    }
}