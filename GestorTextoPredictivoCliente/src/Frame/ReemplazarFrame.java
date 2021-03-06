/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author jcsp0003
 */
public class ReemplazarFrame extends javax.swing.JDialog {

    private final javax.swing.JTextArea jTextArea;
    private int posCaret;

    private int Comienzo;
    private int Final;

    /**
     * Constructor parametrizado de la clase ReemplazarFrame
     *
     * @param parent Clase frame que invoca a ReemplazarFrame
     * @param modal Modo del JDialog
     * @param jt JTextArea principal de escritura
     */
    public ReemplazarFrame(java.awt.Frame parent, boolean modal, javax.swing.JTextArea jt) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        jTextFieldBuscar.addKeyListener(new listenerEscritura(jTextFieldBuscar, this.botonSiguiente, this.botonReemplazar, this.botonReemplazarT));
        this.jTextArea = jt;
        posCaret = 0;
        this.botonSiguiente.setEnabled(false);
        this.botonReemplazar.setEnabled(false);
        this.botonReemplazarT.setEnabled(false);

        Comienzo = 0;
        Final = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jTextFieldReemplazar = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();
        botonReemplazar = new javax.swing.JButton();
        botonReemplazarT = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscar:");

        jLabel2.setText("Reemplazar por:");

        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jTextFieldReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReemplazarActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Buscar siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonReemplazar.setText("Reemplazar");
        botonReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReemplazarActionPerformed(evt);
            }
        });

        botonReemplazarT.setText("Reemplazar todo");
        botonReemplazarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReemplazarTActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        check.setText("Coincidir mayúsculas y minúsculas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTextFieldReemplazar)))
                    .addComponent(check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonReemplazarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReemplazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonReemplazar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonReemplazarT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(check)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReemplazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReemplazarActionPerformed

    /**
     * Cierra el frame
     *
     * @param evt Evento de pulsar el un boton
     */
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed

    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    /**
     * Reemplaza la ocurrencia con el texto escrito
     *
     * @param evt Evento de pulsar el un boton
     */
    private void botonReemplazarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReemplazarTActionPerformed
        this.jTextArea.setText(this.jTextArea.getText().replaceAll(this.jTextFieldBuscar.getText(), this.jTextFieldReemplazar.getText()));
    }//GEN-LAST:event_botonReemplazarTActionPerformed

    /**
     * Busca la siguiente palabra que coincida
     *
     * @param evt Evento de pulsar el un boton
     */
    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        boolean coincidir = check.isSelected();
        String strBusco;
        int posIni;
        if (coincidir) {
            strBusco = this.jTextFieldBuscar.getText();
            posIni = this.jTextArea.getText().indexOf(strBusco, posCaret);
        } else {
            strBusco = this.jTextFieldBuscar.getText().toLowerCase();
            posIni = this.jTextArea.getText().toLowerCase().indexOf(strBusco, posCaret);
        }
        if (posIni != -1) {
            this.jTextArea.select(posIni, posIni + strBusco.length());
            Comienzo = posIni;
            Final = posIni + strBusco.length();
            posCaret = strBusco.length() + posIni;
        } else {
            posCaret = 0;
            if (coincidir) {
                strBusco = this.jTextFieldBuscar.getText();
                posIni = this.jTextArea.getText().indexOf(strBusco, posCaret);
            } else {
                strBusco = this.jTextFieldBuscar.getText().toLowerCase();
                posIni = this.jTextArea.getText().toLowerCase().indexOf(strBusco, posCaret);
            }
            if (posIni != -1) {
                this.jTextArea.select(posIni, posIni + strBusco.length());
                Comienzo = posIni;
                Final = +posIni + strBusco.length();
                posCaret = strBusco.length() + posIni;
            } else {
                this.jTextArea.select(0, 0);
                Comienzo = 0;
                Final = 0;
                JOptionPane.showMessageDialog(null, "No se encontró '" + strBusco + "'");
            }
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    /**
     * Reemplaza la ocurrencia con el texto escrito
     *
     * @param evt Evento de pulsar el un boton
     */
    private void botonReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReemplazarActionPerformed
        if (Comienzo != 0 && Final != 0) {
            this.jTextArea.setText(jTextArea.getText().substring(0, Comienzo) + jTextArea.getText().substring(Final, jTextArea.getText().length()));
            Comienzo = 0;
            Final = 0;
        }
    }//GEN-LAST:event_botonReemplazarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonReemplazar;
    private javax.swing.JButton botonReemplazarT;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldReemplazar;
    // End of variables declaration//GEN-END:variables

    /**
     * Listener que desbloquea los botones al escribir
     */
    private static class listenerEscritura implements KeyListener {

        private final javax.swing.JTextField jTF;
        private final javax.swing.JButton botonSiguiente;
        private final javax.swing.JButton botonReemplazar;
        private final javax.swing.JButton botonReemplazarT;

        /**
         * Consrucor parametrizado
         *
         * @param jTF JTextField de escritura
         * @param bs Boton siguiente
         * @param br Boton reemplazar
         * @param brt Boton reemplazar todos
         */
        public listenerEscritura(javax.swing.JTextField jTF, javax.swing.JButton bs, javax.swing.JButton br, javax.swing.JButton brt) {
            this.jTF = jTF;
            this.botonSiguiente = bs;
            this.botonReemplazar = br;
            this.botonReemplazarT = brt;
        }

        /**
         * Evento de pulsar y soltar una tecla
         *
         * @param ke Evento de tecla
         */
        @Override
        public void keyTyped(KeyEvent ke) {

        }

        /**
         * Evento de pulsar una tecla
         *
         * @param ke Evento de tecla
         */
        @Override
        public void keyPressed(KeyEvent ke) {

        }

        /**
         * Evento de soltar una tecla para desbloquear los botones
         *
         * @param ke Evento de tecla
         */
        @Override
        public void keyReleased(KeyEvent ke) {
            if (!"".equals(this.jTF.getText())) {
                this.botonSiguiente.setEnabled(true);
                this.botonReemplazar.setEnabled(true);
                this.botonReemplazarT.setEnabled(true);
            } else {
                this.botonSiguiente.setEnabled(false);
                this.botonReemplazar.setEnabled(false);
                this.botonReemplazarT.setEnabled(false);
            }
        }
    }

}
