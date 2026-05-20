class Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insiraa o primeiro número: ");
        int inicio = sc.nextInt();
        System.out.print("Insira o número final: ");
        int fim = sc.nextInt();
 
        int count = 0;
        int i = inicio;
        while (i <= fim) {
            if (i % 2 != 0) count++;
            i++;
        }
 
        System.out.println("Total de ímpares entre os números [" + inicio + ", " + fim + "]: " + count);
        sc.close();
    }
}