class Porta{
    boolean aberta;
    String cor;
    int dimensaoX = 30;
    int dimensaoY = 60;
    int dimensaoZ = 5;
    Porta(boolean in_aberta, String in_cor){
        this.aberta = in_aberta;
        this.cor = in_cor;
    }
    void abre(){
        this.aberta = true;
    }
    void fecha(){
        this.aberta = false;
    }
    void pinta(String in_cor){
        this.cor = in_cor;
    }
    boolean estaAberta(){
        if(this.aberta = true){
            return true;
        }else{
            return false;
        }
    }
}