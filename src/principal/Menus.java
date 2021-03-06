package principal;

import classes.ClasseDocente;
import java.util.Scanner;

import classes.Curso;
import classes.Discente;
import classes.Disciplinas;
import classes.Periodo;
import classes.Servidor;
import controllers.CursoController;
import controllers.DiscenteController;
import controllers.GenericController;
import controllers.PeriodoController;
import controllers.ServidorController;

public class Menus {
    private Scanner scan;
    public DiscenteController discenteController;
    public CursoController cursoController;
    public PeriodoController periodoController;
    public ServidorController servidorController;

    public Menus(){
        discenteController = new DiscenteController();
        cursoController = new CursoController();
        periodoController = new PeriodoController();
        servidorController = new ServidorController();
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
        System.out.println("5-Listar no semestre atual");
        System.out.println("6-Listar por turma");
        System.out.println("7-Listar por disciplina");
        System.out.println("8-Solicitar trancamento de disciplina");
        System.out.println("9-Sair\n");

        scan = new Scanner(System.in);
        int a = scan.nextInt();
        if((a<1 && a>8) && a!=9)
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
            Curso curso = GenericController.selecionar(cursoController.cursos);
            curso.setAlunos(curso.getAlunos()+1);
            System.out.println("Selecione o periodo de ingresso:");
            Periodo periodo = GenericController.selecionar(periodoController.periodos);
            periodo.setAtual(periodoController.getAtual(periodo));


            Discente aluno = new Discente(discenteController.getIdIncrementor());
            aluno.disciplinas = cursoController.disciplinasPorPeriodoECurso(periodo.getAtual(),curso);
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
        System.out.println("\tAlunos por turma");
        System.out.println("Selecione o periodo:");
        Periodo p = GenericController.selecionar(periodoController.periodos);
        if(p!=null)
            discenteController.listarPorTurma(p);
    }


    public void listarAlunosPorDisciplina() {
        System.out.println("\tAlunos por disciplina");
        System.out.println("Selecione o curso:");
        Curso c = GenericController.selecionar(cursoController.cursos);
        if(c!=null){
            Disciplinas d = GenericController.selecionar(c.disciplinas);
            if(d!=null)
                discenteController.listarAlunosPorDisciplina(d);
        }


    }

    public void trancamentoDeDisciplina() {
        System.out.println("\tTrancamento de disciplina");
        System.out.println("Selecione o aluno:");
        Discente d = GenericController.selecionar(discenteController.discentes);
        if(d!=null){
            Disciplinas disc = GenericController.selecionar(d.disciplinas);
            if (disc!=null){
                try{
                    int i = discenteController.discentes.lastIndexOf(d);
                    discenteController.discentes.get(i).disciplinas.remove(disc);
                    System.out.println("Trancamento efetuado!");
                }catch (Exception e) {
                    System.out.println("Erro na operacao!");
                }
            }
        }

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

    public void cadastrarServidor(){
        try{
            scan = new Scanner(System.in);
            System.out.println("\tCadastro de servidor");
            System.out.println("Digite o nome:");
            String nome = scan.nextLine();
            System.out.println("Digite a siap:");
            String siape = scan.nextLine();
            System.out.println("Digite o cargo:");
            String cargo = scan.nextLine();
            System.out.println("Digite o cpf:");
            String cpf = scan.nextLine();
            System.out.println("Selecione a classe:");
            ClasseDocente classe = new ClasseDocente();

            Servidor servidor = new Servidor(servidorController.getIdCount());
            servidor.setNome(nome);
            servidor.setSiape(siape);
            servidor.setCargo(cargo);
            servidor.setCPF(cpf);
            

            servidorController.cadastrar(servidor);

        }catch(Exception e){
            System.out.println("Operaçao inválida!");
        }
    }

    public void removerServidor(){
        System.out.println("\tRemover servidor");
        System.out.println("Selecione um servidor:");
        Servidor d = GenericController.selecionar(servidorController.servidores);
        if(d!=null)
                servidorController.remover(d);
    }

    public void atualizarServidor(){
        System.out.println("\tAtualizar servidor");
        System.out.println("Selecione um servidor:");
        Servidor d = GenericController.selecionar(servidorController.servidores);
        if(d!=null){
            try{
                menuUpdateServidor();
            }catch (Exception e) {
                System.out.println("Erro na operação!");
            }
        }
    }

    public void listarServidor(){
        servidorController.listar();
    }
    
    public void relatorioProfDisc(){
        servidorController.relatorioProfDisc();
    }
    
    public void relatorioProfPerio(){
        servidorController.relatorioProfPerio();
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
        System.out.println("6-Relatorio de alunos por curso");
        System.out.println("9-Sair\n");

        scan = new Scanner(System.in);
        int a = scan.nextInt();
        if((a<1 && a>7) && a!=9)
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

                Curso curso = new Curso(cursoController.getIdIncrementorr());

                curso.setCodigo(codigo);
                curso.setNome(nome);

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
        cursoController.mostrarDisciplinas();
    }
    
    public void relatorioAlunos(){
        cursoController.relatorioAlunos();
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

    /*-------------------Atualizar Servidor-----------------*/
    public int menuUpdateServidor(){

        System.out.println("\tAtualiza Servidor");
        System.out.println("\nEscolha o campo a ser atualizado:");
        System.out.println("1-Nome");
        System.out.println("2-Siap");
        System.out.println("3-Cargo");
        System.out.println("4-CPF");
        System.out.println("9-Sair\n");

        scan = new Scanner(System.in);
            int a = scan.nextInt();
            if((a<1 && a>5) && a!=9)
                    return 0;
            return a;
    }

    public void updateNome(Servidor servidor){
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite o nome:");
            String nome = scan.nextLine();

            servidor.setNome(nome);
        }catch(Exception e){
            System.out.println("Operação inválida!");
        }

    }

    public void updateSiap(Servidor servidor){
        try{

            scan = new Scanner(System.in);
            System.out.println("Digite a siap:");
            String siape = scan.nextLine();
            servidor.setSiape(siape);

        }catch(Exception e){
            System.out.println("Operação inválida!");
        }

    }
    public void updateCargo(Servidor servidor){
        try{

            scan = new Scanner(System.in);
            System.out.println("Digite o cargo:");
            String cargo = scan.nextLine();
            servidor.setCargo(cargo);

        }catch(Exception e){
            System.out.println("Operação inválida!");
        }

    }
    public void updateCPF(Servidor servidor){
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite o cpf:");
            String cpf = scan.nextLine();
            servidor.setCPF(cpf);
        }catch(Exception e){
            System.out.println("Operação inválida!");
        }

    }

        /*------------------------------------------------------*/
}