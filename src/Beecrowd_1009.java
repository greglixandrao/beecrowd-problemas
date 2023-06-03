/*
Utilizado média ponderada para resolver esse problema
beecrowd - Problema 1009 - Salário com Bônus
URL:https://www.beecrowd.com.br/judge/pt/problems/view/1009
*/
import java.util.Scanner;

public class Beecrowd_1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        double salario = scan.nextDouble();
        double totalVendas = scan.nextDouble();
        scan.close();

        double salarioFinal = salario + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
    }
}
