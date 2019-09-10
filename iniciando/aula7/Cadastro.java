package aula7;
import java.util.ArrayList;
public class Cadastro {
  //Definir Variaveis da Classe;
  private ArrayList<Contato> dados = new ArrayList<Contato>();
  //Metodo para Resetar a Agenda
  public void resetAgenda(int maxContatos) {
    dados.clear();
  }
  public boolean adicionarContato(String telefone_in, String nome_in) {
    Contato x = new Contato(telefone_in, nome_in);
    dados.add(x);
    return true;
  }
  //Pegar Contato pelo Telefone
  public Contato getContatoByTel(String telefone) {
    for(Contato i: dados){
        if(i.getTelefone().equals(telefone)){
          return i;
        }
    }
    return null;
  }
  //Dado um telefone, atualizar o nome do contato que possui esse telefone
  public boolean atualizarContato(String telefone_in, String nome_in) {
    for(Contato i : dados){
      if(i.getTelefone().equals(telefone_in)){
        i.setNome(nome_in);
        return true;
      }
    }
  return false;
  }

  public boolean removerContato(String telefone_in) {
    int size = dados.size();
    for(Contato i : dados){
      if(i.getTelefone().equals(telefone_in)){
        dados.remove(i);
        return true;
      }
    }
  return false;
  }

  public ArrayList<Contato> getContatos() {
    return dados;
  }
/*
  public ArrayList<String> getTelefones(String nome_contato) {

  }*/
}
