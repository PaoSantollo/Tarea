/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TutoriasISO;

/**
 *
 * @author Paola
 */
public class Exfat extends javax.swing.JFrame {

    /**
     * Creates new form Exfat
     */
    public Exfat() {
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

        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        ingles = new javax.swing.JButton();
        español = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("exFat ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, 30));

        btnRegresar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\if_InterfaceExpendet-02_592613.png")); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 160, 40));

        btnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\if_free-29_618316.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 150, 40));

        ingles.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\eu.png")); // NOI18N
        ingles.setToolTipText("Ingles");
        ingles.setContentAreaFilled(false);
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });
        getContentPane().add(ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 30, -1));

        español.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\if_Spain_298518.png")); // NOI18N
        español.setContentAreaFilled(false);
        español.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                españolActionPerformed(evt);
            }
        });
        getContentPane().add(español, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 30, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\Formatear-unidad-en-Windows.png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 249));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 300, 270));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextPane1.setText("exFAT (Extended File Allocation Table, tabla extendida de asignación de archivos) es un sistema de archivos, patentado y propiedad de Microsoft, especialmente adaptado para memorias flash presentado con Windows CE (Windows Embedded CE 6.0).\n\nEl sistema de archivos exFAT se utiliza cuando el NTFS no es factible debido a la sobrecarga de las estructuras de datos.\n\nAlgunas ventaas son:\n* Límite teórico para el tamaño de fichero de 264 bytes (16 Exbibytes), límite aumentado desde 232 bytes (4 Gibibytes).\n* Tamaño de clúster de hasta 2255 bytes, límite implementado de 32MB.\n* Mejoras en el rendimiento de la asignación de espacio libre gracias a la introducción de un free space bitmap.\n* Soporte de 2.796.202 ficheros por directorio.\n* Soporte de 2.796.202 directorios por partición. Lo que permite almacenar hasta 7,8 billones de archivos.\n* Soporte para listas de control de acceso.\n* Soporte para Transaction-Safe FAT File System (TFAT) (función activada opcionalmente en WinCE).\n* En Windows 7, la función ReadyBoost mejora su capacidad, al eliminarse el límite de archivos de 4Gb del sistema FAT.\n* Multiplataforma, tanto Mac OS X (desde la versión 10.7) como Microsoft Windows (desde la versión 7) soportan lectura y escritura de forma nativa. Windows XP mediante el Service Pack 2 y Windows Vista con el Service Pack 1, también pueden manejar este formato.\n\nTomado el 19/Agosto/18 de: [https://es.wikipedia.org/wiki/ExFAT]");
        jTextPane1.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 390, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\up2.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paola\\Pictures\\SO\\blanco2.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        //Tambien se puede poner
        //this.setVisible(false);

        FatTypes fat= new FatTypes();
        fat.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        // TODO add your handling code here:
        jTextPane1.setText("exFAT (extended file allocation table, file allocation table) is a file system, patented and owned by Microsoft, specially adapted for flash memory presented with Windows CE (Windows Embedded CE 6.0).\n" +
"\n" +
"The file system is used when the NTFS is not feasible due to the overload of the data structures.\n" +
"\n" +
"Some of the advantages are:\n" +
"* Theoretical limit for the size of a file of 264 bytes (16 Exbibytes), increased limit from 232 bytes (4 Gibibytes).\n" +
"* Cluster size of up to 2255 bytes, implemented limit of 32MB.\n" +
"* Performance improvements of free space allocation thanks to the introduction of a free space bitmap.\n" +
"* Support of 2,796,202 files per directory.\n" +
"* Support of 2,796,202 directories per partition. Which allows to store up to 7.8 trillion files.\n" +
"* Support for access control lists.\n" +
"* Support for Transaction-Safe FAT file system (TFAT) (optionally activated in WinCE).\n" +
"* In Windows 7, the ReadyBoost function improves its capacity, and eliminates the 4Gb file limit of the FAT system.\n" +
"* Multiplatform, both Mac OS X (since version 10.7) and Microsoft Windows (since version 7) support reading and writing natively. Windows XP through Service Pack 2 and Windows Vista with Service Pack 1, can also handle this format.");
        
    }//GEN-LAST:event_inglesActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        // TODO add your handling code here:
        jTextPane1.setText("exFAT (Extended File Allocation Table, tabla extendida de asignación de archivos) es un sistema de archivos, patentado y propiedad de Microsoft, especialmente adaptado para memorias flash presentado con Windows CE (Windows Embedded CE 6.0).\n" +
"\n" +
"El sistema de archivos exFAT se utiliza cuando el NTFS no es factible debido a la sobrecarga de las estructuras de datos.\n" +
"\n" +
"Algunas ventaas son:\n" +
"* Límite teórico para el tamaño de fichero de 264 bytes (16 Exbibytes), límite aumentado desde 232 bytes (4 Gibibytes).\n" +
"* Tamaño de clúster de hasta 2255 bytes, límite implementado de 32MB.\n" +
"* Mejoras en el rendimiento de la asignación de espacio libre gracias a la introducción de un free space bitmap.\n" +
"* Soporte de 2.796.202 ficheros por directorio.\n" +
"* Soporte de 2.796.202 directorios por partición. Lo que permite almacenar hasta 7,8 billones de archivos.\n" +
"* Soporte para listas de control de acceso.\n" +
"* Soporte para Transaction-Safe FAT File System (TFAT) (función activada opcionalmente en WinCE).\n" +
"* En Windows 7, la función ReadyBoost mejora su capacidad, al eliminarse el límite de archivos de 4Gb del sistema FAT.\n" +
"* Multiplataforma, tanto Mac OS X (desde la versión 10.7) como Microsoft Windows (desde la versión 7) soportan lectura y escritura de forma nativa. Windows XP mediante el Service Pack 2 y Windows Vista con el Service Pack 1, también pueden manejar este formato.\n" +
"\n" +
"Tomado el 19/Agosto/18 de: [https://es.wikipedia.org/wiki/ExFAT]");
      
    }//GEN-LAST:event_españolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exfat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exfat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exfat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exfat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exfat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton español;
    private javax.swing.JButton ingles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
