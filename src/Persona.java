import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNacimiento;



    public Persona(String nombre, String apellido, int dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    //equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getDni() == persona.getDni() && Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellido(), persona.getApellido()) && Objects.equals(getFechaNacimiento(), persona.getFechaNacimiento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getDni(), getFechaNacimiento());
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", fechaNacimiento='" + fechaNacimiento ;
    }
}
