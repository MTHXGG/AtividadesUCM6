import java.util.Scanner;
import java.util.ArrayList;

public class Hospedagem {

    private double valorDiaria;
    private int qtdeGratuidades = 0;
    private int qtdeMeias = 0;
    private double valorTotal = 0.0;
    private ArrayList<Hospede> hospedes = new ArrayList<>();

    public Hospedagem(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void registrarHospedes(Scanner input) {
        String nomeHospede = "";
        int idadeHospede = 0;

        while (!nomeHospede.equalsIgnoreCase("PARE")) {
            System.out.print("Informe o nome do hóspede: ");
            nomeHospede = input.next();

            if (!nomeHospede.equalsIgnoreCase("PARE")) {
                System.out.print("Informe a idade do hóspede: ");
                idadeHospede = input.nextInt();

                Hospede hospede = new Hospede(nomeHospede, idadeHospede);
                hospedes.add(hospede);

                if (idadeHospede < 4) {
                    System.out.println(nomeHospede + " possui gratuidade.");
                    qtdeGratuidades++;
                } else if (idadeHospede > 80) {
                    System.out.println(nomeHospede + " paga meia.");
                    qtdeMeias++;
                    valorTotal += valorDiaria / 2;
                } else {
                    valorTotal += valorDiaria;
                }
            }
        }
    }



    public void mostrarResumo() {
        System.out.println("Entradas gratuitas: " + qtdeGratuidades);
        System.out.println("Meia-entrada: " + qtdeMeias);
        System.out.println("Total: R$ " + valorTotal);
    }
}
