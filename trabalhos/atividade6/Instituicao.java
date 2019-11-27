import java.util.Scanner;
import java.util.ArrayList;
class Instituicao{
  protected ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
  protected ArrayList<Curso> curso = new ArrayList<Curso>();
  private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
  protected Reitor reitor;

  public void menu(Instituicao in_inst){
    Scanner ler = new Scanner(System.in);
    Boolean sair = false;
    while (sair == false){
      System.out.println ("(1) Entrar como aluno.");
      System.out.println ("(2) Entrar como professor.");
      System.out.println ("(3) Entrar como secretaria.");
      System.out.println ("(4) Entrar como reitor.");
      System.out.println ("(5) Entrar como secretaria.");
      System.out.println ("(0) Sair.");
      int selecao = ler.nextInt();
      switch (selecao){
        case 1:
        menuSecretaria();
          break;
        case 2:
          in_inst.reitor.menu(in_inst);
          break;
        case 0:
          sair = true;
          break;
        default :
          System.out.println ("Nenhuma opção Selecionada.");
          break;
      }
    }
  }

  public ArrayList<Funcionario> getFuncionarios() {
    return this.funcionarios;
  }

  public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
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
  
  public void adicionarCurso(Curso x){
    this.curso.add(x);
  }

  public void adicionarFuncionario(Funcionario x){
    funcionarios.add(x);
  }

  public void adicionarDisciplina(Disciplina x){
    this.disciplinas.add(x);
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
      System.out.println(x.toString());
    }
  }

  public void listargemCompleta(){
    int i = 0;
    for(Curso x : curso){
      System.out.println(i +" "+ x.getNome());
      x.listarDisciplinas();
      i++;
    }
  }

  public void menuSecretaria(){
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite seu cpf");
    String in_cpf = ler.nextLine();
    for(Funcionario x : funcionarios){
      if(x.getCpf().equals(in_cpf)){
        System.out.println("Digite seuadlasljdlasdjljsakljdjkl cpf");

      }
    }
  }
}