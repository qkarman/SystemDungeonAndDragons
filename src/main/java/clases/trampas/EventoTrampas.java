package clases.trampas;
import clases.personaje.BolsaPersonaje;

import java.util.*;
import javax.swing.JOptionPane;

/**
 * Aqui vamos a crear una trampa la cual un duende te va a robar tu oro dentro del cofre
 */

public class EventoTrampas
{
    //Creamos una variable global random
    Random aleatorio = new Random();

    //Creamos el metodo main para hacer pruebas unitarias
    public static void main(String[] args)
    {
        BolsaPersonaje bolsaTotal = new BolsaPersonaje();
        EventoTrampas prueba = new EventoTrampas();
        prueba.trampaCofre(bolsaTotal);
    }

    //Creamos el evento trampa de cofre
    public void trampaCofre(BolsaPersonaje bolsa)
    {
        boolean opcion = true;

        while(opcion)
        {
            try
            {
                int open = Integer.parseInt(JOptionPane.showInputDialog(null,"!!Has tomado un camino en el cual esta un cofre oculto " +
                        "Deseas abrilo?" +
                        "1.- Si" +
                        "2.- No"));

                switch(open)
                {
                    case 1 ->
                    {
                        int cantidadAleatoria = aleatorio.nextInt(11) + 10;
                        bolsa.setAlmacenOro(bolsa.getAlmacenOro() - cantidadAleatoria);

                        if(bolsa.getAlmacenOro() < cantidadAleatoria)
                        {
                            cantidadAleatoria = bolsa.getAlmacenOro();
                        }

                        bolsa.setAlmacenOro(bolsa.getAlmacenOro() - cantidadAleatoria);

                        JOptionPane.showMessageDialog(null,"Has abierto el cofre y te das cuenta que sale un duende" +
                                "y te roba parte de tu oro: " +  cantidadAleatoria + "Piezas de oro");
                        System.out.println("Total de Oro: " + bolsa.getAlmacenOro());
                        opcion = false;
                    }
                    case 2 ->
                    {
                        JOptionPane.showMessageDialog(null,"Te libraste de una trampa");
                        opcion = false;
                    }

                    default -> JOptionPane.showMessageDialog(null,"Entrada invalida intenta de nuevo");
                }
            }
            catch (Exception e)
            {
                System.out.println("Seleccionaste algo mal en la decision: " + e.getMessage());
            }
        }
    }
}
