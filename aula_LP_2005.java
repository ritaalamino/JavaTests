/**
 * aula_LP_2005 exercicio 2.21
 */
import java.util.Scanner;

public class aula_LP_2005 {

    public static void main(String[] args) {
        System.out.println("Digite o valor de n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] matrix = new int [n][n];
        int cont;
        for (int i = 0; i < matrix.length; i++) {
            cont = i + 1;
            for (int j = 0; j < matrix.length;j++){
                if(cont < n){
                    matrix[i][j] = cont;
                    cont ++;
                }
                else{
                    matrix[i][j] = n;
                    cont ++;
                }
            }            
        }
        System.out.println();
    }
}