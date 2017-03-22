package classes;
public class Servidor {

	private final int id;
	private String nome;
	private String siape;
	private String cargo;
	private String CPF;
	private ClasseDocente classe;
        
        public Servidor(int id){
        	this.id = id;
            this.classe = new ClasseDocente();
        }
        
        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSiape() {
            return siape;
        }

        public void setSiape(String siape) {
            this.siape = siape;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public ClasseDocente getClasse() {
            return classe;
        }

        public void setClasse(ClasseDocente classe) {
            this.classe = classe;
        }
        
        @Override
        public String toString() {
            if(this.id != 0)
                return this.id + " - " + this.nome;
            else
                return this.nome;
        }
        
}
