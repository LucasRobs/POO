import java.util.Scanner;
import java.util.ArrayList;
class Aluno extends Pessoa{
  private ArrayList <Disciplina> disciplina_atual = new ArrayList<Disciplina>();
  private static int matricula = 0;

  public Aluno() {
    Aluno.matricula++;
  }
  public void menu(Instituicao inst){
    Scanner ler = new Scanner(System.in);
    Boolean sair = false;
    while (sair == false){
      System.out.println ("(1) Mostrar Disciplinas.");
      System.out.println ("(0) sair.");
      int selecao = ler.nextInt();
      switch (selecao){
        case 1:
          //inst.curso.get(x).alunos.get(z).listarDisciplinas();
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

  public void listarDisciplinas(){
    int i = 0;
    for(Disciplina x : disciplina_atual){
      System.out.println(i +" "+x.getNome());
      i++;
    }
  }

}
