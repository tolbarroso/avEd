package rafa;

public class Aluno implements Comparable<Aluno> {
    private String matricula;
    private String nome;
    private double media;
    private int faltas;
    
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
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

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int compareTo(Aluno al) {
        int result;
        result = this.getMatricula().compareTo(al.getMatricula());
        return result;
    }

    public String toString() {
        return "nome: " + this.nome + " matrícula: " + this.matricula+ " média: " + this.media + " faltas: " + this.faltas;
    }
}