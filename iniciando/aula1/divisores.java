import java.util.Scanner;

class divisores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, aux = 0;
        n1 = input.nextInt();
        for(int i = 0; i < n1; i++){
            if(n1 % i == 0){
            System.out.printf("%d", i);
            }
        }
    }
}