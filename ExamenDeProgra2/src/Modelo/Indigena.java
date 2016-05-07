/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Administrador
 */
public class Indigena 
{
    String id, lugarDeProcedencia, paisDestino;
    int dias;

    public Indigena(String id, String lugarDeProcedencia, String paisDestino, int dias) {
        this.id=id;
        this.lugarDeProcedencia = lugarDeProcedencia;
        this.dias = dias;
        this.paisDestino= paisDestino;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLugarDeProcedencia(String lugarDeProcedencia) {
        this.lugarDeProcedencia = lugarDeProcedencia;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    
    
    
    public String getId() {
        return id;
    }

    public String getLugarDeProcedencia() {
        return lugarDeProcedencia;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public int getDias() {
        return dias;
    }

   
    public String getInformacion ()
    {
        return "Lugar de Procedencia: "+getLugarDeProcedencia()+"Dias: "+getDias()+"Pais Destino: "+getPaisDestino()+"";
    }
    
    
}
