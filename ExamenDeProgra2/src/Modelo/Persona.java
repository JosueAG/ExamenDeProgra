/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 
 */
public class Persona {
    private String id;
    private String lugarProcedencia;
    private String destino;
    private int dias;
    
    public Persona(String id, String lugarProcedencia, String destino, int dias){
    this.id=id;
    this.lugarProcedencia= lugarProcedencia;
    this.destino=destino;
    this.dias=dias;
    }
/******************************************************************************/
    public void setId(String id) {
        this.id = id;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
/******************************************************************************/
    public String getId() {
        return id;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public String getDestino() {
        return destino;
    }    

    public int getDias() {
        return dias;
    }
    
    
    public String getInformacion ()
    {
        return "ID: "+getId()+"\nLugar de Procedencia: "+getLugarProcedencia()+"\nDestino: "+getDestino()+"\nDias: "+getDias();
    }
}//FIN CLASE PERSONA
