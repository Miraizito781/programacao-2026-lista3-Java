//Peça ao usuário que digite seu nome e exiba, na sequência, uma mensagem de saudação 
//personalizada, como "Olá, [nome]! Seja bem-vindo(a).".
import java.util.Scanner;
public class atv1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome.");
        String nome = entrada.next();
        System.out.println("Ola " + nome + "! Bem vindo ao Java!");
    }
}
