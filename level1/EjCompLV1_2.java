import java.util.Scanner;
public class EjCompLV1_2 {
    public static void main(String[]args){
        /*Realizar un programa que solicite por consola 2 números enteros. 
        Para luego imprimir el resultado de la suma, resta, multiplicación, 
        división y módulo (resto de la división) de ambos números.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce un número");
        int num1=scan.nextInt();
        System.out.println("introduce otro número");
        int num2=scan.nextInt();
        scan.close();
        System.out.println(num1+" + "+num2+" = "+ (num1+num2));
        System.out.println(num1+" - "+num2+" = "+ (num1-num2));
        System.out.println(num1+" * "+num2+" = "+ (num1*num2));
        System.out.println(num1+" / "+num2+" = "+ (num1/num2));
        System.out.println(num1+" % "+num2+" = "+ (num1%num2));

    }
}

