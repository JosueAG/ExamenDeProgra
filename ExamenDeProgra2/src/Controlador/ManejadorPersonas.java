/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_VentanaPersonas;
import Modelo.MetodosPersona;
import Modelo.Persona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author KarIve
 */
public class ManejadorPersonas implements ActionListener, ItemListener{

    private FRM_VentanaPersonas ventanaPersona;
    private MetodosPersona metodos;
    //String nombre = ventanaPersona.regresarNombre();
    
   
    
    
    public ManejadorPersonas(FRM_VentanaPersonas ventanaPersona, MetodosPersona metodos){
    this.metodos = metodos;
    this.ventanaPersona = ventanaPersona;
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar")){
            int dias;
            String lugarProcede=ventanaPersona.getTxProcedencia();
            String lugarDestino=ventanaPersona.getTxDestino();
            
            if(ventanaPersona.regresarNombre()=="Ciudadano"){
            if(metodos.verificarPersona(ventanaPersona.getTxID())==false){
                if(lugarProcede.equals(lugarDestino)){
                dias = -1;
                }else{
                dias=30;
                }
          Persona person = new Persona(ventanaPersona.getTxID(),ventanaPersona.getTxProcedencia(),ventanaPersona.getTxDestino(),dias);
          metodos.agregarPersona(person);
          ventanaPersona.mostrarMensaje("La persona fue registrado de forma correcta");
          ventanaPersona.setJlMensajes("Se agrego el Ciudadano con exito");
          System.out.println(person.getInformacion()+"\n");
          ventanaPersona.limpiar();
          
            }else{
            ventanaPersona.mostrarMensaje("El ID de la persona ya existe");
            ventanaPersona.limpiar();
            }
        }    //CIUDADANO
            
            if(ventanaPersona.regresarNombre()=="Indigena"){
                dias = -1;
            if(metodos.verificarPersona(ventanaPersona.getTxID())==false){
          Persona person = new Persona("No tiene ID",ventanaPersona.getTxProcedencia(),ventanaPersona.getTxDestino(),dias);
          metodos.agregarPersona(person);
          ventanaPersona.mostrarMensaje("La persona fue registrado de forma correcta");
          ventanaPersona.setJlMensajes("Se agrego el Indigena con exito");
          System.out.println(person.getInformacion());
          ventanaPersona.limpiar();
          
            }else{
            ventanaPersona.mostrarMensaje("El ID de la persona ya existe");
            ventanaPersona.limpiar();
            }
        }    //Indigena
        
            if(ventanaPersona.regresarNombre()=="Refugiado"){
                dias = 0;
            if(metodos.verificarPersona(ventanaPersona.getTxID())==false){
          Persona person = new Persona(ventanaPersona.getTxID(),ventanaPersona.getTxProcedencia(),ventanaPersona.getTxDestino(),dias);
          metodos.agregarPersona(person);
          ventanaPersona.mostrarMensaje("La persona fue registrado de forma correcta");
          ventanaPersona.setJlMensajes("Se agrego el Refugiado con exito");
          System.out.println(person.getInformacion());
          ventanaPersona.limpiar();
          
            }else{
            ventanaPersona.mostrarMensaje("El ID de la persona ya existe");
            ventanaPersona.limpiar();
            }
        }    //REFUGIADO
            
            if(ventanaPersona.regresarNombre()=="Migrante"){
                dias = 10;
           if(metodos.verificarPersona(ventanaPersona.getTxID())==false){
          Persona person = new Persona(ventanaPersona.getTxID(),ventanaPersona.getTxProcedencia(),ventanaPersona.getTxDestino(),dias);
          metodos.agregarPersona(person);
          ventanaPersona.mostrarMensaje("La persona fue registrado de forma correcta");
          ventanaPersona.setJlMensajes("Se agrego el Migrante con exito");
          System.out.println(person.getInformacion()+"\n");
          ventanaPersona.limpiar();
          
            }else{
            ventanaPersona.mostrarMensaje("El ID de la persona ya existe");
            ventanaPersona.limpiar();
           }
        }    //MIGRANTE
        
      }//FIN AGREGAR    
       
    }//FIN ACTION PERFORMED

    @Override
    public void itemStateChanged(ItemEvent e) {
       String nombre="";
        
        if(e.getItemSelectable()==ventanaPersona.rbCiudadano){
       ventanaPersona.radioButtonOtro();
       nombre = ventanaPersona.regresarNombre();
       //System.out.println(nombre);
       }
       
       if(e.getItemSelectable()==ventanaPersona.rbMigrante){
       ventanaPersona.radioButtonOtro();
       nombre = ventanaPersona.regresarNombre();
       //System.out.println(nombre);
       }
       
       if(e.getItemSelectable()==ventanaPersona.rbRefugiado){
       ventanaPersona.radioButtonOtro();
       nombre = ventanaPersona.regresarNombre();
       //System.out.println(nombre);
       }
       
       if(e.getItemSelectable()==ventanaPersona.rbIndigena){
           ventanaPersona.radioButtonIndigena();
           nombre = ventanaPersona.regresarNombre();
           //System.out.println(nombre);
       }
    }
    
}
