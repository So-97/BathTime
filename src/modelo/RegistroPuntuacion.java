/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.applet.AudioClip;
import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import vista.GUIFin;

/**
 *
 * @author Sofi
 */
public class RegistroPuntuacion {
    private ArrayList<Puntuacion> puntuacion;
    private GUIFin gUIFin;
    private ArchivoPuntuacion archivoPuntuacion;
    

    public RegistroPuntuacion() {
        puntuacion= new ArrayList<>();
        
        archivoPuntuacion= new ArchivoPuntuacion();
        getArchivo();
        
    }
    
    public void agregarPuntuacion(Puntuacion nuevo){
        puntuacion.add(nuevo);
    }
    

    
    
    public void imprimir(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+""+puntuacion.get(i).getNombre()+"  "+puntuacion.get(i).getPuntos()+"\n");
        }
    }
    
    
    public void primerLugarNombre(int puntos){
        int mayor=puntuacion.get(0).getPuntos();
        int indiceMayor;
        String lista="";
        
        for(int indice=0;indice<puntuacion.size();indice++)
        {
            if(puntos<puntuacion.get(indice).getPuntos())
            {
                mayor=puntos;
                indiceMayor=indice;            
            }
        }
    }
    
    public void sonido(){
        
    }
    
    
    
    /*
    public int primerLugarPuntos(){
        
    }
    
    public String listaNombres(int puntos){
        int mayor=topDiez.get(0).getPuntos();
        int indiceMayor;
        String lista="";
        int posicion=2;
        
        for(int indice=0;indice<9;indice++)
        {
            if(puntos>topDiez.get(indice).getPuntos())
            {
                mayor=puntos;
                indiceMayor=indice;
                
                if(indice!=indiceMayor)
                {
                    lista+=posicion+"               "+topDiez.get(indice).getNombre()+"\n";
                    posicion++;
                }
                
            }
        }
    }
    
    
    public void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int indice = 0 ; indice < topDiez.size() - 1 ; indice++) {
            int mayor = indice;
 
            //buscamos el mayor número
            for (int posicion = indice + 1 ; posicion < topDiez.size() ; posicion++) {
                if (arreglo[posicion] > arreglo[mayor]) {
                    mayor = posicion;    //encontramos el mayor número
                }
            }
 
            if (indice != mayor) {
                //permutamos los valores
                int aux = arreglo[indice];
                arreglo[indice] = arreglo[mayor];
                arreglo[mayor] = aux;
            }
        }
    }
    
    
    public String listaPuntos(){
        
    }
    
    
    
    
    
    */
    //////////////////////////////////ARCHIVOS
    
    public void setPuntuacionArchivo()
    {
        archivoPuntuacion.crearArchivo();
        for(int indice=0;indice<puntuacion.size();indice++)
        {
            archivoPuntuacion.setPuntuacion(puntuacion.get(indice));
        }
    }
    public void getArchivo()
    {
        Puntuacion arregloPuntuacion[]=archivoPuntuacion.getArchivo();
        for(int indice=0;indice<arregloPuntuacion.length;indice++)
        {
            puntuacion.add((Puntuacion)arregloPuntuacion[indice]);
        }
    }
    
    public void escribirInfo(){
        
    }
    
}
