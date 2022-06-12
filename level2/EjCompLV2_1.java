import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EjCompLV2_1 {
    /*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
    luego imprimir por pantalla el ranking*/
    public static void main(String[]args){
        List<String> ciudades = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        String continuar, si = "SI";
       do{
            System.out.println("carga una de tus ciudades favoritas de Argentina");
            ciudades.add(scan.nextLine());
            
            System.out.println("¿deseas continuar ingresando ciudades? escribe 'si' para continuar");
            continuar=scan.nextLine();
            continuar=continuar.toUpperCase();
        } while (continuar.equals(si));
        scan.close();
        for ( int i = 0 ; i < ciudades.size() ; i++){
            System.out.println("#"+i+" "+ciudades.get(i));
        }
    }
}
