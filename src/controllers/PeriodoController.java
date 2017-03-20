package controllers;

import java.util.ArrayList;

import classes.Periodo;

public class PeriodoController {
	public ArrayList<Periodo> periodos;
	
	public PeriodoController(){
		periodos = new ArrayList<>();
		gerarPeriodos();
	}

	public int getAtual(Periodo periodo) {
		for(int i=0;i<periodos.size();i++){
			System.out.println(periodos.get(i).toString());
			if(periodo.getNome().equals(periodos.get(i).getNome()))
				return periodos.size()-i;
		}
		return 0;
	}
	
	private void gerarPeriodos(){
		Periodo p = new Periodo();
		p.setNome("2015.1");
		periodos.add(p);
		p = new Periodo();
		p.setNome("2015.2");
		periodos.add(p);
		p = new Periodo();
		p.setNome("2016.1");
		periodos.add(p);
		p = new Periodo();
		p.setNome("2016.2");
		periodos.add(p);
		p = new Periodo();
		p.setNome("2017.1");
		periodos.add(p);
	}
}
