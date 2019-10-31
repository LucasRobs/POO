class Pessoa{
    private String nome;
    private Data data_nasc;
    private Endereco endereco;
}
class Data{
    private int dia;
    private int mes;
    private int ano;
    Data(int in_dia, int in_mes, int in_ano){
        this.dia = in_dia;
        this.mes = in_mes;
        this.ano = in_ano;
    }
}