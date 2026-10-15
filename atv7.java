//Leia dois números inteiros digitados pelo usuário e exiba o produto (multiplicação) entre eles. 
import java.util.Scanner;
public class atv7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite dois números para multiplicar");
    int num1 = entrada.nextInt();
    int num2 = entrada.nextInt();
    int multiplicacao = (num1 * num2);
    System.out.println("O produto desses dois números é: " + multiplicacao);
    }
}