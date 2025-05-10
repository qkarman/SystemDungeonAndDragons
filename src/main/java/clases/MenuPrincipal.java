package clases;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Aqui vamos a gestionar las opciones del menu principal del videojuego
 */
public class MenuPrincipal
{
    //Creamos la variable global para nuestro menu
    protected int opcion;

    //*Creamos el metodo main para hacer pruebas unitarias del codigo
    public static void main(String[] args)
    {
        MenuPrincipal invocar = new MenuPrincipal();
        invocar.menu();
    }

    //*Creamos nuestro metodo del menu principal
    public void menu()
    {
        while( opcion != 3)
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    *** CALABOZOS Y DEIDADES ***
                    1.- Play
                    2.- Continue
                    3.- Exit
                    Selecciona una opcion"""));

                switch (opcion)
                {
                    case 1 -> System.out.println("hola");
                    case 2 -> System.out.println("Como estas");
                    default -> System.out.println("Seleccionaste algo mal");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Hay un error en el character: " + e.getMessage());
            }
        }
    }
}
