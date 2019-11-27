import java.util.ArrayList;
class Disciplina{
  private String nome;
  private ArrayList<String> pre_requisitos;
  private ArrayList<Curso> curso;
  private int creditos;
  private ArrayList<Historico> historico;
  
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCreditos() {
    return this.creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }
}
