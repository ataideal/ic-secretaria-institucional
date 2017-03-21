package controllers;

import classes.Docente;
import java.util.ArrayList;

import classes.Servidor;

public class ServidorController implements Controller{
    
    public ArrayList<Servidor> servidores;
    private int idCount;
    
    
    public ServidorController(){
	servidores = new ArrayList<>();
        idCount = 0;
    }

    @Override
    public boolean cadastrar(Object servidor) {
        try{
            servidores.add((Servidor)servidor);
            System.out.println("Aluno cadastrado!");
            idCount++;
            return true;
        }catch(Exception e){
            System.out.println("Erro ao cadastrar servidor!");
            return false;
        }
    }

    @Override
    public boolean remover(Object obj) {
        try{
            servidores.remove((Servidor)obj);
            System.out.println("Aluno removido!");
            return true;
        }catch(Exception e){
            System.out.println("Erro ao remover servidor!");
            return false;
        }
    }

    @Override
    public boolean atualizar(Object obj) {
        return true;
    }

    @Override
    public void listar() {
        System.out.println("\tLista de Alunos");
            for (Servidor d:servidores){
		System.out.println(d.toString());
            }
            System.out.println("\n");
    }

    public void relatorioProfDisc() {
        System.out.println("Professor - Disciplinas");
        for(Servidor s: servidores){
            if(s instanceof Servidor){
                System.out.print(s.getNome()+":\t");
                /*Falta imprimir as disciplinas*/
            }
        }
    }
}
