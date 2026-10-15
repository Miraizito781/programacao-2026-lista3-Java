//Peça a leitura da quantidade de itens comprados (número inteiro) e do valor unitário do item (número 
//decimal), calcule e exiba o valor total da compra. 
import java.util.Scanner;
public class atv8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Quantos itens você comprou? ");
    int qtdItens = entrada.nextInt();
    System.out.println("Qual o valor de cada unidade desse item?");
    double valorItem = entrada.nextDouble();
    double valorCompra = (qtdItens * valorItem);
    System.out.println("O valor total da sua compra foi de : " + valorCompra);
    }
}