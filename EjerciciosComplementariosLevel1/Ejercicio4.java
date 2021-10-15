import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++ ) {
          fact = fact *i;
        }
        System.out.println("El factorial de un numero es; "+fact);
        sc.close();
    }   
}