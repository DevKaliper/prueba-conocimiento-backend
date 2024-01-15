package dto;

public class PersonaDTO {

    private String nombre;
    private String edad;
    private String romano;

    public PersonaDTO() {
    }

    public PersonaDTO(String nombre, String edad, String romano) {
        this.nombre = nombre;
        this.edad = edad;
        this.romano = romano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRomano() {
        return romano;
    }

    public void setRomano(String romano) {
        this.romano = romano;
    }
}
