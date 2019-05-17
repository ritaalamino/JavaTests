import java.util.Scanner;
import java.util.Locale;

//exercicio 2.3

public class aula_LP_1705 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ITALIAN);
        double number;

        System.out.println("Digite um valor: ");
        number = input.nextDouble();
        if (number < 0){
            number = number*-1;
        }
        System.out.println("O valor absoluto es " + number);        
    }
}
