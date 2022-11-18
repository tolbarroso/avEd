package caio;

public class LDECircular<T extends Comparable<T>> {
    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(T valor) {
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            this.primeiro.setAnt(this.ultimo);
            this.ultimo.setProx(this.primeiro);
        } else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
            this.primeiro.setAnt(this.ultimo);
            this.ultimo.setProx(this.primeiro);
        } else if (valor.compareTo(this.primeiro.getInfo()) == 0) {
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
            this.primeiro.setAnt(this.ultimo);
            this.ultimo.setProx(this.primeiro);
        } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else { // Insere no meio
            aux = this.primeiro.getProx();
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
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("lista vazia!");
        } else {
            aux = this.primeiro;
            do {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            } while (aux != this.primeiro);
        }
    }

    public void exibirEspecifico(T valor) {
        LDENode<T> retorno = this.buscar(valor);
        if (retorno != null) {
            System.out.println(retorno.getInfo());
        } else {
            System.out.println("matricula não encontrada!");
        }
    }

    public LDENode<T> buscar(T valor) {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
            return this.ultimo;
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            return null;
        } else {
            aux = this.primeiro;
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
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> proximo, anterior;
        if (retorno == null) {
            System.out.println("matricula não encontrada!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd--;
        } else if (retorno == this.primeiro) {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            this.primeiro.setAnt(this.ultimo);
            this.ultimo.setProx(this.primeiro);
        } else if (retorno == this.ultimo) {
            this.ultimo = this.ultimo.getAnt();
            this.qtd--;
            this.primeiro.setAnt(this.ultimo);
            this.ultimo.setProx(this.primeiro);
        } else {
            anterior = retorno.getAnt();
            proximo = retorno.getProx();
            anterior.setProx(proximo);
            proximo.setAnt(anterior);
            this.qtd--;
        }
    }
}