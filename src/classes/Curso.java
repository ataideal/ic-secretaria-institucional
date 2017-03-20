package classes;

import java.util.ArrayList;

public class Curso {

	private Integer id;

	private String codigo;

	private String nome;

	public ArrayList<Disciplinas> disciplinas;

	public Curso() {
		disciplinas = new ArrayList();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
