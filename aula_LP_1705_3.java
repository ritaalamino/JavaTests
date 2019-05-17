/**
 * aula_LP_1705_3 vector
 */

import java.util.ArrayList;
import java.util.Collections;
public class aula_LP_1705_3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Banana");
        nomes.add("Uva");
        nomes.add("Manga");
        System.out.println(nomes.get(0));
        nomes.set(2,"Jujuba");
        System.out.println(nomes.get(2));
        //nomes.remove("Jujuba");
        System.out.println(nomes.size()); 
        Collections.sort(nomes);
        for(String i:nomes){
            System.out.println(i);
        }
    }
}