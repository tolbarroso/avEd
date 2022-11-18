package carol;

public class Cadastro {
    private LDECircular<Aluno> aluno;

    public Cadastro() {
        aluno = new LDECircular<>();
    }

    public void cadastro(Aluno al) {
        aluno.inserir(al);
    }

    public void excluir(String valor) {
        Aluno alunoRemovido = new Aluno(valor);
        aluno.remover(alunoRemovido);
    }

    public void exibirLista() {
        aluno.exibirTodos();
    }

    public void exibirUm(String valor) {
        Aluno alunoExibir = new Aluno(valor);
        aluno.exibirEspecifico(alunoExibir);
    }

    public Aluno consultarAluno(String valor) {
        Aluno aux = new Aluno(valor);
        Aluno retorno = aluno.buscar(aux).getInfo();
        return retorno;
    }

    public void alterarMedia(String valor, double novaMedia) {
        Aluno aux = this.consultarAluno(valor);
        if (aux != null) {
            aux.setMedia(novaMedia);
            System.out.println("sua média foi alterada!");
        } else {
            System.out.println("aluno não encontrado!");
        }
    }

    public void adicionarFalta(String valor, int novaFalta) {
        Aluno aux = this.consultarAluno(valor);
        if (aux != null) {
            aux.setFaltas(aux.getFaltas() + novaFalta);
            System.out.println("quant de faltas foi alterada!");
        } else {
            System.out.println("aluno não encontrado!");
        }
    }

    public void removerFalta(String valor, int novaFalta) {
        Aluno aux = this.consultarAluno(valor);
        if (aux != null) {
            aux.setFaltas(aux.getFaltas() - novaFalta);
            System.out.println("quant de faltas foi alterada!");
        } else {
            System.out.println("aluno não encontrado!");
        }
    }
}