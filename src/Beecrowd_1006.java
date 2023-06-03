/*
Utilizado média ponderada para resolver esse problema
beecrowd - Problema 1006 - Media 2
URL:https://www.beecrowd.com.br/judge/pt/problems/view/1006
*/
import java.util.Scanner;

public class Beecrowd_1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();

        double media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
        scan.close();
    }
}
