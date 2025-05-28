package eventosAleatorios;

import personaje.StatsPersonaje;

import javax.swing.*;
import java.util.Random;

/**
 * Sigue en proceso este evento
 */
public class EventoTrampaVampiro
{
    //Instancia Random
    Random aleatorio = new Random();

    //Creamos el metodo main para hacer pruebas unitarias
    public static void main(String[] args)
    {

    }

    //Creamos el metodo del trampa vampiro
    public void trampaVampiro(StatsPersonaje personaje)
    {
        boolean opcion = true;

        while(opcion)
        {
            try
            {
                int open = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "!!Has tomado un camino en el cual esta muy oscuro.... " +
                        " pero alcanzas a ver una silueta te acercas a ella? " +
                        "1.- Si" +
                        "2.- No"));

                switch(open)
                {
                    case 1 ->
                    {
                        int impacto = aleatorio.nextInt(1) + 5;
                        bolsa.setAlmacenOro(bolsa.getAlmacenOro() - cantidadAleatoria);

                        if(bolsa.getAlmacenOro() < cantidadAleatoria)
                        {
                            cantidadAleatoria = bolsa.getAlmacenOro();
                        }

                        bolsa.setAlmacenOro(bolsa.getAlmacenOro() - cantidadAleatoria);

                        JOptionPane.showMessageDialog(null,"te acercas y te das cuenta que es un " +
                                "vampiro, te chupa y roba" +  cantidadAleatoria + "puntos de vida");
                        System.out.println("Total de vida: " + bolsa.getAlmacenOro());
                        opcion = false;
                    }
                    case 2 ->
                    {
                        JOptionPane.showMessageDialog(null,"Te libraste de un vampiro ");
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
