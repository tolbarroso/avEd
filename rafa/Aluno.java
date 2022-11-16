package rafa;

public class Aluno implements Comparable<Aluno> {
    // Atributos
    private String matricula;
    private String nome;
    private double media;
    private int faltas;

    // Construtor
    public Aluno(String matricula) {
        this.matricula = matricula;
    }
    
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(String matricula, String nome, double media, int faltas) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
        this.faltas = faltas;
    }

    // Métodos GET e SET
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
        return "matrícula: " + this.matricula + " nome: " + this.nome + " média: " + this.media + " faltas: " + this.faltas;
    }
}