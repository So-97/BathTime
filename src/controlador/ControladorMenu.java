/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.GUIInicio;
import vista.GUIInstrucciones;
import vista.GUIPuntuacion;
import vista.PanelBotonesMenu;

/**
 *
 * @author Sofi
 */
public class ControladorMenu implements ActionListener{
    private GUIInicio gUIInicio;
    private PanelBotonesMenu panelBotonMenu;
    private GUIPuntuacion gUIPuntuacion;
    private GUIInstrucciones gUIInstrucciones;
    private int cual;

    public ControladorMenu(GUIInicio gUIInicio,GUIPuntuacion gUIPuntuacion) {
        this.gUIInicio = gUIInicio;
        this.gUIPuntuacion=gUIPuntuacion;
        cual=0;
    }

    public ControladorMenu(GUIInicio gUIInicio, GUIInstrucciones gUIInstrucciones) {
        this.gUIInicio = gUIInicio;
        this.gUIInstrucciones = gUIInstrucciones;
        cual=1;
    }

    public int getCual(){
        return cual;
    }
    
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getActionCommand().equals("Menu"))
        {
            if(getCual()==0)
            {
                gUIPuntuacion.setVisible(false);
                gUIInicio.setVisible(true);
            }  
            if(getCual()==1)
            {
                gUIInstrucciones.setVisible(false);
                gUIInicio.setVisible(true);
            }
        }
    }
    
}
