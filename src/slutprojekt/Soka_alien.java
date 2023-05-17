/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slutprojekt;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author krist
 */

public class Soka_alien extends javax.swing.JFrame {
    private InfDB idb;
    private static String email;
    private HashMap<String, String> rad_info = new HashMap<>();
    DefaultTableModel model;
    private String val;
    private String sok;
    private String datum;
    /**
     * Creates new form Soka_alien
     */
    
    public Soka_alien(InfDB idb, String email) {
        initComponents();
        this.idb = idb;
        Agent_L.setText(email);
        model = (DefaultTableModel) alien_tb.getModel();
        val="";
       
        
    }
         
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sok_alien_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alien_tb = new javax.swing.JTable();
        sok_alien_btn = new javax.swing.JButton();
        Agent_L = new javax.swing.JLabel();
        val_cb = new javax.swing.JComboBox<>();
        datum_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Inloggad som Agent A");

        sok_alien_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sok_alien_tfActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sök ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sök alien ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        alien_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alien_ID", "Registreringsdatum", "Epost", "Losenord", "Namn", "Telefon", "Plats", "Ansvarig_Agent", "Ras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(alien_tb);

        sok_alien_btn.setText("Sök alien");
        sok_alien_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sok_alien_btnActionPerformed(evt);
            }
        });

        val_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Namn", "Registreringsdatum", "ID", "Plats", "Ansvarig agent", "Ras (Squid)", "Ras (Boglodite)", "Ras (Worm)", "Epost", " " }));
        val_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_cbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sok_alien_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(sok_alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sok_alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sok_alien_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sok_alien_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_alien_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sok_alien_tfActionPerformed

    private void sok_alien_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_alien_btnActionPerformed
        // TODO add your handling code here:
            model.setRowCount(0);            
            sok = sok_alien_tf.getText();
            datum = datum_tf.getText();
            
            sok_alien_btn.addActionListener(val_cb.getAction());
            
            if(val_cb.getSelectedItem().toString().equals("Namn"))
            {
                val = "where alien.Namn like '%"+sok+"%'";
                
            }
            else if(val_cb.getSelectedItem().toString().equals("Registreringsdatum"))
            {
                
                if(datum_tf.getText().isEmpty())
                {
                    val = "where alien.Registreringsdatum like '"+sok+"%'";
                }
                else
                {
                    val = "WHERE DATE_FORMAT(alien.Registreringsdatum, '%Y-%m-%d') >= '"+sok+"' AND DATE_FORMAT(alien.Registreringsdatum, '%Y-%m-%d') <= '"+datum+"%';";
                }
            }
            else if(val_cb.getSelectedItem().toString().equals("ID"))
            {
                val = "where alien.Alien_ID = "+sok+"";
            }
            else if(val_cb.getSelectedItem().toString().equals("Plats"))
            {
                
                val = "where plats.Benamning like '"+sok+"%'";
            }
            else if(val_cb.getSelectedItem().toString().equals("Ansvarig agent"))
            {
                val = "where agent.Namn like '"+sok+"%'";
            }
            else if(val_cb.getSelectedItem().toString().equals("Epost"))
            {
                val = "where alien.Epost like '"+sok+"%'";
            }
           
            try {
                String hemta_rad_id = "SELECT alien.Namn AS 'Namn', alien.Telefon, alien.Alien_ID, alien.Registreringsdatum, alien.Epost, alien.Losenord, Benamning AS 'Omrade', agent.Namn AS 'Ansvarig_agent', concat(squid.Alien_ID,',', boglodite.Alien_ID,',', worm.Alien_ID) AS 'Ras' from (((((alien\n" +
                                        "join agent on Ansvarig_agent = Agent_ID)\n" +
                                        "LEFT JOIN alien AS squid ON alien.Alien_ID = squid.Alien_ID)\n" +
                                        "LEFT JOIN alien AS worm ON alien.Alien_ID = worm.Alien_ID)\n" +
                                        "LEFT JOIN alien AS boglodite ON alien.Alien_ID = boglodite.Alien_ID)\n" +
                                        "join plats on plats.Plats_ID = alien.Plats)\n" +
                                        val;
                
                System.out.println(val);
               if(val_cb.getSelectedItem().toString().equals("Ras (Squid)"))
                {
                
                    hemta_rad_id = "SELECT * from squid join alien on squid.Alien_ID = alien.Alien_ID join plats on plats.Plats_ID = alien.Plats;";
                
                }
                else if(val_cb.getSelectedItem().toString().equals("Ras (Worm)"))
                {
                    hemta_rad_id = "SELECT * from worm join alien on worm.Alien_ID = alien.Alien_ID join plats on plats.Plats_ID = alien.Plats;";
                }
                else if(val_cb.getSelectedItem().toString().equals("Ras (Boglodite)"))
                {
                    hemta_rad_id = "SELECT * from boglodite join alien on boglodite.Alien_ID = alien.Alien_ID join plats on plats.Plats_ID = alien.Plats;";
                }
               
                ArrayList<HashMap<String, String>> rad_info = idb.fetchRows(hemta_rad_id);
                
                
                for(HashMap<String,String> allt : rad_info)
                {
                    String namn = idb.fetchSingle("select Namn from alien where Alien_ID = "+allt.get("Alien_ID"));
                    String id  = allt.get("Alien_ID");
                    String regDatum = allt.get("Registreringsdatum");
                    String epost = allt.get("Epost");
                    String losen = allt.get("Losenord");
                    String tnr = allt.get("Telefon");
                    String ans_agent = allt.get("Namn");
                    String plats = allt.get("Benamning");
                    String ras= getRas (id);
                    System.out.println(namn + "," + ras + "," + id + "," + regDatum +"," + epost + ","+ losen + ","+ tnr + ","+ ans_agent+ ","+ plats);
                    
                    model.addRow(new Object[]{id,regDatum,epost,losen,namn,tnr,plats,ans_agent,ras});
                    
                }
                
            model.fireTableDataChanged();
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        if(sok_alien_tf.getText().isEmpty())
        {
            model.setRowCount(0);
        }
        sok_alien_tf.setText("");
        val="";
        datum_tf.setVisible(false);
        val_cb.setSelectedIndex(0);
        datum_tf.setText("");
    }//GEN-LAST:event_sok_alien_btnActionPerformed

    private void val_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_cbActionPerformed
       
            sok = sok_alien_tf.getText(); // uppdaterar 
            sok_alien_tf.setEnabled(true);
           
            val_cb.addActionListener(sok_alien_btn.getAction());
            
            
            datum_tf.setEnabled(false);
                
            if (val_cb.getSelectedItem().toString().equals("Ras (Squid)"))
            {
                sok_alien_tf.setText("Squid");
                sok_alien_tf.setEnabled(false);
            }
            else if(val_cb.getSelectedItem().toString().equals("Ras (Worm)"))
            {
                sok_alien_tf.setText("Worm");
                sok_alien_tf.setEnabled(false);
            }
            else if(val_cb.getSelectedItem().toString().equals("Ras (Boglodite)"))
            {
                sok_alien_tf.setText("Boglodite");
                sok_alien_tf.setEnabled(false);
            }
            
            if (val_cb.getSelectedItem().toString().equals("Registreringsdatum"))
            {
                datum_tf.setEnabled(true);
            }

           
            
            
    }//GEN-LAST:event_val_cbActionPerformed

     private String getRas (String alienID)
     {
        String ras = "Worm";
        try {

            if (idb.fetchColumn("SELECT Alien_ID FROM boglodite").contains(alienID)) {

                ras = "Boglodite";

            } else if (idb.fetchColumn("SELECT alien_ID from squid").contains(alienID)) {

                ras = "Squid";

            }

        } catch (InfException ex) {
            Logger.getLogger(soka_agent.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ras;
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
            java.util.logging.Logger.getLogger(Soka_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soka_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soka_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soka_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Soka_alien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agent_L;
    private javax.swing.JTable alien_tb;
    private javax.swing.JTextField datum_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sok_alien_btn;
    private javax.swing.JTextField sok_alien_tf;
    private javax.swing.JComboBox<String> val_cb;
    // End of variables declaration//GEN-END:variables
}
