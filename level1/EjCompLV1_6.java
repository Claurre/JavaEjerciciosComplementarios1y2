import java.util.Scanner;
public class EjCompLV1_6 {
    /*Se desea una aplicación que solicite 2 números enteros y 
    realice la operación de potencia (sin uso de librerías).*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce un número a potenciar");
        int n1=scan.nextInt();
        System.out.println("introduce la potencia");
        int n2=scan.nextInt();
        scan.close();
        int pot=n1;
        for ( int i = 1 ; i < n2 ; i++){
            pot=pot*n1;
        }
        System.out.println(n1+"^"+n2+" = "+pot);
    }
}
