/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slutprojekt;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author krist
 */
public class Slutprojekt {

    /**
     * @param args the command line arguments
     */
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException{
        // TODO code application logic here
        try{
            idb = new InfDB("mibdb", "3306",  "mibdba", "mibkey");
        }catch(InfException ex){
            Logger.getLogger(Slutprojekt.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        String fraga = "SELECT namn FROM agent where agent_id = 1";
        String svar = idb.fetchSingle(fraga);
        System.out.println(svar);
        
        
    }
    
}
