import java.util.Scanner;


public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un nombre");
    String nombre = sc.nextLine();
    System.out.println("HOLA "+ nombre);
    sc.close();
  }
}
