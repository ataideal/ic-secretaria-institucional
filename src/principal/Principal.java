package principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menus menus = new Menus();
		while(true){
			int c1 = menus.menuPrincipal();
			if(c1==1){
				while(true){
					int c2 = menus.menuAlunos();
					if(c2==1){
						menus.cadastrarAluno();
					}else if(c2==4){
						menus.listarAlunos();
					}else
						break;
				}
			}
			else if(c1==2){
				int c2 = menus.menuServidor();
			}
			else if(c1==3){
				int c2 = menus.menuCurso();
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