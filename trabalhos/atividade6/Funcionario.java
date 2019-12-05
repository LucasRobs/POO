class Funcionario extends Pessoa{
  private double salario;
  Funcionario(){
  }
  
  public double getSalario() {
      return salario;
  }

  public void setSalario(double in_salario) {
    this.salario = in_salario;
  }

  public String toString(){
      return "{ "+
          " nome='" + getNome() + "'" +
          ", cpf='" + getCpf() + "'" +
          ", salario='" + getSalario() + "}";
  }

}
