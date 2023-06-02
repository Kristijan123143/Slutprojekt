/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slutprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author krist
 */
public class lagg_till_ny_agent extends javax.swing.JFrame {
    private InfDB idb;
    private static String email;
    /**
     * Creates new form lagg_till_ny_agent
     */
    public lagg_till_ny_agent(InfDB idb, String email, String namn) {
        initComponents();
        this.idb = idb;
        Agent_L.setText(namn);
        agent_id_tf.setEnabled(false);
        email_L.setText(email);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lagg_till_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        losenord_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ny_email_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        faltagent_nej_rb = new javax.swing.JRadioButton();
        faltagent_ja_rb = new javax.swing.JRadioButton();
        faltagent_L = new javax.swing.JLabel();
        nej_rb = new javax.swing.JRadioButton();
        kontorschef_rb = new javax.swing.JRadioButton();
        omradeschef_rb = new javax.swing.JRadioButton();
        admin_nej_rb = new javax.swing.JRadioButton();
        admin_ja_rb = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        omrade_cb = new javax.swing.JComboBox<>();
        omrade_L = new javax.swing.JLabel();
        anstallningsdatum_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonnummer_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agent_id_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namn_tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kategori_L = new javax.swing.JLabel();
        chef_L = new javax.swing.JLabel();
        avsluta_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tillbaka_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email_L = new javax.swing.JLabel();
        Agent_L = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lägg till en ny agent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        lagg_till_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lagg_till_btn.setText("Lägg till ");
        lagg_till_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lagg_till_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagg_till_btnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Lösenord");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Email");

        buttonGroup3.add(faltagent_nej_rb);
        faltagent_nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        faltagent_nej_rb.setText("Nej");

        buttonGroup3.add(faltagent_ja_rb);
        faltagent_ja_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        faltagent_ja_rb.setText("Ja");

        faltagent_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        faltagent_L.setText("Fältagent");

        buttonGroup2.add(nej_rb);
        nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nej_rb.setText("Nej");

        buttonGroup2.add(kontorschef_rb);
        kontorschef_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kontorschef_rb.setText("Kontorschef");

        buttonGroup2.add(omradeschef_rb);
        omradeschef_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        omradeschef_rb.setText("Områdeschef");

        buttonGroup1.add(admin_nej_rb);
        admin_nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        admin_nej_rb.setText("Nej");

        buttonGroup1.add(admin_ja_rb);
        admin_ja_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        admin_ja_rb.setText("Ja");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Administratör");

        omrade_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj område", "Svealand", "Götaland", "Norrland" }));

