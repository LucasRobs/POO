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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          ArrayList<Contato> dados = new ArrayList<Contato>();
          
          Cadastro cad=new Cadastro();
          
          cad.adicionarContato("22222", "joilson");
          Contato joilson=new Contato("22222","joilson");
          dados.add(joilson);
         System.out.println( dados.size());
         for(Contato i: dados){
             System.out.println(i);
         }
    }
    
}
