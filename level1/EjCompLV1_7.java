import java.util.Scanner;

class EjCompLV1_7 {
    /*Realizar un programa que dado un String de entrada en minúsculas 
    lo convierta por completo a mayúsculas. 
    Sin uso de métodos o librerías que realicen toUppercase().*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("escribe una frase");
        String palabra=scan.nextLine();
        scan.close();
        char ch;
        for (int i=0; i<palabra.length(); i++){
            ch = palabra.charAt(i);
            if(ch>96 && ch<123){
                ch=ch-32;
                System.out.print( (char) ch);
            }
        }
    }
}
