/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import util.lecturaDatos;

/**
 *
 * @author jcsp0003
 */
public class FileChooserFrame extends javax.swing.JDialog {

    private final javax.swing.JTextArea jt;
    private final int accion;

    /**
     * Creates new form FileChooserFrame
     *
     * @param parent
     * @param modal
     * @param jt
     * @param accion 1 abrir 3 guardarComo
     */
    public FileChooserFrame(java.awt.Frame parent, boolean modal, javax.swing.JTextArea jt, int accion) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        this.jt = jt;
        this.accion = accion;
        FileFilter[] name = jFileChooser1.getChoosableFileFilters();
        for (FileFilter name1 : name) {
            jFileChooser1.removeChoosableFileFilter(name1);
        }

        if (accion == 1) {
            jFileChooser1.addChoosableFileFilter(new FileTypeFilter(".pdf", "PDF"));
            jFileChooser1.addChoosableFileFilter(new FileTypeFilter(".txt", "Documento de texto"));
            this.jFileChooser1.setApproveButtonText("Abrir");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if (this.accion == 1) {
            abrir(evt);
        }
        if (this.accion == 3) {
            guardarComo(evt);
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void guardarComo(java.awt.event.ActionEvent evt) {
        String command = evt.getActionCommand();
        if (command.equals(JFileChooser.APPROVE_SELECTION)) {
            File ficheroE = new File(this.jFileChooser1.getSelectedFile().getAbsolutePath());
            if (ficheroE.exists()) {
                int result = JOptionPane.showConfirmDialog((Component) null, this.jFileChooser1.getSelectedFile().getName() + " ya existe.\n¿Desea reemplazarlo?", "alert", JOptionPane.OK_CANCEL_OPTION);
                if (result == 0) {
                    ficheroE.delete();
                    crearFichero(this.jFileChooser1.getSelectedFile().getAbsolutePath());
                }
            } else {
                crearFichero(this.jFileChooser1.getSelectedFile().getAbsolutePath());
            }
        } else {
            if (command.equals(JFileChooser.CANCEL_SELECTION)) {
                System.out.println("He dado a cancelar");
                this.dispose();
            }
        }
    }

    private void crearFichero(String SelectedFile) {
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(SelectedFile);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(this.jt.getText());
        } catch (IOException e) {
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (IOException e2) {
            }
        }
        this.dispose();
    }

    private void abrir(java.awt.event.ActionEvent evt) {
        JFileChooser selector = (JFileChooser) evt.getSource();
        String command = evt.getActionCommand();
        System.out.println(evt);
        if (command.equals(JFileChooser.APPROVE_SELECTION)) {
            File archivoSeleccionado = selector.getSelectedFile();
            System.out.println(archivoSeleccionado.getAbsolutePath());
            File ficheroE = new File(this.jFileChooser1.getSelectedFile().getAbsolutePath());
            if (ficheroE.exists()) {
                System.out.println("El fichero existe");
                if (".txt".equals(ficheroE.getName().substring(ficheroE.getName().indexOf("."), ficheroE.getName().length()).toLowerCase())) {
                    abrirTxT();
                } else {
                    if (".pdf".equals(ficheroE.getName().substring(ficheroE.getName().indexOf("."), ficheroE.getName().length()).toLowerCase())) {
                        abrirPdf();
                    }
                }
                this.dispose();
            } else {
                System.out.println("El fichero NO existe");
            }
        } else {
            if (command.equals(JFileChooser.CANCEL_SELECTION)) {
                this.dispose();
            }
        }
    }

    public void abrirTxT() {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        try {
            archivo = new File(this.jFileChooser1.getSelectedFile().getAbsolutePath());
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            this.jt.setText("");
            String linea;
            while ((linea = br.readLine()) != null) {
                this.jt.append(linea + "\n");
            }
        } catch (IOException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }
    }

    public void abrirPdf() {
        lecturaDatos lec = new lecturaDatos();
        try {
            this.jt.setText(lec.lectura("pdf", this.jFileChooser1.getSelectedFile().getAbsolutePath()));
        } catch (IOException ex) {
            Logger.getLogger(FileChooserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public class FileTypeFilter extends FileFilter {

        private final String extension;
        private final String description;

        public FileTypeFilter(String extension, String description) {
            this.extension = extension;
            this.description = description;
        }

        @Override
        public boolean accept(File file) {
            if (file.isDirectory()) {
                return true;
            }
            return file.getName().endsWith(extension);
        }

        @Override
        public String getDescription() {
            return description + String.format(" (*%s)", extension);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
