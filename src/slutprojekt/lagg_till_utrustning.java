/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slutprojekt;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author krist
 */
public class lagg_till_utrustning extends javax.swing.JFrame {
 private HashMap<String, String> info = new HashMap<>();
 private static String email;
 private InfDB idb;
    /**
     * Creates new form lagg_till_utrustning
     */
    public lagg_till_utrustning(InfDB idb, String email, String namn, String agent_info) {
        initComponents();
        this.idb = idb;
        Agent_L.setText(email);
        namn_L.setText(namn);
        extra_L.setVisible(false);
        extra_tf.setVisible(false);
        agent_L.setText( agent_info);
        System.out.println( hemta_agent());
        teknik_utrustning_rb.setSelected(true);
        extra_L.setVisible(true);
        extra_tf.setVisible(true);
        extra_L.setText("Lägg till kraftkälla");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        teknik_utrustning_rb = new javax.swing.JRadioButton();
        kommunikations_utrustning_rb = new javax.swing.JRadioButton();
        vapen_utrustning_rb = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lagg_till_utrustning_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        utkvitteringsDatum_tf = new javax.swing.JTextField();
        extra_L = new javax.swing.JLabel();
        extra_tf = new javax.swing.JTextField();
        lagg_till_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        agent_L = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Agent_L = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namn_L = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        avsluta_btn = new javax.swing.JButton();
        tillbaka_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(teknik_utrustning_rb);
        teknik_utrustning_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        teknik_utrustning_rb.setText("Lägg till teknik utrustning");
        teknik_utrustning_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teknik_utrustning_rbActionPerformed(evt);
            }
        });

        buttonGroup1.add(kommunikations_utrustning_rb);
        kommunikations_utrustning_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kommunikations_utrustning_rb.setText("Lägg till kommunikations utrustning");
        kommunikations_utrustning_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kommunikations_utrustning_rbActionPerformed(evt);
            }
        });

        buttonGroup1.add(vapen_utrustning_rb);
        vapen_utrustning_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vapen_utrustning_rb.setText("Lägg till vapen utrustning");
        vapen_utrustning_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vapen_utrustning_rbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Lägg till utrustning");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Lägg till utkvitteringsdatum");

        extra_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lagg_till_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lagg_till_btn.setText("Lägg till");
        lagg_till_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lagg_till_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagg_till_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Lägg till utrustning för:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kommunikations_utrustning_rb)
                            .addComponent(vapen_utrustning_rb)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(utkvitteringsDatum_tf)
                                    .addComponent(lagg_till_utrustning_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(extra_L, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extra_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agent_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(teknik_utrustning_rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lagg_till_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(teknik_utrustning_rb)
                .addGap(18, 18, 18)
                .addComponent(kommunikations_utrustning_rb)
                .addGap(18, 18, 18)
                .addComponent(vapen_utrustning_rb)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lagg_till_utrustning_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(utkvitteringsDatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(extra_L, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(extra_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lagg_till_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Epost");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Inloggad som");

        namn_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Agent_L, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Lägg till utrustning");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        avsluta_btn.setText("Avsluta");
        avsluta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avsluta_btnActionPerformed(evt);
            }
        });

        tillbaka_btn.setText("Tillbaka");
        tillbaka_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbaka_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91))
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(195, 195, 195)
                        .addComponent(tillbaka_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avsluta_btn)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(avsluta_btn)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tillbaka_btn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(237, 237, 237))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lagg_till_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagg_till_btnActionPerformed
