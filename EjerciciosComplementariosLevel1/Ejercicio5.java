import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        int num2 = sc.nextInt();
        int res = num1;
        for (int i = 1; i < num2 ; i++){
            res = res + num1;
        }
        System.out.println(num1+ " x "+ num2 +" = "+ res);
        sc.close();
    }   
}