/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;
import Modelo.Persona;
import Modelo.Ciudadano;
import Modelo.Indigena;
import Modelo.Refugiado;
import Modelo.Migrante;
/**
 *
 * @author KarIve
 */
public class Fabrica_Metodos {
    private Persona instaciaPersona;
    private Indigena instaciaIndigena;
    public Persona getPersona(String id, String lugarProcedencia, String destino, int dias){
        switch(id){
            case "Ciudadano":
                instaciaPersona=new Ciudadano(id,  lugarProcedencia, destino, dias);
             break;
            case "Indigena":
                instaciaIndigena = new Indigena(id, lugarProcedencia, destino, dias);
                break;
            case "Migrante":
                instaciaPersona= new Migrante(id,  lugarProcedencia, destino, dias,"");
                break;
            case "Refugiado":
                instaciaPersona = new Refugiado(id,  lugarProcedencia, destino, dias, "");
                break;
        }
        return instaciaPersona;
    }
}
