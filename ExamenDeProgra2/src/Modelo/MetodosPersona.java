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
public class MetodosPersona 
{
    
    private ArrayList <Persona> arrayPersona;
    
     String[] arregloInformacionConsultada=new String[2];
    
    int pos;
    public MetodosPersona()
    {
        arrayPersona=new ArrayList <Persona>();
        
        //agregarEstudiante(new String[] {"123","Lanfor","Puntarenas"});
    }
    
    public void agregarPersona(String informacion[])
    {
        Persona objeto=new Persona(informacion[0], informacion[1], informacion[2]);
        arrayPersona.add(objeto); 
    }
    
    public void mostrarInformacion()
    {
        for(int contador=0;contador<arrayPersona.size();contador++)
        {
            System.out.println(arrayPersona.get(contador).getInformacion());
        
        }
    
    }
    
    public boolean consultarEstudiante(String id)
    {
        boolean existe=false;
        
        //[][][][]
        for(int contador=0;contador<arrayPersona.size();contador++)
        {
            if(arrayPersona.get(contador).getId().equals(id))
            {
                arregloInformacionConsultada[0]=arrayPersona.get(contador).getLugarProcedencia();
                arregloInformacionConsultada[1]=arrayPersona.get(contador).getDestino();
                existe=true;
                pos=contador;
            }
        }
        return existe;
    }
    
}
