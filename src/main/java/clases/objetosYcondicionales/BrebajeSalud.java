package clases.objetosYcondicionales;

public class BrebajeSalud extends Objetos
{
    public int sanacion;
    public boolean recogido;

    //Creamos el constructor del brebaje
    public BrebajeSalud(int sanacion, boolean recogido, double probabilidad, String nombre)
    {
        super(probabilidad, nombre);
        this.sanacion = sanacion;
        this.recogido = recogido;
    }

    //Creamos un constructor con parametros
    public BrebajeSalud()
    {
        super(0.5,"Brebaje de vida"); //50% de probabilidad
        this.sanacion = 20;
        this.recogido = false;
    }

    //Creamos los metodos getter and setter para poder acceder

    public int getSanacion()
    {
        return sanacion;
    }

    public void setSanacion(int sanacion)
    {
        this.sanacion = sanacion;
    }

    public boolean isRecogido()
    {
        return recogido;
    }

    public void setRecogido(boolean recogido)
    {
        this.recogido = recogido;
    }

    //Creamos lo estetico un toString
    @Override
    public String toString() {
        return "BrebajeSalud{" +
                "sanacion=" + sanacion +
                ", recogido=" + recogido +
                ", probabilidades=" + probabilidades +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //*Creamos un metodo para lanzar el dado de aparicion
    public boolean aparece()
    {
        return Math.random() < this.getProbabilidades(); //Asume que la clase padre tiene get probabilidad()
    }
}
