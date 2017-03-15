package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Periodo;


public class DiscenteController implements Controller {
	public ArrayList<Discente> discentes;
	
	public DiscenteController(){
		discentes = new ArrayList<>();
	}
	@Override
	public boolean cadastrar(Object aluno){
		try{
			discentes.add((Discente)aluno);
			System.out.println("Aluno cadastrado!");
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
	
}
