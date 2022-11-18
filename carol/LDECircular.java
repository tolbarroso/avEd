package carol;

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

    public void inserir(T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else {
            novo.setAnt(this.ult);
            this.ult.setProx(novo);
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
    }

    public void exibirTodos() {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista de alunos está vazia!");
        } else {
            aux = this.prim;
            do {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            } while (aux != this.prim);
        }
        System.out.println(" ");
    }

    public void exibirEspecifico(T valor) {
        LDENode<T> retorno = this.buscar(valor);
        if (retorno != null) {
            System.out.println(retorno.getInfo());
        } else {
           System.out.println("aluno não encontrado!");
        }

    }

    public LDENode<T> buscar (T valor) { 
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else if (valor.compareTo(this.ult.getInfo()) == 0) {
            return this.ult;
        } else if (valor.compareTo(this.ult.getInfo()) > 0) {
            return null;
        } else {
            aux = this.prim;
            while (aux.getProx() != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                } else if (valor.compareTo(aux.getInfo()) > 0) {
                    aux = aux.getProx();
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void remover (T valor) {
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> proximo, anterior;
        if (retorno == null) {
            System.out.println("matricula não encontrado!");
        } else if (this.qtd == 1) {
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        } else if (retorno == this.prim) { // remove o primeiro
            this.prim = this.prim.getProx();
            this.prim.setAnt(null);
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (retorno == this.ult) { // remove o ultimo
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else { // remove no "meio"
            anterior = retorno.getAnt();
            proximo = retorno.getProx();
            anterior.setProx(proximo);
            proximo.setAnt(anterior);
            this.qtd--;
        }
    }
}