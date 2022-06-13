import java.util.Scanner;

class EjCompLV1_7 {
    /*Realizar un programa que dado un String de entrada en minúsculas 
    lo convierta por completo a mayúsculas. 
    Sin uso de métodos o librerías que realicen toUppercase().*/
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("escribe una frase");
        String palabra=scan.nextLine();
        String palabraMayus=""
        scan.close();
        char letraMin;
        char letraMay;
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        int pos= 0;
        for (int i=0; i<palabra.length(); i++){
            letraMin = palabra.charAt(i);
            pos = minus.indexOf(letraMin);
            if(pos != -1){
                letraMay = mayus.charAt(pos);
                palabraMay=palabraMay+letraMay;
            } else {palabraMay=palabraMay+letraMin;}
        }
        palabra=palabraMay;
        System.out.println(palabra);
    }
}
