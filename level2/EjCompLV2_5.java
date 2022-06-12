import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class EjCompLV2_5 {
    /*Dados 2 ArrayList que contienen horas-trabajadas (array1) 
    y valor-por-hora(array2) del resumen de carga de horas semanal 
    de un empleado. Se debe generar otra lista que contenga los totales y 
    luego imprimir el total final a cobrar.*/
    public static void main(String[]args){
        List<Integer> total = new ArrayList<Integer>();
        List<Integer> horaSemana = Arrays.asList(6, 7, 8, 4, 5);
        List<Integer> valorHora = Arrays.asList(350, 345, 550, 600, 320);
        int totalFinal = 0;
        for (int i=0; i<horaSemana.size();i++){
            total.add(horaSemana.get(i)*valorHora.get(i));
            totalFinal+= total.get(i);
        }
        System.out.println(total);
        System.out.println("Total Final: "+totalFinal);      
    }
}
