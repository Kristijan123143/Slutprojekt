/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slutprojekt;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author krist
 */
public class Validering {

    private InfDB idb;
    
     public Validering(InfDB idb)
     {
        this.idb = idb;
     }

//Metod för att kontrollera om ett textfält är tomt eller inte. Ett meddelande visas om det är tomt.
    public static boolean kolla_om_falt_tomt(JTextField email_tf)
    {   
        boolean kolla = true;
        
        if(email_tf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fyll i fält");
            kolla = false;
        }
        return kolla;
    }
    
//Metod för att kontrollera om ett val är gjort i comboboxen annars retuneras ett meddelande om att ett val behöver utföras.
    public static boolean kollaCB(JComboBox val, JLabel text)
    {
        boolean kollaCB = true;
        String namn = text.getText();
        if(val.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Välj "+namn);
            kollaCB = false;
        }
        
        return kollaCB;
    }
  
//Metod för att kontrollera om ett textfält har rätt datumformat. Annars skrivs ett meddelande ut om att inmatningen är fel och hur det ska bli korrekt.    
    public static boolean kollaDatum(JTextField datum)
    {
        boolean kollaDatum = true;
        String date = datum.getText();
        
        if(!date.matches("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$"))
        {
                kollaDatum = false;
                JOptionPane.showMessageDialog(null, "Fel format för datum. Ska vara yyyy-mm-dd");
        }
       
        return kollaDatum;
    }
    
    
//Metod för att kontrollera om lösenordsfält är tomma. Ges ett meddelande om det är tomt.
    public static boolean kolla_om_losen_tomt(JPasswordField email_tf)
    {   
        boolean kolla = true;
        String losen = new String (email_tf.getPassword());
        if(losen.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fyll i lösenord");
            kolla = false;
        }
        return kolla;
    }
 
//Metod för att kontrollera om den angivna eposten tillhör en agent.
    public static boolean isAgentEpost(ArrayList<String> allaAgentEpost,String angivenEpost){
       boolean resultat = false;
       
       if(allaAgentEpost.contains(angivenEpost)){
           resultat = true;
       }
       
       return resultat;
    }

//Metod för att kontrollera om den angivna eposten tillhör en alien.
    public static boolean isAlienEpost(ArrayList<String> allaAlienEpost,String angivenEpost){
        boolean resultat = false;
        
       if(allaAlienEpost.contains(angivenEpost)){
           resultat = true;
       }
       
       return resultat;
    }

//Metod för att kontroller om lösenordsfälten överrensstämmer med varandra.
    public static boolean kolla_losen(JPasswordField nytt_losenord_pf1, JPasswordField nytt_losenord_pf)
    {
        boolean kolla = false;
        
        char[] nytt_losen = nytt_losenord_pf.getPassword();
        char[] nytt_losen_igen = nytt_losenord_pf1.getPassword();

        String losenord = "";
        String losenord_igen = "";
        
        for(char losen : nytt_losen) 
            {
                    losenord += losen;     
            }
        for(char losen : nytt_losen_igen) 
            {
                    losenord_igen += losen;     
            }
        
        if(losenord.equals(losenord_igen))
        {
            kolla = true;

        }else{
            JOptionPane.showMessageDialog(null, "Lösenordet överrensstämmer inte med varandra ");
        }
        return kolla;
    }
    
//Metod för att kontrollera att längden på lösenordsfältet inte är för långt.
    public static boolean losen_langd(JPasswordField losenord_tf)
    {
        boolean kolla = false;
        
        if(losenord_tf.getPassword().length > 7)
        {
            JOptionPane.showMessageDialog(null, "Lösenordet är för långt, max 6 tecken ");
           
        }else{
            kolla = true; 
        }
        return kolla;
    }
//Metod för att kontrollera att längden för ett textfält som ska innehålla lösenord inte är för långt.
    public static boolean losen_langd_tf(JTextField losenord_tf)
    {
        boolean kolla = false;
        
        if(losenord_tf.getText().length() > 7)
        {
            JOptionPane.showMessageDialog(null, "Lösenordet är för långt, max 6 tecken ");
        }else{
            kolla = true; 
        }
        return kolla;
    }
 
//Metod för att kontrollera om lösenordet överrensstämmer med den angivna epost-addressen.
    public static boolean ratt_losen(JPasswordField nytt_losenord_pf, String svar)
    {
        boolean ratt = false;
        char[] kolla_losen = nytt_losenord_pf.getPassword();
        String losenord = "";
        String agent_svar = svar;
        for(char losen : kolla_losen)
        {
            losenord += losen;
        }
        if(losenord.equals(agent_svar))
        {
            ratt = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Du har skrivit fel lösenord");
        }
        
        return ratt;
        
    }
    
//Metod för att kontrollera om det finns något i tabell. Om det är tomt skrivs ett meddelande ut med att sökningen inte gav något resultat.
    public static boolean finnsIngenTabell(JTable tabell, JTextField sok, JComboBox val)
    {
        boolean finnsInte = true;
        String sokord=sok.getText();
        String comboVal=val.getSelectedItem().toString();
        int raknaRad = tabell.getRowCount();
        if(raknaRad <1)
        {
            JOptionPane.showMessageDialog(null,"Finns ingen med "+ comboVal +" "+ sokord + ". Gör en ny sökning");
            finnsInte = false;
        }
       
        return finnsInte;
    }
    
