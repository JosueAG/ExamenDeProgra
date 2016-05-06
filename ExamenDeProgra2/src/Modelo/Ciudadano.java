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
public class Ciudadano extends Persona
{
    Object dias;
    public Ciudadano (String id, String lugarProcedencia, String destino, int dias)
    {
        super(id,  lugarProcedencia, destino);
        
        this.dias= dias;
    }

    public Object getDias() {
        return dias;
    }

    public void setDias(Object dias) {
        this.dias = dias;
    }
    
    public String getInformacion ()
    {
        return "ID: "+getId()+"Lugar de Procedencia: "+getLugarProcedencia()+"Destino: "+getDestino()+"Dias: "+getDias();
    }
    
}
