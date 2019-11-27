import java.util.Scanner;
class Administrador extends Professor{
  private String senha;

  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  public Boolean login(String in_nome, String in_senha){
    if(in_nome == this.nome && in_senha == this.senha){
      return true;
    }
    return false;
  }


  public Disciplina criarDisciplica(String in_nome ,String in_senha){
    if(login(in_nome, in_senha)){
      Scanner ler = new Scanner(System.in);
      Disciplina disciplina = new Disciplina();
      System.out.println("Nome do disciplina : ");
      disciplina.setNome(ler.nextLine());
      System.out.println("Numero de creditos : ");
      disciplina.setCreditos(ler.nextInt());
      int selecao;
      Boolean sair = false;
      while (sair == false){
        System.out.println ("(1) Escolher curso.");
        System.out.println ("(0) Finalizar criação.");
        selecao = ler.nextInt();
        switch (selecao){
          case 1:

            //mostrar curosos
            //escolhe um id
            //adiciona essa diciplina no array do curso
          case 0:
            sair = true;
            break;
          default :
            System.out.println ("Nenhuma opção Selecionada.");
            break;
        }
      System.out.println("Disciplina criado com sucesso!!!");
      }
    }
    return null;
  }

  public Boolean criarCurso(Instituicao inst,String in_nome ,String in_senha){
    if(login(in_nome, in_senha)){
      Scanner ler = new Scanner(System.in);
      Curso curso = new Curso();
      System.out.println("Nome do curso : ");
      curso.setNome(ler.nextLine());
      //super.curso.add(curso);
      inst.adicionarCurso(curso);
      System.out.println("Curso criado com sucesso!!!");
      return true;
    }
    return false;
  }

  public Funcionario cadastrarFuncionario(String in_nome, String in_cpf, double in_salario){
      Funcionario f1 = new Funcionario();
      f1.setNome(in_nome);
      f1.setCpf(in_cpf);
      f1.setSalario(in_salario);
      return f1;
  }
}
