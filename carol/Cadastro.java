package carol;

public class Cadastro<T extends Comparable<T>> extends LDECircular {
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

    public void remover (T valor) { // Remove um valor específico
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> anterior, proximo;
        if (retorno == null) {
            System.out.println("valor não encontrado!");
        } else if (this.qtd == 1) {
            this.prim = null;
            this.qtd = 0;
        } else if (retorno == this.prim) { // remove o primeiro
            this.prim = this.prim.getProx();
            this.qtd--;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        } else if (retorno == this.ult) { // remove o ultimo
            this.ult = this.ult.getAnt();
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
}