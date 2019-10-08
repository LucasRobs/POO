public class Funcionario{
  private String nome;
  private int departamento;
  private double salario;
  private int dia;
  private int mes;
  private int ano;
  private String rg;
  private Boolean contrato;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Boolean getContrato() {
		return this.contrato;
	}

	public void isContrato(Boolean contrato) {
		this.contrato = contrato;
	}


  public Funcionario(String nome_in, int departamento_in, double salario_in, int dia_in, int mes_in ,int ano_in, String rg_in){
    this.nome = nome_in;
    this.departamento = departamento_in;
    this.salario = salario_in;
    this.dia = dia_in;
    this.mes = mes_in;
    this.ano = ano_in;
    this.rg = rg_in;
    this.contrato = true;
  }

  public void bonifica(int acrescimo){
    this.salario += acrescimo;
  }

  public void demitir(){
    this.contrato = false;
  }

  public void printer(){
    System.out.println("Nome :"+ nome +"
                      \nSalario :" + salario + "
                      \nDepartamento "+ departamento +"
                      \nStatus do contrato :" + contrato + "
                      \nData de entrada : "+ dia +"/"+ mes +"/"+ ano +"
                      \nRG :"+ rg);
  }
}
