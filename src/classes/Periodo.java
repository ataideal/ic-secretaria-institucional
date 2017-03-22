package classes;

public class Periodo {
    
    private int id;
    private String nome;
    private int atual;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return nome;
    }

    public int getAtual() {
            return atual;
    }

    public void setAtual(int atual) {
            this.atual = atual;
    }
}
