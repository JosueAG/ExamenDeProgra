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
    
    public void guardaGasolinera(ArrayList<BDCapacidad> capacidad) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("capacidadPais.xml"),
                    capacidad);
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<BDCapacidad> obteneerGasolineras() {
        Lector<ArrayList<BDCapacidad>> lector = new Lector<>();
        String filepath=null;
        try {
            filepath = ayudaos.get_config_file("capacidadPaisPersona.xml");
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lector.read_xml(filepath);       
    }
    
    public void guardaVehiculos(ArrayList<BDCapacidad> vehiculo) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("vehiculos.xml"),
                    vehiculo);
        } catch (IOException ex) {
            System.out.println("Error en guardar");
        }
    }
    
     public ArrayList<BDCapacidad> obtenerVehiculos() {
        Lector<ArrayList<BDCapacidad>> lector = new Lector<>();
        String filepath=null;
        try {
            filepath = ayudaos.get_config_file("vehiculos.xml");
        } catch (IOException ex) {
            System.out.println("Error en obtener");
        }
        return lector.read_xml(filepath);       
    }


}//FIN CLASE SALVADOR XML
