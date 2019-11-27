import java.util.ArrayList;

class Professor extends Funcionario{
  private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
  private ArrayList<Horario> horario = new ArrayList<Horario>();
  private ArrayList<Turma> turma = new ArrayList<Turma>();
  private Hist_Prof histProf;

    public Professor() {

    }

    public Professor(ArrayList<Disciplina> disciplina, ArrayList<Horario> horario, ArrayList<Turma> turma, Hist_Prof histProf) {
        this.disciplina = disciplina;
        this.horario = horario;
        this.turma = turma;
        this.histProf = histProf;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Horario> getHorario() {
        return this.horario;
    }

    public void setHorario(ArrayList<Horario> horario) {
        this.horario = horario;
    }

    public ArrayList<Turma> getTurma() {
        return this.turma;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public Hist_Prof getHistProf() {
        return this.histProf;
    }

    public void setHistProf(Hist_Prof histProf) {
        this.histProf = histProf;
    }

    public Professor disciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
        return this;
    }

    public Professor horario(ArrayList<Horario> horario) {
        this.horario = horario;
        return this;
    }

    public Professor turma(ArrayList<Turma> turma) {
        this.turma = turma;
        return this;
    }

    public Professor histProf(Hist_Prof histProf) {
        this.histProf = histProf;
        return this;
    }

    public void adicionarDisciplina(Disciplina x){
        this.disciplina.add(x);
    }

}
