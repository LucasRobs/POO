import java.util.ArrayList;

class Academia{
    private ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList <Maquinas> maquinas = new ArrayList<Maquinas>();
    private ArrayList <Filiais> filiais = new ArrayList<Filiais>();
    private Endereco endereco;
    private String nome;
   
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(int x) {
        this.endereco.setCep(x);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}