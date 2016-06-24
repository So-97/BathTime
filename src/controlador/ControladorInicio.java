/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUIComic;
import vista.GUIInicio;
import vista.GUIInstrucciones;
import vista.GUIPuntuacion;

/**
 *
 * @author Sofi
 */
public class ControladorInicio implements ActionListener{

    private GUIInicio gUIInicio;
    private GUIPuntuacion gUIPuntuacion;
    private GUIInstrucciones gUIInstrucciones;
    private GUIComic gUIComic;

    public ControladorInicio(GUIInicio gUIInicio, GUIPuntuacion gUIPuntuacion, GUIInstrucciones gUIInstrucciones,GUIComic gUIComic) {
        this.gUIInicio = gUIInicio;
        this.gUIPuntuacion= gUIPuntuacion;
        this.gUIInstrucciones=gUIInstrucciones;
        this.gUIComic=gUIComic;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getActionCommand().equals("Jugar"))
        {
            gUIComic.setVisible(true);
            gUIInicio.setVisible(false);
        }
        
        if(evento.getActionCommand().equals("Instrucciones"))
        {
            gUIInstrucciones.setVisible(true);
            gUIInicio.setVisible(false);
        }
        
        if(evento.getActionCommand().equals("Puntuaciones"))
        {
            gUIPuntuacion.setVisible(true);
            gUIInicio.setVisible(false);
        }
        
        if(evento.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        
    }
    
}
