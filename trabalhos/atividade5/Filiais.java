class Filiais extends Academia{
    private static int id;
    
    Filiais(String in_nome, int in_cep){
        setNome(in_nome);
        setEndereco(in_cep);
        Filiais.id++;
    }

    public int getId(){
        return id;
    }
}