package controllers;

import java.util.ArrayList;

import classes.Curso;
import classes.Discente;
import classes.Periodo;


public class DiscenteController {
	ArrayList<Discente> discentes;
	
	public DiscenteController(){
		discentes = new ArrayList<>();
	}

	public boolean cadastrarAluno(String nome,String matricula,Curso curso,Periodo periodo,String cpf){
		try{
			Discente aluno = new Discente();
			aluno.setNome(nome);
			aluno.setMatricula(matricula);
			aluno.setCurso(curso);
			aluno.setCpf(cpf);
			aluno.setPeriodoIngresso(periodo);
			discentes.add(aluno);
			return true;
		}catch (Exception e) {
			System.out.println("Erro ao cadastrar aluno!");
			return false;
		}
	}
	public void listarAlunos(){
		System.out.println("\tLista de Alunos");
		for (Discente d:discentes){
			System.out.println(d.toString());
		}
		System.out.println("\n");
	}
}
