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
public class Paises 
{
    private Object nombre;
    private String codigo;

    public Paises(Object nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getInformacion ()
    {
        return "Nombre: "+getNombre()+"\nCodigo: "+getCodigo();
    }
}
