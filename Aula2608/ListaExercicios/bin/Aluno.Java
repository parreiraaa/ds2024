public class Aluno {
    private String nome;
    private String curso;
    private String disciplina;
    private int bimestre;
    private String mencao;

    //CONSTRUTOR DA CLASSE
    public Aluno(String nome, String curso, String disciplina, int bimestre String mencao){
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.bimestre = bimestre;
        this.mencao = mencao;

        public void setNome(String nome){
            this.nome = nome;
        }
       
        public String getNome() {
            return this.nome;
        }

        public void setCurso(String nome){
            this.curso = curso;
        }

        public String getCurso() {
            return this.curso;
        }

        public void setDisciplina(String Disciplina){
            this.disciplina = disciplina;
        }
        
        public String getDisciplina() {
            return this.disciplina;
        }

        public void setBimestre(int Bimestre){
            this.Bimestre = Bimestre;
        }
        
        public int getBimestre() {
            return this.bimestre;
        }

        public void setMencao(String Mencao){
            this.mencao = mencao;
        }
        
        public String getMencao() {
            return this.mencao;
        }
    }
}