/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_VentanaPersonas;
import Modelo.MetodosPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author KarIve
 */
public class ManejadorPersonas implements ActionListener {

    private FRM_VentanaPersonas ventanaPersona;
    private MetodosPersona metodos;
   
    
    
    public ManejadorPersonas(){
    this.metodos = new MetodosPersona();
    this.ventanaPersona = new FRM_VentanaPersonas();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Agregar")){
        
          metodos.agregarPersona(ventanaPersona.devolverInformacion());
          ventanaPersona.mostrarMensaje("El estudiante fue registrado de forma correcta");
          ventanaPersona.setJlMensajes("Se agrego con exito");
          
        }
    }
    
}