//Metod för att lägga till utrustning för en agent.
if(Validering.kolla_om_falt_tomt(lagg_till_utrustning_tf))
{
    if(Validering.kolla_om_falt_tomt(utkvitteringsDatum_tf))
    {
        if(Validering.kolla_om_falt_tomt(extra_tf))
        {
            if(Validering.kollaDatum(utkvitteringsDatum_tf))
            {
//Här hämtas information för utrustningen och sätter in i respektive tabell.
                try {
            String lagg_till_utrustning = lagg_till_utrustning_tf.getText(); // hämtar namnet på utrustningen
            String lagg_till_utkvitteringsDatum = utkvitteringsDatum_tf.getText(); // hämtar utkvitteringsdatumet 
            String next_id = idb.getAutoIncrement("utrustning", "Utrustnings_ID");
            String id =  hemta_agent();
            String lagg_till_vapen = "Insert Into utrustning (Utrustnings_ID, Benamning) values ("+next_id+",'"+ lagg_till_utrustning+ "');";
            idb.insert(lagg_till_vapen);
            
            String lagg_till_utkvDatum = "Insert Into innehar_utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) values ("+ id +","+next_id+",'"+ lagg_till_utkvitteringsDatum+ "');";
            idb.insert(lagg_till_utkvDatum);
            
            String extra = extra_tf.getText();
            String lagg_till = "";
            if(teknik_utrustning_rb.isSelected())
            {
               
                lagg_till = "Insert Into teknik (Utrustnings_ID, Kraftkalla) values ("+next_id+",'"+ extra+ "');";
                idb.insert(lagg_till);
                JOptionPane.showMessageDialog(null, "Du har lagt till ny utrustning");

           
            }else if(kommunikations_utrustning_rb.isSelected())
            {
                lagg_till = "Insert Into kommunikation (Utrustnings_ID, Overforingsteknik) values ("+next_id+",'"+ extra+ "');";
                idb.insert(lagg_till);
                JOptionPane.showMessageDialog(null, "Du har lagt till ny utrustning");

                
            }else if(vapen_utrustning_rb.isSelected())
            {
                 lagg_till = "Insert Into vapen (Utrustnings_ID, Kaliber) values ("+next_id+",'"+ extra+ "');";
                idb.insert(lagg_till);
                JOptionPane.showMessageDialog(null, "Du har lagt till ny utrustning");

            }
        } catch (InfException ex) 
        {
            JOptionPane.showMessageDialog(null, "Något gick fel, ingen utrustnings har blivit registrerad. Försök igen.");
            Logger.getLogger(Utrustning.class.getName()).log(Level.SEVERE, null, ex);
        }    
        }
            }
            
    }
}
    }//GEN-LAST:event_lagg_till_btnActionPerformed

    private void teknik_utrustning_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teknik_utrustning_rbActionPerformed
        // TODO add your handling code here:
        
        extra_L.setVisible(true);
        extra_tf.setVisible(true);
        extra_L.setText("Lägg till kraftkälla");
        
    
    }//GEN-LAST:event_teknik_utrustning_rbActionPerformed

    private void kommunikations_utrustning_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kommunikations_utrustning_rbActionPerformed
        // TODO add your handling code here:
        extra_L.setVisible(true);
        extra_tf.setVisible(true);
        extra_L.setText("Lägg till Överförningsteknik");
        
    }//GEN-LAST:event_kommunikations_utrustning_rbActionPerformed

    private void vapen_utrustning_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vapen_utrustning_rbActionPerformed
        // TODO add your handling code here:
        extra_L.setVisible(true);
        extra_tf.setVisible(true);
        extra_L.setText("Lägg till kaliber");
        
        
    }//GEN-LAST:event_vapen_utrustning_rbActionPerformed

    private void tillbaka_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbaka_btnActionPerformed
        // TODO add your handling code here:
        Utrustning utrustning = new Utrustning(idb, Agent_L.getText(), namn_L.getText(),agent_L.getText());
        utrustning.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tillbaka_btnActionPerformed

    private void avsluta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avsluta_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_avsluta_btnActionPerformed
//Metod för att hämta id för en agent.
private String hemta_agent()
{
    String splitNamn = agent_L.getText();
    String[] arrOfStr = splitNamn.split(" ");
    String id_nummer = arrOfStr[4];
    
    return id_nummer;
}
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
            java.util.logging.Logger.getLogger(lagg_till_utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lagg_till_utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lagg_till_utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lagg_till_utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new lagg_till_utrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agent_L;
    private javax.swing.JLabel agent_L;
    private javax.swing.JButton avsluta_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel extra_L;
    private javax.swing.JTextField extra_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton kommunikations_utrustning_rb;
    private javax.swing.JButton lagg_till_btn;
    private javax.swing.JTextField lagg_till_utrustning_tf;
    private javax.swing.JLabel namn_L;
    private javax.swing.JRadioButton teknik_utrustning_rb;
    private javax.swing.JButton tillbaka_btn;
    private javax.swing.JTextField utkvitteringsDatum_tf;
    private javax.swing.JRadioButton vapen_utrustning_rb;
    // End of variables declaration//GEN-END:variables
}
