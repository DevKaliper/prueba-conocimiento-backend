package model;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.Objects;

//Estableciendo el módelo de qué contiene una persona.
public class Persona {

    @NotBlank @Pattern(regexp = "[A-Za-záéíóúÁÉÍÓÚñÑ ]+")
    private String nombre ;

    @NotBlank @Pattern(regexp = "[A-Za-záéíóúÁÉÍÓÚñÑ ]+")
    private String apellido;

    @Past @NotNull
    private LocalDate fechaDeNacimiento;


    @NotBlank @Pattern(regexp = "\\d-\\d{3}\\d?-\\d{3}\\d?")
    private String cedula;

    public Persona() {
    }


    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.cedula = cedula;
    }

    public int calcularEdad() {
        return LocalDate.now().getYear() - this.fechaDeNacimiento.getYear();
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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(fechaDeNacimiento, persona.fechaDeNacimiento) && Objects.equals(cedula, persona.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaDeNacimiento, cedula);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
