//Peça a leitura de um número inteiro e exiba na tela o dobro, o triplo e a metade desse número.
import java.util.Scanner;
public class atv12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite um número para realizar a operação");
    int num = entrada.nextInt();
    int dobro = (num * 2);
    int triplo = (num * 3);
    double metade = (num / 2.0);
    System.out.println("O dobro desse número é: " + dobro + ".  O triplo dele é: " + triplo + ". A metade dele é: " + metade);
    }
}