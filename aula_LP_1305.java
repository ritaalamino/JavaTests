import java.util.Scanner;
import java.util.Locale;

public class aula_LP_1305{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ITALIAN);
        double valor;
        
        System.out.println("Digite um valor: \n");
        valor = input.nextDouble();
        System.out.println("Valor: " + Math.floor(valor));
    }
}