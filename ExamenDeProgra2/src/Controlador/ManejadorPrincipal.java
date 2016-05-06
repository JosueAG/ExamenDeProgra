
package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.FRM_VentanaPersonas;
import Vista.FRM_VentanaPaises;
/**
 *
 * @author KarIve
 */
public class ManejadorPrincipal implements ActionListener{
    private FRM_VentanaPersonas guiPersona;
    private FRM_VentanaPaises guiPais;

public ManejadorPrincipal(){
    
}
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Salir")){
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Paises")){
            this.guiPais = new FRM_VentanaPaises();
            guiPais.show();
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar Persona")){
        this.guiPersona = new FRM_VentanaPersonas();
        guiPersona.show();
        }
    }
    
}
