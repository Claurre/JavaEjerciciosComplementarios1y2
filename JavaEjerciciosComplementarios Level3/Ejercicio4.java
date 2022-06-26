import java.util.ArrayList;
//import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Set;

public class Ejercicio4 {
    /* Se dispone de una lista de Integer, de la cual queremos obtener otra lista
    aplicando la operación de factorial pero no se desean valores repetidos.*/
    public static void main(String[]args){
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> numerosFact = new ArrayList<Integer>();
        System.out.println(numeros);
        Integer previo=null;
        for (Integer e:numeros){
            if(e!=previo){
                numerosFact.add(factorialFunc(e));
            }
            previo=e;
        }
        System.out.println(numerosFact);
    }
    public static Integer factorialFunc(int num){
        int factorial=num;
        while ( num>1) {
            num--;
            factorial=factorial*num;
            //System.out.println(factorial);
        }
        return factorial;
    }
}
