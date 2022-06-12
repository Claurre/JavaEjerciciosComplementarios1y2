import java.util.Scanner;
public class EjCompLV1_9 {
    /*Dado un String de entrada (frase, texto, etc) 
    calcular la cantidad de veces que aparece una letra dada.*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("escribe una frase");
        String frase=scan.nextLine();
        System.out.println("introduce una letra");
        String letra=scan.nextLine();
        scan.close();
        
        int contLetra= 0;
        int p = frase.indexOf(letra);
        while (p != -1){
            contLetra++;
            p = frase.indexOf(letra, p+1);
        }
        System.out.println("hay "+contLetra+" '"+letra+"' en "+frase);
    }
}
