import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      List<Integer> horas = new ArrayList <> ();
      for (int i = 0; i < 5; i++) {
        System.out.print("Ingrese las horas trabajadas del dia "+(i+1)+": ");
        int hora=sc.nextInt();
        horas.add(hora); 
      }
      List<Integer> valorHoras = new ArrayList <> ();
      for (int i = 0; i < 5; i++) {
        System.out.print("Ingrese el valor de las horas trabajadas del dia "+(i+1)+": $");
        int valor=sc.nextInt();
        valorHoras.add(valor); 
      }

        List<Integer> semanal = new ArrayList <> ();

        int total = 0;
        for (int i = 0; i < 5; i ++){
            semanal.add(valorHoras.get(i)*horas.get(i));
            total += semanal.get(i);
        }

        System.out.println(semanal);

        System.out.println("Total Final: $"+total);
        sc.close();
    }
}