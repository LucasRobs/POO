
import java.util.ArrayList;
class Turma{
  private ArrayList<Aluno> aluno = new ArrayList<Aluno>();
  private Disciplina disciplina;
  private Professor prof;

  public void adicionarAluno(Aluno x) {
      this.aluno.add(x);
  }

  public Disciplina getDisciplina() {
      return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
      this.disciplina = disciplina;
  }

  public Professor getProf() {
      return prof;
  }

  public void setProf(Professor prof) {
      this.prof = prof;
  }
}
