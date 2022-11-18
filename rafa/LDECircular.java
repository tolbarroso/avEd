package rafa;

public class LDECircular<T extends Comparable<T>> {
    private LDECNode<T> prim;
    private LDECNode<T> ult;
    private int qtd;

    public boolean isEmpty() { // verificar lista vazia
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirTodos() { // ver todos os nós
        LDECNode<T> aux = this.prim;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia!");
        } else {
            do {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            } while (aux != this.prim);
        }
        System.out.println(" ");
    }

    public void exibirEspecifico(Object valor) { // ver um nó especifico
        LDECNode<T> retorno = this.buscar(valor);
        if (retorno != null) {
            System.out.println("lista vazia!");
        } else {
            valor.toString();
        }
    }

    public LDECNode<T> buscar(Object valor) { // busca simples
        LDECNode<T> aux = this.prim;
        if (this.isEmpty() == true) {
            return null;
        }
        for (int i = 0; i < this.qtd; i++) {
            if (((Comparable<T>) valor).compareTo(aux.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void alterarMedia(Object valor, double media) { // alterar atributo
        LDECNode<T> retorno = this.buscar(valor);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            ((Aluno) valor).setMedia(media);
        }
        System.out.println("média atualizada para: " + ((Aluno) valor).getMedia());
    }

    public void adicionarFalta(Object valor, int faltas) { // adicionar ao atributo
        LDECNode<T> retorno = this.buscar(valor);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            ((Aluno) valor).setFaltas(((Aluno) valor).getFaltas() + faltas);
        }
        System.out.println("faltas atualizada para: " + ((Aluno) valor).getFaltas());
    }

    public void removerFalta(Object valor, int faltas) { // remover do atributo
        LDECNode<T> retorno = this.buscar(valor);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            if (((Aluno) valor).getFaltas() >= faltas) {
                ((Aluno) valor).setFaltas(((Aluno) valor).getFaltas() - faltas);
                System.out.println("faltas atualizada para: " + ((Aluno) valor).getFaltas());
            } else {
                System.out.println("remoção não efetuada");
            }
        }
    }
}