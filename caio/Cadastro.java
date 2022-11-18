package caio;

public class Cadastro {
    private LDECircular<Aluno> val;

    public Cadastro() {
        val = new LDECircular<>();
    }

    public void cadastroDeAluno(Aluno al) {
        val.inserir(al);
    }

    public void excluirAluno(String valor) {
        Aluno aluno = new Aluno(valor);
        val.remover(aluno);
    }

    public void exibir() {
        val.exibirTodos();
    }

    public void exibirAluno(String valor) {
        Aluno aluno = new Aluno(valor);
        val.exibirEspecifico(aluno);
    }

    public Aluno consultar(String valor) {
        Aluno aux = new Aluno(valor);
        Aluno retorno = val.buscar(aux).getInfo();
        return retorno;
    }

    public void alterarMedia(String valor, double media) {
        Aluno aux = this.consultar(valor);
        if (aux != null) {
            aux.setMedia(media);
        } else {
            System.out.println("matricula não encontrada!");
        }
    }

    public void alterarFalta(String valor, int falta) {
        Aluno aux = this.consultar(valor);
        if (aux != null) {
            aux.setFalta(falta);
        } else {
            System.out.println("matricula não encontrada!");
        }
    }
}