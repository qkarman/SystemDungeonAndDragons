package clases.historia;

import javax.swing.*;

public class Intro
{
    //Creamos la clase main para hacer pruebas de testing
    public static void main(String[] args)
    {
        Intro invocar = new Intro();
        invocar.introduccion();
    }

    //Creamos el metodo introduccion para adentrarnos al calabozo
    public void introduccion()
    {
        JOptionPane.showMessageDialog(null, """
                Nadie recuerda cuándo se abrió… ni por qué susurros aún escapan de su interior. Solo saben que quienes
                entran, nunca salen igual… si es que salen.
                """);

        JOptionPane.showMessageDialog(null, """
                La Cripta de las Mil Puertas cambia con cada paso. Sus pasillos murmuran, sus sombras se mueven. No hay
                mapa que sobreviva.
                
                Una fuerza oscura, atrapada entre planos, ha contaminado cada rincón del lugar. Las habitaciones se
                reconstruyen, los enemigos se reagrupan, las trampas se reactivan... y algunos cofres respiran.
                
                Cada puerta es una elección. Cada elección, una posible muerte.
                """);
    }
}
