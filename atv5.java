//Leia o nome e a idade do usuário, em duas leituras separadas, e exiba ambas as informações em uma
//em uma em uma única linha formatada. 
import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = entrada.nextLine();
    System.out.println("Digite sua idade");
    int idade = entrada.nextInt();
    System.out.println("Seu nome é : " + nome + " e você tem: " + idade + " anos");
    }
}