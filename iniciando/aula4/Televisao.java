public class Televisao{
    private int canal = 0;
    private int volume = 0;

	public int getCanal() {
		return this.canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

    public void controle(char botao){
        if(botao == 'w'){
            if(volume < 100){
                volume += 1;
            }
        }else if(botao == 's'){
            if(volume > 0){
                volume -= 1;
            }
        }else if(botao == 'a'){
            
            if(canal > 0){
                canal += 1;
            }else if(canal < 0){
                canal = 30;
            }
        }else if(botao == 'd'){
            if(canal < 30){
                canal -= 1;
            }else if(canal > 30){
                canal = 0;
            }
        }
    }
}