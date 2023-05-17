/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slutprojekt;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author krist
 */
public class Info_om_agent extends javax.swing.JFrame {
    private InfDB idb;
    private static String email;
    
    private HashMap<String, String> rad_info = new HashMap<>();
    /**
     * Creates new form Info_om_agent
     */
    public Info_om_agent(InfDB idb, String email) {
        initComponents();
        this.idb = idb;
        this.email = email;
        email_L.setText(email);
        setAllt(email); //spelar ingen roll ifall man har email eller agentID
    }
    
    public void setAllt( String epost)
    {
        try {
            String hamta_rad = "select * from agent where Epost = '"+ epost + "'";
            ArrayList<HashMap<String, String>> rad_info = idb.fetchRows(hamta_rad);
            for(HashMap<String,String> allt : rad_info)
            {
                Agent_L.setText(allt.get("Namn"));
                
                agent_id_tf.setText(allt.get("Agent_ID"));
                agent_id_tf.setEnabled(false);
                
                administrator_tf.setText(allt.get("Administrator"));
                administrator_tf.setEnabled(false);
                
                anstallningsdatum_tf.setText(allt.get("Anstallningsdatum"));
                anstallningsdatum_tf.setEnabled(false);
                
                omrade_tf.setText(allt.get("Omrade")); // Något till senare, pröva visa vem som är områdeschef och namnet på området
                omrade_tf.setEnabled(false);
                
                telefonnummer_tf.setText(allt.get("Telefon"));
                telefonnummer_tf.setEnabled(false);
            }
            
            String hamta_omradeschef = "select Agent_ID from omradeschef where Agent_ID = '"+ agent_id_tf.getText() + "'";
            String svar = idb.fetchSingle(hamta_omradeschef);
            omradeschef_tf.setEnabled(false);
            if(svar == null )
            {
             omradeschef_tf.setText("Nej");
    
            }
            else{
                omradeschef_tf.setText("Ja");
            }
            
            String hamta_kontorschef = "select Agent_ID from kontorschef where Agent_ID = '"+ agent_id_tf.getText() + "'";
            String kontorschef_svar = idb.fetchSingle(hamta_kontorschef);
            
            kontorschef_tf.setEnabled(false);
            if(kontorschef_svar == null )
            {
             kontorschef_tf.setText("Nej");
             
            }
            else{
                kontorschef_tf.setText("Ja");
            }
          
            if(administrator_tf.getText().equals("J"))
            {
                administrator_tf.setText("Ja");
               
            }
            else{
                administrator_tf.setText("Nej");
            }
            
            //administrator_tf.setText(); 
            System.out.println(rad_info.toString());
           
            System.out.println("hämta rad" + hamta_rad);
        } catch (InfException ex) {
            Logger.getLogger(Info_om_agent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        omrade_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        administrator_tf = new javax.swing.JTextField();
        agent_id_tf = new javax.swing.JTextField();
        telefonnummer_tf = new javax.swing.JTextField();
        anstallningsdatum_tf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spara_andringar_btn = new javax.swing.JButton();
        Agent_L = new javax.swing.JLabel();
        email_L = new javax.swing.JLabel();
        andra_info_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kontorschef_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        omradeschef_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" Inloggad som");

        jLabel6.setText("Område");

        jLabel2.setText("Agent ID");

        jLabel3.setText("Telefonnummer");

        jLabel7.setText("Administratör");

        jLabel4.setText("Anställningsdatum");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Ändra information om en agent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        spara_andringar_btn.setText("Spara ändringar");
        spara_andringar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spara_andringar_btnActionPerformed(evt);
            }
        });

        andra_info_btn.setText("Ändra information");
        andra_info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andra_info_btnActionPerformed(evt);
            }
        });

        jLabel5.setText("Områdeschef");

        jLabel9.setText("Kontorschef");

        jButton1.setText("Ta bort agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_L, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(andra_info_btn)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spara_andringar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(administrator_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kontorschef_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(omradeschef_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(anstallningsdatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(agent_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(telefonnummer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(omrade_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))))))
                .addGap(117, 118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(email_L, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(andra_info_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(spara_andringar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agent_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(telefonnummer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anstallningsdatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(omrade_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(administrator_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(omradeschef_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kontorschef_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spara_andringar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spara_andringar_btnActionPerformed
        // TODO add your handling code here:
        
        try{
            String id = agent_id_tf.getText();
            String admin =administrator_tf.getText();
            String ans = anstallningsdatum_tf.getText();
            String omrade = omrade_tf.getText();
            String tnr = telefonnummer_tf.getText();

            String omradeschef = omradeschef_tf.getText();
            String kontorschef = kontorschef_tf.getText();

            String spara_andring = "Update agent set Agent_ID = '" +id + "', Telefon ='"+tnr +"', Anstallningsdatum =  '"+ ans +"', Omrade = '" + omrade+ "' where Epost = '"+ email_L.getText() + "'";
            idb.update(spara_andring);
            
            
            if(omradeschef_tf.getText().equals("Ja"))
            {
                String spara_andring_omradeschef = "Insert into omradeschef(Agent_ID, Omrade) values(" + id + ", " + omrade+ ");";
                idb.insert(spara_andring_omradeschef);
            }
            else if (omradeschef_tf.getText().equals("Nej"))
            {
                String radera_omradeschef = "Delete from omradeschef where Agent_ID =" + id + ";";
                idb.delete(radera_omradeschef);
            }
            
            
            
            if(kontorschef_tf.getText().equals("Ja"))
            {
                String spara_andring_kontorschef = "Insert into kontorschef(Agent_ID) values(" + id +");";
                idb.insert(spara_andring_kontorschef);
            }
            else if (kontorschef_tf.getText().equals("Nej"))
            {
                String radera_kontorschef = "Delete from kontorschef where Agent_ID =" + id + ";";
                idb.delete(radera_kontorschef);
            }
            
        }catch (InfException ex) {
            Logger.getLogger(Info_om_agent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_spara_andringar_btnActionPerformed

    private void andra_info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andra_info_btnActionPerformed

        agent_id_tf.setEnabled(true);
        anstallningsdatum_tf.setEnabled(true);
        omrade_tf.setEnabled(true);
        telefonnummer_tf.setEnabled(true);
        omradeschef_tf.setEnabled(true);
        kontorschef_tf.setEnabled(true);
        if(administrator_tf.getText().equals("Ja"))
            {
               administrator_tf.setEnabled(false);
            }
            else{
                administrator_tf.setText("Nej");
                administrator_tf.setEnabled(true);
            }
        
    }//GEN-LAST:event_andra_info_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Info_om_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info_om_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info_om_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info_om_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Info_om_agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agent_L;
    private javax.swing.JTextField administrator_tf;
    private javax.swing.JTextField agent_id_tf;
    private javax.swing.JButton andra_info_btn;
    private javax.swing.JTextField anstallningsdatum_tf;
    private javax.swing.JLabel email_L;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kontorschef_tf;
    private javax.swing.JTextField omrade_tf;
    private javax.swing.JTextField omradeschef_tf;
    private javax.swing.JButton spara_andringar_btn;
    private javax.swing.JTextField telefonnummer_tf;
    // End of variables declaration//GEN-END:variables
}
