package clases.trampas;

import clases.personaje.StatsPersonaje;

import javax.swing.*;
import java.util.Random;

/**
 * Se a completo
 */
public class EventoTrampaVampiro
{
    //Instancia Random
    Random aleatorio = new Random();

    //Creamos el metodo main para hacer pruebas unitarias
    public static void main(String[] args)
    {
        StatsPersonaje heroe = new StatsPersonaje(100,23,"Cristian","Luz","Oscuridad");
        EventoTrampaVampiro vampiro = new EventoTrampaVampiro();
        vampiro.trampaVampiro(heroe);
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
                        "!!Has tomado un camino en el cual esta muy oscuro.... " + "\n" +
                        " pero alcanzas a ver una silueta te acercas a ella? " +
                        " 1.- Si " +
                        " 2.- No "));

                switch(open)
                {
                    case 1 ->
                    {
                        int impacto = aleatorio.nextInt(11) + 10;
                        personaje.setVida(Math.max(0,personaje.getVida() - impacto));

                        JOptionPane.showMessageDialog(null,"te acercas y te das cuenta que es un " +
                                "vampiro, te muerde y roba " +  impacto + " puntos de vida ");
                        System.out.println("Total de vida: " + personaje.getVida());
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
                JOptionPane.showMessageDialog(null,"Seleccionaste algo mal en la decision: " + e.getMessage());
            }
        }
    }
}
