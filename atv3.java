//Leia um número inteiro representando a idade do usuário e exiba uma mensagem informando a idade 
//recebida, como "Você tem X anos."
import java.util.Scanner;
public class atv3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua idade");
    int idade = entrada.nextInt();
    System.out.println("Voce tem " + idade + " anos");
    }
}