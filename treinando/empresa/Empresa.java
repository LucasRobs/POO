import java.util.ArrayList;
class Empresa{
    String nome;
    int cnpj;
    private ArrayList<Funcionario> trabalhador = new ArrayList<Funcionario>();

    Empresa(String in_nome, int in_cnpj){
        this.nome = in_nome;
        this.cnpj = in_cnpj;
    }

    public void adicionarFuncionario(String in_nome, int in_idade){
        Funcionario x = new Funcionario(in_nome, in_idade);
        trabalhador.add(x);
    }
    public void listarFuncionarios(){
        for(Funcionario x: trabalhador){
            System.out.println("Nome : "+ x.getNome() +"\nIdade : "+ x.getIdade());
        }
    }
}

class Funcionario{
    private String nome;
    private int idade;
    
    Funcionario(String in_nome, int in_idade) {
        this.nome = in_nome;
        this.idade = in_idade;
    }

    public String getNome() {
		return this.nome;
	}

	public String setNome(String nome) {
        this.nome = nome;
        return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
    }
    
}
