import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio7 {
  public static void main(String args[]){
      List<String> lista = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese un numero: ");
      int num1 = sc.nextInt();
      System.out.print("Ingrese un numero mayor al anterior: ");
      int num2 = sc.nextInt();

      if (num1 < num2){
        for (int i = num1; i<num2; i++){
          if (((i % 2) == 0) && ((i % 3) == 0)){
            lista.add("FizzBuzz");
          }else {
              if ((i % 2) == 0){
                lista.add("Fizz");
              }else{
                  if ((i % 3) == 0){
                    lista.add("Buzz");
                  }else{
                      lista.add(""+i);
                    }
                  }
                }
              }
            }
            System.out.print(lista);
            sc.close();
          }
        }
