import java.util.ArrayList;
class Disciplina{
  private String nome;
  private ArrayList<String> pre_requisitos;
  private ArrayList<Curso> curso;
  private int creditos;
  private ArrayList<Historico> historico;

  public void setNome(String in_nome){
    this.nome = in_nome;
  }
  public String getNome(){
    return this.nome;
  }
  public void setCreditos(int in_creditos){
    this.creditos = in_creditos;
  }
  public int getCreditos(){
    return this.creditos;
  }
}
