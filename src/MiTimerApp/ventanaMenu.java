package MiTimerApp;

import java.io.IOException;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto del yesso
 */
public class ventanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenu
     */
    public ventanaMenu() {
        initComponents();
        jTextHorasApagar.setEditable(false);
        jTextMinutosApagar.setEditable(false);
        jTextHorasApagar.setText("0");
        jTextMinutosApagar.setText("5");
        
    }
    
    private int calcularSegundos(int horas, int minutos){
        int segundos;
        minutos = minutos + 60 * horas;
        segundos = minutos * 60;    
        return segundos;
    }
    
    //metodo de cerrar ediciones
    private void bloquearEdiciones(){
        this.jTextHorasApagar.setText("0");
        this.jTextHorasApagar.setEnabled(false);
        this.jTextMinutosApagar.setText("0");
        this.jTextMinutosApagar.setEnabled(false);
        this.jButtonApagado.setEnabled(false);
        this.jButtonReinicio.setEnabled(false);
    }
    
    //metodo de habilitar ediciones
    private void habilitarEdiciones(){
        this.jTextHorasApagar.setText("0");
        this.jTextHorasApagar.setEnabled(true);
        this.jTextMinutosApagar.setText("5");
        this.jTextMinutosApagar.setEnabled(true);
        this.jButtonApagado.setEnabled(true);
        this.jButtonReinicio.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextHorasApagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextMinutosApagar = new javax.swing.JTextField();
        Hmas = new javax.swing.JButton();
        Hmenos = new javax.swing.JButton();
        Mmas = new javax.swing.JButton();
        Mmenos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonReinicio = new javax.swing.JButton();
        jButtonApagado = new javax.swing.JButton();
        jButtonSuspender = new javax.swing.JButton();
        jBottonCancelar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jTProgramado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(153, 204, 255)));

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Semibold", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("MiTimerApp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Programar:");

        jLabel2.setText("HORAS");

        jTextHorasApagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setText("MINUTOS");

        jTextMinutosApagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Hmas.setText("H +");
        Hmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HmasActionPerformed(evt);
            }
        });

        Hmenos.setText("H -");
        Hmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HmenosActionPerformed(evt);
            }
        });

        Mmas.setText("M +");
        Mmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmasActionPerformed(evt);
            }
        });

        Mmenos.setText("M -");
        Mmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MmenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextHorasApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hmas, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Hmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextMinutosApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mmas, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Hmas)
                            .addComponent(jLabel3)
                            .addComponent(Mmas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHorasApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hmenos)
                            .addComponent(jTextMinutosApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mmenos))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTextMinutosApagar.getAccessibleContext().setAccessibleParent(jTextMinutosApagar);

        jButtonReinicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonReinicio.setText("REINICIO");
        jButtonReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReinicioActionPerformed(evt);
            }
        });

        jButtonApagado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonApagado.setText("APAGADO");
        jButtonApagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagadoActionPerformed(evt);
            }
        });

        jButtonSuspender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSuspender.setText("SUSPENDER");
        jButtonSuspender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuspenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jButtonApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSuspender, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuspender, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBottonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBottonCancelar.setText("CARCELAR");
        jBottonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBottonCancelarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTProgramado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTProgramadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBottonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTProgramado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBottonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jTProgramado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jBottonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBottonCancelarActionPerformed
        // Codigo de cancelacion de las programaciones
        try {
            String [] cmd = {"shutdown","-a"}; //Comando de apagado en windows
            Runtime.getRuntime().exec(cmd);
            this.habilitarEdiciones();
        } catch (IOException ioe) {
            System.out.println (ioe);
        }

    }//GEN-LAST:event_jBottonCancelarActionPerformed

    private void jButtonApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagadoActionPerformed
        // Programa el apagado de la máquina:
        int horas = Integer.parseInt(jTextHorasApagar.getText());
        int minutos = Integer.parseInt(jTextMinutosApagar.getText());
        try {
            //calcula cantidad de segundos
            int segundos = this.calcularSegundos(horas, minutos);
            System.out.println (Integer.toString(segundos));
            String [] cmd = {"shutdown","-s","-t", Integer.toString(segundos)}; //Comando de apagado en windows
            //String [] cmd = {"dir"}; //Comando de apagado en windows
            this.bloquearEdiciones();
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println (ioe);
        }
    }//GEN-LAST:event_jButtonApagadoActionPerformed

    private void jButtonReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReinicioActionPerformed
        // Programa el reinicio de la máquina:
        int horas = Integer.parseInt(jTextHorasApagar.getText());
        int minutos = Integer.parseInt(jTextMinutosApagar.getText());
        try {
            //calcula cantidad de minutos
            int segundos = this.calcularSegundos(horas, minutos);
            String [] cmd = {"shutdown","-r","-t", Integer.toString(segundos)}; //Comando de apagado en windows
            Runtime.getRuntime().exec(cmd);
            this.bloquearEdiciones();
        } catch (IOException ioe) {
            System.out.println (ioe);
        }
    }//GEN-LAST:event_jButtonReinicioActionPerformed

    private void MmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmenosActionPerformed
        // TODO add your handling code here:
        //baja los minutos hasta cero
        int minutos = Integer.parseInt(jTextMinutosApagar.getText());
        if (minutos > 0){
            minutos = minutos - 1;
        }
        this.jTextMinutosApagar.setText(Integer.toString(minutos));
    }//GEN-LAST:event_MmenosActionPerformed

    private void MmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MmasActionPerformed
        // TODO add your handling code here:
        //sube los minutos hasta 59
        int minutos = Integer.parseInt(jTextMinutosApagar.getText());
        if (minutos < 59){
            minutos = minutos + 1;
        }
        this.jTextMinutosApagar.setText(Integer.toString(minutos));
    }//GEN-LAST:event_MmasActionPerformed

    private void HmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HmenosActionPerformed
        // TODO add your handling code here:
        //baja las horas hasta cero
        int horas = Integer.parseInt(jTextHorasApagar.getText());
        if (horas > 0){
            horas = horas - 1;
        }
        this.jTextHorasApagar.setText(Integer.toString(horas));
    }//GEN-LAST:event_HmenosActionPerformed

    private void HmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HmasActionPerformed
        // TODO add your handling code here:
        //suma horas hasta 24horas
        int horas = Integer.parseInt(jTextHorasApagar.getText());
        if (horas < 24){
            horas = horas + 1;
        }
        this.jTextHorasApagar.setText(Integer.toString(horas));
    }//GEN-LAST:event_HmasActionPerformed

    private void jButtonSuspenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuspenderActionPerformed
        // Programa la suspención de la máquina:
        int horas = Integer.parseInt(jTextHorasApagar.getText());
        int minutos = Integer.parseInt(jTextMinutosApagar.getText());
        try {
            //calcula cantidad de segundos
            int segundos = this.calcularSegundos(horas, minutos);
            System.out.println (Integer.toString(segundos));
            String [] cmd = {"shutdown","-h","-t", Integer.toString(segundos)}; //Comando de apagado en windows
            //String [] cmd = {"dir"}; //Comando de apagado en windows
            this.bloquearEdiciones();
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println (ioe);
        }
        
        
    }//GEN-LAST:event_jButtonSuspenderActionPerformed

    private void jTProgramadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTProgramadoActionPerformed
        // TODO add your handling code here:
        this.jTProgramado.setText("0");
    }//GEN-LAST:event_jTProgramadoActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hmas;
    private javax.swing.JButton Hmenos;
    private javax.swing.JButton Mmas;
    private javax.swing.JButton Mmenos;
    private javax.swing.JButton jBottonCancelar;
    private javax.swing.JButton jButtonApagado;
    private javax.swing.JButton jButtonReinicio;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSuspender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTProgramado;
    private javax.swing.JTextField jTextHorasApagar;
    private javax.swing.JTextField jTextMinutosApagar;
    // End of variables declaration//GEN-END:variables
}
