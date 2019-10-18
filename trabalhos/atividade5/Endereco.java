class Endereco{
    private int cep;

    public Endereco setCep(int cep) {
        this.cep = cep;
        return this;
    }

    public int localizar(){
        return this.cep;
    }
}