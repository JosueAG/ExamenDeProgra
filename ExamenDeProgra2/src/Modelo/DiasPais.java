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
public class DiasPais {
   private int CANTIDAD_DIAS=0;//la gasolina
    private static DiasPais diasPais= new DiasPais();//  singleton  //
 
    private DiasPais(){
        
    }
    
    public int getCantidadDias()throws Exception{ ///el error radica en el hecho de que hay dos restas
        return CANTIDAD_DIAS;//true hay gasolinaif()
    }
    public void setLaCantidadDias(int tiempo){
        CANTIDAD_DIAS=tiempo;
    }
    public void setGasolinaGasto(int tiempo){
        CANTIDAD_DIAS=CANTIDAD_DIAS-tiempo;
    }
    public static DiasPais getInstace(){//recope.setGasolina
        return diasPais;
    }
}
