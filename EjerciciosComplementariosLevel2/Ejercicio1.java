import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        for(int i=1; i <4; i++ ) {
          System.out.print("Ingrese una ciudad: ");
          String nombre = sc.nextLine();
          ciudades.add(nombre);
        }
        for (int i = 0; i < ciudades.size(); i++){
          System.out.println("#"+(i+1)+" - "+ciudades.get(i));
        }
        sc.close();
    }
}