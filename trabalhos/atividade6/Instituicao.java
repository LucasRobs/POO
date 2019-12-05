import java.util.Scanner;
import java.util.ArrayList;
class Instituicao{
  protected ArrayList<Professor> professores = new ArrayList<Professor>();
  protected ArrayList<Secretaria> secretarias = new ArrayList<Secretaria>();
  protected ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();
  protected ArrayList<Curso> curso = new ArrayList<Curso>();
  protected ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
  protected Reitor reitor;

  public void menu(Instituicao in_inst){
    Scanner ler = new Scanner(System.in);
    Boolean sair = false;
    while (sair == false){
      System.out.println ("(1) Entrar como aluno.");
      System.out.println ("(2) Entrar como professor.");
      System.out.println ("(3) Entrar como Coordenador.");
      System.out.println ("(4) Entrar como secretaria.");
      System.out.println ("(5) Entrar como reitor.");
      System.out.println ("(0) Sair.");
      int selecao = ler.nextInt();
      switch (selecao){
        case 1:
          alunoEcurso();
          System.out.println ("Numero do Curso");
          int x = ler.nextInt();
          System.out.println ("Numero do aluno");
          int y = ler.nextInt();
          in_inst.curso.get(x).alunos.get(y).menu(in_inst);
          break;
        case 2:
          listarProfessores();
        case 3:
          listarCoordenadores();
          x = ler.nextInt();
          in_inst.coordenadores.get(x).menu(in_inst);
          break;
        case 4:
          menuSecretaria(in_inst);
          break;
        case 5:
          in_inst.reitor.menu(in_inst);
          break;
        case 0:
          return;
        default :
          System.out.println ("Nenhuma opção Selecionada.");
          break;
      }
    }
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

  public void adicionarDisciplina(Disciplina x){
    this.disciplinas.add(x);
  }

  public void adicionarProfessor(Professor x){
    this.professores.add(x);
  }

  public void adicionarSecretaria(Secretaria x){
    this.secretarias.add(x);
  }

  public void adicionarCoordenador(Coordenador x){
    this.coordenadores.add(x);
  }

  public void listarCursos(){
    int i = 0;
    for(Curso x : curso){
      System.out.println(i +" "+ x.getNome());
      i++;
    }
  }

  public void listarProfessores(){
    for(Professor x: professores){
      System.out.println(x.toString());
    }
  }

  public void listarSecretarias(){
    for(Secretaria x: secretarias){
      System.out.println(x.toString());
    }
  }

  public void listarCoordenadores(){
    for(Coordenador x: coordenadores){
      System.out.println(x.toString());
    }
  }


  public void alunoEcurso(){
    int i = 0;
    for(Curso x : curso){
        System.out.println(i +" "+ x.getNome());
        x.listarAlunos();
        i++;
    }
}

  public void listarFuncionarios(){
    listarProfessores();
    listarSecretarias();
    listarCoordenadores();
  }

  public void listarDisciplinas(){
    int i = 0;
    for(Disciplina x : disciplinas){
        System.out.println("   "+ x.getNome());
        i++;
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
  
  public void menuSecretaria(Instituicao in_inst){
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite seu cpf");
    String in_cpf = ler.nextLine();
    for(Secretaria x : secretarias){
      if(x.getCpf().equals(in_cpf)){
        x.menu(in_inst);
      }
    }
  }
}