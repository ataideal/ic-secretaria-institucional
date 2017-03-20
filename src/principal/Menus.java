package principal;

import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Periodo;
import controllers.CursoController;
import controllers.DiscenteController;
import controllers.GenericController;
import controllers.PeriodoController;

public class Menus {
	private Scanner scan;
	public DiscenteController discenteController;
	public CursoController cursoController;
	public PeriodoController periodoController;

	public Menus(){
		discenteController = new DiscenteController();
		cursoController = new CursoController();
	}
	public int menuPrincipal(){

		System.out.println("\tSecretaria IC");
		System.out.println("1-Alunos");
		System.out.println("2-Sevidor");
		System.out.println("3-Curso");
		System.out.println("4-Periodo");
		System.out.println("5-Funcionalidades");
		System.out.println("9-Sair\n");

		scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a<1 && a>5) && a!=9)
			return 0;
		return a;
	}
	/*--------------------------Alunos-------------------------*/
	public int menuAlunos(){

		System.out.println("\tAlunos");
		System.out.println("1-Cadastrar");
		System.out.println("2-Atualizar");
		System.out.println("3-Remover");
		System.out.println("4-Listar");
		System.out.println("9-Sair\n");

		scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a<1 && a>4) && a!=9)
			return 0;
		return a;
	}

	public void cadastrarAluno(){
		try{
			scan = new Scanner(System.in);
			System.out.println("\tCadastro de aluno");
			System.out.println("Digite o nome:");
			String nome = scan.nextLine();
			System.out.println("Digite a matricula:");
			String matricula = scan.nextLine();
			System.out.println("Digite o cpf:");
			String cpf = scan.nextLine();
			System.out.println("Selecione o curso:");
			Curso curso = new Curso(); //GenericController.selecionar(cursoController.cursos);
			System.out.println("Selecione o periodo de ingresso:");
			Periodo periodo = GenericController.selecionar(periodoController.periodos);
			periodo.setAtual(periodoController.getAtual(periodo));


			Discente aluno = new Discente(discenteController.getIdIncrementor());
			aluno.setNome(nome);
			aluno.setMatricula(matricula);
			aluno.setCurso(curso);
			aluno.setCpf(cpf);
			aluno.setPeriodoIngresso(periodo);

			discenteController.cadastrar(aluno);
		}catch (Exception e) {
			System.out.println ("Operacao invalida!");
		}

	}

	public void removerAluno(){
		System.out.println("\tRemover aluno");
		System.out.println("Selecione um aluno:");
		Discente d = GenericController.selecionar(discenteController.discentes);
		if(d!=null)
			discenteController.remover(d);
	}

	public void atualizarAluno(){
		System.out.println("\tAtualizar aluno");
		System.out.println("Selecione um aluno:");
		Discente d = GenericController.selecionar(discenteController.discentes);
		if(d!=null){
			try{

			}catch (Exception e) {
			}
		}

	}

	public void listarAlunos(){
		discenteController.listar();
	}

	public void listarAlunosPorPeriodo(){
		System.out.println("\tAlunos por periodo");
		System.out.println("Selecione o periodo:");
		Periodo p = GenericController.selecionar(periodoController.periodos);
		if(p!=null)
			discenteController.listarPorPeriodo(p);
	}

	public void listarAlunosPorTurma(){
		System.out.println("\tAlunos por periodo");
		System.out.println("Selecione o periodo:");
		Periodo p = GenericController.selecionar(periodoController.periodos);
		if(p!=null)
			discenteController.listarPorTurma(p);
	}


	/*--------------------------------------------------------*/


	/*------------------------Servidor ------------------------*/
	public int menuServidor(){

		System.out.println("\tServidor");
		System.out.println("1-Cadastrar");
		System.out.println("2-Atualizar");
		System.out.println("3-Remover");
		System.out.println("4-Listar");
		System.out.println("9-Sair\n");

		scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a<1 && a>5) && a!=9)
			return 0;
		return a;
	}
	/*--------------------------------------------------------*/

	/*--------------------------Curso-------------------------*/
	public int menuCurso(){

		System.out.println("\tCurso");
		System.out.println("1-Cadastrar");
		System.out.println("2-Atualizar");
		System.out.println("3-Remover");
		System.out.println("4-Listar");
		System.out.println("5-Mostrar matriz de disciplina");
		System.out.println("9-Sair\n");

		scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a<1 && a>5) && a!=9)
			return 0;
		return a;
	}

	public void cadastrarCurso(){
		try{
			scan = new Scanner(System.in);
			System.out.println("\tCadastro de curso");
			System.out.println("Digite o nome:");
			String nome = scan.nextLine();
			System.out.println("Digite o codigo:");
			String codigo = scan.nextLine();
			System.out.println("Digite o id:");
			int id = scan.nextInt();

			Curso curso = new Curso();

			curso.setCodigo(codigo);
			curso.setNome(nome);
			curso.setId(id);

			cursoController.cadastrar(curso);
		}catch (Exception e) {
			System.out.println ("Operacao invalida!");
		}

	}

	public void removerCurso(){
		System.out.println("\tRemover curso");
		System.out.println("Selecione um aluno:");
		Curso c = GenericController.selecionar(cursoController.cursos);
		if(c!=null)
			cursoController.remover(c);
	}

	public void atualizarCurso(){
		System.out.println("\tAtualizar curso");
		System.out.println("Selecione um curso:");
		Curso c = GenericController.selecionar(cursoController.cursos);
		if(c!=null){
			try{

			}catch (Exception e) {
			}
		}

	}

	public void listarCursos(){
		cursoController.listar();
	}

	public void mostrarDisciplinas(){

	}
	/*--------------------------------------------------------*/

	/*-------------------------Periodo------------------------*/
	public int menuPeriodo(){

		System.out.println("\tPeriodo");
		System.out.println("1-Cadastrar");
		System.out.println("2-Atualizar");
		System.out.println("3-Remover");
		System.out.println("4-Listar");
		System.out.println("9-Sair\n");

		scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a<1 && a>5) && a!=9)
			return 0;
		return a;
	}
	/*------------------------------------------------------*/
}