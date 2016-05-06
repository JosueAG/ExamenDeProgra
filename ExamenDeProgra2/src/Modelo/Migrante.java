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
public class Migrante extends Persona{
     Object  estatusRefugiado, dias;
     
    public Migrante(String id, String lugarProcedencia, String destino, String estatusRefugiado, int dias){
        super(id,lugarProcedencia,destino);
        
        this.estatusRefugiado = estatusRefugiado;
        this.dias = dias;
    }
/******************************************************************************/
    public void setEstatusRefugiado(Object estatusRefugiado) {
        this.estatusRefugiado = estatusRefugiado;
    }

    public void setDias(Object dias) {
        this.dias = dias;
    }
/******************************************************************************/
    
    
    public Object getEstatusRefugiado() {
        return estatusRefugiado;
    }

    public Object getDias() {
        return dias;
    }
 /*****************************************************************************/   
    public String getInfo(){
    return "Id Migrante: "+getId();
    }
}
