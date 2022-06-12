import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EjCompLV2_2 {
     /*Crear un ArrayList, agregar 5 números enteros. 
     Luego, agregar un número entero al principio de la lista y otro al final. 
     Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma 
     (antes y después de agregar a en la primera y última posición).*/
    public static void main(String[]args){
        List<Integer> enteros = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("introduce un número entero");
            enteros.add(scan.nextInt());
        }
        System.out.println("elemontos de la lista");
        for (int i=0; i<enteros.size(); i++){
            System.out.print(enteros.get(i)+" ");
        }
        System.out.println("el tamaño de la lista es: "+enteros.size());
        System.out.println("introduce un número entero para el principio de la lista");
        enteros.add(0,scan.nextInt());
        System.out.println("introduce un número entero para el final de la lista");
        enteros.add(scan.nextInt());
        System.out.println("elemontos de la lista");
        for (int i=0; i<enteros.size(); i++){
            System.out.print(enteros.get(i)+" ");
        }
        System.out.println("el tamaño de la lista es: "+enteros.size());
        scan.close();
    }
}
