public class Casa{
    String cor;
    ArrayList<Porta> portas = new ArrayList<Porta>();

    void pintar(String cor_in){
        this.cor = cor_in
    }
    int quantasPortasEstaoAbertas(){
        int contador = 0;
        for(int i = 0; i < totalDePortas; i++){
            if(portas.get(i).getAberta() == true){
                contador++;
            }
        }
        return contador;
    }

    void adicionaPorta(){
        portas.add(new Portas());
    }
    int totalPortasAbertas(){
        return totalDePortas();
    }
}
