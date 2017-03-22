package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Curso;
import classes.Disciplinas;

public class CursoController implements Controller {

	public ArrayList<Curso> cursos;
	public Scanner scan;
	private int idIncrementor;
	public CursoController(){
		cursos = new ArrayList<>();
		gerarExemplos();
		idIncrementor=0;
	}

	@Override
	public boolean cadastrar(Object curso){
		try{
			cursos.add((Curso)curso);
			System.out.println("Curso cadastrado!");
			idIncrementor++;
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
	
	 public int getIdIncrementorr(){
	    	return idIncrementor;
	    }
	public void mostrarDisciplinas(){

		scan = new Scanner(System.in);
		int cur;

		try{

			System.out.println("Escolha o curso : ");
			for(int i=0;i<cursos.size();i++){
				System.out.println(i + "- " + "Curso " + cursos.get(i).toString());
				cursos.get(i).toString();
			}

			cur = scan.nextInt();
			for(int i=0;i<cursos.get(cur).getDisciplinas().size();i++){
				System.out.println(cursos.get(cur).getDisciplinas().get(i).toString());
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
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Programação 1");
		dis.setCodigo("Comp201");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Laboratório de Programação");
		dis.setCodigo("Comp202");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Fundamentos da Matemática");
		dis.setCodigo("Comp203");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Geometria Analitica");
		dis.setCodigo("Comp204");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Introdução à Computação");
		dis.setCodigo("Comp205");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Internet e Web");
		dis.setCodigo("Comp206");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		//SEGUNDO PERIODO
		dis = new Disciplinas();
		dis.setNome("Linguagens Formais e Autômatos");
		dis.setCodigo("Comp207");
		dis.setHoras("40 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Estrutura de Dados");
		dis.setCodigo("Comp208");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Matemática Discreta");
		dis.setCodigo("Comp209");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 1");
		dis.setCodigo("Comp210");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Álgebra Linear");
		dis.setCodigo("Comp211");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Metodologia da Pesquisa e do Trabalho Científico");
		dis.setCodigo("Comp212");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Lógica Aplicada à Computação");
		dis.setCodigo("Comp213");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		//TERCEIRO PERIODO
		dis = new Disciplinas();
		dis.setNome("Teoria da Computação");
		dis.setCodigo("Comp214");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Projeto de Software");
		dis.setCodigo("Comp215");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física 1");
		dis.setCodigo("Comp216");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 2");
		dis.setCodigo("Comp217");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Circuitos Digitais");
		dis.setCodigo("Comp218");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Projeto e Análise de Algorítmos");
		dis.setCodigo("Comp219");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Banco de Dados");
		dis.setCodigo("Comp220");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		//QUARTO PERIODO
		dis = new Disciplinas();
		dis.setNome("Probabilidade e Estatística");
		dis.setCodigo("Comp221");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Metodologia e Processos");
		dis.setCodigo("Comp222");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física 2");
		dis.setCodigo("Comp223");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 3");
		dis.setCodigo("Comp224");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Organização e Arquitetura de Computadores");
		dis.setCodigo("Comp225");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Conceitos de Linguagens de Programação");
		dis.setCodigo("Comp226");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Banco de Dados 2");
		dis.setCodigo("Comp227");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física Experimental");
		dis.setCodigo("Comp228");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		return disciplinas;
	}

	public ArrayList<Disciplinas> gerarDisciplinasEC(){
            ArrayList<Disciplinas> disciplinas = new ArrayList();
		Disciplinas dis = new Disciplinas();

		//PRIMEIRO PERIODO
		dis.setNome("Inglês Instrumental");
		dis.setCodigo("ECOM001");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Programação 1");
		dis.setCodigo("ECOM002");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Matemática Discreta");
		dis.setCodigo("ECOM003");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 1");
		dis.setCodigo("ECOM004");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Geometria Analitica");
		dis.setCodigo("ECOM005");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Introdução à Eng da Computação");
		dis.setCodigo("ECOM006");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(1);
		disciplinas.add(dis);

		//SEGUNDO PERIODO
		dis = new Disciplinas();
		dis.setNome("Lógica Aplicada à Computação");
		dis.setCodigo("ECOM007");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Estrutura de Dados");
		dis.setCodigo("ECOM008");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física 1");
		dis.setCodigo("ECOM009");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 2");
		dis.setCodigo("ECOM010");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Álgebra Linear");
		dis.setCodigo("ECOM011");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Circuitos Digitais");
		dis.setCodigo("ECOM012");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Desenho");
		dis.setCodigo("ECOM013");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(2);
		disciplinas.add(dis);

		//TERCEIRO PERIODO
		dis = new Disciplinas();
		dis.setNome("Linguagens Formais, Autômatos e Computibilidade");
		dis.setCodigo("ECOM014");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Projeto de Software");
		dis.setCodigo("ECOM015");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física 2");
		dis.setCodigo("ECOM016");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 3");
		dis.setCodigo("ECOM017");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Metodologia da Pesquisa e do Trabalho Científico");
		dis.setCodigo("ECOM018");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Sistemas Digitais");
		dis.setCodigo("ECOM019");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Química Tecnológica");
		dis.setCodigo("ECOM057");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(3);
		disciplinas.add(dis);

		//QUARTO PERIODO
		dis = new Disciplinas();
		dis.setNome("Probabilidade e Estatística");
		dis.setCodigo("ECOM020");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Engenharia de Software");
		dis.setCodigo("ECOM021");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física 3");
		dis.setCodigo("ECOM022");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Cálculo 4");
		dis.setCodigo("ECOM023");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Variáveis Complexas");
		dis.setCodigo("ECOM024");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Organização e Arquitetura de Computadores");
		dis.setCodigo("ECOM025");
		dis.setHoras("60 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		dis = new Disciplinas();
		dis.setNome("Física Experimental");
		dis.setCodigo("ECOM026");
		dis.setHoras("30 hs");
		dis.getPeriodo().setAtual(4);
		disciplinas.add(dis);

		return disciplinas;

	}

	public void gerarExemplos(){
		Curso cur1 = new Curso(idIncrementor++);
		cur1.setNome("Ciência da Computação");
		cur1.setCodigo("230");
		cur1.setDisciplinas(gerarDisciplinasCC());

		Curso cur2 = new Curso(idIncrementor++);
		cur2.setNome("Engenharia da Computação");
		cur2.setCodigo("231");
		cur2.setDisciplinas(gerarDisciplinasEC()); //DEPOIS MUDAR PARA EC;

		cursos.add(cur1);
		cursos.add(cur2);
	}

	public ArrayList<Disciplinas> disciplinasPorPeriodoECurso(int atual, Curso curso) {
		ArrayList <Disciplinas> newarray = new ArrayList<>();
		for (Curso c:cursos){
			if(curso==c){
				for(Disciplinas d:c.disciplinas){
					if(d.getPeriodo().getAtual()==atual)
						newarray.add(d);
				}
			}
		}
		return newarray;
	}
        
        public void relatorioAlunos(){
            
            for(int i=0;i<cursos.size();i++){
                System.out.println("Curso : " + cursos.get(i).getNome());
                System.out.println("Número de alunos : " + cursos.get(i).getAlunos());
            }
            
        }

}
