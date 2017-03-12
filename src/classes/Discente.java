package classes;
public class Discente {

	private Integer id;

	private String nome;

	private String matricula;

	private Curso curso;

	private Periodo periodoIngresso;

	private String cpf;
        
        public Discente(){
            this.curso = new Curso();
            this.periodoIngresso = new Periodo();
        }
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public Curso getCurso() {
            return curso;
        }

        public void setCurso(Curso curso) {
            this.curso = curso;
        }

        public Periodo getPeriodoIngresso() {
            return periodoIngresso;
        }

        public void setPeriodoIngresso(Periodo periodoIngresso) {
            this.periodoIngresso = periodoIngresso;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        
        @Override
        public String toString(){
            return this.nome;
        }

}