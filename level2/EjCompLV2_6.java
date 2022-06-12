import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EjCompLV2_6 {
    /*Se dispone de una colección de Empleados, 
    de cada empleado se conoce:
    *Nombre y Apellido
    *DNI
    *horasTrabajadas
    *valorPorHora
    Todos los empleados están cargados en un Set (HashSet), 
    se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista 
    para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni 
    y el valor (value) es el sueldo calculado. */
    public static void main(String[]args){
        Empleado emp1 = new Empleado(12121212,"Juan Perez", 25, 950);
        Empleado emp2 = new Empleado(15615611, "Edelgarth Von Astra", 20, 1950);
        Empleado emp3 = new Empleado(12456789, "Ephraim Fado", 25, 1650);
        Empleado emp4 = new Empleado(38248624, "Reginn Eitri", 15, 1800);
        HashSet<Empleado> empleados = new HashSet<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        //System.out.println(empleados);
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        int sueldo,dni;
        for(Empleado empleado:empleados){
            sueldo = empleado.getHorasTrabajadas()*empleado.getValorHora();;
            dni = empleado.getDni();
            sueldos.put(dni, sueldo);
        }
        System.out.println(sueldos);
    }
}
class Empleado{
    private int dni;
    private String nombre;
    private int horasTrabajadas;
    private int valorHora;

    public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora) {
        this.dni = dni;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dni;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (dni != other.dni)
            return false;
        return true;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }   
}

