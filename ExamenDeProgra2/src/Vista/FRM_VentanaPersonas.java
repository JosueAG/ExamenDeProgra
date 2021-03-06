/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejadorPersonas;
import Modelo.MetodosPersona;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
/**
 *
 * @author KarIve
 */
public class FRM_VentanaPersonas extends javax.swing.JFrame {
    
    
   private MetodosPersona metodos;
   private FRM_VentanaPaises ventanaPais;
    
    public FRM_VentanaPersonas() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(rbCiudadano);
        group.add(rbIndigena);
        group.add(rbMigrante);
        group.add(rbRefugiado);
        rbCiudadano.setSelected(true);
        this.metodos = new MetodosPersona();
        this.ventanaPais = new FRM_VentanaPaises();
        ManejadorPersonas maneja = new ManejadorPersonas(this,metodos );
        
        btAgregar.addActionListener(maneja);
        btSimular.addActionListener(maneja);
        
        rbIndigena.addItemListener(maneja);
        rbCiudadano.addItemListener(maneja);
        rbMigrante.addItemListener(maneja);
        rbRefugiado.addItemListener(maneja);
        
        
        setLocationRelativeTo(null);
    }
 /****************************************************************************/   
    public String regresarNombre(){
        String nombre="";
        if(rbCiudadano.isSelected()){
            nombre="Ciudadano";
        }
        else if(rbIndigena.isSelected()){
            nombre="Indigena";
        }
        else if(rbMigrante.isSelected()){
            nombre="Migrante";
        }
        else if(rbRefugiado.isSelected()){
            nombre="Refugiado";
        }
        return nombre;
    }//fin del constructor
/****************************************************************************/    
    public String[] devolverInformacion()
    {
        String informacion[]=new String[3];
        
        informacion[0]=this.txID.getText();
        informacion[1]=this.txCantidadDisponible.getText();
        informacion[2]=this.txCapacidadPersonas.getText();
        
        return informacion;
    }
/****************************************************************************/
     public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(this,mensaje);
    }
/****************************************************************************/
     public void setJlMensajes(String jlMensajes) {
        this.jlMensajes.setText(jlMensajes);
    } 
 /****************************************************************************/    
     public void radioButtonIndigena(){
     txID.setEditable(false);
     txID.setBackground(new Color(150,150,150));
     }
 /****************************************************************************/    
     public void radioButtonOtro(){
     txID.setEditable(true);
     txID.setBackground(Color.white);
     }
     
/******************************************************************************/
    public void setJlCiclos(String jlCiclos) {
        this.jlCiclos.setText(jlCiclos);
    }
     
     public String getTxID() {
          return txID.getText();
    }
     public void setID(String txID) {
        this.txID.setText(txID);
    }
     
     public String getTxProcedencia(){
         return txProcedencia.getText();
     }
     
     public void setTxProcedencia(String txProcedencia){
     this.txProcedencia.setText(txProcedencia);
     }
     
     public String getTxDestino(){
        return txDestino.getText();
    }
     
     public void setTxDestino(String txDestino){
         this.txDestino.setText(txDestino);
     }
     
     public String getTxtCantidadDisponible(){
     return ""+txCantidadDisponible.getText();
     }
     public void setTxCantidadDisponible(int txCantidadDisponible){
     this.txCantidadDisponible.setText(""+txCantidadDisponible);
     }
     
     public String getTxCapacidadPersonas(){
     return ""+txCapacidadPersonas.getText();
     }
     
     public void setTxCapacidadPersonas(int txCantidadDisponible){
     this.txCapacidadPersonas.setText(""+txCapacidadPersonas);
     }
/******************************************************************************/
    public void limpiar(){
    txID.setText("");
    txDestino.setText("");
    txProcedencia.setText("");
    }
    
    public void limpiarSimulador(){
     txCapacidadPersonas.setText("");
     txCantidadDisponible.setText("");
    }
/******************************************************************************/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        rbCiudadano = new javax.swing.JRadioButton();
        rbIndigena = new javax.swing.JRadioButton();
        rbMigrante = new javax.swing.JRadioButton();
        rbRefugiado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jlMensajes = new javax.swing.JLabel();
        btAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txCapacidadPersonas = new javax.swing.JTextField();
        txCantidadDisponible = new javax.swing.JTextField();
        btSimular = new javax.swing.JButton();
        txProcedencia = new javax.swing.JTextField();
        txDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jlCiclos = new javax.swing.JLabel();

        jLabel1.setText("ID:");

        jLabel2.setText("Lugar Procedencia:");

        jLabel3.setText("Lugar Destino: ");

        txID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDActionPerformed(evt);
            }
        });

        rbCiudadano.setText("Ciudadano");
        rbCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCiudadanoActionPerformed(evt);
            }
        });

        rbIndigena.setText("Indigena");
        rbIndigena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIndigenaActionPerformed(evt);
            }
        });

        rbMigrante.setText("Migrante");

        rbRefugiado.setText("Refugiado");
        rbRefugiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRefugiadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo:");

        jlMensajes.setText("MENSAJE");

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Capacidad de Personas en el País: ");

        jLabel7.setText("Cantidad de campos disponibles:");

        btSimular.setText("Simular");
        btSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimularActionPerformed(evt);
            }
        });

        txDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDestinoActionPerformed(evt);
            }
        });

        jLabel5.setText("Ciclo:");

        jlCiclos.setText("****************************");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txID, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(txProcedencia)
                                        .addComponent(txDestino)))
                                .addComponent(jlMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txCantidadDisponible))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txCapacidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btSimular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlCiclos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(74, 74, 74))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbCiudadano)
                                .addComponent(rbIndigena)
                                .addComponent(rbMigrante))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(rbRefugiado)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbCiudadano, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbIndigena)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(txDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMensajes)
                    .addComponent(rbMigrante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbRefugiado)
                    .addComponent(btAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txCapacidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btSimular)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlCiclos))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDActionPerformed

    private void rbCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCiudadanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCiudadanoActionPerformed

    private void rbRefugiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRefugiadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRefugiadoActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarActionPerformed

    private void rbIndigenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIndigenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIndigenaActionPerformed

    private void btSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSimularActionPerformed

    private void txDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDestinoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlCiclos;
    private javax.swing.JLabel jlMensajes;
    public javax.swing.JRadioButton rbCiudadano;
    public javax.swing.JRadioButton rbIndigena;
    public javax.swing.JRadioButton rbMigrante;
    public javax.swing.JRadioButton rbRefugiado;
    private javax.swing.JTextField txCantidadDisponible;
    private javax.swing.JTextField txCapacidadPersonas;
    public javax.swing.JTextField txDestino;
    private javax.swing.JTextField txID;
    public javax.swing.JTextField txProcedencia;
    // End of variables declaration//GEN-END:variables

    
}
