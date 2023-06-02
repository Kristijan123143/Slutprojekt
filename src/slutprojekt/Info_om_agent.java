/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slutprojekt;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
    public Info_om_agent(InfDB idb, String email, String namn) {
        initComponents();
        this.idb = idb;
        this.email = email;
        email_L.setText(email);
        Agent_L.setText(namn);
        setAllt(email); //spelar ingen roll ifall man har email eller agentID
        fyllCb();
        ny_email.setEditable(false);
        lasAllt();
    }
    //Metod för att sätta in all information om den inloggade agenten.
    public void setAllt( String epost)
    {
        String admin = "";
        try {
            String hamta_rad = "select * from agent where Epost = '"+ epost + "'";
            ArrayList<HashMap<String, String>> rad_info = idb.fetchRows(hamta_rad);
            for(HashMap<String,String> allt : rad_info)
            {
                namn_tf.setText(allt.get("Namn"));
                agent_id_tf.setText(allt.get("Agent_ID"));
                ny_email.setText(allt.get("Epost"));
                anstallningsdatum_tf.setText(allt.get("Anstallningsdatum"));
                omrade_cb.setEnabled(false);
                telefonnummer_tf.setText(allt.get("Telefon"));
                admin = allt.get("Administrator");
                int plats = Integer.parseInt(allt.get("Omrade"));
                
                if(plats == 4)
                {
                    plats = 3;
                }
                
                omrade_cb.setSelectedIndex(plats);
                
            }
            
            String hamta_omradeschef = "select Agent_ID from omradeschef where Agent_ID = '"+ agent_id_tf.getText() + "'";
            String svar = idb.fetchSingle(hamta_omradeschef);
            if(svar == null )
            {
             omradeschef_nej_rb.setSelected(true);
            }
            else{
                omradeschef_ja_rb.setSelected(true);
            }
            
            String hamta_kontorschef = "select Agent_ID from kontorschef where Agent_ID = '"+ agent_id_tf.getText() + "'";
            String kontorschef_svar = idb.fetchSingle(hamta_kontorschef);
            
            if(kontorschef_svar == null)
            {
             kontorschef_nej_rb.setSelected(true);
            }
            else{
                kontorschef_ja_rb.setSelected(true);
            }
            
            String hemta_faltagent = "select Agent_ID from faltagent where Agent_ID = '"+ agent_id_tf.getText() + "'";
            String faltagent_svar = idb.fetchSingle(hemta_faltagent);
            
            if(faltagent_svar == null )
            {
             faltagent_nej_rb.setSelected(true);
            }
            else{
                faltagent_ja_rb.setSelected(true);
            }
            
            if(admin.equals("J"))
            {
                admin_ja_rb.setSelected(true);
            }
            else{
                admin_nej_rb.setSelected(true);
            }
            
        } catch (InfException ex) {
            Logger.getLogger(Info_om_agent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        tillbaka_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        val_cb = new javax.swing.JComboBox<>();
        sok_agent = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        omradeschef_nej_rb = new javax.swing.JRadioButton();
        kontorschef_ja_rb = new javax.swing.JRadioButton();
        kontorschef_nej_rb = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        faltagent_ja_rb = new javax.swing.JRadioButton();
        faltagent_nej_rb = new javax.swing.JRadioButton();
        omrade_cb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ny_email = new javax.swing.JTextField();
        omrade_L = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namn_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        admin_ja_rb = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        admin_nej_rb = new javax.swing.JRadioButton();
        agent_id_tf = new javax.swing.JTextField();
        omradeschef_ja_rb = new javax.swing.JRadioButton();
        telefonnummer_tf = new javax.swing.JTextField();
        anstallningsdatum_tf = new javax.swing.JTextField();
        avsluta_btn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Agent_L = new javax.swing.JLabel();
        email_L = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        andra_info_btn = new javax.swing.JButton();
        spara_andringar_btn = new javax.swing.JButton();
        ta_bort_agent_btn = new javax.swing.JButton();
        tillbaka_btn1 = new javax.swing.JButton();

        tillbaka_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tillbaka_btn.setText("Tillbaka");
        tillbaka_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ändra information om en agent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Välj agent");

        val_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));

        sok_agent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sok_agent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Custom-Icon-Design-Mono-General-2-Search.16.png"))); // NOI18N
        sok_agent.setText("Sök");
        sok_agent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        sok_agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sok_agentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sok_agent, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sok_agent)
                    .addComponent(val_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup2.add(omradeschef_nej_rb);
        omradeschef_nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        omradeschef_nej_rb.setText("Nej");

        buttonGroup3.add(kontorschef_ja_rb);
        kontorschef_ja_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kontorschef_ja_rb.setText("Ja");
        kontorschef_ja_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontorschef_ja_rbActionPerformed(evt);
            }
        });

        buttonGroup3.add(kontorschef_nej_rb);
        kontorschef_nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kontorschef_nej_rb.setText("Nej");
        kontorschef_nej_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontorschef_nej_rbActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Fältagent");

        buttonGroup4.add(faltagent_ja_rb);
        faltagent_ja_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        faltagent_ja_rb.setText("Ja");

        buttonGroup4.add(faltagent_nej_rb);
        faltagent_nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        faltagent_nej_rb.setText("Nej");

        omrade_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Svealand", "Götaland", "Norrland" }));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Områdeschef");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Kontorschef");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Email");

        omrade_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        omrade_L.setText("Område");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Agent ID");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Namn");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Telefonnummer");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Administratör");

        buttonGroup1.add(admin_ja_rb);
        admin_ja_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        admin_ja_rb.setText("Ja");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Anställningsdatum");

        buttonGroup1.add(admin_nej_rb);
        admin_nej_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        admin_nej_rb.setText("Nej");

        buttonGroup2.add(omradeschef_ja_rb);
        omradeschef_ja_rb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        omradeschef_ja_rb.setText("Ja");
        omradeschef_ja_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omradeschef_ja_rbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kontorschef_ja_rb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kontorschef_nej_rb))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(admin_ja_rb)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(admin_nej_rb))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(omradeschef_ja_rb)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(omradeschef_nej_rb)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(faltagent_ja_rb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(faltagent_nej_rb))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(omrade_L)
                            .addGap(68, 68, 68)
                            .addComponent(omrade_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel14)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefonnummer_tf)
                                .addComponent(anstallningsdatum_tf)
                                .addComponent(agent_id_tf)
                                .addComponent(namn_tf)
                                .addComponent(ny_email, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ny_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(namn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(agent_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefonnummer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(anstallningsdatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omrade_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omrade_L))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin_nej_rb)
                            .addComponent(admin_ja_rb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omradeschef_ja_rb)
                    .addComponent(omradeschef_nej_rb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kontorschef_ja_rb)
                    .addComponent(kontorschef_nej_rb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faltagent_ja_rb)
                    .addComponent(faltagent_nej_rb)
                    .addComponent(jLabel15))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        avsluta_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        avsluta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/power-icon.png"))); // NOI18N
        avsluta_btn.setText("Avsluta");
        avsluta_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        avsluta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avsluta_btnActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Icons8-Windows-8-Users-Administrator.96.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" Inloggad som");

        Agent_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agent_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        email_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Epost");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        andra_info_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        andra_info_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/folder-edit-outline-icon.png"))); // NOI18N
        andra_info_btn.setText("Ändra information");
        andra_info_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        andra_info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andra_info_btnActionPerformed(evt);
            }
        });

        spara_andringar_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        spara_andringar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Save-icon.png"))); // NOI18N
        spara_andringar_btn.setText("Spara ändringar");
        spara_andringar_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        spara_andringar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spara_andringar_btnActionPerformed(evt);
            }
        });

        ta_bort_agent_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ta_bort_agent_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/delete-icon.png"))); // NOI18N
        ta_bort_agent_btn.setText("Ta bort agent");
        ta_bort_agent_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ta_bort_agent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_bort_agent_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spara_andringar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ta_bort_agent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(andra_info_btn)
                        .addGap(32, 32, 32))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(andra_info_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(spara_andringar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ta_bort_agent_btn)
                .addGap(20, 20, 20))
        );

        tillbaka_btn1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tillbaka_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/back-icon.png"))); // NOI18N
        tillbaka_btn1.setText("Tillbaka");
        tillbaka_btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tillbaka_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbaka_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(jLabel6))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(email_L, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tillbaka_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tillbaka_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(email_L, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(avsluta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avsluta_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spara_andringar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spara_andringar_btnActionPerformed
        // TODO add your handling code here:
        agent_id_tf.setEditable(false);
        
            //Denna metod kollar om alla fält, radioknappar och combobox är korrekt ifyllda/valda.
            if(Validering.kolla_om_falt_tomt(namn_tf))
            {
                if(Validering.kolla_om_falt_tomt(agent_id_tf))
                {
                    if(Validering.kolla_om_falt_tomt(anstallningsdatum_tf))
                    {
                        if(Validering.kolla_om_falt_tomt(telefonnummer_tf))
                        {
                            if(Validering.kollaCB(omrade_cb, omrade_L))
                            {
                                if(Validering.kollaDatum(anstallningsdatum_tf))
                                {
                                    if(Validering.villAndra())
                                {
                                    try{
//Här hämtas informationen som har finns i inmatningsfälten
                                        String namn = namn_tf.getText();
                                        String id = agent_id_tf.getText();
                                        String ans = anstallningsdatum_tf.getText();
                                        String omrade = "";
                                        String tnr = telefonnummer_tf.getText();
                                        String admin = "";
                                        String kontorsbeteckning = "Örebrokontoret";

                                                        if(admin_ja_rb.isSelected())
                                                        {
                                                            admin = "J";
                                                        }
                                                        else if(admin_nej_rb.isSelected())
                                                        {
                                                            admin = "N";
                                                        }
                                        if(omrade_cb.getSelectedItem().toString().equals("Svealand"))
                                        {
                                            omrade = "1";

                                        }else if(omrade_cb.getSelectedItem().toString().equals("Götaland"))
                                        {
                                            omrade = "2";
                                        }else if(omrade_cb.getSelectedItem().toString().equals("Norrland"))
                                        {
                                            omrade = "4";
                                        }
//Här sparas all information som hämtats från inmatningsfältet
                                        String spara_andring = "Update agent set Namn = '" +namn + "', Telefon ='"+tnr +"', Anstallningsdatum =  '"+ ans +"', Omrade = '" + omrade + "', Administrator = '"+admin+"' where Epost = '"+ ny_email.getText() + "';";
                                        idb.update(spara_andring);
                                        
//Villkorssats för att endast kunna välja om man är en områdeschef eller inte och ta bort kontorschef vid ja. Annars uppdatera området om det har ändrats för en områdeschef.
                                        if(omradeschef_ja_rb.isSelected())
                                        {
                                            if (!idb.fetchColumn("SELECT Agent_ID FROM omradeschef").contains(id)|| idb.fetchColumn("SELECT Agent_ID FROM omradeschef") == null) 
                                                {
                                                    String spara_andring_f = "Insert into omradeschef(Agent_ID, Omrade) values('" + id +"','"+omrade+"');";

                                                    idb.insert(spara_andring_f);
                                                     if(idb.fetchColumn("SELECT Agent_ID FROM kontorschef") == null)
                                                    {

                                                    }
                                                     else if(idb.fetchColumn("SELECT Agent_ID FROM kontorschef").contains(id) )
                                                    {
                                                        String radera_kontorschef = "Delete from kontorschef where Agent_ID = '" + id + "';";
                                                        idb.delete(radera_kontorschef);
                                                    }
                                                }else if(idb.fetchColumn("SELECT Agent_ID FROM omradeschef").contains(id))
                                                {
                                                    String sql_fraga = "Update omradeschef set Omrade = '"+omrade+"' where Agent_ID = "+id+";";
                                                    idb.update(sql_fraga);
                                                }
                                        }

                                        if (omradeschef_nej_rb.isSelected())
                                        {
                                            if (!idb.fetchColumn("SELECT Agent_ID FROM omradeschef").contains(id) || idb.fetchColumn("SELECT Agent_ID FROM omradeschef") == null) 
                                                {

                                                }
                                            else if(idb.fetchColumn("SELECT Agent_ID FROM omradeschef").contains(id))
                                            {
                                                    String radera_omradeschef = "Delete from omradeschef where Agent_ID = '" + id + "';";
                                                    idb.delete(radera_omradeschef);
                                            }
                                        }



                                        if(faltagent_ja_rb.isSelected())
                                        { 
                                            if (!idb.fetchColumn("SELECT Agent_ID FROM faltagent").contains(id)) 
                                                {
                                                    String spara_andring_f = "Insert into faltagent(Agent_ID) values(" + id +");";
                                                    idb.insert(spara_andring_f);
                                                }
                                        }
                                        else if (faltagent_nej_rb.isSelected())
                                        {
                                            if (idb.fetchColumn("SELECT Agent_ID FROM faltagent").contains(id)) 
                                                {
                                                    String radera_faltagent = "Delete from faltagent where Agent_ID = " + id + ";";
                                                    idb.delete(radera_faltagent);
                                                }
                                        }
//Villkorssats för att endast kunna välja om man är en kontorschef eller inte och ta bort områdeschef vid ja. 

                                        if(kontorschef_ja_rb.isSelected())
                                        {

                                            if (!idb.fetchColumn("SELECT Agent_ID FROM kontorschef").contains(id)|| idb.fetchColumn("SELECT Agent_ID FROM kontorschef") == null) 
                                                {
                                                    String spara_andring_f = "Insert into kontorschef(Agent_ID, Kontorsbeteckning) values('" + id +"','"+kontorsbeteckning+"');";
                                                    idb.insert(spara_andring_f);
                                                     if(idb.fetchColumn("SELECT Agent_ID FROM omradeschef") == null)
                                                     {

                                                     }
                                                      else if(idb.fetchColumn("SELECT Agent_ID FROM omradeschef").contains(id) )
                                                    {
                                                        String radera_omradeschef = "Delete from omradeschef where Agent_ID = '" + id + "';";
                                                        idb.delete(radera_omradeschef);
                                                    }
                                                }
                                        }

                                        if (kontorschef_nej_rb.isSelected())
                                        {
                                            if (!idb.fetchColumn("SELECT Agent_ID FROM kontorschef").isEmpty() || idb.fetchColumn("SELECT Agent_ID FROM kontorschef").contains(id) ) 
                                                {
                                                    String radera_kontorschef = "Delete from kontorschef where Agent_ID ='" + id + "';";
                                                    idb.delete(radera_kontorschef);
                                                }
                                        }

                                    }catch (InfException ex) 
                                    {
                                        JOptionPane.showMessageDialog(null, "Något gick fel, ingen agent blev ändrad. Försök igen. ");
                                        Logger.getLogger(Info_om_agent.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                    lasAllt();

                                    reset();
                                }
                                }
                                
                                
                            }
                        }
                    }
                }
            }
            
           
    }//GEN-LAST:event_spara_andringar_btnActionPerformed

    private void andra_info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andra_info_btnActionPerformed
//Gör alla fält, combobox och radioknappar synliga och valbara. Det går inte att uppdatera sin egen administratörsstatus om inloggad som administratör.       
        
        agent_id_tf.setEnabled(false);
        omrade_cb.setEnabled(true);
        anstallningsdatum_tf.setEnabled(true);
        telefonnummer_tf.setEnabled(true);
        omradeschef_ja_rb.setEnabled(true);
        kontorschef_ja_rb.setEnabled(true);
        omradeschef_nej_rb.setEnabled(true);
        kontorschef_nej_rb.setEnabled(true);
        namn_tf.setEditable(true);
        faltagent_ja_rb.setEnabled(true);
        faltagent_nej_rb.setEnabled(true);
        admin_ja_rb.setEnabled(true);
        admin_nej_rb.setEnabled(true);
        if(email_L.getText().equals(ny_email.getText()))
            {
               admin_ja_rb.setEnabled(false);
               admin_nej_rb.setEnabled(false);
            }
            else{
               admin_ja_rb.setEnabled(true);
               admin_nej_rb.setEnabled(true);
            }
        
    }//GEN-LAST:event_andra_info_btnActionPerformed

    private void sok_agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_agentActionPerformed
//En splitfunktion för att hämta ut ID för den valda agenten i combobox och använder ID för metoden setAllt();
        try {
            // TODO add your handling code here:
            String splitNamn = val_cb.getSelectedItem().toString();
            String[] arrOfStr = splitNamn.split(": ");
            
            String id = arrOfStr[2];
            
            setKategori(id);
            
            String sok_med_epost = "select Epost from agent where Agent_ID = "+id+";" ;
            String sok = idb.fetchSingle(sok_med_epost);
            setAllt(sok);
            
        } catch (InfException ex) {
            Logger.getLogger(Info_om_agent.class.getName()).log(Level.SEVERE, null, ex);
        }
        lasAllt();
    }//GEN-LAST:event_sok_agentActionPerformed

    private void kontorschef_nej_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontorschef_nej_rbActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kontorschef_nej_rbActionPerformed

    private void kontorschef_ja_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontorschef_ja_rbActionPerformed
        // TODO add your handling code here:
        
        omradeschef_nej_rb.setSelected(true);
        
    }//GEN-LAST:event_kontorschef_ja_rbActionPerformed

    private void omradeschef_ja_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omradeschef_ja_rbActionPerformed
        // TODO add your handling code here:
        kontorschef_nej_rb.setSelected(true);
    }//GEN-LAST:event_omradeschef_ja_rbActionPerformed

    private void ta_bort_agent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_bort_agent_btnActionPerformed
