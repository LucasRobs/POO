public class Main{
  public static void main(String[] args){
    Instituicao UFCqx = new Instituicao();
    Reitor r1 = new Reitor();
    UFCqx.reitor = r1;

    UFCqx.funcionarios.add(UFCqx.reitor.cadastrarFuncionario("Lucas","030190239012", 45000));
    /*
    for(Funcionario x: UFCqx.funcionarios){
        System.out.println(x.toString());
    }*/
  }
}
