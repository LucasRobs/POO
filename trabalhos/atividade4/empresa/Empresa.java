import java.util.ArrayList;

class Empresa{
    private static int id = 0;
    private ArrayList<Funcionario> trabalhador = new ArrayList<Funcionario>();
    public void adicionarFuncionario(String in_nome,String in_nvEscolar,String in_instituto){
      Funcionario x = new Funcionario(in_nome, in_nvEscolar, in_instituto, Empresa.id);
      trabalhador.add(x);
      Empresa.id += 1;
    }
    public void listarFuncionarios(){
        for(Funcionario x: trabalhador){
            System.out.println("Nome : "+ x.getNome() + " ID :"+ x.getId() +"\nNivel escolar ["+ x.getNvEscolar() +"]\nComissao ["+ x.getComissao() +"]\nSalario Total : "+ x.getRenda() +"\n");
        }
    }
    public void custoEmpresa(){
        double custo = 0;
        for(Funcionario x: trabalhador){
            custo = custo + x.getRenda();
        }
        System.out.println("Custo da empresa : "+ custo +"\n");
    }
    public void declararComissao(int id,String in_comissao){
      for(int i = 0; i < trabalhador.size();i++){
        if(trabalhador.get(i).getId() == id){
          trabalhador.get(i).setComissao(in_comissao);
        }
      }
    }
}
class Funcionario{
    private String nome;
    private String NvEscolar;
    private String instituto;
    private double salario = 1000;
    private int id = 0;
    private String comissao;
    Funcionario(String in_nome, int id){//não estudou
        this.nome = in_nome;
        this.NvEscolar = "nada";
        this.instituto = "não frequentou";
        this.id = id;
    }
    Funcionario(String in_nome,String in_nvEscolar,String in_instituto, int in_id){
        this.nome = in_nome;
        this.NvEscolar = in_nvEscolar;
        this.instituto = in_instituto;
        this.id = in_id;
    }
      public String getNome(){
        return nome;
      }
      public void setNome(String nome){
        this.nome = nome;
      }
      public String getNvEscolar(){
        return NvEscolar;
      }
      public void setNvEscolar(String nvEscolar){
        this.NvEscolar = nvEscolar;
      }
      public String getInstituto(){
        return instituto;
      }
      public void setInstituto(String instituto){
        this.instituto = instituto;
      }
      public int getId(){
        return id;
      }
      public double getSalario(){
        return salario;
      }
      public void setSalario(double salario){
        this.salario = salario;
      }
      public String getComissao(){
        return comissao;
      }
      public void setComissao(String comissao){
        this.comissao = comissao;
      }

      public double getRenda(){
          double renda = 0;
          if(comissao == "gerente"){
              renda += 1500;
          }else if(comissao == "supervisor"){
              renda += 600;
          }else if(comissao == "vendedor"){
              renda += 250;
          }
          if(NvEscolar == "nada"){
              return salario;
          }else if(NvEscolar == "basico"){
              renda += salario + (salario * 0.10);
              return renda;

          }else if(NvEscolar == "medio"){
              renda += salario + (salario * 0.60);
              return renda;

          }else if(NvEscolar == "superior"){
              renda += salario + (salario * 1.60);
              return renda;
          }
          return 0;
      }




}
