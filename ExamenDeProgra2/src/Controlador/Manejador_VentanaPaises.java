/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosPaises;
import Vista.FRM_VentanaPaises;
import Modelo.Paises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador_VentanaPaises implements ActionListener
{
    FRM_VentanaPaises paises;
    MetodosPaises metodosPaises;
    
    public Manejador_VentanaPaises (FRM_VentanaPaises paises, MetodosPaises metodosPaises)
    {
        this.paises=paises;
        this.metodosPaises= metodosPaises;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            if(metodosPaises.verificarPais(paises.getTxtCodigo())==false){
           Paises pais = new Paises(paises.getTxtCodigo(),paises.getTxtNombre());
           metodosPaises.agregarPaises(pais);
            paises.mostrarMensaje("El pais fue registrado de forma correcta");
            System.out.println(pais.getInformacion());
            paises.limpiar();
        }else{
            paises.mostrarMensaje("El codigo de país ya existe");
            paises.limpiar();
            }
       }
    }
            
    
}
