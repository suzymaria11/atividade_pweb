class MenuSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Menu ===");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Atualizar");
        System.out.println("4 - Excluir");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
 
        switch (opcao) {
            case 1: System.out.println("Ação: Cadastrar"); break;
            case 2: System.out.println("Ação: Consultar"); break;
            case 3: System.out.println("Ação: Atualizar"); break;
            case 4: System.out.println("Ação: Excluir"); break;
            default: System.out.println("Erro: opção inválida.");
        }
        sc.close();
    }
}