/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author KarIve
 */
public class BDCapacidad {
 private ArrayList<Capacidad> arrayCapacidad;
 
 public BDCapacidad(){
     arrayCapacidad = new ArrayList<Capacidad>();
 }
 
 public void agregarCapacidad(int capacidadPersonas,Capacidad capacity){
        for(int i=capacidadPersonas;i>0;i--){
            arrayCapacidad.add(capacity);
        }
    }
 
 public int tamanioCapacidad(){
        return arrayCapacidad.size();
    }
 
  public boolean recorrerGasolinera(CapacidadPersona capaPerso,int posicion) throws Exception{
        //envia el gasto del vehiculo y a la vez lo resta si se puede o devuele false si no resto
        return arrayCapacidad.get(posicion).darGasolinaVehiculo(capaPerso);//esto dice que si gasto 
    }
}
