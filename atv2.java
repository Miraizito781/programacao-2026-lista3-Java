//Leia dois números inteiros digitados pelo usuário e exiba a soma entre eles. 
import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int soma = (num1 + num2);
        System.out.println("A soma desses dois numeros e: " + soma);
    }
}