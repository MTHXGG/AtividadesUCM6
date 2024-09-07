public class Main {
    public static void main(String[] args) {
        Hospede hospede  = new Hospede();
        int opcao = 0;

        while(opcao != 3) {
            opcao = Menu.mostrarMenu(); // Exibe o menu inicialmente

            if (opcao == 1) {
                if(hospede.getNumeroDeHospedes() < 15) {
                    hospede.cadastrarhospede(); // Cadastra o hóspede
                } else {
                    System.out.println("Máximo número de cadastros atingidos");
                }
            } else if (opcao == 2) {
                System.out.println(hospede.pesquisaHospede()); // Pesquisa por hóspede
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}