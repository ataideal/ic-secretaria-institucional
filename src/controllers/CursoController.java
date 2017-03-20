package controllers;

import java.util.ArrayList;

import classes.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Disciplinas;
import classes.Periodo;

public class CursoController implements Controller {
	
	public ArrayList<Curso> cursos;
	public Scanner scan;
        
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
        
        public void mostrarDisciplinas(){
            
            scan = new Scanner(System.in);
            int cur;
            
            System.out.println("Escolha o curso : ");
            for(int i=0;i<cursos.size();i++){
                System.out.println("Curso " + i);
                cursos.get(i).toString();
            }
            
            cur = scan.nextInt();
            
            try{
                for(int i=0;i<cursos.get(cur).getDisciplinas().size();i++){
                    cursos.get(cur).getDisciplinas().get(i).toString();
                }
            } catch(Exception e) {
                System.out.println("Operação inválida!");
            }
     
                    
        }
        
        
        public ArrayList<Disciplinas> gerarDisciplinasCC(){
            ArrayList<Disciplinas> disciplinas = new ArrayList();
            Disciplinas dis = new Disciplinas();
            
            //PRIMEIRO PERIODO
            dis.setNome("Inglês Instrumental");
            dis.setCodigo("Comp200");
            dis.setHoras("60 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            dis.setNome("Programação 1");
            dis.setCodigo("Comp201");
            dis.setHoras("60 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            dis.setNome("Laboratório de Programação");
            dis.setCodigo("Comp202");
            dis.setHoras("30 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            dis.setNome("Fundamentos da Matemática");
            dis.setCodigo("Comp203");
            dis.setHoras("60 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            dis.setNome("Geometria Analitica");
            dis.setCodigo("Comp204");
            dis.setHoras("60 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            dis.setNome("Introdução à Computação");
            dis.setCodigo("Comp205");
            dis.setHoras("60 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            dis.setNome("Internet e Web");
            dis.setCodigo("Comp206");
            dis.setHoras("30 hs");
            dis.setPeriodo("1");
            disciplinas.add(dis);
            
            //SEGUNDO PERIODO
            dis.setNome("Linguagens Formais e Autômatos");
            dis.setCodigo("Comp207");
            dis.setHoras("40 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            dis.setNome("Estrutura de Dados");
            dis.setCodigo("Comp208");
            dis.setHoras("60 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            dis.setNome("Matemática Discreta");
            dis.setCodigo("Comp209");
            dis.setHoras("60 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            dis.setNome("Cálculo 1");
            dis.setCodigo("Comp210");
            dis.setHoras("60 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            dis.setNome("Álgebra Linear");
            dis.setCodigo("Comp211");
            dis.setHoras("60 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            dis.setNome("Metodologia da Pesquisa e do Trabalho Científico");
            dis.setCodigo("Comp212");
            dis.setHoras("30 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            dis.setNome("Lógica Aplicada à Computação");
            dis.setCodigo("Comp213");
            dis.setHoras("60 hs");
            dis.setPeriodo("2");
            disciplinas.add(dis);
            
            //TERCEIRO PERIODO
            dis.setNome("Teoria da Computação");
            dis.setCodigo("Comp214");
            dis.setHoras("30 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            dis.setNome("Projeto de Software");
            dis.setCodigo("Comp215");
            dis.setHoras("60 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            dis.setNome("Física 1");
            dis.setCodigo("Comp216");
            dis.setHoras("60 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            dis.setNome("Cálculo 2");
            dis.setCodigo("Comp217");
            dis.setHoras("60 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            dis.setNome("Circuitos Digitais");
            dis.setCodigo("Comp218");
            dis.setHoras("30 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            dis.setNome("Projeto e Análise de Algorítmos");
            dis.setCodigo("Comp219");
            dis.setHoras("60 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            dis.setNome("Banco de Dados");
            dis.setCodigo("Comp220");
            dis.setHoras("60 hs");
            dis.setPeriodo("3");
            disciplinas.add(dis);
            
            //QUARTO PERIODO
            dis.setNome("Probabilidade e Estatística");
            dis.setCodigo("Comp221");
            dis.setHoras("60 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Metodologia e Processos");
            dis.setCodigo("Comp222");
            dis.setHoras("30 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Física 2");
            dis.setCodigo("Comp223");
            dis.setHoras("60 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Cálculo 3");
            dis.setCodigo("Comp224");
            dis.setHoras("60 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Organização e Arquitetura de Computadores");
            dis.setCodigo("Comp225");
            dis.setHoras("60 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Conceitos de Linguagens de Programação");
            dis.setCodigo("Comp226");
            dis.setHoras("60 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Banco de Dados 2");
            dis.setCodigo("Comp227");
            dis.setHoras("30 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            dis.setNome("Física Experimental");
            dis.setCodigo("Comp228");
            dis.setHoras("30 hs");
            dis.setPeriodo("4");
            disciplinas.add(dis);
            
            return disciplinas;
        }
        
        public void gerarDisciplinasEC(){
            
        }
        
        public void gerarExemplos(){
            Curso cur1 = new Curso();
            cur1.setNome("Ciência da Computação");
            cur1.setCodigo("230");
            cur1.setId(1);
            cur1.setDisciplinas(gerarDisciplinasCC());
   
            Curso cur2 = new Curso();
            cur2.setNome("Engenharia da Computação");
            cur2.setCodigo("231");
            cur2.setId(2);
            cur2.setDisciplinas(gerarDisciplinasCC()); //DEPOIS MUDAR PARA EC;
            
            cursos.add(cur1);
            cursos.add(cur2);
        }
}
