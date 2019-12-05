import java.util.Scanner;

class Secretaria extends Funcionario{
  public void menu(Instituicao inst){
    Scanner ler = new Scanner(System.in);
    Boolean sair = false;
    while (sair == false){
      System.out.println ("(1) Matricular aluno.");
      System.out.println ("(2) Cadastrar aluno.");
      System.out.println ("(3) Abrir turma.");
      System.out.println ("(0) sair.");
      int selecao = ler.nextInt();
      switch (selecao){
        case 1:
          matricularAluno(inst);
          break;
        case 2:
          cadastrarAluno(inst);
          break;
        case 3:
          abrirTurma(inst);
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

  public void abrirTurma(Instituicao inst){
    Scanner ler = new Scanner(System.in);
    Turma turma = new Turma();
    System.out.println ("Qual a diciplina.");
    inst.listarDisciplinas();
    int n = ler.nextInt();
    turma.setDisciplina(inst.disciplinas.get(n));
    System.out.println ("Qual o professor.");
    inst.listarProfessores();
    n = ler.nextInt();
    turma.setProf(inst.professores.get(n));
    inst.professores.get(n).adicionarTurma(turma);
  }

  public void cadastrarAluno(Instituicao inst){
    Scanner ler = new Scanner(System.in);
    inst.listarProfessores();
    System.out.println ("Qual o professor");
    int n = ler.nextInt();
    inst.professores.get(n).listarTurmas();
    System.out.println ("Qual a turma.");
    int x = ler.nextInt();
    inst.alunoEcurso();
    System.out.println ("Qual o numero do curso.");
    int xcurso = ler.nextInt();
    System.out.println ("Qual o numero do aluno.");
    int xaluno = ler.nextInt();
    inst.professores.get(n).turma.get(x).adicionarAluno(inst.curso.get(xcurso).alunos.get(xaluno));
  }

  public void matricularAluno(Instituicao inst){
    Scanner ler = new Scanner(System.in);
    Aluno f1 = new Aluno();
    System.out.println("Nome do alunos : ");
    f1.setNome(ler.nextLine());
    System.out.println("Numero do CPF : ");
    f1.setCpf(ler.nextLine());
    inst.listarCursos();
    System.out.println("Numero do curso : ");
    inst.curso.get(ler.nextInt()).adicionarAluno(f1);
    }


}
