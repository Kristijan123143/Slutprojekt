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
    
    public Soka_alien(InfDB idb, String email, String namn) {
        initComponents();
        this.idb = idb;
        Agent_L.setText(email);
        model = (DefaultTableModel) alien_tb.getModel();
        val="";
       namn_L.setText(namn);
    }
         
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alien_tb = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sok_alien_btn = new javax.swing.JButton();
        val_cb = new javax.swing.JComboBox<>();
        datum_tf = new javax.swing.JTextField();
        sok_alien_tf = new javax.swing.JTextField();
        avsluta_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namn_L = new javax.swing.JLabel();
        Agent_L = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tillbaka_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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

        alien_tb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Välj alien");

        sok_alien_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sok_alien_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Custom-Icon-Design-Mono-General-2-Search.16.png"))); // NOI18N
        sok_alien_btn.setText("Sök alien");
        sok_alien_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
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

        sok_alien_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sok_alien_tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sok_alien_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(sok_alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sok_alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sok_alien_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        avsluta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/power-icon.png"))); // NOI18N
        avsluta_btn.setText("Avsluta");
        avsluta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avsluta_btnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Icons8-Windows-8-Users-Administrator.48 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Inloggad som ");

        namn_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Epost");

        tillbaka_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/back-icon.png"))); // NOI18N
        tillbaka_btn.setText("Tillbaka");
        tillbaka_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbaka_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(tillbaka_btn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tillbaka_btn)
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agent_L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 110, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avsluta_btn)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(avsluta_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sok_alien_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_alien_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sok_alien_tfActionPerformed

    private void sok_alien_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_alien_btnActionPerformed
        // Metod för att söka upp en alien genom att ta texten från textfältet sok_alien_tf.
            model.setRowCount(0);            
            datum = datum_tf.getText();
            sok = sok_alien_tf.getText().substring(0,1).toUpperCase() + sok_alien_tf.getText().substring(1);
            sok_alien_btn.addActionListener(val_cb.getAction());
            
//SQL frågans where-sats ändras utifrån valet i comboboxen
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
//SQL fråga som joinar de olika ras-tabellerna och plats. SQL frågan kombineras med valet från comboboxen.   
            try {
                String hemta_rad_id = "SELECT alien.Namn AS 'Namn', alien.Telefon, alien.Alien_ID, alien.Registreringsdatum, alien.Epost, alien.Losenord, Benamning AS 'Omrade', agent.Namn AS 'Ansvarig_agent', concat(squid.Alien_ID,',', boglodite.Alien_ID,',', worm.Alien_ID) AS 'Ras' from (((((alien\n" +
                                        "join agent on Ansvarig_agent = Agent_ID)\n" +
                                        "LEFT JOIN alien AS squid ON alien.Alien_ID = squid.Alien_ID)\n" +
                                        "LEFT JOIN alien AS worm ON alien.Alien_ID = worm.Alien_ID)\n" +
                                        "LEFT JOIN alien AS boglodite ON alien.Alien_ID = boglodite.Alien_ID)\n" +
                                        "join plats on plats.Plats_ID = alien.Plats)\n" +
                                        val;
                
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
 //Här hämtas all information ut från SQL frågan från tabellerna och lägger till den informationen i tabellen.
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
                    
                    model.addRow(new Object[]{id,regDatum,epost,losen,namn,tnr,plats,ans_agent,ras});
                    
                }
                
            model.fireTableDataChanged();
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Validering.finnsIngenTabell(alien_tb, sok_alien_tf, val_cb);
        sok_alien_tf.setText("");
        val_cb.setSelectedIndex(0);
        datum_tf.setText("");
    }//GEN-LAST:event_sok_alien_btnActionPerformed

    private void val_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_cbActionPerformed
//Metoden kommer att beroende på valet för ras i comboboxen kommer ge ett förvalt inmatat värde i textfältet.
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

    private void tillbaka_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbaka_btnActionPerformed
        // TODO add your handling code here:
        Andra_sidan andra_sidan = new Andra_sidan(idb, Agent_L.getText());
        andra_sidan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tillbaka_btnActionPerformed

    private void avsluta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avsluta_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_avsluta_btnActionPerformed
//Metod för att hämta rasen för en alien.
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
    private javax.swing.JButton avsluta_btn;
    private javax.swing.JTextField datum_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel namn_L;
    private javax.swing.JButton sok_alien_btn;
    private javax.swing.JTextField sok_alien_tf;
    private javax.swing.JButton tillbaka_btn;
    private javax.swing.JComboBox<String> val_cb;
    // End of variables declaration//GEN-END:variables
}
