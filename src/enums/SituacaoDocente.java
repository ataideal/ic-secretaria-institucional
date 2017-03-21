package enums;

public enum SituacaoDocente {
    FERIAS("Férias"), AFASTADO("Afastado"), LICENSA("Licensa"), NORMAL("Normal");
    
    private String situacao;

    private SituacaoDocente(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return situacao;
    }
    
    
    
    
}
