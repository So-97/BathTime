/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Sofi
 */
public class ArchivoPuntuacion {
    
    ObjectOutputStream archivoSalida;
    ObjectInputStream archivoEntrada;

    public ArchivoPuntuacion() {
        try {
            archivoEntrada = new ObjectInputStream(new FileInputStream("puntuacion.dat"));
        } catch (Exception e) {
            System.out.println("El archivo de puntuación no fue encontrado " + e);
        }
    }

    public void crearArchivo() {
        try {
            archivoSalida = new ObjectOutputStream(new FileOutputStream("puntuacion.dat"));
            System.out.println("guarda");
        } catch (Exception e) {
            System.out.println("Error al crear el archivo de puntuacion: " + e);
        }
    }

    public void setPuntuacion(Puntuacion puntuacion) {
        try {
            archivoSalida.writeObject(puntuacion);
            System.out.println("Se ingreso puntaje");
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo de puntuacion: " + e);
        }
    }

    public Puntuacion[] getArchivo() {
        int tamano = devolverTamanoDelArchivo();
        Puntuacion arreglopuntuacion[] = new Puntuacion[tamano];
        
        try {
            archivoEntrada = new ObjectInputStream(new FileInputStream("puntuacion.dat"));
            
            for (int contador = 0; contador < tamano; contador++) 
            {
                arreglopuntuacion[contador] = (Puntuacion) archivoEntrada.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error devolver información del archivo de puntuacion como un arreglo: " + e);
        }
        return arreglopuntuacion;
    }

    public int devolverTamanoDelArchivo() {
        int contador = 0;
        Puntuacion temporal;
        try {
            while (true) {
                temporal = (Puntuacion) archivoEntrada.readObject();
                contador++;
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo de puntuación: " + e);
        } catch (Exception e) {
            System.out.println("Error al devolver el tamaño del archivo de puntuación: " + e);
        }
        return contador;
    }
    
    public ArrayList<Puntuacion> devolverInfoAlArchivo(){
        ArrayList<Puntuacion> array=new ArrayList<Puntuacion>();
        
        try
        {
            array.add((Puntuacion)archivoEntrada.readObject());
        }
        catch(Exception e)
        {
            System.out.println("Se llego al final del archivo");
        }
        return array;
    }
}
