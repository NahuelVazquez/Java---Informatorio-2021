import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String cadena = sc.nextLine();
        System.out.println("Ingrese una letra a contar: ");
        char letra = sc.next().charAt(0);
        int cont=0;
        char[] caracter = cadena.toCharArray();
        for (int i = 0; i < caracter.length; i++){
          if(letra == caracter[i]){
            cont++;
          }
        }
        System.out.println("Cantidad de veces que se repite la '" + letra + "' es =" +cont);

        sc.close();
    }
}