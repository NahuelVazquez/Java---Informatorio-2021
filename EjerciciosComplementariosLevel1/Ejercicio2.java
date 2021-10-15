import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int num1 = sc.nextInt();
    System.out.println("Ingrese otro numero");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    int res = num1 - num2;
    int mult = num1 * num2;
    int div = num1 / num2;
    int mod = num1 % num2;

    System.out.println(num1 + " + " + num2 + " = " + sum);
    System.out.println(num1 + " - " + num2 + " = " + res);
    System.out.println(num1 + " * " + num2 + " = " + mult);
    System.out.println(num1 + " / " + num2 + " = " + div);
    System.out.println(num1 + " % " + num2 + " = " + mod);
    sc.close();
  }
}
