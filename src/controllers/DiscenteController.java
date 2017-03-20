package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Disciplinas;
import classes.Periodo;


public class DiscenteController implements Controller {
	public ArrayList<Discente> discentes;
	private int idIncrementor;
	public DiscenteController(){
		discentes = new ArrayList<>();
		idIncrementor=0;
	}
	@Override
	public boolean cadastrar(Object aluno){
		try{
			discentes.add((Discente)aluno);
			System.out.println("Aluno cadastrado!");
			idIncrementor++;
			return true;
		}catch (Exception e) {
			System.out.println("Erro ao cadastrar aluno!");
			return false;
		}
	}
	@Override
	public void listar(){
		System.out.println("\tLista de Alunos");
		for (Discente d:discentes){
			System.out.println(d.toString());
		}
		System.out.println("\n");
	}

	@Override
	public boolean remover(Object obj) {
		try{
			discentes.remove((Discente)obj);
			System.out.println("Aluno removido!");
			return true;
		}catch (Exception e) {
			System.out.println("Erro ao remover aluno!");
			return false;
		}
	}

	@Override
	public boolean atualizar(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getIdIncrementor(){
		return idIncrementor;
	}
	
	public void listarPorPeriodo(Periodo periodo) {
		System.out.println("\tLista de Alunos do semestre");
		for (Discente d:discentes){
			System.out.println(d.toStringNomePeriodo());
		}
		System.out.println("\n");
	}
	
	public void listarPorTurma(Periodo periodo) {
		System.out.println("\tLista de Alunos no "+periodo.getAtual()+"° periodo");
		for (Discente d:discentes){
			if(periodo.getAtual()==d.getPeriodoIngresso().getAtual())
				System.out.println(d.toString());
		}
		System.out.println("\n");
	}
	
	public void listarAlunosPorDisciplina(Disciplinas disciplina) {
		System.out.println("\tLista de Alunos na disciplina "+disciplina.getNome());
		for (Discente d:discentes){
			if(d.disciplinas.contains(disciplina))
				System.out.println(d.toString());
		}
		System.out.println("\n");
	}
	
}
