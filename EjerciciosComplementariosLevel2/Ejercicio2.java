import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaNum = new ArrayList<>();
        for(int i=0; i < 5; i++ ) {
          System.out.print("Ingrese un Numero: ");
          int num = sc.nextInt();
          listaNum.add(num);
        }
        System.out.println(listaNum.size());
        System.out.print("Ingrese un numero al inicio: ");
        int num1= sc.nextInt();
        listaNum.add(0,num1);

        System.out.print("Ingrese un numero al final: ");
        int num2= sc.nextInt();
        listaNum.add(listaNum.size(),num2);
        for(int i = 0; i <listaNum.size(); i++){
          System.out.println(listaNum.get(i));
        }

        System.out.println("Elementos del arreglo: "+listaNum.size());
        sc.close();
    }
}