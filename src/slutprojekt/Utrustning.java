/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slutprojekt;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import oru.inf.InfException;
/**
 *
 * @author krist
 */
public class Utrustning extends javax.swing.JFrame {
    private InfDB idb;
    private static String email;
    private HashMap<String, String> info = new HashMap<>();
    DefaultTableModel model;
    private String val;
    /**
     * Creates new form Utrustning
     */
    public Utrustning(InfDB idb, String email, String namn, String admin) {
        initComponents();
        this.idb = idb;
        Agent_L.setText(email);
        namn_L.setText(namn);
        model = (DefaultTableModel) utrustning_tb.getModel();
        administrator_tf.setText(admin);
        getVapenInfo(namn);
        fyllCb();
        kollaAdmin();
        val = "";
        id_tf.setEditable(false);
        lagg_till_utrustning_tf.setEditable(false);
        utkvitteringsDatum_tf.setEditable(false);
        ny_agent_id.setEditable(false);
        lagg_till_vapen_btn.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lagg_till_vapen_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ny_agent_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lagg_till_utrustning_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        utkvitteringsDatum_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ta_bort_utrustning_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        val_cb = new javax.swing.JComboBox<>();
        sok_agent_btn = new javax.swing.JButton();
        avsluta_btn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Agent_L = new javax.swing.JLabel();
        namn_L = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tillbaka_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        utrustning_tb = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        administrator_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Utrustning");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        lagg_till_vapen_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lagg_till_vapen_btn.setText("Lägg till ny utrustning");
        lagg_till_vapen_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lagg_till_vapen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagg_till_vapen_btnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Agent ID");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Benämning");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Utkvitteringsdatum");

        utkvitteringsDatum_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utkvitteringsDatum_tfActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Utrustnings id");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Välj utrustning i listan");

        ta_bort_utrustning_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/delete-icon.png"))); // NOI18N
        ta_bort_utrustning_btn.setText("Ta bort utrustning");
        ta_bort_utrustning_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_bort_utrustning_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_tf)
                            .addComponent(lagg_till_utrustning_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(utkvitteringsDatum_tf)
                            .addComponent(ny_agent_id, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ta_bort_utrustning_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lagg_till_utrustning_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utkvitteringsDatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ny_agent_id)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(ta_bort_utrustning_btn)
                .addGap(29, 29, 29))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Välj agent");

        val_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Val" }));

        sok_agent_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sok_agent_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Custom-Icon-Design-Mono-General-2-Search.16.png"))); // NOI18N
        sok_agent_btn.setText("Sök agent");
        sok_agent_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        sok_agent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sok_agent_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sok_agent_btn)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sok_agent_btn))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        avsluta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/power-icon.png"))); // NOI18N
        avsluta_btn.setText("Avsluta");
        avsluta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avsluta_btnActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Icons8-Windows-8-Users-Administrator.96.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Inloggad som");

        Agent_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        namn_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Epost");

        tillbaka_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/back-icon.png"))); // NOI18N
        tillbaka_btn.setText("Tillbaka");
        tillbaka_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbaka_btnActionPerformed(evt);
            }
        });

        utrustning_tb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        utrustning_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Utrustning", "Utkvitteringsdatum", "Utrustnings_ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        utrustning_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                utrustning_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(utrustning_tb);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Detta är utkvitterat");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tillbaka_btn))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(administrator_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tillbaka_btn)
                .addGap(54, 54, 54)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(administrator_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lagg_till_vapen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avsluta_btn)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avsluta_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lagg_till_vapen_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lagg_till_vapen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagg_till_vapen_btnActionPerformed
        lagg_till_utrustning ny_utrustning = new lagg_till_utrustning(idb,Agent_L.getText(),namn_L.getText(), (String) val_cb.getSelectedItem());
        ny_utrustning.setVisible(true);
       
    }//GEN-LAST:event_lagg_till_vapen_btnActionPerformed

    private void ta_bort_utrustning_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_bort_utrustning_btnActionPerformed
