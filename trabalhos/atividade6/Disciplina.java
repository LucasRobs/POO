import java.util.ArrayList;
class Disciplina{
  private String nome;
  private int creditos;
  Boolean ativo  = true;
    
    public Boolean getAtivo() {
        return this.ativo;
    }

    public void finaliarDisciplina() {
        this.ativo = false;
    }

    public void iniciarDisciplina() {
        this.ativo = true;
    }

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
