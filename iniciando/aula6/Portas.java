public class Porta[]{
    private boolean aberta = false;
    private String cor;
    private int totalDePortas;

    void pintar(String cor_in){
        this.cor = cor_in
    }
    
    int totalDePortas(){
        return totalDePortas;
    }

    public Porta(){

    }

	public boolean getAberta() {
		return this.aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

}
