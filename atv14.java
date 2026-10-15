//Peça a leitura do peso (em kg) e da altura (em m) de uma pessoa e exiba ambos os valores formatados 
//com duas casas decimais.
import java.util.Scanner;
public class atv14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite seu peso");
    double peso = entrada.nextDouble();
    System.out.println("Digite sua altura");
    double altura = entrada.nextDouble();
    System.out.printf("O seu peso é: %.2f  kg e sua altura é: %.2f m", peso, altura);
    }
}
