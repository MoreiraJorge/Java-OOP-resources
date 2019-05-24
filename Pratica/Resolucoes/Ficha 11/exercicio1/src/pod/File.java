package pod;

public class File {

    private String extention;
    private double size;
    private int duracao;
    private String nome;

    public File(String nome, String extention, double size, int duracao) {
        this.nome = nome;
        this.extention = extention;
        this.size = size;
        this.duracao = duracao;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String toString(){
        String text = "Nome : " + nome + "\n";
        text += "Duração : "+ duracao + "\n";
        return text;
    }
}
