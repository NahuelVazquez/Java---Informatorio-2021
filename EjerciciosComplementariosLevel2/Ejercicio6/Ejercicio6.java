package Ejercicio6;

import java.util.HashSet;
//import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
//import java.util.Map;


public class Ejercicio6 {
    
    public static void main(String[] args) {
       String nombre; String apellido; int DNI; int horas; float valor;
       Scanner sc= new Scanner(System.in);
       Set<Empleado> lista= new HashSet<>();
       //Map<String,Integer> map = new HashMap<>();
       
       
       System.out.print("Ingrese la cantidad de empleados: ");
       int cantidad= sc.nextInt();
       
        for (int i = 0; i < cantidad; i++) {
            sc.nextLine();
            System.out.print("Ingrese nombre del empleado: ");
            nombre=sc.nextLine();

            System.out.print("Ingrese apellido del empleado: ");
            apellido=sc.nextLine();
            
            System.out.print("ingrese el DNI del empleado: ");
            DNI=sc.nextInt();

            System.out.print("ingrese las horas trabajadas del empleado: ");
            horas=sc.nextInt();

            System.out.print("ingrese el valor por hora, del empleado: ");
            valor=sc.nextFloat();
            System.out.println("Empleado: "+DNI+" Sueldo: "+horas*valor);
            lista.add(new Empleado(nombre,apellido,DNI,horas,valor));
            
        }
        System.out.println(lista);
        sc.close();        
        
    }
    
}