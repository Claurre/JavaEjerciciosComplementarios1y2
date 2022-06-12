import java.util.Scanner;

public class EjCompLV1_8 {
    /*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String[] datos= new String[4];
        System.out.println("¿Nombre y Apellido?");
        datos[0]=scan.nextLine();
        System.out.println("¿Edad?");
        datos[1]=scan.nextLine();
        System.out.println("¿Dirección?");
        datos[2]=scan.nextLine();
        System.out.println("¿Ciudad?");
        datos[3]=scan.nextLine();
        scan.close();
        System.out.println(datos[3]+" - "+datos[2]+" - "+datos[1]+" - "+datos[0]);
        /*for ( int i = 3 ; i < 0 ; i--){
            System.out.print(datos[i]+" - ");
        }*/
    }
}
