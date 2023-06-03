/*
Utilizado matemática básica para resolver esse problema
beecrowd - Problema 1011 - Esfera
URL:https://www.beecrowd.com.br/judge/pt/problems/view/1011
*/
import java.util.Scanner;

public class Beecrowd_1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        scan.close();

        double volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
