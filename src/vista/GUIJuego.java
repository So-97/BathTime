/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorHilo;
import java.applet.AudioClip;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.Hilo;
import modelo.MetodosHilo;


/**
 *
 * @author Sofi
 */
public class GUIJuego extends javax.swing.JFrame {
    Hilo hilo;
    private MetodosHilo metodosHilo;
    private ControladorHilo controladorHilo;
    private Icon personaje;
    private Icon barraDeVida;
    private GUIFin gUIFin;
    private GUIInicio gUIInicio;
    private GUIPuntuacion gUIPuntuacion;
    
    public int tiempoFinal;
    public int cantFrisbe;
    public int totalPuntos;
    

    
    public GUIJuego(GUIInicio gUIInicio, GUIPuntuacion gUIPuntuacion) {
        initComponents();
        this.setSize(800, 507);
        this.setLocation(270, 100);
        controladorHilo=new ControladorHilo(this);
        hilo=new Hilo(this,controladorHilo.getMetodosHilo());
        setControlador(controladorHilo);
        hilo.start();
        barraDeVida= new ImageIcon(getClass().getResource("../icon/barra0.png"));
        setBarraInicial();
        personaje=new ImageIcon(getClass().getResource("../icon/dog2.gif"));
        setPrimerMovimiento();
        this.gUIInicio=gUIInicio;
        gUIFin= new GUIFin(gUIInicio,this,gUIPuntuacion);
        
        
    }

    


    


    public void setControlador(KeyListener manejador)
    {
        this.addKeyListener(manejador);
    }
    
    public void setBarraInicial(){
        jlBarraDeVida.setIcon(barraDeVida);
    }
    
    public void setBarraSiguiente(Icon barra){
        jlBarraDeVida.setIcon(barra);
    }
    
    public void setPrimerMovimiento(){
        jlPersonaje.setIcon(personaje);
        jlPersonaje.repaint();
    }
    
    public void setSiguienteMovimiento(Icon movimiento){
        jlPersonaje.setIcon(movimiento);
        jlPersonaje.repaint();
        
    }
    
    public Icon getPrimerMovimiento(){
        return personaje;
    }
    
    public void setCantFrisbe(int cant){
        jlCantFrisbe.setText(""+cant);
    }
    
    public int getCantFrisbe(){
        return Integer.parseInt(jlCantFrisbe.getText());
    }
    
    public void setTiempo(int tiempo){
        jlTiempo.setText(""+tiempo);
        jlTiempo.repaint();
    }
    
    public int getTiempo(){
        return Integer.parseInt(jlTiempo.getText());
    }
    
    public int getTotalPuntos(){
        int puntos=0;
        puntos=getTiempo()+(getCantFrisbe()*10);
        return puntos;
    }
    
    public void detener(){
        hilo.stop();
    }
    
    public void setPosicionDeslizar(){
        jlPersonaje.setLocation(210, 350);
    }
    
    public void iniciarMusica(){         

    }

    

    
    
    public GUIFin fin(){
        return gUIFin;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCantFrisbe = new javax.swing.JLabel();
        jlPersonaje = new javax.swing.JLabel();
        jlFrisbe = new javax.swing.JLabel();
        jlCubeta = new javax.swing.JLabel();
        jlObsJabon = new javax.swing.JLabel();
        jlTituloTiempo = new javax.swing.JLabel();
        jlTiempo = new javax.swing.JLabel();
        jlImgFrisbe = new javax.swing.JLabel();
        jlBarraDeVida = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();
        jlImgFrisbe1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 360));
        getContentPane().setLayout(null);

        jlCantFrisbe.setFont(new java.awt.Font("where stars shine the brightest", 1, 36)); // NOI18N
        jlCantFrisbe.setForeground(new java.awt.Color(255, 255, 255));
        jlCantFrisbe.setText("0");
        getContentPane().add(jlCantFrisbe);
        jlCantFrisbe.setBounds(460, 30, 50, 40);

        jlPersonaje.setText("jlPersonaje");
        jlPersonaje.setPreferredSize(new java.awt.Dimension(180, 100));
        jlPersonaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlPersonajeKeyPressed(evt);
            }
        });
        getContentPane().add(jlPersonaje);
        jlPersonaje.setBounds(210, 340, 180, 100);

        jlFrisbe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/frisbe.png"))); // NOI18N
        getContentPane().add(jlFrisbe);
        jlFrisbe.setBounds(1670, 250, 92, 43);

        jlCubeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/balde.png"))); // NOI18N
        getContentPane().add(jlCubeta);
        jlCubeta.setBounds(1470, 280, 71, 58);

        jlObsJabon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/jabon1.png"))); // NOI18N
        getContentPane().add(jlObsJabon);
        jlObsJabon.setBounds(1100, 390, 107, 39);

        jlTituloTiempo.setFont(new java.awt.Font("where stars shine the brightest", 1, 36)); // NOI18N
        jlTituloTiempo.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloTiempo.setText("Tiempo");
        getContentPane().add(jlTituloTiempo);
        jlTituloTiempo.setBounds(520, 30, 70, 30);

        jlTiempo.setFont(new java.awt.Font("where stars shine the brightest", 1, 36)); // NOI18N
        jlTiempo.setForeground(new java.awt.Color(255, 255, 255));
        jlTiempo.setText("0");
        getContentPane().add(jlTiempo);
        jlTiempo.setBounds(600, 30, 70, 30);

        jlImgFrisbe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/frisbe.png"))); // NOI18N
        getContentPane().add(jlImgFrisbe);
        jlImgFrisbe.setBounds(360, 30, 92, 43);

        jlBarraDeVida.setText("jlBarraDeVida");
        jlBarraDeVida.setPreferredSize(new java.awt.Dimension(286, 49));
        getContentPane().add(jlBarraDeVida);
        jlBarraDeVida.setBounds(20, 20, 286, 49);

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fondo3s.png"))); // NOI18N
        jlFondo.setMaximumSize(new java.awt.Dimension(400, 400));
        jlFondo.setPreferredSize(new java.awt.Dimension(500, 9125));
        jlFondo.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jlFondo);
        jlFondo.setBounds(-10, -30, 9125, 500);

        jlImgFrisbe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/frisbe.png"))); // NOI18N
        getContentPane().add(jlImgFrisbe1);
        jlImgFrisbe1.setBounds(380, 20, 92, 43);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlPersonajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlPersonajeKeyPressed

    }//GEN-LAST:event_jlPersonajeKeyPressed

//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIJuego().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlBarraDeVida;
    private javax.swing.JLabel jlCantFrisbe;
    public javax.swing.JLabel jlCubeta;
    public javax.swing.JLabel jlFondo;
    public javax.swing.JLabel jlFrisbe;
    private javax.swing.JLabel jlImgFrisbe;
    private javax.swing.JLabel jlImgFrisbe1;
    public javax.swing.JLabel jlObsJabon;
    public javax.swing.JLabel jlPersonaje;
    private javax.swing.JLabel jlTiempo;
    private javax.swing.JLabel jlTituloTiempo;
    // End of variables declaration//GEN-END:variables
}
