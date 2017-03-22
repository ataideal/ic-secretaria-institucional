package classes;

import enums.SituacaoDocente;
import java.util.ArrayList;

public class Docente extends Servidor{
    
    public ArrayList<Disciplinas> disciplinasMinistradas;
    private SituacaoDocente situacao;
    private ClasseDocente classe;

    public Docente(int id){
    	super(id);
    	disciplinasMinistradas = new ArrayList<>();
    }
    
    public ArrayList<Disciplinas> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(ArrayList<Disciplinas> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public SituacaoDocente getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoDocente situacao) {
        this.situacao = situacao;
    }
   
    
}
