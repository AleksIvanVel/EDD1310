package com.mycompany.clasearreglo;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class NominaADT {
    private BufferedReader lector;
    private String nombreEmpresa;
    private Arreglo<Empleado> nomina;
    private String rutaArchivo;
    private String fila;
    private String colum;
    private String[] datosTrab;
    private String[] totalTrab;

    public void NominaADT(String ruta){
        this.rutaArchivo=ruta;
        int i=0;
 
        //leer el archivo en la ruta
        try{
            lector= new BufferedReader(new FileReader(ruta));//leer archivo de la ruta
            while ((fila= lector.readLine()) != null){
                totalTrab = fila.split("\n"); //separamos el arreglo por lineas  
                imprimirFila();
            }
              lector.close();
              fila=null;
              totalTrab=null;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
        }

         this.nomina= new Arreglo(totalTrab.length);
 //-------------------------------------------------------------------------------------------------------
        for (Arreglo<Empleado> elementos: nomina){
            try{
               lector= new BufferedReader(new FileReader(ruta));//leer archivo de la ruta
               while ((colum= lector.readLine()) != null){
                   datosTrab = colum.split(","); //separamos el arreglo por comas  
                    Empleado e = new Empleado();
                    nomina.set(datosTrab);
               }
           }catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
           }
        }
    }

    public void imprimirFila(){
        for(int i=0; i<totalTrab.length; i++){
             System.out.println(totalTrab[i]);
        }
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Arreglo<Empleado> getNomina() {
        return nomina;
    }

    public void setNomina(Arreglo<Empleado> nomina) {
        this.nomina = nomina;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }


    

    
}
