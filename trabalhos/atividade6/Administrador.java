class Administrador extends Professor{
  private String senha;

  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }
  /*
  public Disciplina IncluirDisciplica(int in_senha){
    if(in_senha == this.senha){
      Disciplina diciplina = new Disciplina;
      disciplina.nome = ;
      disciplina.pre_requisitos.add(x);
      disciplina.curso =
      disciplina.creditos =
      return Disciplina;
    }
    return null;
  }*/
  public Funcionario cadastrarFuncionario(String in_nome, String in_cpf, double in_salario){
      Funcionario f1 = new Funcionario();
      f1.setNome(in_nome);
      f1.setCpf(in_cpf);
      f1.setSalario(in_salario);
      return f1;
  }
}
