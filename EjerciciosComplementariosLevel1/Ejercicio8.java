import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombreYApellido;
        String edad;
        String direccion;
        String ciudad;

        System.out.println("Nombre y Apellido: ");
        nombreYApellido = sc.nextLine();
        System.out.println("Edad: ");
        edad = sc.nextLine();
        System.out.println("Direccion: ");
        direccion = sc.nextLine();
        System.out.println("Ciudad: ");
        ciudad = sc.nextLine();

        System.out.println(ciudad +" - "+ direccion+" - "+edad+" - "+nombreYApellido);

        sc.close();
    }
}