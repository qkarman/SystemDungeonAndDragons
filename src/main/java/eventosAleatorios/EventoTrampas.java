package eventosAleatorios;
import java.util.*;
import javax.swing.JOptionPane;

public class EventoTrampas
{
    //Creamos una variable global

    //Creamos el evento trampa de cofre
    public void trampaCofre()
    {
       try
       {
           int open = Integer.parseInt(JOptionPane.showInputDialog(null,"!!Has tomado un camino el cual esta un cofre oculto " +
                   "Deseas abrilo" +
                   "1.- Si" +
                   "2.- No"));

           switch (open)
           {
                case 1 -> JOptionPane.showMessageDialog(null,"Has abierto el cofre y un demonio esta dentro.... te devora"  );
                case 2 -> JOptionPane.showMessageDialog(null,"Perdiste el oro del cofre");
                default -> JOptionPane.showMessageDialog(null,"Digitaste algo mal");
           }
       }
       catch (Exception e)
       {
           System.out.println("Seleccionaste algo mal en la decision: " + e.getMessage());
       }
    }
}
