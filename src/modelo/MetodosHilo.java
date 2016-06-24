/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import vista.GUIJuego;

/**
 *
 * @author Sofi
 */
public class MetodosHilo {
    GUIJuego gUIJuego;
    public String estado="EnElSuelo";
    private Icon barra1;
    private Icon barra2;
    private Icon barra3;
    private Icon barra4;
    private int aumentaColision=0;
    private int cantFrisbe=0;
    private int tiempo=0;
    public boolean agachado=false;
    
    
    public MetodosHilo(GUIJuego gUIJuego) {
        this.gUIJuego = gUIJuego;
        barra1= new ImageIcon(getClass().getResource("../icon/barra1.png"));
        barra2= new ImageIcon(getClass().getResource("../icon/barra2.png"));
        barra3= new ImageIcon(getClass().getResource("../icon/barra3.png"));
        barra4= new ImageIcon(getClass().getResource("../icon/barra4.png"));
    }

    
    /////////FONDO
    
    public void moverFondo()
    {
        if(gUIJuego.jlFondo.getX()>-8310)
        {
            gUIJuego.jlFondo.setLocation(gUIJuego.jlFondo.getX()-20, gUIJuego.jlFondo.getY());
            tiempo++;
        }
        else
        {
            gUIJuego.jlFondo.setLocation(0, gUIJuego.jlFondo.getY());
        }
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public void nuevoTiempo(){
        gUIJuego.setTiempo(getTiempo());
    }
    
    /////////PERSONAJE
    
    public void comprobarPersonaje()
    {
        if(estado.equals("Subiendo"))
        {
            subirPersonaje();
            
        }
        if(estado.equals("Bajando"))
        {
            bajarPersonaje();
        }
        if(gUIJuego.jlPersonaje.getY()==220)
        {
            estado="Bajando";
        }
        if(gUIJuego.jlPersonaje.getY()==340)
        {
            estado="EnElSuelo";
            if (!agachado) {
                gUIJuego.setSiguienteMovimiento(gUIJuego.getPrimerMovimiento());
            }  
        }
//        System.out.println("perro "+gUIJuego.jlPersonaje.getY());
    }
    
    public void subirPersonaje()
    {

        gUIJuego.jlPersonaje.setLocation(gUIJuego.jlPersonaje.getX(),gUIJuego.jlPersonaje.getY()-20);
    }
    
    public void bajarPersonaje()
    {
        gUIJuego.jlPersonaje.setLocation(gUIJuego.jlPersonaje.getX(),gUIJuego.jlPersonaje.getY()+10);
    }

    /////////OBJETOS
    
    public void moverObstaculoJabon()
    {
        if(gUIJuego.jlObsJabon.getX()>-200)
        {
            gUIJuego.jlObsJabon.setLocation(gUIJuego.jlObsJabon.getX()-20, gUIJuego.jlObsJabon.getY());
        }
        else
        {
            gUIJuego.jlObsJabon.setLocation(810, gUIJuego.jlObsJabon.getY());
        }
    }
    
    public void comprobarColisionJabon()
    {
        if(gUIJuego.jlPersonaje.getX()+180>gUIJuego.jlObsJabon.getX() && gUIJuego.jlPersonaje.getX()+150<gUIJuego.jlObsJabon.getX() && 
            gUIJuego.jlObsJabon.getX()+100>gUIJuego.jlPersonaje.getX() && gUIJuego.jlPersonaje.getY()+60>gUIJuego.jlObsJabon.getY() )
        {
            System.out.println("ColisiónJabon");
            aumentaColision+=1;
        }
    }
    
    
    public void moverObstaculoCubeta()
    {
        if(gUIJuego.jlCubeta.getX()>-450)
        {
            gUIJuego.jlCubeta.setLocation(gUIJuego.jlCubeta.getX()-20, gUIJuego.jlCubeta.getY());
        }
        else
        {
            gUIJuego.jlCubeta.setLocation(810, gUIJuego.jlCubeta.getY());
        }
    }
    
    public void comprobarColisionCubeta()
    {
        if(gUIJuego.jlPersonaje.getBounds().intersects(gUIJuego.jlCubeta.getBounds()))
      //  if(gUIJuego.jlPersonaje.getX()+180==gUIJuego.jlCubeta.getX()&&gUIJuego.jlPersonaje.getY()+100==gUIJuego.jlCubeta.getY()+58)
        {

            System.out.println("Colisióncubeta");
            aumentaColision+=1;

        }
    }
    
    public void moverFrisbe()
    {
        if(gUIJuego.jlFrisbe.getX()>-500)
        {
            gUIJuego.jlFrisbe.setLocation(gUIJuego.jlFrisbe.getX()-30, gUIJuego.jlFrisbe.getY());
        }
        else
        {
            gUIJuego.jlFrisbe.setLocation(1300, gUIJuego.jlFrisbe.getY());
        }
    }
    
    public void comprobarColisionFrisbe()
    {
     //   Rectangle perro= new Rectangle(gUIJuego.jlFrisbe.getX(),gUIJuego.jlFrisbe.getY(),gUIJuego.jlFrisbe.getWidth(),gUIJuego.jlFrisbe.getHeight());
        
          //if(gUIJuego.jlPersonaje.getX()+180>gUIJuego.jlFrisbe.getX()&&gUIJuego.jlFrisbe.getX()+92>gUIJuego.jlPersonaje.getX()&&gUIJuego.jlPersonaje.getY()+100>gUIJuego.jlFrisbe.getY()&&gUIJuego.jlFrisbe.getY()+43>gUIJuego.jlPersonaje.getY())
         if(gUIJuego.jlPersonaje.getX()+180>gUIJuego.jlFrisbe.getX()&& gUIJuego.jlFrisbe.getY()+30>gUIJuego.jlPersonaje.getY() &&
           gUIJuego.jlPersonaje.getX()<gUIJuego.jlFrisbe.getX()+5  && gUIJuego.jlFrisbe.getY()<gUIJuego.jlPersonaje.getY()+5 ) 
//           gUIJuego.jlPersonaje.getY()>gUIJuego.jlFrisbe.getY()+39 && gUIJuego.jlFrisbe.getY()+43>gUIJuego.jlPersonaje.getY())
        //if(perro.intersects(gUIJuego.jlFrisbe.getX(),gUIJuego.jlFrisbe.getY(),gUIJuego.jlFrisbe.getWidth(),gUIJuego.jlFrisbe.getWidth()))
        //if(gUIJuego.colisionFrisbe())
        
        //if(gUIJuego.jlPersonaje.getBounds().intersects(gUIJuego.jlFrisbe.getBounds()))
        {
            System.out.println("ColisiónFrisbe");
            cantFrisbe++;
        }
    }
    
    public int getCantFrisbe(){
//        System.out.println("cant "+cantFrisbe);
        return cantFrisbe;
    }
    
    public void nuevaCantFrisbe(){
        gUIJuego.setCantFrisbe(getCantFrisbe());
        
    }
        
    /////////BARRA DE VIDA

    public void aumentarBarra(){
        
        if(aumentaColision==1)
        {
            gUIJuego.setBarraSiguiente(barra1);
        }
        if(aumentaColision==2)
        {
            gUIJuego.setBarraSiguiente(barra2);
        }
        if(aumentaColision==3)
        {
            gUIJuego.setBarraSiguiente(barra3);
        }
        if(aumentaColision==4)
        {
            gUIJuego.setBarraSiguiente(barra4);
        }
    }
    
    public int getAumentaColision(){
        return aumentaColision;
    }

}
