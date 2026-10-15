//Leia um valor decimal representando uma temperatura em graus Celsius e exiba a mesma 
//temperatura convertida para Fahrenheit. 
import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite a temperatura em celsius");
    double tempCelsius = entrada.nextDouble();
    // F = (C × 9 / 5) + 32
    double tempCelparaFah = (tempCelsius * (9.0 / 5.0)) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + tempCelparaFah);
    }
}