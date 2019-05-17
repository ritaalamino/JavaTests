import jdk.nashorn.internal.parser.Scanner;
import java.util.Locale;
import java.util.Scanner;
/**
 * aula_LP_1305_2
 */
public class aula_LP_1305_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        input.useLocale(Locale.ITALIAN);
        double NumA;
        double NumB;
        double prod;

        System.out.println("Digite um valor: ");
        NumA = input.nextDouble();
        NumB = input.nextDouble();
        prod = NumA*NumB;
        System.out.println("Num: "+Math.floor(prod));

    }
}