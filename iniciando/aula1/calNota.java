import java.util.Scanner;

class Media {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1 = 0, n2 = 0, n3 = 0;
        int aux = 0;
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		if(n1 == n2){
            aux++;
		}
        if(n1 == n3){
            aux++;
		}
        if(n2 == n3){
            aux++;
        }
        System.out.printf("%d iguais", aux);
	}
}