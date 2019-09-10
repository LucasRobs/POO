package aula7;
import java.util.ArrayList;
public class main{
    public static void main(String[] args) {
        ArrayList<Contato> dados = new ArrayList<Contato>();
        Cadastro conta = new Cadastro();
        conta.adicionarContato("666", "Marcielow");
        System.out.println( dados.size());
        for(Contato i: dados){
            System.out.println(i);
        }
    }
}