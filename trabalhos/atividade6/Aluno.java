import java.util.ArrayList;
class Aluno extends Pessoa{
  private Disciplina disciplina_atual;
  private ArrayList <Disciplina> disciplina_anteriorres;
  private static int matricula = 0;
  private Curso curso;

  public Aluno() {
    Aluno.matricula++;
  }
}
