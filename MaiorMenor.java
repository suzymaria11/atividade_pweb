class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja informar? ");
        int qtd = sc.nextInt();
 
        System.out.print("Digite o primeiro número: ");
        double maior = sc.nextDouble();
        double menor = maior;
 
        for (int i = 1; i < qtd; i++) {
            System.out.print("Digite o próximo número: ");
            double num = sc.nextDouble();
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
 
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}