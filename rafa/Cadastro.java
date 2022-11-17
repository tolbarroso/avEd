package rafa;

public class Cadastro<T extends Comparable<T>> extends LDECircular {
    private LDECNode<T> prim;
    private LDECNode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*public LDECNode<T> buscar(T valor) { // busca simples
        LDECNode<T> aux = this.prim;
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
    }*/

    public void cadastrarAluno(T valor) {
        LDECNode<T> novo = new LDECNode(valor);
        LDECNode<T> aux;
        if (this.isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else {
            aux = this.buscar(valor);
            if (aux == null) { // verifica repetição
                System.out.println("valor repetido. inserção não efetuada.");
            } else {
                novo.setAnt(this.ult);
                this.ult.setProx(novo);
                this.ult = novo;
                this.qtd++;
                this.prim.setAnt(this.ult);
                this.ult.setProx(this.prim);
            }
        }
    }

    public void removerAluno(T valor) {
        LDECNode<T> aux, anterior, proximo;
        if (this.isEmpty() == true) { // Caso 1: lista vazia!
            System.out.println("lista vazia");
        } else if (this.qtd == 1) { // Caso 2: lista com apenas um nó
            if (valor.compareTo(this.prim.getInfo()) == 0) {
                this.prim = null;
                this.ult = null;
                this.qtd--;
            } else {
                System.out.println("aluno não encontrado");
            }
        } else { // Caso 3: caso geral (lista com mais de um nó)
            aux = this.buscar(valor);
            if (aux != null) {
                anterior = aux.getAnt();
                proximo = aux.getProx();
                anterior.setProx(proximo);
                proximo.setAnt(anterior);
                this.qtd--;
                if (aux == this.prim) {
                    this.prim = proximo;
                } else if (aux == this.ult) {
                    this.ult = anterior;
                }
            } else {
                System.out.println("aluno não encontrado");
            }
        }
    }
}