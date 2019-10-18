class Conta{
    public String nome = "User"+ numeroDeContas;
    private int numero = 0;
    private String agencia = "0";
    private int saldo = 0;
    public Data abertura;
    private static int numeroDeContas = 0;

    Conta(String in_nome, int in_numero, String in_agencia, int in_saldo, int in_dia, int in_mes, int in_ano){
        this.nome = in_nome +" ID : "+ Conta.numeroDeContas;
        this.numero = in_numero;
        this.agencia = in_agencia;
        this.saldo = in_saldo;
        this.abertura = new Data(in_dia, in_mes, in_ano);
        Conta.numeroDeContas += 1;
    }

    Conta(String in_nome){
        this.nome = in_nome + numeroDeContas;
        Conta.numeroDeContas += 1;
    }


    int saldo(){
        return this.saldo;
    }

    Boolean sacar(int in_valor){
        if(saldo > in_valor){
            this.saldo -= in_valor;
            return true;
        }else{
            return false;    
        }
    }

    void depositar(int in_valor){
        this.saldo += in_valor;
    }

    double rendimento(){
        double rendimento = this.saldo * 0.1;
        return rendimento;
    }

    String recuperaDadosParaImpressao(){
        String dados = "Nome = "+ this.nome+"\nNumero = "+ this.numero +"\nSaldo = "+ this.saldo +"\nRendiemnto = "+ rendimento()+"\nAbertura = "+ abertura.formatado();
        return dados;
    }
    
    	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Data getAbertura() {
		return this.abertura;
	}

	public void setAbertura(Data abertura) {
		this.abertura = abertura;
	}

	public static int getNumeroDeContas() {
		return Conta.numeroDeContas;
	}

}
class Data {
    public int dia = 0;
    public int mes = 0;
    public int ano = 0;
    Data(int in_dia, int in_mes, int in_ano){
        this.dia = in_dia;
        this.mes = in_mes;
        this.ano = in_ano;
    }
    String formatado(){
        String formatado = this.dia +"/"+ this.mes +"/"+ this.ano;
        return formatado;
    }
}