   //Metod för att bekräfta borttagning.
     public static boolean villTaBort()
    {
        boolean taBort = true;
        int radera = JOptionPane.showConfirmDialog(null, "Är du säker du vill radera?","Bekräfta", JOptionPane.YES_NO_OPTION);
        
        if (radera==JOptionPane.YES_OPTION)
        {
            taBort=true;
        }
        else if(radera==JOptionPane.NO_OPTION)
        {
            taBort=false;
        }
        return taBort;
    }
     
  //Metod för att bekräfta ändringar.
    public static boolean villAndra()
    {
        boolean andraInfo = true;
        int andra = JOptionPane.showConfirmDialog(null, "Är du säker du vill ändra informationen?","Bekräfta", JOptionPane.YES_NO_OPTION);
        
        if (andra==JOptionPane.YES_OPTION)
        {
            andraInfo=true;
        }
        else if(andra==JOptionPane.NO_OPTION)
        {
            andraInfo=false;
        }
        return andraInfo;
    }
//Metod för att bekräfta om man vill lägga till.
    public static boolean villlaggaTill()
    {
        boolean andraInfo = true;
        int andra = JOptionPane.showConfirmDialog(null, "Är du säker du vill lägga till?","Bekräfta", JOptionPane.YES_NO_OPTION);
        
        if (andra==JOptionPane.YES_OPTION)
        {
            andraInfo=true;
        }
        else if(andra==JOptionPane.NO_OPTION)
        {
            andraInfo=false;
        }
        return andraInfo;
    }

//En annan metod för att kontrollera om ett val har gjorts i comboboxen.
    public static boolean cbEjVald(JComboBox val)
    {
        boolean finnsInte = true;
        if(val.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null,"Du har inte valt något i comboboxen");
            finnsInte = false;
        }
        return finnsInte;
    }

//Metod för att kontrollera om valet Nej ska gälla för vald radioknapp.
    public static boolean kollaRadioButton(JRadioButton radioButton, JLabel text)
    {
        boolean kolla = true;
        String lableText = text.getText();
        if(radioButton.isSelected())
        {
            int andra = JOptionPane.showConfirmDialog(null, "Är du säker på att du inte vill välja "+lableText+"?","Bekräfta", JOptionPane.YES_NO_OPTION);
            if (andra==JOptionPane.YES_OPTION)
            {
                kolla=true;
            }
            else if(andra==JOptionPane.NO_OPTION)
            {
                kolla=false;
            }
        }
        return kolla;
    }
    
   

    
    
    
    
}
