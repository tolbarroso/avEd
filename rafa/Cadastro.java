package rafa;

public class Cadastro extends LDECircular<Aluno> {
    //private LDECircular<Aluno> cadastro;

    private LDECNode<Aluno> prim;
    private LDECNode<Aluno> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void cadastrarAluno(Aluno al) {
        LDECNode<Aluno> novo = new LDECNode(al);
        LDECNode<Aluno> aux;
        if (this.isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else {
            aux = this.buscar(al);
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

    public void removerAluno(Aluno al) {
        LDECNode<Aluno> aux, anterior, proximo;
        if (this.isEmpty() == true) { // Caso 1: lista vazia!
            System.out.println("lista vazia");
        } else if (this.qtd == 1) { // Caso 2: lista com apenas um nó
            if (al.compareTo(this.prim.getInfo()) == 0) {
                this.prim = null;
                this.ult = null;
                this.qtd--;
            } else {
                System.out.println("aluno não encontrado");
            }
        } else { // Caso 3: caso geral (lista com mais de um nó)
            aux = this.buscar(al);
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