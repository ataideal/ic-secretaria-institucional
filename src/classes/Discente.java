package classes;

import java.util.ArrayList;

public class Discente {

	private final Integer id;

	private String nome;

	private String matricula;

	private Curso curso;

	private Periodo periodoIngresso;

	private String cpf;

	public ArrayList<Disciplinas> disciplinas;

	public Discente(int id){
		this.id = id;
		this.curso = new Curso();
		this.periodoIngresso = new Periodo();
		this.disciplinas = new ArrayList<>();
	}
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Periodo getPeriodoIngresso() {
		return periodoIngresso;
	}

	public void setPeriodoIngresso(Periodo periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString(){
		return this.nome;
	}
	public String toStringNomePeriodo(){
		return this.nome+" "+this.periodoIngresso.getAtual()+"� periodo";
	}


}
