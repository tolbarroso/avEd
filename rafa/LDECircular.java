package rafa;

public class LDECircular<T extends Comparable<T>> {
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

    public void inserir(T valor) {
        LDECNode<T> novo = new LDECNode(valor);
        LDECNode<T> aux, anterior;
        if (this.isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.prim.getInfo()) < 0) {
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.prim.getInfo()) == 0) {
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else if (valor.compareTo(this.ult.getInfo()) > 0) {
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.ult.getInfo()) == 0) {
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else { // Insere no meio
            aux = this.prim.getProx();
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada.");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(anterior);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void exibirTodos() {
        LDECNode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("lista vazia!");
        } else {
            aux = this.prim;
            do {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            } while (aux != this.prim);
        }
    }

    public void exibirEspecifico(T valor) {
        LDECNode<T> retorno = this.buscar(valor);
        if (retorno != null) {
            System.out.println(retorno.getInfo());
        } else {
            System.out.println("aluno não encontrado!");
        }
    }

    public LDECNode<T> buscar(T valor) {
        LDECNode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else if (valor.compareTo(this.ult.getInfo()) == 0) {
            return this.ult;
        } else if (valor.compareTo(this.ult.getInfo()) > 0) {
            return null;
        } else {
            aux = this.prim;
            for (int i = 0; i < this.qtd; i++) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    return aux;
                }
                aux = aux.getProx();
            }
            return null;
        }
    }

    public void remover (T valor) {
        LDECNode<T> retorno = this.buscar(valor);
        LDECNode<T> proximo, anterior;
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else if (this.qtd == 1) {
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        } else if (retorno == this.prim) {
            this.prim = this.prim.getProx();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (retorno == this.ult) {
            this.ult = this.ult.getAnt();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else {
            anterior = retorno.getAnt();
            proximo = retorno.getProx();
            anterior.setProx(proximo);
            proximo.setAnt(anterior);
            this.qtd--;
        }
    }
}