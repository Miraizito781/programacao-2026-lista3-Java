//Leia dois valores decimais digitados pelo usuário e exiba a diferença entre o primeiro e o segundo 
//valor.
import java.util.Scanner;
public class atv13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite um número");
    double num1 = entrada.nextDouble();
    System.out.println("Digite outro número");
    double num2 = entrada.nextDouble();
    double diferenca = (num1 - num2);
    System.out.println("A diferenca entre números é de: " + diferenca);
    }
}