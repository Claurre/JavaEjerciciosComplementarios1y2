import java.util.Scanner;
class EjCompLV1_3 {
    /*Confeccionar un programa que dado un número entero como dato de entrada 
    imprima la secuencia de números (incrementos de 1)*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce un número");
        int a=scan.nextInt();
        scan.close();
        for ( int i = 1 ; i <= a ; i++){
            System.out.print(i);
        }
    }
}