/*Först görs en validering för att kontrollera om man vill ta bort en agent eller inte. Är valet ja kommer metoden att radera den valda agenten där
        Agent ID står i agent_id textfältet. Först kontrolleras om agent ID finns i kontorschef eller områdeschef och tas därefter bort. Sedan kontrolleras
        om agenten finns i fältagent och tas i sådana fall bort. Efter det kontrolleras om agenten har utrustning och raderas där. För att sist tas bort från Agent.
      */  
        if(Validering.villTaBort())
        {
            try {
            String ta_bort_utrustning = "DELETE FROM innehar_utrustning WHERE Agent_ID = "+agent_id_tf.getText()+";";
            String ta_bort_omradeschef = "DELETE FROM omradeschef WHERE Agent_ID = "+agent_id_tf.getText()+";";
            String ta_bort_kontorschef = "DELETE FROM kontorschef WHERE Agent_ID = "+agent_id_tf.getText()+";";
            String ta_bort_faltagent = "DELETE FROM faltagent WHERE Agent_ID = "+agent_id_tf.getText()+";";
            String ta_bort_agent= "DELETE FROM agent WHERE Agent_ID = "+agent_id_tf.getText()+";";
            
            String fraga_omradeschef = "select Agent_ID from omradeschef where Agent_ID = "+agent_id_tf.getText()+";";
            String fraga_kontorschef = "select Agent_ID from kontorschef where Agent_ID = "+agent_id_tf.getText()+";";
            String fraga_faltagent = "select Agent_ID from faltagent where Agent_ID = "+agent_id_tf.getText()+";";
            String alien_fraga = "select Ansvarig_Agent from alien where Ansvarig_Agent = "+agent_id_tf.getText()+";";
            
            
                if(idb.fetchColumn(alien_fraga).contains(agent_id_tf.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Du kan inte ta bort agenten eftersom att den ansvarar för en alien. Byt ansvarig agent för alien. ");
                    return;
                }
                
            if(idb.fetchColumn(fraga_kontorschef).contains(agent_id_tf.getText()))
            {
                idb.delete(ta_bort_kontorschef);
            }else if(idb.fetchColumn(fraga_omradeschef).contains(agent_id_tf.getText()))
            {
                idb.delete(ta_bort_omradeschef);
                
            }
            
            if(idb.fetchColumn(fraga_faltagent).contains(agent_id_tf.getText()))
            {
                idb.delete(ta_bort_faltagent);
            }
            idb.delete(ta_bort_utrustning);
            idb.delete(ta_bort_agent);
           
            
            
            reset();
            val_cb.removeAllItems();
            fyllCb();
        } catch (InfException ex) 
        {
            JOptionPane.showMessageDialog(null, "Något gick fel, ingen agent blev borttagen. Försök igen. ");
            Logger.getLogger(Info_om_agent.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_ta_bort_agent_btnActionPerformed

    private void avsluta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avsluta_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_avsluta_btnActionPerformed

    private void tillbaka_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbaka_btn1ActionPerformed
        Andra_sidan andra_sidan = new Andra_sidan(idb, email_L.getText());
        andra_sidan.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_tillbaka_btn1ActionPerformed

    //Metod för att hämta alla agenters namn och agent ID.
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
    //Metod för att kontrollera om agenten är områdeschef eller kontorschef och fältagent.
    private void setKategori(String agentID)
    {
        String kategori = "";
        try {
            if (idb.fetchColumn("SELECT Agent_ID FROM omradeschef").contains(agentID)) {
                
                omradeschef_ja_rb.setSelected(true);
                kategori= "select Omrade from omradeschef where Agent_ID = "+agentID+" ";
                

            } else if (idb.fetchColumn("SELECT agent_ID from kontorschef").contains(agentID)) {

                kontorschef_ja_rb.setSelected(true);
                kategori = "select kontorsbeteckning from kontorschef where Agent_ID = "+agentID+" ";
            }
            
            if(idb.fetchColumn("SELECT Agent_ID FROM faltagent").contains(agentID))
            {
                faltagent_ja_rb.setSelected(true);
            }
            else{
                faltagent_ja_rb.setSelected(false);

            }
            
        } catch (InfException ex) {
            Logger.getLogger(lagg_till_ny_alien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
//Metod för att låsa alla fält, combobox och radioknappar.    
    private void lasAllt()
    {
        agent_id_tf.setEnabled(false);
        anstallningsdatum_tf.setEnabled(false);
        omrade_cb.setEnabled(false);
        telefonnummer_tf.setEnabled(false);
        omradeschef_ja_rb.setEnabled(false);
        kontorschef_ja_rb.setEnabled(false);
        omradeschef_nej_rb.setEnabled(false);
        kontorschef_nej_rb.setEnabled(false);
        namn_tf.setEditable(false);
        faltagent_ja_rb.setEnabled(false);
        faltagent_nej_rb.setEnabled(false);
        admin_ja_rb.setEnabled(false);
        admin_nej_rb.setEnabled(false);
    }
    
   //Metod för att återställa alla fält, combobox och radioknappar.
    private void reset()
    {
        agent_id_tf.setText("");
        ny_email.setText(" ");
        anstallningsdatum_tf.setText("");
        omrade_cb.setSelectedIndex(0);
        val_cb.setSelectedIndex(0);
        telefonnummer_tf.setText(" ");
        omradeschef_ja_rb.setSelected(false);
        kontorschef_ja_rb.setSelected(false);
        omradeschef_nej_rb.setSelected(true);
        kontorschef_nej_rb.setSelected(true);
        namn_tf.setText(" ");
        faltagent_ja_rb.setSelected(false);
        faltagent_nej_rb.setSelected(true);
        admin_ja_rb.setSelected(false);
        admin_nej_rb.setSelected(true);
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
    private javax.swing.JRadioButton admin_ja_rb;
    private javax.swing.JRadioButton admin_nej_rb;
    private javax.swing.JTextField agent_id_tf;
    private javax.swing.JButton andra_info_btn;
    private javax.swing.JTextField anstallningsdatum_tf;
    private javax.swing.JButton avsluta_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel email_L;
    private javax.swing.JRadioButton faltagent_ja_rb;
    private javax.swing.JRadioButton faltagent_nej_rb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JRadioButton kontorschef_ja_rb;
    private javax.swing.JRadioButton kontorschef_nej_rb;
    private javax.swing.JTextField namn_tf;
    private javax.swing.JTextField ny_email;
    private javax.swing.JLabel omrade_L;
    private javax.swing.JComboBox<String> omrade_cb;
    private javax.swing.JRadioButton omradeschef_ja_rb;
    private javax.swing.JRadioButton omradeschef_nej_rb;
    private javax.swing.JButton sok_agent;
    private javax.swing.JButton spara_andringar_btn;
    private javax.swing.JButton ta_bort_agent_btn;
    private javax.swing.JTextField telefonnummer_tf;
    private javax.swing.JButton tillbaka_btn;
    private javax.swing.JButton tillbaka_btn1;
    private javax.swing.JComboBox<String> val_cb;
    // End of variables declaration//GEN-END:variables
}
