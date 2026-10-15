//Peça a leitura do nome de um produto (texto) e do seu preço (número decimal), e exiba as duas 
//informações formatadas em uma única linha, como "Produto: [nome] – Preço: R$ [preço]". 
import java.util.Scanner;
public class atv10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite o nome de um produto");
    String nome = entrada.nextLine();
    System.out.println("Digite o preco do produto");
    double preco = entrada.nextDouble();
    System.out.println("Produto: " + nome + " Preço: R$ " + preco);
    }
}