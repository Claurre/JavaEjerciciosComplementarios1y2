import java.util.Scanner;
public class EjCompLV1_4 {
    /*Realizar un programa que calcule el factorial de un número: 
    n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n. */
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce un número");
        int n=scan.nextInt();
        scan.close();
        int fact=1;
        for ( int i = 1 ; i < n ; i++){
            fact=fact*(i+1);
        }
        System.out.println("factorial de "+n+" es: "+fact);
    }
}
