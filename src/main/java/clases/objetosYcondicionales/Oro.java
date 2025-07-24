package clases.objetosYcondicionales;

public class Oro
{
    //Creamos las variables
    private int cantidad;
    private boolean recogido;

    //!Creamos un constructor con los atributos del oro
    public Oro(int cantidad)
    {
        this.cantidad = cantidad;
        this.recogido = false;
    }

    //*Creamos los metodos getter and setter
    public int getCantidad()
    {
        return cantidad;
    }

    public void Recoger()
    {
        this.recogido = true;
    }

    public boolean estaRecogido()
    {
        return recogido;
    }

    //*Creamos el metodo toString para hacer la impresion adecuada

    @Override
    public String toString()
    {
        return "Oro{" +
                "cantidad=" + cantidad +
                ", recogido=" + recogido +
                '}';
    }
}
