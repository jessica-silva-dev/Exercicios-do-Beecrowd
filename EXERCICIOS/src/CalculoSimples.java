/*
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

 // Resolução do exercício

 import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoPeca1, codigoPeca2;
        int qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2;

        codigoPeca1 = scanner.nextInt();
        qtdPeca1 = scanner.nextInt();
        valorPeca1 = scanner.nextDouble();

        codigoPeca2 = scanner.nextInt();
        qtdPeca2 = scanner.nextInt();
        valorPeca2 = scanner.nextDouble();

        ddouble resultado = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);
    }
}
