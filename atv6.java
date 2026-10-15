//Peça a leitura de um caractere representando a inicial do nome do usuário e exiba a mensagem "Sua 
//inicial é: X".
import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite a letra inicial do seu nome: ");
        char inicial = entrada.next().charAt(0);
        System.out.println("Sua inicial é: " + inicial);
    }
}