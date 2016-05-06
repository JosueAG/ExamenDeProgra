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
    
    public Persona(String id, String lugarProcedencia, String destino){
    this.id=id;
    this.lugarProcedencia= lugarProcedencia;
    this.destino=destino;
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
    
    public String getInformacion ()
    {
        return "ID: "+getId()+"Lugar de Procedencia: "+getLugarProcedencia()+"Destino: "+getDestino();
    }
}//FIN CLASE PERSONA
