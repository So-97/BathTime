/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorInicio;
import java.applet.AudioClip;
import java.awt.event.ActionListener;

/**
 *
 * @author Sofi
 */
public class GUIInicio extends javax.swing.JFrame {
    private ControladorInicio controlador;
    private GUIPuntuacion gUIPuntuacion;
    private GUIInstrucciones gUIInstrucciones;
    private GUIComic gUIComic;
    private GUIJuego gUIJuego;
    AudioClip sonido;
    
    public GUIInicio() {
        initComponents();
        this.setSize(800, 515);
        this.setLocation(270, 100);
    
        gUIPuntuacion= new GUIPuntuacion(this);
        gUIInstrucciones= new GUIInstrucciones(this);
        gUIComic= new GUIComic(this);
        
        controlador=new ControladorInicio(this,gUIPuntuacion,gUIInstrucciones,gUIComic);
        setControlador();
        sonido= java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Akashic_Records_-_Cheerful_Lighthearted_Pop-Rock.wav"));
        sonido.play();
    }
    
    public void setControlador(){
        jbJugar.addActionListener(controlador);
        jbInstrucciones.addActionListener(controlador);
        jbPuntuaciones.addActionListener(controlador);
        jbSalir.addActionListener(controlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbInstrucciones = new javax.swing.JButton();
        jbPuntuaciones = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbJugar = new javax.swing.JButton();
        jlInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jbInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/instrucciones.png"))); // NOI18N
        jbInstrucciones.setActionCommand("Instrucciones");
        jbInstrucciones.setContentAreaFilled(false);
        jbInstrucciones.setPreferredSize(new java.awt.Dimension(129, 42));
        jbInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(jbInstrucciones);
        jbInstrucciones.setBounds(130, 270, 129, 42);

        jbPuntuaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/puntacionesB.png"))); // NOI18N
        jbPuntuaciones.setActionCommand("Puntuaciones");
        jbPuntuaciones.setContentAreaFilled(false);
        jbPuntuaciones.setPreferredSize(new java.awt.Dimension(129, 42));
        getContentPane().add(jbPuntuaciones);
        jbPuntuaciones.setBounds(130, 330, 129, 42);

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salir.png"))); // NOI18N
        jbSalir.setActionCommand("Salir");
        jbSalir.setContentAreaFilled(false);
        jbSalir.setPreferredSize(new java.awt.Dimension(129, 42));
        getContentPane().add(jbSalir);
        jbSalir.setBounds(130, 390, 129, 42);

        jbJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/jugar.png"))); // NOI18N
        jbJugar.setActionCommand("Jugar");
        jbJugar.setContentAreaFilled(false);
        jbJugar.setPreferredSize(new java.awt.Dimension(129, 42));
        getContentPane().add(jbJugar);
        jbJugar.setBounds(130, 210, 129, 42);

        jlInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/inicio.png"))); // NOI18N
        jlInicio.setOpaque(true);
        getContentPane().add(jlInicio);
        jlInicio.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInstruccionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbInstrucciones;
    private javax.swing.JButton jbJugar;
    private javax.swing.JButton jbPuntuaciones;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlInicio;
    // End of variables declaration//GEN-END:variables
}
