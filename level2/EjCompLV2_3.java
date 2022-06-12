import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class EjCompLV2_3 {
    /*Crear una lista que contenga como elementos la numeración de cartas de 
    una baraja francesa (solo los valores, no figuras). 
    Se deberá cargar el ArrayList (en orden), imprimir, 
    imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList 
    y volver a imprimir.*/
    public static void main(String[]args){
        List<String> cartas = new ArrayList<>();
        cartas.add("A");
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
        System.out.println(cartas);
        Collections.reverse(cartas);
        System.out.println(cartas);
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }
}