import java.util.ArrayList;
class Petshop{
    public Funcionario funcionario;
    Petshop(String in_nome, int in_telefona, String in_cidade, String in_rua, int in_numeroC){
        this.funcionario = Funcionario(in_nome, in_telefone, in_cidade, in_rua, in_numeroC);
    }
}

class Consulta{
    public String cachorro;
    public Cliente cliente;
    public Funcionario funcionario;
    public String petshop;
    Consulta(String in_nomeDog,String in_nome_petshop,String in_nome, int in_telefona, String in_cidade, String in_rua, int in_numeroC, String in_nomeF, int in_telefonaF, String in_cidadeF, String in_ruaF, int in_numeroCF){
        this.cachorro = in_nomeDog;
        this.petshop = in_nome_petshop;
        this.cliente = Cliente(in_nome, in_telefone, in_cidade, in_rua, in_numeroC);
        this.funcionario = Funcionario(in_nomeF, in_telefoneF, in_cidadeF, in_ruaF, in_numeroCF);
    }
}

class Funcionario{
    private ArrayList<Pessoa> funcionario = new ArrayList<Pessoa>();

    Funcionario(String in_nome, int in_telefona, String in_cidade, String in_rua, int in_numeroC){
        Pessoa x = new Pessoa(in_nome, in_telefone, in_cidade, in_rua, in_numeroC);
        funcionario.add(x);
    }
    Funcionario(String in_nome, int in_telefona){
        Pessoa x = new Pessoa(in_nome, in_telefone);
        funcionario.add(x);
    }
}

class Cliente{
    private ArrayList<Pessoa> cliente = new ArrayList<Pessoa>();

    Cliente(String in_nome, int in_telefona, String in_cidade, String in_rua, int in_numeroC){
        Pessoa x = new Pessoa(in_nome, in_telefone, in_cidade, in_rua, in_numeroC);
        cliente.add(x);
    }
    Cliente(String in_nome, int in_telefona){
        Pessoa x = new Pessoa(in_nome, in_telefone);
        cliente.add(x);
    }
}
class Pessoa{
    private String nome;
    private int telefone;
    private Endereço end;
    Pessoa(String in_nome, int in_telefona, String in_cidade, String in_rua, int in_numeroC){
        this.nome = in_nome;
        this.telefone = in_telefone;
        this.end = new Endereço(in_cidade, in_rua, in_numeroC);
    }

    Pessoa(String in_nome, int in_telefona){
        this.nome = in_nome;
        this.telefone = in_telefone;
    }
}
class Endereço{
    private String cidade;
    private String rua;
    private int numero;
    Endereço(String in_cidade, String in_rua, int in_numeroC){
        this.cidade = in_cidade;
        this.rua = in_rua;
        this.numero = in_numeroC;
    }
}