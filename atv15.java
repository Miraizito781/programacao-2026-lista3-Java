//Leia um valor inteiro representando o ano de nascimento de uma pessoa e exiba a idade aproximada 
//dela, considerando o ano de referência 2026 (Idade = Ano de referência − Ano de nascimento). 
import java.util.Scanner;
public class atv15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite o eu ano de nascimento");
    int anoNas = entrada.nextInt();
    final int anoRef = 2026;
    int idade = (anoRef - anoNas);
    System.out.println(" Sua idade é de aproximadamente: " + idade); 
    }
}