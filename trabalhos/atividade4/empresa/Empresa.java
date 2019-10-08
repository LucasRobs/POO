import java.util.ArrayList;

class Empresa{
    private ArrayList<Funcionario> trabalhador = new ArrayList<Funcionario>();
    public void adicionarFuncionario(String in_nome,String in_nvEscolar,String in_instituto){
        Funcionario x = new Funcionario(in_nome, in_nvEscolar, in_instituto);
        trabalhador.add(x);
    }
    public void listarFuncionarios(){
        for(Funcionario x: trabalhador){
            System.out.println("Nome : "+ x.getNome() +"\nRenda : "+ x.getRenda());
        }
    }
    public void custoEmpresa(){
        double custo = 0;
        for(Funcionario x: trabalhador){
            custo = custo + x.getRenda();
        }
        System.out.println("Custo : "+ custo);
    }

}
class Funcionario{
    private String nome;
    private String NvEscolar;
    private String instituto;
    private double salario = 1000;
    private String comissao;
    private static int id = 0;
    Funcionario(String in_nome){//não estudou
        this.nome = in_nome;
        this.NvEscolar = "nada";
        this.instituto = "não frequentou";
        Funcionario.id += 1;
    }
    Funcionario(String in_nome,String in_nvEscolar,String in_instituto){
        this.nome = in_nome;
        if(in_nvEscolar == "basico"){
            this.NvEscolar = in_nvEscolar;
            this.instituto = in_instituto;
        }else if(in_nvEscolar == "medio"){
            this.NvEscolar = in_nvEscolar;
            this.instituto = in_instituto;
        }else if(in_nvEscolar == "graduacao"){
            this.NvEscolar = in_nvEscolar;
            this.instituto = in_instituto;
        }
        Funcionario.id += 1;
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

          }else if(NvEscolar == "graduacao"){
              renda += salario + (salario * 1.60);
              return renda;
          }
          return 0;
      }


}
