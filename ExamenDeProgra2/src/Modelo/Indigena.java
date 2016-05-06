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
    Object lugarDeProcedencia, dias, paisDestino;

    public Indigena(Object lugarDeProcedencia, Object dias, Object paisDestino) {
        this.lugarDeProcedencia = lugarDeProcedencia;
        this.dias = dias;
        this.paisDestino= paisDestino;
    }

    public Object getLugarDeProcedencia() {
        return lugarDeProcedencia;
    }

    public void setLugarDeProcedencia(Object lugarDeProcedencia) {
        this.lugarDeProcedencia = lugarDeProcedencia;
    }

    public Object getDias() {
        return dias;
    }

    public void setDias(Object dias) {
        this.dias = dias;
    }

    public Object getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(Object paisDestino) {
        this.paisDestino = paisDestino;
    }
    
    public Object getInformacion ()
    {
        return "Lugar de Procedencia: "+getLugarDeProcedencia()+"Dias: "+getDias()+"Pais Destino: "+getPaisDestino();
    }
    
    
}
