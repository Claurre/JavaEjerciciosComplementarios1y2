import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EjCompLV2_7 {
    /*Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
    nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
    Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” 
    y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
    Observacion: Los 2 argumentos indican con que valor se arranca a calcular 
    y el segundo con qué valor debe frenar (no se incluye en el cálculo)
    Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
    
    Input (Entrada):
    fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
    fizzBuzzFuncion(1,8)

    Output (Salida):
    [“1”, “Fizz”, “Buzz”, “Fizz”, “5”]
    [“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]*/
    public static void main(String[]ars){
        System.out.println(fizzBuzzFuncion(1, 8));
        System.out.println(fizzBuzzFuncion(1, 6));

    }
    public static List fizzBuzzFuncion(int numA, int numB){
        List<String> fizzBuzz = new ArrayList<String>();
        //fizzBuzz.add(Integer.toString(numA));
        for (int i=numA;i<numB;i++){
            String fzbz = "";
            if (i%2==0){
                fzbz=fzbz+"Fizz";
            }
            if (i%3==0){
                fzbz=fzbz+"Buzz";
            }
            if (i%2 != 0 && i%3 != 0){
                fzbz=fzbz+Integer.toString(i);
            }
            fizzBuzz.add(fzbz);
        }
        return fizzBuzz;
    }
}
