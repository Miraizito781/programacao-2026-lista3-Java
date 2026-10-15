// Peça a leitura de um número decimal representando o preço de um produto e exiba o valor formatado 
//com duas casas decimais, precedido do símbolo "R$". 
import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o preço de um produto");
    double preco = entrada.nextDouble();
    System.out.printf("O valor formatado é: de R$ %.2f", preco);
    }
}