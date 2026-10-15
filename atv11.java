// Leia três números inteiros digitados pelo usuário e exiba a soma dos três valores. 
import java.util.Scanner;
public class atv11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o primeiro número para somar");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número para somar");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número para somar");
        int num3 = entrada.nextInt();
        int soma = (num1 + num2 + num3);
        System.out.println("A soma dos 3 números citados é: " + soma);

    }
}