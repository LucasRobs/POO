import java.util.ArrayList;
class Instituicao{
  public ArrayList<Funcionario> funcionarios;
  private ArrayList<Aluno> aluno;
  private ArrayList<Curso> curso;
  protected Reitor reitor;

  public ArrayList<Funcionario> getFuncionarios() {
    return this.funcionarios;
  }

  public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
  }

  public ArrayList<Aluno> getAluno() {
    return this.aluno;
  }

  public void setAluno(ArrayList<Aluno> aluno) {
    this.aluno = aluno;
  }

  public ArrayList<Curso> getCurso() {
    return this.curso;
  }

  public void setCurso(ArrayList<Curso> curso) {
    this.curso = curso;
  }

  public Reitor getReitor() {
    return this.reitor;
  }

  public void setReitor(Reitor reitor) {
    this.reitor = reitor;
  }
  
  public void adicionarCurso(Curso in_curso){
    this.curso.add(in_curso);
  }

  public void adicionarFuncionario(Funcionario x){
    funcionarios.add(x);
    listarFuncionarios();
  }

  public void listarCursos(){
    int i = 0;
    for(Curso x : curso){
      System.out.println(i +" "+ x.getNome());
      i++;
    }
  }

  public void listarFuncionarios(){
    for(Funcionario x: funcionarios){
      System.out.println(x.getNome());
    }
  }
}