import java.util.ArrayList;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Cadastro conta = new Cadastro();
        while(true){
            Scanner leitor = new Scanner(System.in);
            System.out.println("digite 1 para add contato 2 ver contatos e 3 para sair");
            int controle = leitor.nextInt();
            if(controle == 1){
                System.out.println("digite o nome e o numero do novo contato");
                String nome = leitor.nextLine();
                String numero = leitor.nextLine();
                conta.adicionarContato(numero, nome);
            }else if(controle == 2){
                for(Contato i: conta.getContatos()){
                    System.out.println(i);
                }
            }else if(controle == 3){
                System.out.println("FLWWWWW!!!!!");
                return;
            }
        }
    }
}