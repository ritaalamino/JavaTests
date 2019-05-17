import java.util.Scanner;
import java.util.Locale;

//Exercicio 2.4
public class aula_LP_1705_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        input.useLocale(Locale.ITALIAN);
        int num;
        System.out.println("Digite :");
        num = input.nextInt();
        if ((num % 2) == 0){
            System.out.println("El numero es par.");
        }
        else {
            System.out.println("El numero es impar.");
        }

    }
}