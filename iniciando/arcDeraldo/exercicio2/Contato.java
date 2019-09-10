/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;

/**
 *
 * @author duran
 */
public class Contato {
     // Declare as variaveis da Classe;
    private String telefone;
    private String nome;
    private ArrayList<String> telefones =  new ArrayList<String>();
     
    
    //Criar Metodo Construtor //TODO
    public Contato(String telefone, String nome){
        this.telefone=telefone;
        this.nome=nome;
    }
     public ArrayList<String> getTelefones(){
         return this.telefones;
     }
    // Metodo para retornar Nome do Contato;
    public String getNome() {
        return this.nome;
    }
 
    // Metodo para Escevrer nome no contato
    public void setNome(String nome) {
        this.nome=nome;
    }
 
    // Metodo para retornar telefone do Contato;
    public String getTelefone() {
        return this.telefone;
    }
 
    // Metodo para escrever telefone do Contato 
    public void setTelefone(String telefone) {
        this.telefones.add(telefone);
    }
 
    // Criar metodo para concatenar Nome e telefones
    // Ex.:  Fulano - 32232323  
 
    public String toString(){
        return this.nome+this.telefone;
    }
     
    
}
