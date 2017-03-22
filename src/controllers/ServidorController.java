package controllers;

import classes.Disciplinas;
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
            if(s instanceof Docente){
                if(((Docente) s).disciplinasMinistradas.size()>0){
                    System.out.print(s.getNome()+":\t");
                    for(Disciplinas a: ((Docente) s).disciplinasMinistradas)
                        System.out.println(a.getNome());
                }
                
            }
        }
    }
    
    public void relatorioProfPerio(){
        System.out.println("Professor - Situação");
        for(Servidor s: servidores){
            if(s instanceof Docente){
                System.out.println(s.getNome() + "\t\t\t" + ((Docente) s).getSituacao().toString());
            }
        }
    }
    
    public int getIdCount(){
    	return idCount;
    }
}
