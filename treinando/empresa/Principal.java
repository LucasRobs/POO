import java.util.ArrayList;
public class Principal{
    public static void main(String[] args){        
        Empresa ban = new Empresa("Banana", 40028922);
        ban.adicionarFuncionario("Lucas", 21);
        ban.adicionarFuncionario("Dirlândia", 19);
        ban.adicionarFuncionario("Walam", 4);
        ban.listarFuncionarios();
    }
}