package personaje;

public class StatsPersonaje
{
    private int vida;
    private int ataque;
    private String nombre;
    private String tipo;
    private String debilidad;

    //!Creamos el constructor vacio para pruebas de stats
    public StatsPersonaje()
    {
        StatsPersonaje heroe = new StatsPersonaje(5,2,"Traspié","Humanoide","Bestia");
    }

    //!Creamos el constructor del personaje
    public StatsPersonaje(int vida, int ataque, String nombre, String tipo, String debilidad)
    {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
        this.tipo = tipo;
        this.debilidad = debilidad;
    }

    //*Creamos los metodos getter and setter
    public int getVida()
    {
        return vida;
    }

    public void setVida(int vida)
    {
        this.vida = Math.max(0,vida);
    }

    public int getAtaque()
    {
        return ataque;
    }

    public void setAtaque(int ataque)
    {
        this.ataque = Math.max(0,ataque);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getDebilidad()
    {
        return debilidad;
    }

    public void setDebilidad(String debilidad)
    {
        this.debilidad = debilidad;
    }

    //Creamos el sistema Enum para debilidad y tipo
    public enum Tipo
    {
        DEMONIO, BESTIA, HUMANOIDE, PLANTA, DIOS
        //Demonio Debil con Dios
        //Bestia debil con Demonio
        //Humanoide debil con bestia
        //Planta debil con humanoide
        //Dios inmune
    }

    //*Por ultimo el metodo toString para invocar stats
    @Override
    public String toString()
    {
        return "StatsPersonaje{" +
                "vida=" + vida +
                ", ataque=" + ataque +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", debilidad='" + debilidad + '\'' +
                '}';
    }

    //*Creamos un metodo para recibir el impacto de los enemigos
    public void recibirImpacto(int impacto)
    {
        this.vida = Math.max(0,this.vida - impacto);
    }
}
