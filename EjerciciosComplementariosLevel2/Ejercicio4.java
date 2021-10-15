import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> estudiantes= new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre=sc.nextLine();
            estudiantes.add(nombre); 
        }
        
        List<String> curso1=estudiantes.subList(0, 4);
        List<String> curso2=estudiantes.subList(4,8);
        List<String> curso3=estudiantes.subList(8, 12);
        
        System.out.println("Curso1: "+curso1);
        System.out.println("Curso2: "+curso2);
        System.out.println("Curso3: "+curso3);
        sc.close();
        
    }     
}