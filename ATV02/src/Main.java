
/**
 Escreva um programa Java que faça a troca de quartos entre dois hospedes. É
 preciso que ele receba o nome de um cliente e sua idade; o cliente a princípio será
 hospedado no quarto A. Depois, o programa deve receber o nome de outro cliente
 e sua idade; se o cliente for mais jovem, ficará no quarto B, mas, se a idade deste
 for maior que a do primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará
 no quarto B. Além disso, se a pessoa mais velha for idosa (com 60 anos ou mais),
 terá desconto de 40%. O programa deve mostrar ao final o nome do cliente que
 ficou no quarto A e o desconto, se houver, e o nome do cliente que ficou no quarto
 B.
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo informações dos clientes
        Cliente cliente1 = TrocaDeQuartos.receberInformacoesCliente(sc, 1);
        Cliente cliente2 = TrocaDeQuartos.receberInformacoesCliente(sc, 2);

        // Processando a troca de quartos
        TrocaDeQuartos.realizarTroca(cliente1, cliente2);
    }
}
