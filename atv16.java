
//16. Peça a leitura de dois números inteiros representando horas e minutos e exiba a quantidade total de 
//minutos correspondente a essa duração (Total de minutos = horas × 60 + minutos)
import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a hora atual, e logo após os minutos percorridos:");
        int horas = entrada.nextInt();
        int minutos = entrada.nextInt();
        int totalMin = (horas * 60 + minutos);
        System.out.println("O total de minutos percorridos no horário informado é de: " + totalMin + " min");
    }
}