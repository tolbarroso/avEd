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

    public void inserirNoFinal(T valor) {
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

    public void inserir(T valor) { // Insere um novo nó na lista
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) { // Lista vazia?
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.prim.getInfo()) < 0) { // Insere antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.prim.getInfo()) == 0) { // Verifica repetição
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else if (valor.compareTo(this.ult.getInfo()) > 0) { // Insere depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (valor.compareTo(this.ult.getInfo()) == 0) { // Verifica repetição
            System.out.println("Valor Repetido. Inserção não efetuada.");
        } else { //  Insere no meio
            aux = this.prim.getProx();
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) { // Verifica repetição
                    System.out.println("Valor repetido. Inserção não efetuada.");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) { // Insere no meio da lista
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
            System.out.println("lista de alunos está vazia!");
        } else {
            aux = this.prim;
            do {
                System.out.print(aux.getInfo() + " ");
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