import java.util.Scanner;

public class aula_LP_2705{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String espacos;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                for(int i = 0; i < (15-(s1.lenght()+3))){
                    espacos += " ";
                }
                System.out.println(s1+espacos+x);
            }
            System.out.println("================================");

    }
}

