package rafa;

public class Cadastro {
    private LDECircular<Aluno> novo;

    public Cadastro() {
        novo = new LDECircular<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        novo.inserir(aluno);
    }

    public void excluir(String valor) {
        Aluno aluno = new Aluno(valor);
        novo.remover(aluno);
    }

    public void exibirLista() {
        novo.exibirTodos();
    }

    public void exibirUm(String valor) {
        Aluno aluno = new Aluno(valor);
        novo.exibirEspecifico(aluno);
    }

    public Aluno pesquisar(String valor) {
        Aluno aux = new Aluno(valor);
        Aluno retorno = novo.buscar(aux).getInfo();
        return retorno;
    }

    public void alterarMedia(String valor, double media) {
        Aluno aux = this.pesquisar(valor);
        if (aux != null) {
            aux.setMedia(media);
        } else {
            System.out.println("aluno não encontrado!");
        }
    }

    public void alterarFalta(String valor, int falta) {
        Aluno aux = this.pesquisar(valor);
        if (aux != null) {
            aux.setFaltas(falta);
        } else {
            System.out.println("aluno não encontrado!");
        }
    }
}