/*Metod för att ta bort vald utrustning. Först måste en bekräftelse ske om radering önskas. Sedan tas utrustning bort från tabellerna i följande ordning
Innehar_utrustning, kommunikation, vapen, teknik och sist från utrustning*/
model.setRowCount(0);
        
        if(Validering.villTaBort())
        {
            try {
            String ta_bort= "DELETE FROM innehar_utrustning WHERE Utrustnings_ID = "+id_tf.getText()+";";
            String ta_bort_kommunikation = "DELETE FROM kommunikation WHERE Utrustnings_ID = "+id_tf.getText()+";";
            String ta_bort_vapen = " DELETE FROM vapen WHERE Utrustnings_ID = "+id_tf.getText()+";";
            String ta_bort_teknik = "DELETE FROM teknik WHERE Utrustnings_ID = "+id_tf.getText()+";";
            String ta_bort_utrustning = "DELETE FROM utrustning WHERE Utrustnings_ID ="+id_tf.getText()+";";
            
            String fraga_vapen = "select Utrustnings_ID from vapen where Utrustnings_ID = "+id_tf.getText()+";";
            String fraga_teknik = "select Utrustnings_ID from teknik where Utrustnings_ID = "+id_tf.getText()+";";
            String fraga_kommunikation = "select Utrustnings_ID from kommunikation where Utrustnings_ID = "+id_tf.getText()+";";
           
            
            if(idb.fetchColumn(fraga_vapen).contains(id_tf.getText()))
            {
                idb.delete(ta_bort_vapen);
            }else if(idb.fetchColumn(fraga_teknik).contains(id_tf.getText()))
            {
                idb.delete(ta_bort_teknik);
            }else if(idb.fetchColumn(fraga_kommunikation).contains(id_tf.getText()))
            {
                idb.delete(ta_bort_kommunikation);
            }
            
            idb.delete(ta_bort);
            idb.delete(ta_bort_utrustning);
            
        } catch (InfException ex) {
            Logger.getLogger(Utrustning.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        String namn = hemta_namn();
        getVapenInfo(namn);
    }//GEN-LAST:event_ta_bort_utrustning_btnActionPerformed

    private void sok_agent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_agent_btnActionPerformed
        // TODO add your handling code here:
//Metod för att nollställa alla rader i tabellen. Sedan sker en split på vald Agent i combobox där id hämtas ut för att sedan fylla tabellen igen med information om vilken utrustning agenten har utkvitterat.
         model.setRowCount(0);
            String splitNamn = val_cb.getSelectedItem().toString();
            String[] arrOfStr = splitNamn.split(" ");

            String namn = arrOfStr[1]+" "+arrOfStr[2];
            String id = arrOfStr[4];
            ny_agent_id.setText(id);
            
            getVapenInfo(namn);
            lagg_till_vapen_btn.setEnabled(true);

    }//GEN-LAST:event_sok_agent_btnActionPerformed

    private void utrustning_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_utrustning_tbMouseClicked
//Metod för att välja utrustning i tabellen och lägga in den i fälten.
        int i = utrustning_tb.getSelectedRow();
        TableModel model = utrustning_tb.getModel();
        id_tf.setText(model.getValueAt(i, 2).toString());
        lagg_till_utrustning_tf.setText(model.getValueAt(i, 0).toString());
        utkvitteringsDatum_tf.setText(model.getValueAt(i, 1).toString());

    }//GEN-LAST:event_utrustning_tbMouseClicked

    private void utkvitteringsDatum_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utkvitteringsDatum_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utkvitteringsDatum_tfActionPerformed

    private void tillbaka_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbaka_btnActionPerformed
        Andra_sidan andra_sidan = new Andra_sidan(idb, Agent_L.getText());
        andra_sidan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tillbaka_btnActionPerformed

    private void avsluta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avsluta_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_avsluta_btnActionPerformed
//Metod för att kontrollera om den inloggade agenten har administratörsstatus. Har agenten det kan agenten ta bort utrustning annars är den funktionen låst.
    public void kollaAdmin()
    {
        administrator_tf.setVisible(false);
        if(administrator_tf.getText().equals("Ja"))
        {
           sok_agent_btn.setVisible(true);
           val_cb.setVisible(true);
           jLabel5.setVisible(true);
           ta_bort_utrustning_btn.setVisible(true);
        }
        else{
            
            ta_bort_utrustning_btn.setVisible(false);

        }
    }
    
//Metod för att hämta alla vapen som är utkvitterade för den valda agenten.
    public String getVapenInfo(String namn)
    {
        
        String hemta_vapen = "SELECT utrustning.Utrustnings_ID, Namn,agent.Agent_ID ,Benamning AS 'Vapen_Namn', Utkvitteringsdatum FROM agent\n" +
"                   LEFT join innehar_utrustning on agent.Agent_ID = innehar_utrustning.Agent_ID\n" +
"                   LEFT join utrustning on innehar_utrustning.Utrustnings_ID = utrustning.Utrustnings_ID\n" +
"                   where Namn ='"+ namn+ "';";
        try {
            ArrayList<HashMap<String, String>> info = idb.fetchRows(hemta_vapen);
            for(HashMap<String,String> allt : info)
            {
                String vapenNamn = allt.get("Benamning");
                String utv = allt.get("Utkvitteringsdatum");
                String id = allt.get("Utrustnings_ID");
                System.out.println(vapenNamn+","+ utv);
                model.addRow(new Object[]{vapenNamn,utv,id});
            }
          
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hemta_vapen;
    }
    
//Metod för att hämta alla agenters namn och agent ID. Sedan fylls comboboxen med den informationen.   
    private void fyllCb() {
        String agentNamn = "select Namn from agent";
        
        ArrayList<String> hamtaAllaAgentNamn;
        try {
           
            hamtaAllaAgentNamn = idb.fetchColumn(agentNamn);
            for (String namn : hamtaAllaAgentNamn)
            {
                String agentID = "select Agent_ID from agent where Namn = '"+namn+"';";

                String id = idb.fetchSingle(agentID);
                val_cb.addItem("Namn: "+namn +" "+ "ID: "+id);
            }            
            
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Metod för att hämta namnet på den valda agenten i comboboxen.
    private String hemta_namn()
    {
        String splitNamn = val_cb.getSelectedItem().toString();
        String[] arrOfStr = splitNamn.split(" ");

        String namn = arrOfStr[1]+" "+arrOfStr[2];
        
        return namn;
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
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Utrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agent_L;
    private javax.swing.JTextField administrator_tf;
    private javax.swing.JButton avsluta_btn;
    private javax.swing.JTextField id_tf;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lagg_till_utrustning_tf;
    private javax.swing.JButton lagg_till_vapen_btn;
    private javax.swing.JLabel namn_L;
    private javax.swing.JTextField ny_agent_id;
    private javax.swing.JButton sok_agent_btn;
    private javax.swing.JButton ta_bort_utrustning_btn;
    private javax.swing.JButton tillbaka_btn;
    private javax.swing.JTextField utkvitteringsDatum_tf;
    private javax.swing.JTable utrustning_tb;
    private javax.swing.JComboBox<String> val_cb;
    // End of variables declaration//GEN-END:variables
}