        omrade_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        omrade_L.setText("Område");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Anställningsdatum");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Telefonnummer");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Agent ID");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Namn");

        kategori_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kategori_L.setText("Kategori");

        chef_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chef_L.setText("Chef");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chef_L)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(omrade_L)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(namn_tf)
                                    .addComponent(agent_id_tf)
                                    .addComponent(telefonnummer_tf)
                                    .addComponent(losenord_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(omrade_cb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ny_email_tf)
                                    .addComponent(anstallningsdatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(faltagent_L)
                                    .addComponent(jLabel7)
                                    .addComponent(omradeschef_rb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(kontorschef_rb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nej_rb))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(admin_ja_rb)
                                        .addGap(18, 18, 18)
                                        .addComponent(admin_nej_rb))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(faltagent_ja_rb)
                                        .addGap(18, 18, 18)
                                        .addComponent(faltagent_nej_rb)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(kategori_L)
                        .addGap(81, 81, 81))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agent_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonnummer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anstallningsdatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ny_email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenord_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omrade_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omrade_L))
                .addGap(18, 18, 18)
                .addComponent(kategori_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin_nej_rb)
                    .addComponent(admin_ja_rb)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nej_rb)
                    .addComponent(kontorschef_rb)
                    .addComponent(omradeschef_rb)
                    .addComponent(chef_L))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faltagent_nej_rb)
                    .addComponent(faltagent_ja_rb)
                    .addComponent(faltagent_L))
                .addGap(15, 15, 15))
        );

        avsluta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/power-icon.png"))); // NOI18N
        avsluta_btn.setText("Avsluta");
        avsluta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avsluta_btnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Icons8-Windows-8-Users-Administrator.96.png"))); // NOI18N

        tillbaka_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/back-icon.png"))); // NOI18N
        tillbaka_btn.setText("Tillbaka");
        tillbaka_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbaka_btnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(" Inloggad som");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Epost");

        Agent_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agent_L.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tillbaka_btn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_L, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tillbaka_btn)
                .addGap(107, 107, 107)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(email_L, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Agent_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Add-User-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lagg_till_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avsluta_btn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avsluta_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lagg_till_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lagg_till_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagg_till_btnActionPerformed
//Metod för att lägga till en ny agent. Flertalet valideringar sker innan data läggs in i tabeller.
        
        if(Validering.kolla_om_falt_tomt(namn_tf))
        {
            if(Validering.kolla_om_falt_tomt(telefonnummer_tf))
            {
                if(Validering.kolla_om_falt_tomt(anstallningsdatum_tf))
                {
                    if(Validering.kolla_om_falt_tomt(ny_email_tf))
                    {
                        String kollaEmail = ny_email_tf.getText();
                        if(Validering.kolla_om_falt_tomt(losenord_tf))
                        {
                            if(Validering.kollaCB(omrade_cb, omrade_L))
                            {
                                if(Validering.kollaDatum(anstallningsdatum_tf))
                                {
                                    if(Validering.kollaRadioButton(nej_rb, chef_L) && Validering.kollaRadioButton(faltagent_nej_rb, faltagent_L))
                                    {
                                    try {
                                        if(!Validering.isAgentEpost(idb.fetchColumn("SELECT Epost from agent;"), kollaEmail))
                                        {
                                            if(Validering.losen_langd_tf(losenord_tf))
                                            {
                                                if(Validering.villlaggaTill())
                                                {
//Här hämtas informationen från inmatningsfälten. För att sedan läggas in i respektive tabell.
                                                    try {
                                                        String id = idb.getAutoIncrement("agent", "Agent_ID");
                                                        
                                                        String admin ="";
                                                        String ans = anstallningsdatum_tf.getText();
                                                        
                                                        int omrade = omrade_cb.getSelectedIndex();
                                                        
                                                        if(omrade == 3)
                                                        {
                                                            omrade = 4;
                                                        }
                                                        String tnr = telefonnummer_tf.getText();
                                                        String namn = namn_tf.getText();
                                                        
                                                        String chef = "";
                                                        String faltagent = "";
                                                        String kontorsbeteckning = "Örebrokontoret";
                                                        String losen = losenord_tf.getText();
                                                        String ny_epost = ny_email_tf.getText();
                                                        
                                                        if(admin_ja_rb.isSelected())
                                                        {
                                                            admin = "J";
                                                        }
                                                        else if(admin_nej_rb.isSelected())
                                                        {
                                                            admin = "N";
                                                        }
                                                        String spara_andring = "Insert into agent (Agent_ID, Telefon, Anstallningsdatum ,Omrade, Epost , Losenord, Namn, Administrator)"+ "values(" +id + ", '"+tnr +"','"+ ans +"'," + omrade+ ", '"+ny_epost+"', '" + losen + "','" + namn + "','"+admin+"');";
                                                        
                                                        idb.insert(spara_andring);
                                                        if(omradeschef_rb.isSelected())
                                                        {
                                                            chef = "insert into omradeschef (Agent_ID, Omrade) values("+id+","+omrade+");";
                                                            System.out.println("Chef: " + chef);
                                                            idb.insert(chef);
                                                                
                                                        }else if(kontorschef_rb.isSelected())
                                                        {
                                                            chef = "insert into kontorschef (Agent_ID, Kontorsbeteckning) values("+id+",'"+kontorsbeteckning+"');";
                                                            System.out.println("Chef" + chef);
                                                            idb.insert(chef);
                                                            
                                                        }
                                                        if(faltagent_ja_rb.isSelected())
                                                        {
                                                            faltagent = "insert into faltagent (Agent_ID) values("+id+");";
                                                            System.out.println("Fältagent" + faltagent);
                                                            idb.insert(faltagent);
                                                            
                                                        }
                                                    } catch (InfException ex) {
                                                        Logger.getLogger(lagg_till_ny_agent.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
                                                }
                                            }
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null, "Epostadressen finns redan ");
                                        }
                                        
                                    } catch (InfException ex) 
                                    {
                                        JOptionPane.showMessageDialog(null, "Något gick fel, ingen agent blev tillagd. Försök igen. ");
                                        Logger.getLogger(lagg_till_ny_agent.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                
                                }
                            }
                        }
                    }
                }
            }
        }
            
        
        
            
            
    reset();
    }//GEN-LAST:event_lagg_till_btnActionPerformed

    private void tillbaka_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbaka_btnActionPerformed
        Andra_sidan andra_sidan = new Andra_sidan(idb, email_L.getText());
        andra_sidan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tillbaka_btnActionPerformed

    private void avsluta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avsluta_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_avsluta_btnActionPerformed

//Metod för att återställa.
    private void reset()
    {
        agent_id_tf.setText("");
        anstallningsdatum_tf.setText("");
        omrade_cb.setSelectedIndex(0);
        telefonnummer_tf.setText("");
        namn_tf.setText("");
        faltagent_nej_rb.setSelected(true);
        nej_rb.setSelected(true);
        admin_nej_rb.setSelected(true);
        losenord_tf.setText("");
        ny_email_tf.setText("");
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
            java.util.logging.Logger.getLogger(lagg_till_ny_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lagg_till_ny_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lagg_till_ny_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lagg_till_ny_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new lagg_till_ny_agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agent_L;
    private javax.swing.JRadioButton admin_ja_rb;
    private javax.swing.JRadioButton admin_nej_rb;
    private javax.swing.JTextField agent_id_tf;
    private javax.swing.JTextField anstallningsdatum_tf;
    private javax.swing.JButton avsluta_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel chef_L;
    private javax.swing.JLabel email_L;
    private javax.swing.JLabel faltagent_L;
    private javax.swing.JRadioButton faltagent_ja_rb;
    private javax.swing.JRadioButton faltagent_nej_rb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel kategori_L;
    private javax.swing.JRadioButton kontorschef_rb;
    private javax.swing.JButton lagg_till_btn;
    private javax.swing.JTextField losenord_tf;
    private javax.swing.JTextField namn_tf;
    private javax.swing.JRadioButton nej_rb;
    private javax.swing.JTextField ny_email_tf;
    private javax.swing.JLabel omrade_L;
    private javax.swing.JComboBox<String> omrade_cb;
    private javax.swing.JRadioButton omradeschef_rb;
    private javax.swing.JTextField telefonnummer_tf;
    private javax.swing.JButton tillbaka_btn;
    // End of variables declaration//GEN-END:variables
}
