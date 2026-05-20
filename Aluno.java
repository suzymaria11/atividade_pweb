class Aluno {
    String nome;
    double nota;
 
    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
 
    boolean foiAprovado() {
        return nota >= 7;
    }
 
    String getConceito() {
        if (nota >= 9) return "A";
        else if (nota >= 7) return "B";
        else return "C";
    }
}

class Aluno1 {
    public static void main(String[] args) {
        Aluno a = new Aluno("Maria", 8.5);
        System.out.println("Aluno: " + a.nome);
        System.out.println("Nota: " + a.nota);
        System.out.println("Aprovado: " + (a.foiAprovado() ? "Sim" : "Não"));
        System.out.println("Conceito: " + a.getConceito());
    }
}