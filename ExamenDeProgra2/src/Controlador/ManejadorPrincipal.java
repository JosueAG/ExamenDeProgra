
package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.FRM_VentanaPersonas;
/**
 *
 * @author KarIve
 */
public class ManejadorPrincipal implements ActionListener{
    private FRM_VentanaPersonas guiPersona;

public ManejadorPrincipal(){
    
}
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Salir")){
            
        }else
        if(e.getActionCommand().equalsIgnoreCase("Paises")){
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Personas")){
        this.guiPersona = new FRM_VentanaPersonas();
        guiPersona.show();
        }
    }
    
}
