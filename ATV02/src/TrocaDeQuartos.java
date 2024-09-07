import javax.sound.midi.MidiFileFormat;
import java.text.MessageFormat;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class TrocaDeQuartos {

    public static Cliente receberInformacoesCliente(Scanner sc, int numeroCliente) {
        System.out.print("Nome do " + numeroCliente + "º cliente: ");
        String nome = sc.nextLine();

        System.out.print("Idade do " + numeroCliente + "º cliente: ");
        int idade = sc.nextInt();
        sc.nextLine();

        return new Cliente(nome, idade);
    }

    public static void realizarTroca(Cliente cliente1, Cliente cliente2) {
        String nomeQuartoA, nomeQuartoB;
        int idadeQuartoA, idadeQuartoB;
        double desconto = 0;

        if (cliente1.getIdade() > cliente2.getIdade()) {
            nomeQuartoA = cliente1.getNome();
            idadeQuartoA = cliente1.getIdade();
            nomeQuartoB = cliente2.getNome();
            idadeQuartoB = cliente2.getIdade();
        } else {
            nomeQuartoA = cliente2.getNome();
            idadeQuartoA = cliente2.getIdade();
            nomeQuartoB = cliente1.getNome();
            idadeQuartoB = cliente1.getIdade();
        }

        if (idadeQuartoA >= 60) {
            desconto = 40;
        }
        /**
         * ----------------
         * |0|1|2|3|4|...
         * ----------------
         *
         */
        System.out.println(MessageFormat.format("O Quarto A ficará com: {0} de {1} anos de idade.\n", nomeQuartoA, idadeQuartoA));
        System.out.println(MessageFormat.format("O Quarto B ficará com: {0} de {1} anos de idade.\n", nomeQuartoB, idadeQuartoB));
        if (desconto > 0) {
            System.out.println(MessageFormat.format("O(A/U/UNIX/ELO) hóspede {0} ficará com o desconto de 40% POR SER VELHO(A/E/IX).", nomeQuartoA));
        }
    }
}