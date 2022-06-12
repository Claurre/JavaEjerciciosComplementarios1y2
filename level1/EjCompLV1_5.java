import java.util.Scanner;
public class EjCompLV1_5 {
    /*Se desea una aplicación que solicite 2 números enteros 
    y realice la operación de multiplicación por sumas sucesivas 
    (sin uso de librerías).*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce un número");
        int n1=scan.nextInt();
        System.out.println("introduce otro número");
        int n2=scan.nextInt();
        scan.close();
        int mult=n1;
        for ( int i = 1 ; i < n2 ; i++){
            mult=mult+n1;
        }
        System.out.println(n1+" * "+n2+" = "+mult);
    }
}
