package classes;

import java.util.ArrayList;

public class Curso {

	private final Integer id;

	private String codigo;

	private String nome;
        
        private int alunos;

	public ArrayList<Disciplinas> disciplinas;

	public Curso(int id) {
		disciplinas = new ArrayList();
        this.alunos = 0;
        this.id = id;
	}
        
        public int getAlunos() {
            return alunos;
        }

        public void setAlunos(int alunos) {
            this.alunos = alunos;
        }

	public Integer getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String toString(){
		if(this.id != 0)
			return getNome()+"\n";
		else
			return this.nome;
	}

}
