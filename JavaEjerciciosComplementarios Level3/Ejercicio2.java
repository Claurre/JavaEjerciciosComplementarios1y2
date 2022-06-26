import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    /*Dada una lista que contiene números enteros, se deberá generar otra lista que
    contendrá el resultado de aplicar la operación de potencia a 2. */
    public static void main(String[]args){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> numerosPot = new ArrayList<Integer>();
        numeros.forEach((e) -> {
            e = e*e; 
            numerosPot.add(e);
        });
        System.out.println(numerosPot);
    }
}
