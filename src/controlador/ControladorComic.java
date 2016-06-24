/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import vista.GUIComic;
import vista.GUIInicio;
import vista.GUIJuego;
import vista.GUIPuntuacion;

/**
 *
 * @author Sofi
 */
public class ControladorComic implements ActionListener{
    private GUIComic gUIComic;
    private GUIJuego gUIJuego;
    private GUIInicio gUIInicio;
    private GUIPuntuacion gUIPuntuacion;
    
    private Icon comic2;
    private Icon comic3;
    private int secuencia=1;
            
    public ControladorComic(GUIComic gUIComic,GUIInicio gUIInicio) {
        this.gUIComic = gUIComic;
        comic3=new ImageIcon(getClass().getResource("../icon/comic2.png"));
        comic2=new ImageIcon(getClass().getResource("../icon/comic3.png"));
        this.gUIInicio=gUIInicio;
        gUIComic.setComicSig(gUIComic.getPrimerComic());
        secuencia=1;
    }


    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getActionCommand().equals("Siguiente"))
        {

            gUIComic.setComicSig(comic2);
            
            secuencia++;
            
            if(secuencia==2)
            {
                gUIComic.setComicSig(comic3);
                
            }
            if(secuencia==4)
            {
                gUIComic.setVisible(false);
                gUIJuego= new GUIJuego(gUIInicio,gUIPuntuacion);
                gUIJuego.setVisible(true);
            }
        }
        
        if(evento.getActionCommand().equals("Skip"))
        {
            gUIComic.setVisible(false);
            gUIJuego= new GUIJuego(gUIInicio,gUIPuntuacion);
            gUIJuego.setVisible(true);
        }
    }
    
}
