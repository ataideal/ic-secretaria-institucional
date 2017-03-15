package controllers;

public interface Controller {
	
	public boolean cadastrar(Object obj);
	public boolean remover(Object obj);
	public void listar();
	public boolean atualizar(Object obj);
	
}
