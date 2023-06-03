/*
Utilizado a formula ((numero1 + numero2 + abs(numero1 - numero2)) / 2 , onde abs é o valor absoluto,
isso é o valor positivo de qualquer número passado
beecrowd - Problema 1013 - O Maior
URL:https://www.beecrowd.com.br/judge/pt/problems/view/1013
*/
import java.util.Scanner;

public class Beecrowd_1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();

        int maiorAB = (num1 + num2 + (Math.abs(num1 - num2))) / 2;
        int maiorBC = (maiorAB + num3 + (Math.abs(maiorAB - num3))) / 2;
        System.out.printf("%d eh o maior%n", maiorBC);
    }
}
