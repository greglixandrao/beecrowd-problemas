/*
Utilizado média ponderada para resolver esse problema
beecrowd - Problema 1005 - Media 1
URL:https://www.beecrowd.com.br/judge/pt/problems/view/1005
 */
import java.util.Scanner;

public class Beecrowd_1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", media);
        scan.close();

    }
}