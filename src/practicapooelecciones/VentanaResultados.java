/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio;

import java.text.DecimalFormat;
import practicapoojunio.Eleccion.Eleccion;
import practicapoojunio.Votante.Votante;


/**
 *
 * @author Ruben
 */
public class VentanaResultados extends javax.swing.JFrame {
Votante votante;
Eleccion eleccion;
    /**
     * Creates new form VentanaResultados
     */
    public VentanaResultados() {
        initComponents();
        
        VentanaResultados.participacion.setText(Double.toString(eleccion.participacion));
        VentanaResultados.totalescaños.setText(Integer.toString(eleccion.totalescaños));
        DecimalFormat decimales= new DecimalFormat("0.000");
        
        Double porcentajea= (eleccion.resultados_total_votoselec.tablavotos[0].numeroVotos)/(eleccion.totalescaños*eleccion.participacion);
        Double porcentajeb= (eleccion.resultados_total_votoselec.tablavotos[1].numeroVotos)/(eleccion.totalescaños*eleccion.participacion);
        Double porcentajec= (eleccion.resultados_total_votoselec.tablavotos[2].numeroVotos)/(eleccion.totalescaños*eleccion.participacion);
        Double porcentajed= (eleccion.resultados_total_votoselec.tablavotos[3].numeroVotos)/(eleccion.totalescaños*eleccion.participacion);
        decimales.format(porcentajea);
        decimales.format(porcentajeb); 
        decimales.format(porcentajec);
        decimales.format(porcentajed);
        VentanaResultados.porcentajea.setText(String.valueOf( decimales.format(porcentajea)));
        VentanaResultados.porcentajeb.setText(String.valueOf( decimales.format(porcentajeb)));
        VentanaResultados.porcentajec.setText(String.valueOf(decimales.format(porcentajec)));
        VentanaResultados.porcentajed.setText(String.valueOf(decimales.format(porcentajed)));
        VentanaResultados.Partidoa.setText(eleccion.resultados_total_votoselec.tablavotos[0].formacionPolitica.Nombre);
        VentanaResultados.Partidob.setText(eleccion.resultados_total_votoselec.tablavotos[1].formacionPolitica.Nombre);
        VentanaResultados.Partidoc.setText(eleccion.resultados_total_votoselec.tablavotos[2].formacionPolitica.Nombre);
        VentanaResultados.Partidod.setText(eleccion.resultados_total_votoselec.tablavotos[3].formacionPolitica.Nombre);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        participacion = new javax.swing.JLabel();
        totalescaños = new javax.swing.JLabel();
        porcentajea = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        porcentajed = new javax.swing.JLabel();
        porcentajeb = new javax.swing.JLabel();
        porcentajec = new javax.swing.JLabel();
        Partidoa = new javax.swing.JLabel();
        Partidob = new javax.swing.JLabel();
        Partidoc = new javax.swing.JLabel();
        Partidod = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Escañosa = new javax.swing.JLabel();
        Escañosb = new javax.swing.JLabel();
        Escañosc = new javax.swing.JLabel();
        Escañosd = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Participación:");

        jLabel2.setText("Total de escaños:");

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel5.setText("RESULTADOS");

        participacion.setText("participacion");

        totalescaños.setText("totalescaños");

        porcentajea.setText("porcentajea");

        jLabel11.setText("Porcentaje de votos:");

        jLabel12.setText("Escaños:");

        porcentajed.setText("porcentajed");

        porcentajeb.setText("porcentajeb");

        porcentajec.setText("porcentajec");

        Partidoa.setText("A");

        Partidob.setText("B");

        Partidoc.setText("C");

        Partidod.setText("D");

        jToggleButton1.setText("Atrás");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Escañosa.setText("escañosa");

        Escañosb.setText("escañosb");

        Escañosc.setText("escañosc");

        Escañosd.setText("escañosd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(porcentajea)
                                    .addComponent(Partidoa)
                                    .addComponent(Escañosa))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(porcentajeb)
                                    .addComponent(Partidob)
                                    .addComponent(Escañosb))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Partidoc)
                                            .addComponent(porcentajec))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Partidod)
                                            .addComponent(porcentajed)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Escañosc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Escañosd)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalescaños)
                                    .addComponent(participacion))
                                .addGap(109, 109, 109))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(participacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(totalescaños)
                                .addGap(55, 55, 55)))
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Partidoa)
                            .addComponent(Partidob)
                            .addComponent(Partidoc)
                            .addComponent(Partidod))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(porcentajea)
                            .addComponent(porcentajeb)
                            .addComponent(porcentajec)
                            .addComponent(porcentajed))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Escañosa)
                    .addComponent(Escañosb)
                    .addComponent(Escañosc)
                    .addComponent(Escañosd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    MenuElecciones obj=new MenuElecciones(votante);
    obj.setVisible(true);
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Escañosa;
    public static javax.swing.JLabel Escañosb;
    public static javax.swing.JLabel Escañosc;
    public static javax.swing.JLabel Escañosd;
    public static javax.swing.JLabel Partidoa;
    public static javax.swing.JLabel Partidob;
    public static javax.swing.JLabel Partidoc;
    public static javax.swing.JLabel Partidod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JLabel participacion;
    public static javax.swing.JLabel porcentajea;
    public static javax.swing.JLabel porcentajeb;
    public static javax.swing.JLabel porcentajec;
    public static javax.swing.JLabel porcentajed;
    public static javax.swing.JLabel totalescaños;
    // End of variables declaration//GEN-END:variables
}
