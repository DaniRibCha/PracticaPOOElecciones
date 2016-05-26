/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import practicapoojunio.Votante.Votante;
/**
 *
 * @author Ruben
 */
public class MenuElecciones extends javax.swing.JFrame {
    

    public MenuElecciones() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Resultados");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Resultados Históricos");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Posibles coaliciones con mayoría absoluta");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Registro de Votantes");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Elecciones");

        jButton2.setText("Partidos Políticos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Coaliciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton2)
                                .addGap(36, 36, 36)
                                .addComponent(jToggleButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(47, 47, 47)
                                .addComponent(jToggleButton4)))
                        .addGap(0, 69, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jToggleButton4))
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if ("null".equals(VentanaCrearElección.jTextField3.getText())){JOptionPane.showMessageDialog(rootPane, "No hay elección disponible", "Error", JOptionPane.ERROR_MESSAGE);}
        else{
        VentanaResultados obj= new VentanaResultados();
        VentanaResultados.participacion.setText(VentanaCrearElección.jTextField3.getText());
        VentanaResultados.totalescaños.setText(VentanaCrearElección.jTextField2.getText());
        DecimalFormat decimales= new DecimalFormat("0.000");
        
        Double porcentajea= ((Double.parseDouble(VentanaCrearElección.jTextField24.getText()))/(Double.parseDouble(VentanaCrearElección.jTextField1.getText())-Double.parseDouble(VentanaCrearElección.jTextField4.getText())-Double.parseDouble(VentanaCrearElección.jTextField5.getText()))*100);
        Double porcentajeb= ((Double.parseDouble(VentanaCrearElección.jTextField25.getText()))/(Double.parseDouble(VentanaCrearElección.jTextField1.getText())-Double.parseDouble(VentanaCrearElección.jTextField4.getText())-Double.parseDouble(VentanaCrearElección.jTextField5.getText()))*100);
        Double porcentajec= ((Double.parseDouble(VentanaCrearElección.jTextField26.getText()))/(Double.parseDouble(VentanaCrearElección.jTextField1.getText())-Double.parseDouble(VentanaCrearElección.jTextField4.getText())-Double.parseDouble(VentanaCrearElección.jTextField5.getText()))*100);
        Double porcentajed= ((Double.parseDouble(VentanaCrearElección.jTextField27.getText()))/(Double.parseDouble(VentanaCrearElección.jTextField1.getText())-Double.parseDouble(VentanaCrearElección.jTextField4.getText())-Double.parseDouble(VentanaCrearElección.jTextField5.getText()))*100);
        decimales.format(porcentajea);
        decimales.format(porcentajeb);  
        VentanaResultados.porcentajea.setText(String.valueOf( decimales.format(porcentajea)));
        VentanaResultados.porcentajeb.setText(String.valueOf( decimales.format(porcentajeb)));
        VentanaResultados.porcentajec.setText(String.valueOf(decimales.format(porcentajec)));
        VentanaResultados.porcentajed.setText(String.valueOf(decimales.format(porcentajed)));
        VentanaResultados.Partidoa.setText(String.valueOf(VentanaCrearElección.jTextField2));
        VentanaResultados.Partidoa.setText(String.valueOf(VentanaCrearElección.jTextField3));
        VentanaResultados.Partidoa.setText(String.valueOf(VentanaCrearElección.jTextField4));
        VentanaResultados.Partidoa.setText(String.valueOf(VentanaCrearElección.jTextField5));
       /* VentanaResultados.Partidob.setText(VentanaCrearElección.jTextField13.getText());
        VentanaResultados.Partidoc.setText(VentanaCrearElección.jTextField14.getText());
        VentanaResultados.Partidod.setText(VentanaCrearElección.jTextField15.getText());*/
        
        /*HAY QUE CAMBIAR TODO ESTO PARA QUE EL TEXTO QUE SE PONE SEA LOS DATOS POR EJEMPLO VentanaResultados.jLabel6.setText= eleccion.nombre;*/
        
        obj.setVisible(true);
        dispose(); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        VentanaCoaliciones obj= new VentanaCoaliciones();
        obj.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        VentanaResultadosHistoricos obj= new VentanaResultadosHistoricos();
        obj.setVisible(true);
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        VentanaEncuestas obj= new VentanaEncuestas();
        obj.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaTipoPartido obj= new VentanaTipoPartido();
        obj.setVisible(true);
        dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        VentanaCoaliciones obj= new VentanaCoaliciones();
        obj.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
