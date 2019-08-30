public class Elevador{
    private int andar_atual = 0;
    private int andar_max = 0;
    private int elevador_cap = 0;
    private int n_pessoas = 0;

	public int getAndar_atual() {
		return this.andar_atual;
	}

	public void setAndar_atual(int andar_atual) {
		this.andar_atual = andar_atual;
	}

	public int getAndar_max() {
		return this.andar_max;
	}

	public void setAndar_max(int andar_max) {
		this.andar_max = andar_max;
	}

	public int getElevador_cap() {
		return this.elevador_cap;
	}

	public void setElevador_cap(int elevador_cap) {
		this.elevador_cap = elevador_cap;
	}

	public int getN_pessoas() {
		return this.n_pessoas;
	}

	public void setN_pessoas(int n_pessoas) {
		this.n_pessoas = n_pessoas;
	}


    public Elevador(int andarAtual, int andarMax, int elevadorCap, int nPessoas){
        this.andar_atual = andarAtual;
        this.andar_max = andarMax;
        this.elevador_cap = elevadorCap;
        this.n_pessoas = nPessoas;
    }
    public void Inicializa(int capacidade_in, int andar_in){
        this.elevador_cap = capacidade_in;
        this.andar_max = andar_in;
        this.elevador_cap = 0;
        this.n_pessoas = 0;
    }
    public void Entra(){
        if(n_pessoas <= elevador_cap)
            n_pessoas += 1;
    }
    public void Sai(){
        if(n_pessoas > 0){
            n_pessoas -= 1;
        }
    }
    public void Sobe(){
        if(andar_atual < andar_max){
            andar_atual -= 1;
        }
    }
    public void Desce(){
        if(andar_atual < 0){
            andar_atual -= 1;
        }
    }
    public void ImprimirInfo(){
        System.out.println("Andar atual "+andar_atual+"Numero de pessoas "+n_pessoas+"/"+elevador_cap);
    }
}