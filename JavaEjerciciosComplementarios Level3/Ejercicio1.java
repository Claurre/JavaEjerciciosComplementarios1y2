import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//import java.util.Scanner;

class Ejercicio1 {
    /*Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
    valores que NO sean null o vacío ("").
    Input (Entrada):
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
    Output (Salida):
        ["Hola", "Informatorio"] */
    public static void main(String[]args){
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List<String> filtrado = palabras.stream().filter(Objects::nonNull).filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        System.out.println(filtrado); 
    }
    }