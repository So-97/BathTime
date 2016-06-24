/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorHilo;
import vista.GUIJuego;

/**
 *
 * @author Sofi
 */
public class Hilo extends Thread{
    GUIJuego gUIJuego;
    MetodosHilo metodosHilo;

    public Hilo(GUIJuego gUIJuego, MetodosHilo metodosHilo) {
        this.gUIJuego = gUIJuego;
        this.metodosHilo= metodosHilo;

    }
    

    public void run(){

        while(true)
        {
            try
            {
                
                sleep(90);
                metodosHilo.moverFondo();
                metodosHilo.nuevoTiempo();
                metodosHilo.moverObstaculoJabon();
                metodosHilo.comprobarColisionJabon();
                metodosHilo.moverFrisbe();
                metodosHilo.comprobarColisionFrisbe();
                metodosHilo.moverObstaculoCubeta();
                metodosHilo.comprobarColisionCubeta();
                metodosHilo.aumentarBarra();
                metodosHilo.nuevaCantFrisbe();
                metodosHilo.comprobarPersonaje();
                
                if(metodosHilo.getAumentaColision()==4)
                {   
                System.out.println("Temp "+gUIJuego.getTiempo());
                System.out.println("Fris "+gUIJuego.getCantFrisbe());    
                gUIJuego.tiempoFinal=gUIJuego.getTiempo();
                gUIJuego.cantFrisbe=gUIJuego.getCantFrisbe();
                gUIJuego.totalPuntos=gUIJuego.getTotalPuntos();
                
                    gUIJuego.setVisible(false);
                    gUIJuego.fin().setDatos();
                    gUIJuego.fin().setVisible(true);
                    gUIJuego.detener();
                }
                
            }
            catch(Exception e)
            {
                System.out.println("Hubo un error en el hilo de ejecución: "+e);
            }
        
        }
    }
    
    
}
