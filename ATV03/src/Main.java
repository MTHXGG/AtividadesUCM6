/**
 * Escreva um programa Java que receba o valor padrão de uma diária e em
 * seguida receba vários nomes de hóspedes e suas idades. Caso a idade do
 * hóspede seja menor de 4 anos, ele não paga hospedagem – nesses casos, é
 * preciso que seja mostrada na tela a mensagem “(Nome do hóspede) possui
 * gratuidade”. Hóspedes com mais de 80 anos pagam metade – então dever ser
 * mostrado na tela “(Nome do hóspede) paga meia”. - Condições
 *
 * O usuário informará hóspedes
 * até digitar a palavra “PARE”, que interrompe a entrada de dados. - Loop
 *
 * Ao fim, o programa deve mostrar a quantidade de gratuidades, a quantidade de meias
 * hospedagens e o valor total, considerando todos os hóspedes informados
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor padrão da diária: ");
        double valorDiaria = input.nextDouble();

        Hospedagem hospedagem = new Hospedagem(valorDiaria);
        hospedagem.registrarHospedes(input);

        hospedagem.mostrarResumo();

        input.close();
    }
}
