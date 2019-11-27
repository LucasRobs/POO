class Funcionario extends Pessoa{
  private static int id;
  private double salario;
  Funcionario(){
    Funcionario.id += 1;
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public double getSalario() {
      return salario;
  }

  public void setSalario(double in_salario) {
      this.salario = salario;
  }
  public String toString() {
      return "{" +
          " nome='" + getNome() + "'" +
          ", cpf='" + getCpf() + "'" +
          ", salario='" + getSalario() + "}";
  }
}
