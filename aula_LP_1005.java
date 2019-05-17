import java.util.Scanner;
import java.util.Locale;

class aula_LP_1005{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        input.useLocale(Locale.ITALIAN);
        double valorDigitadoDouble;

        System.out.printf("Digite um valor: \n");
        valorDigitadoDouble = input.nextDouble();

        System.out.printf("\n+--Valor Digitado--+\n");
        System.out.printf(""+valorDigitadoDouble+"\n");
        /*
        while(valorDigitadoDouble > 0){
            System.out.println(valorDigitadoDouble);
            valorDigitadoDouble = valorDigitadoDouble - 1;
        }*/

        for(int i = 1; i < 10; i = i+1){
            if(i%2 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}