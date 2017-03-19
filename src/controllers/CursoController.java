package controllers;

import java.util.ArrayList;

import classes.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Periodo;

public class CursoController implements Controller {
	
	public ArrayList<Curso> cursos;
	
	public CursoController(){
		cursos = new ArrayList<>();
	}
        
        @Override
	public boolean cadastrar(Object curso){
		try{
			cursos.add((Curso)curso);
			System.out.println("Curso cadastrado!");
			return true;
		}catch (Exception e) {
			System.out.println("Erro ao cadastrar curso!");
			return false;
		}
	}

        @Override
        public boolean remover(Object obj) {
            try{
			cursos.remove((Curso)obj);
			System.out.println("Curso removido!");
			return true;
		}catch (Exception e) {
			System.out.println("Erro ao remover o curso!");
			return false;
		}
        }

        @Override
        public void listar() {
            System.out.println("\tLista de Cursos");
		for (Curso c:cursos){
			System.out.println(c.toString());
		}
		System.out.println("\n");
        }

        @Override
        public boolean atualizar(Object obj) {
                
            return false;
        }
}
