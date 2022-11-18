package rafa;

public class LDECNode<Aluno extends Comparable<Aluno>> {
    private Aluno info;
    private LDECNode<Aluno> ant;
    private LDECNode<Aluno> prox;

    public LDECNode(Aluno valor) {
        this.info = valor;
    }

    public Aluno getInfo() {
        return this.info;
    }

    public void setInfo(Aluno valor) {
        this.info = valor;
    }

    public LDECNode<Aluno> getAnt() {
        return this.ant;
    }

    public void setAnt(LDECNode<Aluno> novoAnt) {
        this.ant = novoAnt;
    }

    public LDECNode<Aluno> getProx() {
        return this.prox;
    }

    public void setProx(LDECNode<Aluno> novoProx) {
        this.prox = novoProx;
    }
}