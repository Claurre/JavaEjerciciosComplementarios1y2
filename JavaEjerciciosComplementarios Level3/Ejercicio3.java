import java.util.List;

import javax.print.event.PrintJobListener;

public class Ejercicio3 {
    /*Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
     comiencen con la letra B (tanto mayúscula como minúscula, en ese caso
     decimos que será ignoreCase).*/
    public static void main(String[]args){
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl","Wonder Woman", "brainiac");
        int contB = 0;
        for (String e:palabras){
            int bB =hayB(e);
            contB = contB + bB;
        }
        System.out.println(contB);
    }
    //comprueba si hay una letra b o B
    public static int hayB (String palabra){
        if ( palabra.indexOf("b")!=-1 || palabra.indexOf("B")!=-1){
            return 1;
        } else {
            return 0;
        }

    }
}
