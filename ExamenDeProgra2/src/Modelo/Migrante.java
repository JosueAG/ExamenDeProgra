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
     
    public Migrante(String id, String lugarProcedencia, String destino,int dias, String estatusRefugiado){
        super(id,lugarProcedencia,destino,dias);
        
        this.estatusRefugiado = estatusRefugiado;
        
    }
/******************************************************************************/
    public void setEstatusRefugiado(Object estatusRefugiado) {
        this.estatusRefugiado = estatusRefugiado;
    }

/******************************************************************************/
  public Object getEstatusRefugiado() {
        return estatusRefugiado;
    }

 /*****************************************************************************/   
    public String getInfo(){
    return "Id Migrante: "+getId();
    }
}
