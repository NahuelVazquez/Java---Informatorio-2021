import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        char[] caracter = cadena.toCharArray();
        for (int i = 0; i < caracter.length; i++){
            if (caracter[i] >= 'a' && caracter[i] <= 'z') {
                caracter[i] = (char)(caracter[i] - (int) 'a' + (int) 'A');
            }
            System.out.print(caracter[i]);
        }
        sc.close();
    }
}