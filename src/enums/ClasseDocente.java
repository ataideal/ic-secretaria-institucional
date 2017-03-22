package enums;

public enum ClasseDocente {
    Exclusivo("Dedicação exclusiva"), R30("Regime 30 horas"), R40("Regime 40 horas");
    
    private String regime;
    
    ClasseDocente(String regime){
        this.regime = regime;
    }

    @Override
    public String toString() {
        return regime;
    }
    
    

}
