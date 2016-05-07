/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import Vista.FRM_VentanaPersonas;
import javax.swing.JComboBox;
/**
 *
 * @author Administrador
 */
public class MetodosPaises 
{
    private ArrayList <Paises> arrayPaises;
    private JComboBox <String> arrayCombo;
    //ArrayList<Paises>
    
    String[] arregloInformacionConsultada=new String[1];
    
    int pos;
    public MetodosPaises()
    {
        this.arrayPaises=new ArrayList <Paises>();
    }
    
 /**   public void agregarPaises(String informacion[])
    {
        Paises objeto=new Paises(informacion[0], informacion[1]);
        arrayPaises.add(objeto); 
    }**/
    
     public void agregarPaises(Paises paises){
    arrayPaises.add(paises);   
    }

 /******************************************************************************/    
     public boolean verificarPais(String codigo) {

        boolean dev = false;
        if (arrayPaises.size() != 0) {

            for (int i = 0; i < arrayPaises.size(); i++) {
                if (arrayPaises.get(i).getCodigo().equals(codigo)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    } 
/******************************************************************************/
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }    
    
}
