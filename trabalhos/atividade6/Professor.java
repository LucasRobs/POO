class Professor extends Pessoa{
  private Disciplina disciplina;
  private Horario horario;
  private Turma turma;
  private Hist_Prof histProf;

  public Disciplina getDisciplina() {
      return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
      this.disciplina = disciplina;
  }

  public Horario getHorario() {
      return horario;
  }

  public void setHorario(Horario horario) {
      this.horario = horario;
  }

  public Turma getTurma() {
      return turma;
  }

  public void setTurma(Turma turma) {
      this.turma = turma;
  }

  public Hist_Prof getHistProf() {
      return histProf;
  }

  public void setHistProf(Hist_Prof histProf) {
      this.histProf = histProf;
  }




}
