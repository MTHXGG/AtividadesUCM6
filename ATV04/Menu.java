import java.util.Scanner;

public class Menu {
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma opção: \n1 - Cadastrar\n2 - Pesquisar\n3 - Sair");
        return scanner.nextInt();
    }


    public static int mostrarOpcaoPesquisa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma opção: \n1 - Cadastrar\n2 - Pesquisar\n3 - Sair");
        return scanner.nextInt();
    }
}


