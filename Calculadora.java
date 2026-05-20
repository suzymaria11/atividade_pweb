import java.util.Scanner;

class Calculadora {
    double somar(double a, double b) { return a + b; }
    double subtrair(double a, double b) { return a - b; }
    double multiplicar(double a, double b) { return a * b; }
    double dividir(double a, double b) {
        if (b != 0) return a / b;
        System.out.println("Erro: divisão por zero.");
        return 0;
    }
}
 
class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
 
        System.out.println("=== Calculadora ===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
 
        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
 
        switch (op) {
            case 1: System.out.println("Resultado: " + calc.somar(a, b)); break;
            case 2: System.out.println("Resultado: " + calc.subtrair(a, b)); break;
            case 3: System.out.println("Resultado: " + calc.multiplicar(a, b)); break;
            case 4: System.out.println("Resultado: " + calc.dividir(a, b)); break;
            default: System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
