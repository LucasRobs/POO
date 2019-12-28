import java.util.ArrayList;

class Curso{
  private String nome;
  private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
  protected ArrayList<Aluno> alunos = new ArrayList<Aluno>();
  private Coordenador coordenador;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Coordenador getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public void adicionarDisciplina(Disciplina x){
        this.disciplinas.add(x);
    }

    public void listarDisciplinas(){
        for(Disciplina x : disciplinas){
            System.out.println("   "+ x.getNome());
        }
    }


    public void listarAlunos(){
        int i = 0;
        for(Aluno x : alunos){
            System.out.println(i +"  "+ x.getNome());
            i++;
        }
    }

    public void adicionarAluno(Aluno x){
        alunos.add(x);
    }
}
