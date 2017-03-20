package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menus menus = new Menus();

		Scanner scan = new Scanner(System.in);

		while(true){
			int c1 = menus.menuPrincipal();

			if(c1==1){
				while(true){
					int c2 = menus.menuAlunos();
					if(c2==1){
						menus.cadastrarAluno();
					}else if(c2==2){
						menus.atualizarAluno();
					}else if(c2==3){
						menus.removerAluno();
					}else if(c2==4){
						menus.listarAlunos();
					}else if(c2==5){
						menus.listarAlunosPorPeriodo();
					}else if(c2==6){
						menus.listarAlunosPorTurma();
					}else if(c2==7){
						menus.listarAlunosPorDisciplina();
					}else if(c2==8){
					
					}else
						break;
				}
			}
			else if(c1==2){
				int c2 = menus.menuServidor();
			}
			else if(c1==3){ //Curso
				int c2 = menus.menuCurso();
				if(c2==1){
					menus.cadastrarCurso();
				} else if (c2==2){
					menus.atualizarCurso();
				} else if (c2==3){
					menus.removerCurso();
				} else if (c2==4){
					menus.listarCursos();
				} else if (c2==5){
					menus.mostrarDisciplinas();
				}
			}
			else if(c1==4){
				int c2 = menus.menuPeriodo();
			}
			else{
				break;
			}
		}

	}

}
