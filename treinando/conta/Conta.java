class Conta{
    String nome;
    int numero;
    String agencia;
    int saldo;
    Data abertura;

    Conta(String in_nome, int in_numero, String in_agencia, int in_saldo, int in_dia, int in_mes, int in_ano){
        this.nome = in_nome;
        this.numero = in_numero;
        this.agencia = in_agencia;
        this.saldo = in_saldo;
        this.abertura = new Data(in_dia, in_mes, in_ano);
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
}

class Data {
    int dia;
    int mes;
    int ano;
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