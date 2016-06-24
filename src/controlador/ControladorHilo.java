/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.MetodosHilo;
import vista.GUIJuego;

/**
 *
 * @author Sofi
 */
public class ControladorHilo implements KeyListener{
    
    //public String estado="EnElSuelo";
    private GUIJuego gUIJuego;
    private MetodosHilo metodosHilo;
    private Icon personajeCorre;
    private Icon saltando;
    private Icon deslizar;
    
    
    public ControladorHilo(GUIJuego gUIJuego) {
        this.gUIJuego=gUIJuego;
        metodosHilo= new MetodosHilo(gUIJuego);
        saltando= new ImageIcon(getClass().getResource("../icon/saltando.png"));
        deslizar= new ImageIcon(getClass().getResource("../icon/deslizar.gif"));
    }
    public MetodosHilo getMetodosHilo()
    {
       return metodosHilo;
    }  
    
    
    public void keyTyped(KeyEvent ke) {}
    
    public void keyReleased(KeyEvent evento) {
           if(evento.getKeyCode()==40)
        {
            metodosHilo.agachado=false;
        }
    }
    
    public void keyPressed(KeyEvent evento) {
        
        if(evento.getKeyCode()==38)
        {
            
            if(metodosHilo.estado.equals("EnElSuelo"))
            {
                metodosHilo.estado="Subiendo";
                
                gUIJuego.setSiguienteMovimiento(saltando);
            }
        }
        
        if(evento.getKeyCode()==40)
        {
            
            metodosHilo.agachado=true;
            gUIJuego.setSiguienteMovimiento(deslizar);
            

        }
    }
    
}
