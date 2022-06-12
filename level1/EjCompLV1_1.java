import java.util.Scanner;

class EjCompLV1_1 {
    public static void main(String[]args){
        /*Solicitar por consola el nombre del usuario 
        e imprimir por pantalla el 
        siguiente mensaje “HOLA {USUARIO}!!!”*/

        System.out.println("introduce nombre de usuario");
        Scanner scan= new Scanner(System.in);
        String usuario = scan.nextLine();
        System.out.println("hola "+usuario);
        scan.close();
    }
}
