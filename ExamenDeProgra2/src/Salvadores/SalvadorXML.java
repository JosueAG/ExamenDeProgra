/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salvadores;

import Modelo.BDCapacidad;
import Modelo.MetodosPaises;
import Modelo.MetodosPersona;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utilidades.AyudanteOs;
import Utilidades.Escritor;
import Utilidades.Lector;
/**
 *
 * @author KarIve
 */
public class SalvadorXML {
    private Escritor escritor;
    private AyudanteOs ayudaos;
    
    public SalvadorXML() {
        escritor = new Escritor();
        ayudaos = new AyudanteOs();
    }
    
    public void guardaPais(ArrayList<BDCapacidad> capacidad) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("capacidadPais.xml"),
                    capacidad);
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<BDCapacidad> obtenerCapacidad() {
        Lector<ArrayList<BDCapacidad>> lector = new Lector<>();
        String filepath=null;
        try {
            filepath = ayudaos.get_config_file("capacidadPaisPersona.xml");
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lector.read_xml(filepath);       
    }
    
    public void guardaCapacidad(ArrayList<BDCapacidad> capacidad) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("capacidad.xml"),
                    capacidad);
        } catch (IOException ex) {
            System.out.println("Error en guardar");
        }
    }
    
     public ArrayList<BDCapacidad> obtenerPaises() {
        Lector<ArrayList<BDCapacidad>> lector = new Lector<>();
        String filepath=null;
        try {
            filepath = ayudaos.get_config_file("capacidad.xml");
        } catch (IOException ex) {
            System.out.println("Error en obtener");
        }
        return lector.read_xml(filepath);       
    }


}//FIN CLASE SALVADOR XML
