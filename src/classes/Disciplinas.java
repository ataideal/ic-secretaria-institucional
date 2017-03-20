package classes;

public class Disciplinas {
    
    private String nome;
    private String codigo;
    private String horas;
    private Periodo periodo;
    
    public Disciplinas(){
    	periodo = new Periodo();
    }
    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return getCodigo() + " / " + getNome() + " / " + getHoras();
    }

 
    
}
