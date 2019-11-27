public class Main{
  public static void main(String[] args){
    Instituicao UFCqx = new Instituicao();
    Reitor r1 = new Reitor();
    UFCqx.setReitor(r1);
    UFCqx.funcionarios.add(UFCqx.reitor.cadastrarFuncionario("Lucas","030190239012", 45000));
    /*
    for(Funcionario x: UFCqx.getFuncionarios()){
      System.out.println(x.getNome());
    }
    UFCqx.listarFuncionarios();

    for(Funcionario x: UFCqx.getFuncionarios()){
        System.out.println(x.toString());
    }
    UFCqx.funcionarios.add(UFCqx.reitor.cadastrarFuncionario("Lucas","030190239012", 45000));
    */
  }
}
