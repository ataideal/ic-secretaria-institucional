package principal;

import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Periodo;
import controllers.DiscenteController;
import controllers.GenericController;

public class Menus {
	private Scanner scan;
	public DiscenteController discenteController;

	public Menus(){
		discenteController = new DiscenteController();
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
			Curso curso = new Curso();// = cursoController.selecionarCurso();
			System.out.println("Selecione o periodo de ingresso:");
			Periodo periodo = new Periodo();// = periodoController.selecionarCurso();

			Discente aluno = new Discente();
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
		System.out.println("9-Sair\n");

		scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a<1 && a>5) && a!=9)
			return 0;
		return a;
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