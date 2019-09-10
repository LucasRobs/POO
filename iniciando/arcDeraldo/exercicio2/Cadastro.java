/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
  import java.util.ArrayList;
   //import aluno.Contato;
/**
 *
 * @author duran
 */
public class Cadastro {
  
 

    //Definir Variaveis da Classe;
    private ArrayList<Contato> dados = new ArrayList<Contato>();
 
    //Metodo para Resetar a Agenda
    public boolean resetAgenda(int maxContatos) {
        dados.clear();
        return true;
    }
 
    public void adicionarContato(String telefone_in, String nome_in) {
        dados.add(telefone_in, nome_in);
        return 0;
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
    public boolean atualizarContato(String telefone_in) {
        for(Contato i; i < dados; i++){
            if(i.getTelefone().equals(telefone_in)){
                i.setNome(nome);
                return true;
            }
        }
        return false;
    }
    //Remover contatos
    public boolean removerContato(String telefone) {
        for(Contato i; i < dados; i++){
            if(i.getTelefone().equals(telefone_in)){
                
                return true;
            }
        }

        return false;
    }
 
    public ArrayList<Contato> getContatos() {
        return dados;
    }
 
    public ArrayList<String> getTelefones(String nome_contato) {
        for(Contato i: dados){
            if(i.getNome().equals(nome_contato)){
                return i.getTelefones();
            }
            
        }
        return null;
    }
 
    
}
