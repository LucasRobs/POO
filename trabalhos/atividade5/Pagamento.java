class Pagamento{
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public static Pagamento TipoDePagamento(int x){
        if(x == 1){
            Boleto y = new Boleto();
            return y;
        }else if(x == 2){
            Cartao y = new Cartao();
            return y;
        }
        return null;
    }
}