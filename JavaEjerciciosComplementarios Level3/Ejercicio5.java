import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    /* Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
    nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
    generar un Map<String, Integer> donde la clave de Map será el apellido
    concatenado con el nombre (con separador de espacio en blanco) y el value la
    edad del alumno.
    _La lista de entrada debe estar cargada con varios alumnos (al menos 5)
    para subir el ejemplo y demostrar su funcionamiento.
    _En ejemplo se muestra solo con 1 Alumno a modo de abreviar
    Input (Entrada)
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));
    Output (Salida): 
        {"Simpson Homero"=30}*/
    public static void main(String[]args){
        Alumno emp1 = new Alumno("Eirika", "Fado", LocalDate.now().minusYears(20));
        Alumno emp2 = new Alumno("Reginn", "Eitri", LocalDate.now().minusYears(21));
        Alumno emp3 = new Alumno("Gohan", "Son", LocalDate.now().minusYears(31));
        Alumno emp4 = new Alumno("Naru", "Narusegawa", LocalDate.now().minusYears(17));
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)), emp1, emp2, emp3,emp4);
            //alumnos.add(emp1);
            //alumnos.add(emp2);
            //alumnos.add(emp3);
            //alumnos.add(emp4);
            //System.out.println(empleados);
        Map<String, Integer> alumMap = new HashMap<String, Integer>();
            Integer edad;
            String nombyAp;
            LocalDate fecha= LocalDate.now();
        for(Alumno alumno:alumnos){
            nombyAp= alumno.getNombre()+" "+alumno.getApellido();
            edad = Period.between(alumno.getEdad(), fecha).getYears(); 
            alumMap.put(nombyAp, edad);
        }
        System.out.println(alumMap);
    }
}
class Alumno {
        private String nombre;
        private String apellido;
        private LocalDate edad;
        public Alumno(String nombre, String apellido, LocalDate edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public LocalDate getEdad() {
            return edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public void setEdad(LocalDate edad) {
            this.edad = edad;
        }
}

