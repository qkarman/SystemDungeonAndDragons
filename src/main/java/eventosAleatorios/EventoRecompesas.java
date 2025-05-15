package eventosAleatorios;
import objetosYcondicionales.Oro;

import java.util.*;
import javax.swing.JOptionPane;

public class EventoRecompesas
{
    //Creamos las variables del random
    private final Random random = new Random();

    //Creamos una variable global
    Oro oroCofre = new Oro(20);

    //Creamos el metodo donde va a estar el primer evento de recompensa
    public void recompensaOro()
    {
        try
        {
            int open = Integer.parseInt(JOptionPane.showInputDialog(null,"!!Has tomado un camino en el cual esta un cofre oculto " +
                    "Deseas abrilo?" +
                    "1.- Si" +
                    "2.- No"));

            switch (open)
            {
                case 1 ->
                {

                    oroCofre.Recoger(); //Marcamos que esta recogido
                    JOptionPane.showMessageDialog(null,"Has abierto el cofre y recibes "+ oroCofre.getCantidad() + "Piezas de oro");
                }
                case 2 -> JOptionPane.showMessageDialog(null,"Perdiste el oro del cofre");
                default -> JOptionPane.showMessageDialog(null,"Entrada invalida intenta de nuevo");
            }
        }
        catch (Exception e)
        {
            System.out.println("Seleccionaste algo mal en la decision: " + e.getMessage());
        }
    }
}
