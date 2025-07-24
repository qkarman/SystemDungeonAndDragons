package clases.personaje;

import clases.objetosYcondicionales.Objetos;

import java.util.ArrayList;
import java.util.List;

public class BolsaPersonaje
{
    private int almacenOro;
    private List<String> objetos = new ArrayList<>();

    //!Creamos un constructor sin atributos
    public BolsaPersonaje()
    {
        objetos = new ArrayList<>();
    }

    //!Creamos el constructor con los atributos que se van almacenar
    public BolsaPersonaje(int almacenOro, List objetos)
    {
        this.almacenOro = almacenOro;
        this.objetos = objetos;
    }

    //*Creamos los metodos getter and setter
    public int getAlmacenOro()
    {
        return almacenOro;
    }

    public void setAlmacenOro(int almacenOro)
    {
        this.almacenOro = almacenOro;
    }

    public List<String> getObjetos()
    {
        return objetos;
    }

    public void setObjetos(List<String> objetos)
    {
        this.objetos = objetos;
    }

    //Creamos el toString para enviar el mensaje

    @Override
    public String toString()
    {
        return "BolsaPersonaje" +
                "{" +
                "almacenOro=" + almacenOro +
                ", objetos='" + objetos + '\'' +
                '}';
    }

    //*Metodo para agregar objetos al bolso
    public void agregarObjetos(Objetos objeto)
    {
        
    }
}
