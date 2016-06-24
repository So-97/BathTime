/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroPuntuacion;
import vista.GUIFin;
import vista.GUIInicio;
import vista.GUIJuego;
import vista.GUIPuntuacion;

/**
 *
 * @author Sofi
 */
public class ControladorFin implements ActionListener{

    private GUIFin gUIFin;
    private GUIInicio gUIInicio;
    private GUIJuego gUIJuego;
    private RegistroPuntuacion registroPuntuacion;
    private GUIPuntuacion gUIPuntuacion;

    public ControladorFin(GUIFin gUIFin, GUIInicio gUIInicio, RegistroPuntuacion registroPuntuacion,GUIPuntuacion gUIPuntuacion) {
        this.gUIFin = gUIFin;
        this.gUIInicio = gUIInicio;
        this.registroPuntuacion= registroPuntuacion;
        this.gUIPuntuacion=gUIPuntuacion;
    }

    
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equals("Ingresar"))
        {
            System.out.println("i");
            registroPuntuacion.agregarPuntuacion(gUIFin.getPuntuacion());
            
            //registroPuntuacion.registrarPuntajeMayor(puntuacion)
            //escribirInfoArchivo;
            System.out.println("nombre"+gUIFin.getNombre());
            gUIFin.limpiar();
        }
        
        if(evento.getActionCommand().equals("OtraVez"))
        {
            gUIFin.setVisible(false);
            gUIJuego= new GUIJuego(gUIInicio,gUIPuntuacion);
            gUIJuego.setVisible(true);
        }
        
        if(evento.getActionCommand().equals("Menu"))
        {
            gUIFin.setVisible(false);
            gUIInicio.setVisible(true);
        }
        
    }
    
    public void setArchivo()
    {
        registroPuntuacion.setPuntuacionArchivo();
    }
    
    public void setEstudianteArchivo()
    {
       registroPuntuacion.setPuntuacionArchivo();
    }
    
    
}
