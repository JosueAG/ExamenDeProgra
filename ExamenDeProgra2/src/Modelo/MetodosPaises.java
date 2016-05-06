/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class MetodosPaises 
{
    private ArrayList <Paises> arrayPaises;
    
    String[] arregloInformacionConsultada=new String[1];
    
    int pos;
    public MetodosPaises()
    {
        arrayPaises=new ArrayList <Paises>();
    }
    
    public void agregarPaises(String informacion[])
    {
        Paises objeto=new Paises(informacion[0], informacion[1]);
        arrayPaises.add(objeto); 
    }
    
    public void mostrarInformacion()
    {
        for(int contador=0;contador<arrayPaises.size();contador++)
        {
            System.out.println(arrayPaises.get(contador).getInformacion());
        
        }
    
    }
    
    public boolean consultarEstudiante(String codigo)
    {
        boolean existe=false;
        //[][][][]
        for(int contador=0;contador<arrayPaises.size();contador++)
        {
            if(arrayPaises.get(contador).getCodigo().equals(codigo))
            {
                existe=true;
                pos=contador;
            }
        }
        return existe;
    }
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }    
    
}
