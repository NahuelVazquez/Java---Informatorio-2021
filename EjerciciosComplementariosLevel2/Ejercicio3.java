import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        List<Integer> cartas= new ArrayList<>();
       //no contemple el as, ni las figuras j q k. 
        for (int i = 2; i < 10; i++) {
            cartas.add(i);
        }       
        System.out.println("Cartas ordenadas: "+cartas);
   
        Collections.reverse(cartas);
        System.out.println("Cartas invertidas: "+cartas);

        Collections.shuffle(cartas);
        System.out.println("Cartas mezcladas: "+cartas);
    }
    
    
   
    
}