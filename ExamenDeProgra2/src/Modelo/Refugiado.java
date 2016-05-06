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
public class Refugiado extends Persona{
    Object carnetRefugiado;
    public Refugiado(String id, String lugarProcedencia, String destino, String carnetRefugiado){
        super(id,lugarProcedencia,destino);
        
        this.carnetRefugiado = carnetRefugiado;
    }

    public void setCarnetRefugiado(Object carnetRefugiado) {
        this.carnetRefugiado = carnetRefugiado;
    }

    public Object getCarnetRefugiado() {
        return carnetRefugiado;
    }
    
    public String getInfo(){
    return "Id Refugiado:"+getId();
    }
}
