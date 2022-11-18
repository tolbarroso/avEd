package caio;

public class Aluno implements Comparable<Aluno> {
    private String matricula;
    private String nome;
    private double media;
    private int falta;
    
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public int compareTo(Aluno al) {
        int result;
        result = this.getMatricula().compareTo(al.getMatricula());
        return result;
    }

    public String toString() {
        return "matrícula: " + this.matricula + " | nome: " + this.nome + " | média: " + this.media + " | faltas: " + this.falta;
    }
}