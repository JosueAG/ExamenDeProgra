/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author KarIve
 */
public class Capacidad {
    private DiasPais diasPais;
    public Capacidad() {
       diasPais= DiasPais.getInstace();
    }
    public boolean darGasolinaVehiculo(CapacidadPersona capacidadP) throws Exception{//regres a recope la cantidad de gasolina  
        boolean dias=false;
        if(diasPais.getCantidadDias()-capacidadP.cantidadDias()>=0){
            diasPais.setGasolinaGasto(capacidadP.cantidadDias());//hace la comprobacion si devuelve un numero q sepueda restar
            dias=true;
        }
        return dias;
    }
}
