import java.util.ArrayList;
public class Contato {
  // Declare as variaveis da Classe;
  private String telefone;
  private String nome;

  //Criar Metodo Construtor //
  public Contato(String telefone_in, String nome_in){
    this.telefone = telefone_in;
    this.nome = nome_in;
  }

  // Metodo para retornar Nome do Contato;
  public String getNome(){
    return nome;
  }

  // Metodo para Escevrer nome no contato
  public void setNome(String nome_in) {
    this.nome = nome_in;
  }

  // Metodo para retornar telefone do Contato;
  public String getTelefone() {
    return telefone;
  }

  // Metodo para escrever telefone do Contato
  public void setTelefone(String telefone_in) {
    this.telefone = telefone_in;
  }

  // Criar metodo para concatenar Nome e telefones
  // Ex.:  Fulano - 32232323

  public String toString(){
    return this.nome+" "+this.telefone;
  }
}
