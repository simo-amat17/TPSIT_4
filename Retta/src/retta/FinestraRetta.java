/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retta;

/**
 *
 * @author Amatucci Simone 4INB 23/03/2017
 */
public class FinestraRetta extends javax.swing.JFrame {

    /**
     * Creates new form FinestraRetta
     */
    public FinestraRetta() {
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

        coeffa = new javax.swing.JTextField();
        coeffb = new javax.swing.JTextField();
        coeffc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Imposta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Equazione = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        coordX = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        coordY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Verifica = new javax.swing.JButton();
        risapp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        coeffa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeffaActionPerformed(evt);
            }
        });

        coeffb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeffbActionPerformed(evt);
            }
        });

        coeffc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeffcActionPerformed(evt);
            }
        });

        jLabel1.setText("a");

        jLabel2.setText("b");

        jLabel3.setText("c");

        jLabel4.setText("x   +");

        jLabel5.setText("y   +");

        jLabel6.setText(" =  0");

        Imposta.setText("Imposta");
        Imposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpostaActionPerformed(evt);
            }
        });

        jLabel7.setText("Equazione:");

        jLabel8.setText("Tipo retta:");

        jLabel9.setText("P  (");

        coordX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordXActionPerformed(evt);
            }
        });

        jLabel10.setText(",");

        coordY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordYActionPerformed(evt);
            }
        });

        jLabel11.setText(")");

        Verifica.setText("Verifica punto");
        Verifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(coeffa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(coeffb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coeffc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(Imposta))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coordX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coordY, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Verifica))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(Equazione, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(risapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeffa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coeffc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coeffb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(Imposta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Equazione, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(coordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(coordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Verifica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(risapp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coeffaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeffaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeffaActionPerformed

    private void coeffbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeffbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeffbActionPerformed

    private void coeffcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeffcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeffcActionPerformed

    private void ImpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpostaActionPerformed
        String Retta;
        int d=0;
        int e=0;
        String coeffa = this.coeffa.getText();
        double a = Double.parseDouble(coeffa);
        if(a == 0){
          d=1;  
        }
        String coeffb = this.coeffb.getText();
        double b = Double.parseDouble(coeffb);
        if(b == 0){
          e=1;  
        }
        String coeffc = this.coeffc.getText();
        double c = Double.parseDouble(coeffc);
        Retta r = new Retta(a, b, c);
        if((a == 0)&&(b == 0)){
            int p1=0,p2=0;
            FinestraErrore error = new FinestraErrore();
            error.setVisible(true);
            error.setLocation(p1=75,p2=330);
            error.setTitle("Errore!");
            this.Equazione.setText("");
            this.Tipo.setText("");
        }
        this.Equazione.setText(r.stampa());
        this.Tipo.setText(r.getTipo());
        
    }//GEN-LAST:event_ImpostaActionPerformed

    private void coordXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordXActionPerformed

    private void coordYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordYActionPerformed

    private void VerificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificaActionPerformed
      String Retta;
        int d=0;
        int e=0;
        String coeffa = this.coeffa.getText();
        double a = Double.parseDouble(coeffa);
        if(a == 0){
          d=1;  
        }
        String coeffb = this.coeffb.getText();
        double b = Double.parseDouble(coeffb);
        if(b == 0){
          e=1;  
        }
        String coeffc = this.coeffc.getText();
        double c = Double.parseDouble(coeffc);
        
        Retta r = new Retta(a, b, c);
        
        String coordX = this.coordX.getText();
        double x = Double.parseDouble(coordX);
        
        String coordY = this.coordY.getText();
        double y = Double.parseDouble(coordY);
        
        if(r.appartenenza(x, y) == true){
            this.risapp.setText("Il punto appartiene alla retta.");
        }else{
            this.risapp.setText("Il punto non appartiene alla retta.");
        }
    }//GEN-LAST:event_VerificaActionPerformed

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
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraRetta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Equazione;
    private javax.swing.JButton Imposta;
    private javax.swing.JLabel Tipo;
    private javax.swing.JButton Verifica;
    private javax.swing.JTextField coeffa;
    private javax.swing.JTextField coeffb;
    private javax.swing.JTextField coeffc;
    private javax.swing.JTextField coordX;
    private javax.swing.JTextField coordY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel risapp;
    // End of variables declaration//GEN-END:variables
}
