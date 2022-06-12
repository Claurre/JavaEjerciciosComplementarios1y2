import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EjCompLV2_4 {
    /*Cargar un arrayList con 12 nombres de estudiantes (String), 
    luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.*/
    public static void main(String[]args){
        List<String> curso1, curso2, curso3, alumnos = new ArrayList<>();
        
        alumnos.add("alumno 01");
        alumnos.add("alumno 02");
        alumnos.add("alumno 03");
        alumnos.add("alumno 04");
        alumnos.add("alumno 05");
        alumnos.add("alumno 06");
        alumnos.add("alumno 07");
        alumnos.add("alumno 08");
        alumnos.add("alumno 09");
        alumnos.add("alumno 10");
        alumnos.add("alumno 11");
        alumnos.add("alumno 12");
        System.out.println("lista de alumnos: "+alumnos);
        curso1 = alumnos.subList(0, 3);
        System.out.println("curso 1: "+curso1);
        curso2 = alumnos.subList(4, 7);
        System.out.println("curso 2: "+curso2);
        curso3 = alumnos.subList(8, 11);
        System.out.println("curso 3: "+curso3);
    }
}
