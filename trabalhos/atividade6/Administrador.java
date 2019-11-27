import java.util.Scanner;
class Administrador extends Professor{
  protected String senha;
  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  public void menu(Instituicao in_inst){
    if(login()){
      Scanner ler = new Scanner(System.in);
      Boolean sair = false;
      while (sair == false){
        System.out.println ("(1) Cadastrar funcionario.");
        System.out.println ("(2) Cadastrar curso.");
        System.out.println ("(3) Cadastrar disciplina.");
        System.out.println ("(4) Listar cursos e disciplinas.");
        System.out.println ("(5) Listar cursos e disciplinas.");
        System.out.println ("(0) Sair.");
        int selecao = ler.nextInt();
        switch (selecao){
          case 1:
            in_inst.adicionarFuncionario(criarFuncionario());
            break;
          case 2:
            in_inst.adicionarCurso(criarCurso());
            break;
          case 3:
            criarDisciplina(in_inst);
            break;
          case 4:
            in_inst.listargemCompleta();
            break;
          case 5:
            in_inst.listarFuncionarios();
            break;
          case 0:
            sair = true;
            break;
          default :
            System.out.println ("Nenhuma opção Selecionada.");
            break;
        }
      }
    }else{
      System.out.println ("Falha no login, nome ou senha invalido!");
    }
  }

  public Boolean login(){
    Scanner ler = new Scanner(System.in);
    String in_nome = ler.nextLine();
    String in_senha = ler.nextLine();
    if(in_nome.equals(this.nome) && in_senha.equals(this.senha)){
      System.out.println("Login efetuado com sucesso!!!");
      return true;
    }
    return false;
  }


  public Disciplina criarDisciplina(Instituicao in_inst){
    Scanner ler = new Scanner(System.in);
    Disciplina disciplina = new Disciplina();
    System.out.println("Nome do disciplina : ");
    disciplina.setNome(ler.nextLine());
    System.out.println("Numero de creditos : ");
    disciplina.setCreditos(ler.nextInt());
    int selecao;
    Boolean sair = false;
    while (sair == false){
      System.out.println ("(1) Escolher um curso curso.");
      System.out.println ("(0) Finalizar criação.");
      selecao = ler.nextInt();
      switch (selecao){
        case 1:
          in_inst.listarCursos();
          int n = ler.nextInt();
          in_inst.curso.get(n).adicionarDisciplina(disciplina);
          break;
        case 0:
          sair = true;
          break;
        default :
          System.out.println ("Nenhuma opção Selecionada.");
          break;
      }
    }
    System.out.println("Disciplina criado com sucesso!!!");
    return null;
  }
  public Curso criarCurso(){
    Scanner ler = new Scanner(System.in);
    Curso curso = new Curso();
    System.out.println("Nome do curso : ");
    curso.setNome(ler.nextLine());
    return curso;
  }

  public Funcionario criarFuncionario(){
    Scanner ler = new Scanner(System.in);
    Funcionario f1 = new Funcionario();
    System.out.println ("(1) Professor.");
    System.out.println ("(2) Secretaria.");
    System.out.println ("(3) Coordenador.");
    int x = ler.nextInt();
    switch(x){
      case 1:
        f1 = criarProfessor();
        break;
      case 2:
        f1 = criarSecretaria();
        break;
      case 3:
        f1 = criarCoordenador();
        break;
    }
    return f1;
  }

  public Secretaria criarSecretaria(){
    Scanner ler = new Scanner(System.in);
    Secretaria f1 = new Secretaria();
    System.out.println("Nome do Secretaria : ");
    f1.setNome(ler.nextLine());
    System.out.println("Numero do CPF : ");
    f1.setCpf(ler.nextLine());
    System.out.println("Salario : ");
    f1.setSalario(ler.nextDouble());
    return f1;
  }

  public Professor criarProfessor(){
    Scanner ler = new Scanner(System.in);
    Professor f1 = new Professor();
    System.out.println("Nome do professor : ");
    f1.setNome(ler.nextLine());
    System.out.println("Numero do CPF : ");
    f1.setCpf(ler.nextLine());
    System.out.println("Salario : ");
    f1.setSalario(ler.nextDouble());
    return f1;
  }

  public Funcionario criarCoordenador(){
    Scanner ler = new Scanner(System.in);
    Coordenador f1 = new Coordenador();
    System.out.println("Nome do coordenador : ");
    f1.setNome(ler.nextLine());
    System.out.println("Numero do CPF : ");
    f1.setCpf(ler.nextLine());
    System.out.println("Salario : ");
    f1.setSalario(ler.nextDouble());
    return f1;
  }

}
