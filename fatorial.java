import java.util.Scanner;

class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
 
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
 
        System.out.println("Fatorial de " + n + " = " + fatorial);
        sc.close();
    }   
}