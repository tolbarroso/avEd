public class Aluno implements Comparable<Aluno> {
    // Atributos
    private int matr;
    private String nome;
    private double media;
    private int faltas;

    // Construtor
    public Aluno(int m, String n) {
        this.matr = m;
        this.nome = n;
    }

    public Aluno(int m) {
        this.matr = m;
    }

    public Aluno(int ma, String n, double me, int f) {
        this.matr = ma;
        this.nome = n;
        this.media = me;
        this.faltas = f;
    }

    // Métodos GET e SET
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
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
        result = this.getMatr().compareTo(al.getMatr());
        return result;
    }

    public String toString() {
        return this.matr + " " + this.nome + " " + this.media + " " + this.faltas;
    }
}