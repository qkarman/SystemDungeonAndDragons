package clases.recompensas;

import clases.personaje.BolsaPersonaje;
import clases.trampas.EventoTrampas;

import javax.swing.*;
import java.util.Random;

public class RecompensaObjetoAleatorio
{
    //Creamos las variables del random
    private final Random random = new Random();

    //Creamos el main para hacer pruebas unitarias
    public static void main(String[] args)
    {
        BolsaPersonaje bolsaTotal = new BolsaPersonaje();
        RecompensaCofreOro invocacion = new RecompensaCofreOro();
        EventoTrampas prueba = new EventoTrampas();
        invocacion.recompensaOro(bolsaTotal);
        prueba.trampaCofre(bolsaTotal);
    }

    //Creamos el metodo donde va a estar el primer evento de recompensa
    public void recompensaOro(BolsaPersonaje bolsa)
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

                switch (open)
                {
                    case 1 ->
                    {
                        int cantidadAleatoria = random.nextInt(30) + 20;
                        bolsa.setAlmacenOro(bolsa.getAlmacenOro() + cantidadAleatoria);

                        JOptionPane.showMessageDialog(null,"Has abierto el cofre y recibes "+  cantidadAleatoria + "Piezas de oro");
                        System.out.println("Total de Oro: " + bolsa.getAlmacenOro());
                        opcion = false;
                    }
                    case 2 ->
                    {
                        JOptionPane.showMessageDialog(null,"Perdiste el objeto del cofre");
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
