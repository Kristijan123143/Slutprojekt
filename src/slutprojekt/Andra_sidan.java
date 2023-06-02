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
public class Andra_sidan extends javax.swing.JFrame {
    private InfDB idb;
    private static String email;
            
    /**
     * Creates new form Andra_sidan
     */
    public Andra_sidan(InfDB idb, String email) {
        initComponents();
        this.idb = idb;
        Agent_L.setText(email);
        fyllFalt(email);
        lasAllt();
    }
    
    // Metod för att låsa alla inmatningsfält. 
    private void lasAllt() 
    {
        agentID_tf.setEnabled(false);
        anstallningsdatum_tf.setEnabled(false);
        omrade_tf.setEnabled(false);
        namn_tf.setEnabled(false);
        administrator_tf.setEnabled(false);
        telefonnnummer_tf.setEnabled(false);
    }
    
    // Hämtar namnet för en agent.
    public String getNamn(String epost)
    {
        String agentNamn = "Select Namn from agent where Epost = '" + epost + "'";
        try {
            String svar = idb.fetchSingle(agentNamn);
            namn_tf.setText(svar);
            namn_L.setText(svar);
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agentNamn;
    }
    
    // Hämtar telefonnummret för en inloggadagent.
    public String getTelefonnummer(String epost)
    {
        String telefonnummer = "Select Telefon from agent where Epost ='" + epost + "'";
        try {
            String svar = idb.fetchSingle(telefonnummer);
            telefonnnummer_tf.setText(svar);
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telefonnummer;
    }
    
    // Hämtar anställningsdatumet för en agent. 
    public String getAnstallningsdatum(String epost)
    {
        String anstallningsdatum = "select Anstallningsdatum from agent where Epost = '" + epost + "'";
        try {
            String svar = idb.fetchSingle(anstallningsdatum);
            anstallningsdatum_tf.setText(svar);
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return anstallningsdatum;
    }
    //Hämtar området den inloggade agenten tillhör
    public String getOmrade(String epost)
    {
        String omrade = "select Omrade from agent where Epost = '" + epost + "'";
        try {
            String svar = idb.fetchSingle(omrade);
            
            if(svar.equals("1") )
            {
                svar = "Svealand";
            }else if(svar.equals("2"))
            {
                svar = "Götaland";
            }
            else if(svar.equals("4"))
            {
                svar = "Norrland";
            }
            
            omrade_tf.setText(svar);
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return omrade;
    }
    //Hämtar agent-id för den inloggade agenten.
    
    public String getAgentID(String epost)
    {
        String agentID = "select Agent_ID from agent where Epost = '" + epost + "'";
        try {
            String svar = idb.fetchSingle(agentID);
            agentID_tf.setText(svar);
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agentID;
    }
    
    
    //Kollar om den inloggade agenten är administratör eller inte.
    public String getAdmin(String epost)
    {
        String administrator = "select Administrator from agent where Epost = '" + epost + "'";
        try {
            String svar = idb.fetchSingle(administrator);
            if(svar.equals("J"))
            {
                administrator_tf.setText("Ja");
                andra_info_om_agent_btn.setEnabled(true);
                sok_omradeschef_btn.setVisible(false);
                ny_agent_btn.setVisible(true);
            }
            else{
                administrator_tf.setText("Nej");
                andra_info_om_agent_btn.setVisible(false);
                agent_info_btn.setVisible(false);
                ny_agent_btn.setVisible(false);
                ny_alien_btn.setText("Lägg till/Ändra alien");
            }            
        } catch (InfException ex) {
            Logger.getLogger(Andra_sidan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return administrator;
    }
    //Metod för att fylla alla textfält med information som hämtas angående den inloggade agenten.
    public void fyllFalt(String epost)
    {
        getNamn(epost);
        getTelefonnummer(epost);
        getAnstallningsdatum(epost);
        getOmrade(epost);
        getAgentID(epost);
        getAdmin(epost);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
            
    
            
        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sok_omradeschef_btn = new javax.swing.JButton();
        andra_info_om_agent_btn = new javax.swing.JButton();
        alien_btn = new javax.swing.JButton();
        agent_info_btn = new javax.swing.JButton();
        lagg_till_ny_utrustning_btn = new javax.swing.JButton();
        andra_losen = new javax.swing.JButton();
        ny_agent_btn = new javax.swing.JButton();
        ny_alien_btn = new javax.swing.JButton();
        avsluta_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        omrade_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        administrator_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        namn_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agentID_tf = new javax.swing.JTextField();
        telefonnnummer_tf = new javax.swing.JTextField();
        anstallningsdatum_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namn_L = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Agent_L = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Nova", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meny");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sok_omradeschef_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sok_omradeschef_btn.setText("Sök områdeschef");
        sok_omradeschef_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        sok_omradeschef_btn.setMaximumSize(new java.awt.Dimension(123, 21));
        sok_omradeschef_btn.setMinimumSize(new java.awt.Dimension(123, 21));
        sok_omradeschef_btn.setPreferredSize(new java.awt.Dimension(123, 21));
        sok_omradeschef_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sok_omradeschef_btnActionPerformed(evt);
            }
        });

        andra_info_om_agent_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        andra_info_om_agent_btn.setText("Ändra/ta bort agent");
        andra_info_om_agent_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        andra_info_om_agent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andra_info_om_agent_btnActionPerformed(evt);
            }
        });

        alien_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alien_btn.setText("Sök alien");
        alien_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        alien_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alien_btnActionPerformed(evt);
            }
        });

        agent_info_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agent_info_btn.setText("Sök agent");
        agent_info_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        agent_info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agent_info_btnActionPerformed(evt);
            }
        });

        lagg_till_ny_utrustning_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lagg_till_ny_utrustning_btn.setText("Utrustning");
        lagg_till_ny_utrustning_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lagg_till_ny_utrustning_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagg_till_ny_utrustning_btnActionPerformed(evt);
            }
        });

        andra_losen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        andra_losen.setText("Ändra lösenord");
        andra_losen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        andra_losen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andra_losenActionPerformed(evt);
            }
        });

        ny_agent_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ny_agent_btn.setText("Lägg till en ny agent");
        ny_agent_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ny_agent_btn.setMaximumSize(new java.awt.Dimension(123, 21));
        ny_agent_btn.setMinimumSize(new java.awt.Dimension(123, 21));
        ny_agent_btn.setPreferredSize(new java.awt.Dimension(123, 21));
        ny_agent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ny_agent_btnActionPerformed(evt);
            }
        });

        ny_alien_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ny_alien_btn.setText("Lägg till/Ändra/Ta bort en alien");
        ny_alien_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ny_alien_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ny_alien_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ny_alien_btn)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(andra_losen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lagg_till_ny_utrustning_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ny_agent_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(agent_info_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(andra_info_om_agent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sok_omradeschef_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(sok_omradeschef_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andra_info_om_agent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agent_info_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lagg_till_ny_utrustning_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andra_losen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(ny_agent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ny_alien_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        avsluta_btn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        avsluta_btn.setForeground(new java.awt.Color(255, 255, 255));
        avsluta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/power-icon.png"))); // NOI18N
        avsluta_btn.setBorder(null);
        avsluta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avsluta_btnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/Icons8-Windows-8-Users-Administrator.96.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Administratör");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Namn");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Agent ID");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Telefonnummer");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Anställningsdatum");

        agentID_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentID_tfActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Område");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anstallningsdatum_tf))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telefonnnummer_tf)
                            .addComponent(agentID_tf)
                            .addComponent(namn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(administrator_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(omrade_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(namn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(agentID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefonnnummer_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(anstallningsdatum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(omrade_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(administrator_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" Inloggad som");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Epost");

        Agent_L.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namn_L, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Agent_L, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Avsluta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(avsluta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avsluta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agentID_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentID_tfActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_agentID_tfActionPerformed

    private void andra_info_om_agent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andra_info_om_agent_btnActionPerformed
        // TODO add your handling code here:
        //new Info_om_agent(idb, getAgentID(email)).setVisible(true);
        
        Info_om_agent agent_info = new Info_om_agent(idb, Agent_L.getText(), namn_L.getText());
        agent_info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_andra_info_om_agent_btnActionPerformed

    private void ny_agent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ny_agent_btnActionPerformed
        lagg_till_ny_agent ny_agent = new lagg_till_ny_agent(idb, Agent_L.getText(), namn_L.getText());
        ny_agent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ny_agent_btnActionPerformed

    private void ny_alien_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ny_alien_btnActionPerformed
        lagg_till_ny_alien ny_alien = new lagg_till_ny_alien(idb, Agent_L.getText(), namn_L.getText());
        ny_alien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ny_alien_btnActionPerformed

    private void alien_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alien_btnActionPerformed
        Soka_alien sok_alien= new Soka_alien(idb, Agent_L.getText(), namn_L.getText());
        sok_alien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alien_btnActionPerformed

    private void andra_losenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andra_losenActionPerformed
        andra_losenord losenord= new andra_losenord(idb, Agent_L.getText(), namn_L.getText());
        losenord.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_andra_losenActionPerformed

    private void agent_info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agent_info_btnActionPerformed
       soka_agent sok_agent= new soka_agent(idb, Agent_L.getText(), namn_L.getText());
        sok_agent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agent_info_btnActionPerformed

    private void lagg_till_ny_utrustning_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagg_till_ny_utrustning_btnActionPerformed

        Utrustning ny_utrustning= new Utrustning(idb, Agent_L.getText(), namn_L.getText(), administrator_tf.getText());
        ny_utrustning.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lagg_till_ny_utrustning_btnActionPerformed

    private void sok_omradeschef_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sok_omradeschef_btnActionPerformed

        omradeschef soka_omradeschef = new omradeschef(idb, Agent_L.getText(), omrade_tf.getText(), namn_L.getText());
        soka_omradeschef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sok_omradeschef_btnActionPerformed

    private void avsluta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avsluta_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_avsluta_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Andra_sidan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Andra_sidan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Andra_sidan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Andra_sidan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Andra_sidan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agent_L;
    private javax.swing.JTextField administrator_tf;
    public javax.swing.JTextField agentID_tf;
    private javax.swing.JButton agent_info_btn;
    private javax.swing.JButton alien_btn;
    private javax.swing.JButton andra_info_om_agent_btn;
    private javax.swing.JButton andra_losen;
    private javax.swing.JTextField anstallningsdatum_tf;
    private javax.swing.JButton avsluta_btn;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton lagg_till_ny_utrustning_btn;
    private javax.swing.JLabel namn_L;
    private javax.swing.JTextField namn_tf;
    private javax.swing.JButton ny_agent_btn;
    private javax.swing.JButton ny_alien_btn;
    private javax.swing.JTextField omrade_tf;
    private javax.swing.JButton sok_omradeschef_btn;
    private javax.swing.JTextField telefonnnummer_tf;
    // End of variables declaration//GEN-END:variables
}
