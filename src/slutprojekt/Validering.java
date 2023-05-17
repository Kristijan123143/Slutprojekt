/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slutprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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

    
    public static boolean kolla_om_falt_tomt(JTextField email_tf)
    {   
        boolean kolla = true;
        
        if(email_tf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fyll i alla fält");
            kolla = false;
        }
        return kolla;
    }
    
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
    
    
}
