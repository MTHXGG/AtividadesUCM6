import java.util.ArrayList;
import java.util.Scanner;

public class Hospede {
        private ArrayList<String> listaDeHospedes = new ArrayList<>();

        public String nomeHospede() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do Hóspede: ");
            return scanner.nextLine();
        }
        public String pesquisaHospede() {
            String nome = nomeHospede();

            if(listaDeHospedes.contains(nome)){
                int indice = listaDeHospedes.indexOf(nome);
                return "Hospede " + nome + " foi encontrado no indice." +indice;
            } else {
                return "hospede " + nome + " não foi encontrado.";
            }
        }


        public void cadastrarhospede () {
            if (listaDeHospedes.size() < 15) {
                listaDeHospedes.add(nomeHospede());
            } else {
                System.out.println("número Máximo de hóspede atingido.");
            }
        }
    public int getNumeroDeHospedes() {
            return listaDeHospedes.size();
    }

}
