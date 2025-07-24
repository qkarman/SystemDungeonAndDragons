package clases.objetosYcondicionales;

public class Objetos
{
    public Double probabilidades;
    public String nombre;

    public Objetos(Double probabilidades, String nombre)
    {
        this.probabilidades = probabilidades;
        this.nombre = nombre;
    }

    public Double getProbabilidades() {
        return probabilidades;
    }

    public void setProbabilidades(Double probabilidades) {
        this.probabilidades = probabilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Objetos{" +
                "probabilidades=" + probabilidades +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
