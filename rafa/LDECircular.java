package rafa;

public class LDECircular<ALuno extends Comparable<Aluno>> {
    private LDECNode<Aluno> prim;
    private LDECNode<Aluno> ult;
    private int qtd;

    public boolean isEmpty() { // verificar lista vazia
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirTodos() { // ver todos os nós
        LDECNode<Aluno> aux = this.prim;
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

    public void exibirEspecifico(Aluno al) { // ver um nó especifico
        LDECNode<Aluno> retorno = this.buscar(al);
        if (retorno != null) {
            System.out.println("lista vazia!");
        } else {
            al.toString();
        }
    }

    public LDECNode<Aluno> buscar(Aluno al) { // busca simples
        LDECNode<Aluno> aux = this.prim;
        if (this.isEmpty() == true) {
            return null;
        }
        for (int i = 0; i < this.qtd; i++) {
            if (al.compareTo(aux.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void alterarMedia(Aluno al, double media) { // alterar atributo
        LDECNode<Aluno> retorno = this.buscar(al);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            al.setMedia(media);
        }
        System.out.println("média atualizada para: " + al.getMedia());
    }

    public void adicionarFalta(Aluno al, int faltas) { // adicionar ao atributo
        LDECNode<Aluno> retorno = this.buscar(al);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            al.setFaltas(al.getFaltas() + faltas);
        }
        System.out.println("faltas atualizada para: " + al.getFaltas());
    }

    public void removerFalta(Aluno al, int faltas) { // remover do atributo
        LDECNode<Aluno> retorno = this.buscar(al);
        if (retorno == null) {
            System.out.println("aluno não encontrado!");
        } else {
            if (al.getFaltas() >= faltas) {
                al.setFaltas(al.getFaltas() - faltas);
                System.out.println("faltas atualizada para: " + al.getFaltas());
            } else {
                System.out.println("remoção não efetuada");
            }
        }
    }
}