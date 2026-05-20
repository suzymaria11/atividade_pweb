class Retangulo {
    double largura;
    double altura;
 
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
 
    double calcularArea() {
        return largura * altura;
    }
 
    double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
 
class primeiroRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a largura? ");
        double largura = sc.nextDouble();
        System.out.print("Quala a Altura? ");
        double altura = sc.nextDouble();
 
        Retangulo r = new Retangulo(largura, altura);
        System.out.println("A área do retângulo é de: " + r.calcularArea());
        System.out.println("O perímetro do retângulo é: " + r.calcularPerimetro());
        sc.close();
    }
}
